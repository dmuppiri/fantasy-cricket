package com.unt.hci.fantasycricket;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.IOException;
import java.util.List;

public class SquadsListAdaptor extends BaseAdapter {

    private Activity activity;
    List<Squads.SquadsBean.PlayersBean> data;
    private List<Bitmap> photos;
    private static LayoutInflater inflater=null;
    AssetManager assetManager;


    public SquadsListAdaptor(Activity a, List<Squads.SquadsBean.PlayersBean> s, AssetManager am) {
        activity = a;
        data=s;
        assetManager = am;
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
        View view=convertView;
        if(convertView==null)
            view = inflater.inflate(R.layout.player_row, null);

        TextView playerName = (TextView)view.findViewById(R.id.playerName);
        TextView playerPosition = (TextView)view.findViewById(R.id.playerPosition);
        ImageView playerImage=(ImageView)view.findViewById(R.id.playerImage);
        ImageView playerTeamLogo =(ImageView)view.findViewById(R.id.playerTeamLogo);

        Squads.SquadsBean.PlayersBean player = data.get(position);
        playerName.setText(player.getFullName());
        playerPosition.setText(player.getNationality());
        try {
            playerImage.setImageDrawable(Drawable.createFromStream(assetManager.open("img/players/large/"+player.getId()+".png"), null));
//            playerTeamLogo.setImageDrawable(Drawable.createFromStream(assetManager.open("img//"+player.getId()+".png"), null));

        } catch (IOException e) {
            e.printStackTrace();
            Log.e("ERROR", "Invalid drawable file path!");
       }
        return view;
    }
}
