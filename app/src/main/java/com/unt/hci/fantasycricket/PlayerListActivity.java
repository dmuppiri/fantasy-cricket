package com.unt.hci.fantasycricket;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class PlayerListActivity extends MenuActivity {
    private ListView list;
    private PlayerListAdaptor adapter;
    DataLoader loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("INFO", "PlayerListActivity Create");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Players");
        loader = DataLoader.getInstance(null);

        //put list of players in listView
        adapter=new PlayerListAdaptor(this,loader.getScore().getMatchInfo().getTeams(), am);
        list=(ListView)findViewById(R.id.playerList);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO: if user clicks on list item...
            }
        });

    }
}
