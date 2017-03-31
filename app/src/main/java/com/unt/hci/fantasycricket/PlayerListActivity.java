package com.unt.hci.fantasycricket;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class PlayerListActivity extends MenuActivity {
    private ListView list;
    private PlayerListAdaptor adapter;
    private TeamStatsData.PlayersStatsBean playersStatsBean;
    DataLoader loader;
    Intent intent = null;
    private CharSequence teamFull = "Team full remove any player before adding";
    private CharSequence playerinTeam = "Player already added to team";
    private CharSequence addedPlayer = "Added player to Team";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("INFO", "PlayerListActivity Create");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Players");
        loader = DataLoader.getInstance(null);

        //Make TeamStatsData.PlayersStatsBean list


        //put list of players in listView
        adapter=new PlayerListAdaptor(this,loader.getScore(loader.getMyTeam().getMatch()).getMatchInfo().getTeams(), am);
        list=(ListView)findViewById(R.id.playerList);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                intent = new Intent(PlayerListActivity.this, PlayerStatsActivity.class);
                intent.putExtra("Player_id",adapter.getPlayer_Id(position));
                startActivity(intent);
            }
        });
        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                MyTeamData.PlayersBean playersBean = new MyTeamData.PlayersBean();
                playersBean.setId(adapter.getPlayer_Id(position));
                List<MyTeamData.PlayersBean> currentplayers;
                currentplayers = loader.getMyTeam().getPlayers();
                if (currentplayers.size() > 10) {
                    Toast toast = Toast.makeText(getApplicationContext(), teamFull, Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    boolean player_exists = false;
                    for(int i=0; i<currentplayers.size(); i++){
                        if(currentplayers.get(i).getId()==adapter.getPlayer_Id(position)){
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
                        return false;
                    }
                }
                return true;
            }
        });

    }
}
