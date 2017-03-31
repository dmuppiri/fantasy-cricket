package com.unt.hci.fantasycricket;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * Created by dpk on 3/23/17.
 */

public class  PlayerStatsActivity extends MenuActivity{
    private DataLoader loader;
    private TeamStatsData teamStatsData;
    private BitmapFactory bitmapFactory;
    InputStream bmp = null;

    private ImageView imageView;
    private TextView player_name_text;
    private Button add_player;

    private int player_id;
    private int team;
    private int position;

    private CharSequence teamFull = "Team full remove any player before adding";
    private CharSequence playerinTeam = "Player already added to team";
    private CharSequence addedPlayer = "Added player to Team";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playerstats);
        imageView = (ImageView) findViewById(R.id.img_view);
        player_name_text = (TextView) findViewById(R.id.player_name);
        add_player =(Button) findViewById(R.id.add);

        am = this.getAssets();
        loader = DataLoader.getInstance(null);
        teamStatsData = loader.getTeamStatsData();

        player_id = getIntent().getExtras().getInt("Player_id");

        System.out.println("Player id is "+player_id);
        try {
            bmp = am.open("img/players/large/"+player_id+".png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        imageView.setImageBitmap(bitmapFactory.decodeStream(bmp));
//        player_name_text.setText(loader.getScore().getMatchInfo().getTeams().get(team).getPlayers().get(position).getFullName());
        player_name_text.setText(loader.players.get(player_id).getPlayer().getFullName());
        add_player.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MyTeamData.PlayersBean playersBean = new MyTeamData.PlayersBean();
                playersBean.setId(player_id);
                List<MyTeamData.PlayersBean> currentplayers;
                currentplayers = loader.getMyTeam().getPlayers();
                if (currentplayers.size() > 10) {
                    Toast toast = Toast.makeText(getApplicationContext(), teamFull, Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    boolean player_exists = false;
                    for(int i=0; i<currentplayers.size(); i++){
                        if(currentplayers.get(i).getId()==player_id){
                            Toast toast = Toast.makeText(getApplicationContext(), playerinTeam, Toast.LENGTH_SHORT);
                            toast.show();
                            player_exists = true;
                            break;
                        }
                    }
                    if(!player_exists) {
                        currentplayers.add(playersBean);
                        loader.getMyTeam().setPlayers(currentplayers);
                        loader.WriteMyTeamData(loader.getMyTeam());
                        Toast toast = Toast.makeText(getApplicationContext(), addedPlayer, Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
            }
        });

    }

}
