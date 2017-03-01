package com.unt.hci.fantasycricket;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.google.gson.Gson;

import org.apache.commons.io.IOUtils;

import java.io.IOException;


public class MainActivity extends AppCompatActivity {
    ListView list;
    SquadsListAdaptor adapter;
    Squads squads;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //create list of players from 1st squad in squads.json
        AssetManager assetManager = getResources().getAssets();
        try {
            String s =  IOUtils.toString(assetManager.open("tournament/squads.json"), "UTF-8");
            Gson g = new Gson();
            squads = g.fromJson(s,Squads.class);
            list=(ListView)findViewById(R.id.playerList);
            adapter=new SquadsListAdaptor(this, squads.getSquads().get(0).getPlayers(), assetManager);
            list.setAdapter(adapter);
            list.setOnItemClickListener(new OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                    // if user clicks on list item...
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
            Log.e("ERROR", "Invalid drawable file path!");
        }
    }
}
