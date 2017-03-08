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

    //Read Data file into classes
    private StandingsData standings;
    private SquadsData squads;
    private AssetManager assetManager;
    private MyTeamData myTeam;

    private ScoreData score; //reads scoring.json
    private ListView list;
    private PlayerListAdaptor adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //read resource file for match 1 into score
        assetManager = getResources().getAssets();
        Gson g = new Gson();
        String s;
        try {
            s =  IOUtils.toString(assetManager.open("tournament/match/1/scoring.json"), "UTF-8");
            score = g.fromJson(s, ScoreData.class);
            s =  IOUtils.toString(assetManager.open("tournament/squads.json"), "UTF-8");
            squads = g.fromJson(s,SquadsData.class);
            s =  IOUtils.toString(assetManager.open("myTeam.json"), "UTF-8");
            myTeam = g.fromJson(s,MyTeamData.class);

        } catch (IOException e) {
            e.printStackTrace();
            Log.e("ERROR", "Invalid drawable file path!");
        }

        //put list of players in listView
        adapter=new PlayerListAdaptor(this,score.getMatchInfo().getTeams(), assetManager);
        list=(ListView)findViewById(R.id.playerList);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO: if user clicks on list item...
            }
        });


    }
}
