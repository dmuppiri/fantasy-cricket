package com.unt.hci.fantasycricket;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * Created by dpk on 3/23/17.
 */

public class  PlayerStatsActivity extends MenuActivity{
    private DataLoader loader;
    private TeamStatsData teamStatsData;
    private List<MyTeamData.PlayersBean>  myPlayers;
    private BitmapFactory bitmapFactory;
    InputStream bmp = null;

    private ImageView imageView;
    private TextView player_name_text;
    private TextView player_runs;
    private TextView player_sr;
    private TextView player_six;
    private TextView player_four;
    private TextView player_fifty;
    private TextView player_hundred;
    private TextView player_wickets;
    private TextView player_economy;
    private TextView player_wide;
    private TextView player_noball;
    private Button add_player;

    private int player_id;
    private int team;
    private int position;
    private boolean playerInTeam = false;
    private CharSequence TEAMFULL = "Team full remove any player before adding";
    private CharSequence PLAYERINTEAM = "Player already added to team";
    private CharSequence ADDEDPLAYER = "Added player to Team";
    private CharSequence REMOVEDPLAYER = "Removed player from Team";
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playerstats);
        imageView = (ImageView) findViewById(R.id.img_view);
        player_name_text = (TextView) findViewById(R.id.player_name);
        player_runs = (TextView) findViewById(R.id.player_runs);
        player_sr = (TextView) findViewById(R.id.playere_sr);
        player_six = (TextView) findViewById(R.id.player_six);
        player_four = (TextView) findViewById(R.id.player_four);
        player_fifty =(TextView) findViewById(R.id.player_fifty);
        player_hundred =(TextView) findViewById(R.id.player_hundred);
        player_wickets = (TextView) findViewById(R.id.player_wickets);
        player_economy = (TextView) findViewById(R.id.player_economy);
        player_wide = (TextView) findViewById(R.id.player_wide);
        player_noball = (TextView) findViewById(R.id.player_noball);
        add_player =(Button) findViewById(R.id.add);

        am = this.getAssets();
        loader = DataLoader.getInstance(null);
        teamStatsData = loader.getTeamStatsData();
        myPlayers = loader.getMyTeam().getPlayers();

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
        player_runs.setText("RUNS:" + " " + loader.players.get(player_id).getStats().get(2).getBattingStats().getR());
        player_sr.setText("STRIKE-RATE:" + " " + loader.players.get(player_id).getStats().get(2).getBattingStats().getSr());
        player_six.setText("SIXES:" + " " + loader.players.get(player_id).getStats().get(2).getBattingStats().get_$6s());
        player_four.setText("FOURS:" + " " + loader.players.get(player_id).getStats().get(2).getBattingStats().get_$4s());
        player_fifty.setText("FIFTIES:" + " " + loader.players.get(player_id).getStats().get(2).getBattingStats().get_$50s());
        player_hundred.setText("HUNDREDS:" + " " + loader.players.get(player_id).getStats().get(2).getBattingStats().get_$100s());
        player_wickets.setText("WICKETS" + " " + loader.players.get(player_id).getStats().get(2).getBowlingStats().getW());
        player_economy.setText("ECONOMY:" + " " + loader.players.get(player_id).getStats().get(2).getBowlingStats().getE());
        player_wide.setText("WIDE-BALLS:" + " " + loader.players.get(player_id).getStats().get(2).getBowlingStats().getWb());
        player_noball.setText("NO-BALLS:" + " " + loader.players.get(player_id).getStats().get(2).getBowlingStats().getNb());
        for(int i=0; i<myPlayers.size();i++) {
            if(myPlayers.get(i).getId()==player_id){
                playerInTeam = true;
            }
        }














        if(playerInTeam)
        {
            add_player.setText("REMOVE");
            add_player.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    for(int i=0; i<myPlayers.size();i++) {
                        if(player_id == myPlayers.get(i).getId()){
                            myPlayers.remove(i);
                        }
                    }
                    loader.getMyTeam().setPlayers(myPlayers);
                    loader.WriteMyTeamData(loader.getMyTeam());
                    Toast toast = Toast.makeText(getApplicationContext(), REMOVEDPLAYER, Toast.LENGTH_SHORT);
                    toast.show();
                }
            });
        }
        else {
            add_player.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    MyTeamData.PlayersBean playersBean = new MyTeamData.PlayersBean();
                    playersBean.setId(player_id);
                    List<MyTeamData.PlayersBean> currentplayers;
                    currentplayers = loader.getMyTeam().getPlayers();
                    if (currentplayers.size() > 10) {
                        Toast toast = Toast.makeText(getApplicationContext(), TEAMFULL, Toast.LENGTH_SHORT);
                        toast.show();
                    } else {
                        boolean player_exists = false;
                        for (int i = 0; i < currentplayers.size(); i++) {
                            if (currentplayers.get(i).getId() == player_id) {
                                Toast toast = Toast.makeText(getApplicationContext(), PLAYERINTEAM, Toast.LENGTH_SHORT);
                                toast.show();
                                player_exists = true;
                                break;
                            }
                        }
                        if (!player_exists) {
                            currentplayers.add(playersBean);
                            loader.getMyTeam().setPlayers(currentplayers);
                            loader.WriteMyTeamData(loader.getMyTeam());
                            Toast toast = Toast.makeText(getApplicationContext(), ADDEDPLAYER, Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    }
                }
            });
        }
    }

}
