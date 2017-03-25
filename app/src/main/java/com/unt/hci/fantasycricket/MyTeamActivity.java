package com.unt.hci.fantasycricket;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class MyTeamActivity extends MenuActivity {
    private ListView list;
    private MyTeamListAdaptor adapter;
    DataLoader loader;

    protected void onCreate(Bundle savedInstanceState) {
        Log.e("INFO", "MyTeamActivity Create");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("My Team");

        // read my team file
        loader = DataLoader.getInstance(null);

        //put list of players in listView
        adapter = new MyTeamListAdaptor(this,loader, this.am);
        list=(ListView)findViewById(R.id.playerList);
        list.setAdapter(adapter);
//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                // TODO: if user clicks on list item...
//            }
//        });
    }
}
