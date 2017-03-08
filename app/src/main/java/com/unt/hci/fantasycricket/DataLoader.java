package com.unt.hci.fantasycricket;

import android.content.res.AssetManager;
import android.util.Log;

import com.google.gson.Gson;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import android.content.res.AssetManager;

/**
 * Created by jt on 3/8/17.
 */

public class DataLoader {

    private static DataLoader instance = null;

    //Read Data file into classes
    private StandingsData standings;
    private SquadsData squads;
    private MyTeamData myTeam;
    private ScoreData score; //reads scoring.json
    private AssetManager assetManager;

    public static DataLoader getInstance(AssetManager am){
        if( instance == null){
            instance = new DataLoader(am);
            Log.e("INFO", "New DataLoader!");
        }
        return instance;
    }
    private DataLoader(AssetManager am){
        assetManager = am;
        load();
    }
    private void load(){
        //load resource files
        Gson g = new Gson();
        String s;
        try {
            s =  IOUtils.toString(assetManager.open("tournament/match/1/scoring.json"), "UTF-8");
            score = g.fromJson(s, ScoreData.class);
            s =  IOUtils.toString(assetManager.open("tournament/squads.json"), "UTF-8");
            squads = g.fromJson(s,SquadsData.class);
            s =  IOUtils.toString(assetManager.open("groupStandings.json"), "UTF-8");
            standings = g.fromJson(s,StandingsData.class);
            s =  IOUtils.toString(assetManager.open("myTeam.json"), "UTF-8");
            myTeam = g.fromJson(s,MyTeamData.class);

        } catch (IOException e) {
            e.printStackTrace();
            Log.e("ERROR", "Invalid drawable file path!");
        }
    }
    public ScoreData getScore(){return score;}
    public SquadsData getSquads(){return squads;}
    public MyTeamData getMyTeam(){return myTeam;}
    public StandingsData getStandings(){return standings;}


}
