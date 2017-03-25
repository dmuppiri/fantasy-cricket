package com.unt.hci.fantasycricket;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;


/**
 * Created by dpk on 3/23/17.
 */

public class PlayerStatsActivity extends MenuActivity{
    private DataLoader loader;
    private TeamStatsData teamStatsData;
    private BitmapFactory bitmapFactory;
    InputStream bmp = null;

    private ImageView imageView;
    private TextView player_name_text;

    private int player_id;
    private int team;
    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playerstats);
        imageView = (ImageView) findViewById(R.id.img_view);
        player_name_text = (TextView) findViewById(R.id.player_name);

        am = this.getAssets();
        loader = DataLoader.getInstance(null);
        teamStatsData = loader.getTeamStatsData();

        player_id = getIntent().getExtras().getInt("Player_id");
        team = getIntent().getExtras().getInt("Team");
        position = getIntent().getExtras().getInt("Position");

        System.out.println("Player id is "+player_id);
        try {
            bmp = am.open("img/players/large/"+player_id+".png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        imageView.setImageBitmap(bitmapFactory.decodeStream(bmp));
//        player_name_text.setText(loader.getScore().getMatchInfo().getTeams().get(team).getPlayers().get(position).getFullName());
        player_name_text.setText(loader.players.get(player_id).getPlayer().getFullName());
    }

}
