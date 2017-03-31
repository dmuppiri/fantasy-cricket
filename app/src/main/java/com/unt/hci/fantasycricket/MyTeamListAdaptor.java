package com.unt.hci.fantasycricket;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyTeamListAdaptor extends BaseAdapter {

    private Activity activity;
    private List<TeamStatsData.PlayersStatsBean.PlayerBean> data;
    private HashMap<Integer, Integer> teamLogo;
    private static LayoutInflater inflater=null;
    private AssetManager assetManager;
    private String TAG= "MyTeamListAdapter";
    private DataLoader loader_priv;
    private List<ScoreData.MatchInfoBean.TeamsBean> teamsBean;
    public MyTeamListAdaptor(Activity a, DataLoader loader, AssetManager am) {
        loader_priv = loader;
        activity = a;
        assetManager = am;
        teamsBean = loader.getScore(loader.getMyTeam().getMatch()).getMatchInfo().getTeams();
        data = new ArrayList<>(); //holds merged list of players

        teamLogo = new HashMap<>(); // player id --> team logo id

        for(int i=0; i<teamsBean.size();i++){
            List<ScoreData.MatchInfoBean.TeamsBean.PlayersBean> p = teamsBean.get(i).getPlayers();
            for (int j=0; j<p.size();j++){
                teamLogo.put(p.get(j).getId(),teamsBean.get(i).getTeam().getId());
            }
        }
        for (int i = 0; i < loader.getMyTeam().getPlayers().size(); i++) {
            //get player data
            int pid = loader.getMyTeam().getPlayers().get(i).getId();
            TeamStatsData.PlayersStatsBean.PlayerBean player = loader.players.get(pid).getPlayer();
            data.add(player);
        }

        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return data.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        Log.e("INFO", "MyTeamListAdaptor Get view");
        View view=convertView;
        if(convertView==null) {
            view = inflater.inflate(R.layout.player_row, null);
        }

        //reference layout elements
        TextView playerName = (TextView)view.findViewById(R.id.playerName);
        TextView playerPosition = (TextView)view.findViewById(R.id.playerPosition);
        ImageView playerImage=(ImageView)view.findViewById(R.id.playerImage);
        ImageView playerTeamLogo =(ImageView)view.findViewById(R.id.playerTeamLogo);

        //get player data

        TeamStatsData.PlayersStatsBean.PlayerBean player = data.get(position);
        playerName.setText(player.getFullName());
        playerPosition.setText(player.getNationality());

        //read img files
        try {
            playerImage.setImageDrawable(Drawable.createFromStream(assetManager.open("img/players/large/"+player.getId()+".png"), null));
            playerTeamLogo.setImageDrawable(Drawable.createFromStream(assetManager.open("img/logos/"+teamLogo.get(player.getId())+".png"), null));
        } catch (IOException e) {
            e.printStackTrace();
            Log.e("ERROR", "Invalid drawable file path!:"+player.getFullName()+": "+player.getId());
            try {
                playerImage.setImageDrawable(Drawable.createFromStream(assetManager.open("img/players/Photo-Missing.png"), null));
                playerTeamLogo.setImageDrawable(Drawable.createFromStream(assetManager.open("img/players/Photo-Missing.png"), null));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        return view;
    }
}
