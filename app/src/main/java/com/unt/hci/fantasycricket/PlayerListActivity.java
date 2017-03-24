package com.unt.hci.fantasycricket;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class PlayerListActivity extends MenuActivity {
    private ListView list;
    private PlayerListAdaptor adapter;
    DataLoader loader;
    Intent intent = null;
    int match_num = 1;
    int team = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("INFO", "PlayerListActivity Create");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Players");
        loader = DataLoader.getInstance(null, match_num);

        //put list of players in listView
        adapter=new PlayerListAdaptor(this,loader.getScore().getMatchInfo().getTeams(), am);
        list=(ListView)findViewById(R.id.playerList);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                intent = new Intent(PlayerListActivity.this, PlayerStatsActivity.class);
                intent.putExtra("Player_id",adapter.getPlayer_Id(position));
                if(position<11) {
                    intent.putExtra("Team", 0);
                    intent.putExtra("Position", position);
                }
                else {
                    intent.putExtra("Team", 1);
                    intent.putExtra("Position", position-11);
                }


                startActivity(intent);
            }
        });
        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                return false;
            }
        });

    }
}
