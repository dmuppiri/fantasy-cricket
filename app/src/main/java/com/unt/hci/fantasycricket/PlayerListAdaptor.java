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



public class PlayerListAdaptor extends BaseAdapter {

    private class DataModel{
        int id;
        String name;
        Drawable teamLogo;
        Drawable picture;
        public DataModel(){}
    }
    private Activity activity;
    private List<ScoreData.MatchInfoBean.TeamsBean.PlayersBean> data;
    private HashMap<Integer, Integer> teamLogo;
    private static LayoutInflater inflater=null;
    private AssetManager assetManager;


    public PlayerListAdaptor(Activity a, List<ScoreData.MatchInfoBean.TeamsBean> s, AssetManager am) {
        activity = a;
        data = new ArrayList<>(); //holds merged list of players
        teamLogo = new HashMap<>(); // player id --> team logo id

        //Team beans have two teams. Combine players from both teams into list
        int pid;
        for (int i =0; i < s.size(); i++) {
            List<ScoreData.MatchInfoBean.TeamsBean.PlayersBean> p = s.get(i).getPlayers();
            for (int j = 0; j < p.size() ; j++){
                data.add(p.get(j));
                teamLogo.put(p.get(j).getId(), s.get(i).getTeam().getId());
                //get the id
                //pid = p.get(j).getId();
                //pull info from TeamStats
            }
        }
        assetManager = am;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    public int getPlayer_Id(int pos){return data.get(pos).getId();}
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
        View view=convertView;
        if(convertView==null)
            view = inflater.inflate(R.layout.player_row, null);

        //reference layout elements
        TextView playerName = (TextView)view.findViewById(R.id.playerName);
        TextView playerPosition = (TextView)view.findViewById(R.id.playerPosition);
        ImageView playerImage=(ImageView)view.findViewById(R.id.playerImage);
        ImageView playerTeamLogo =(ImageView)view.findViewById(R.id.playerTeamLogo);

        //get player data
        ScoreData.MatchInfoBean.TeamsBean.PlayersBean player = data.get(position);
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
//                playerTeamLogo.setImageDrawable(Drawable.createFromStream(assetManager.open("img/players/Photo-Missing.png"), null));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        return view;
    }
}
