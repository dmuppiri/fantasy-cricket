package com.unt.hci.fantasycricket;

import android.content.res.AssetManager;
import android.util.Log;

import com.google.gson.Gson;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import android.content.res.AssetManager;

/**
 * Created by jt on 3/8/17.
 * Modified by deepak 3/23/2017
 */

public class DataLoader {

    private static DataLoader instance = null;

    //Read Data file into classes
    private StandingsData standings;
    private SquadsData squads;
    private MyTeamData myTeam;
    private ScoreData score; //reads scoring.json
    private TeamStatsData teamStatsData;
    private AssetManager assetManager;

    public static DataLoader getInstance(AssetManager am, int match_num){
        if( instance == null){
            instance = new DataLoader(am, match_num);
            Log.e("INFO", "New DataLoader!");
        }
        return instance;
    }
    private DataLoader(AssetManager am, int match_num){
        assetManager = am;
        load(match_num);
    }
    private void load(int match_num){
        //load resource files
        Gson g = new Gson();
        String s;
        try {
            s =  IOUtils.toString(assetManager.open("tournament/match/"+match_num+"/scoring.json"), "UTF-8");
            score = g.fromJson(s, ScoreData.class);
            s =  IOUtils.toString(assetManager.open("tournament/squads.json"), "UTF-8");
            squads = g.fromJson(s,SquadsData.class);
            s =  IOUtils.toString(assetManager.open("tournament/groupStandings.json"), "UTF-8");
            standings = g.fromJson(s,StandingsData.class);
            s =  IOUtils.toString(assetManager.open("myTeam.json"), "UTF-8");
            myTeam = g.fromJson(s,MyTeamData.class);
            s =  IOUtils.toString(assetManager.open("tournament/1_tournamentStats.json"), "UTF-8");
            teamStatsData = g.fromJson(s,TeamStatsData.class);

        } catch (IOException e) {
            e.printStackTrace();
            Log.e("ERROR", "Invalid file access");
        }
    }
    public ScoreData getScore(){return score;}
    public SquadsData getSquads(){return squads;}
    public MyTeamData getMyTeam(){return myTeam;}
    public StandingsData getStandings(){return standings;}
    public TeamStatsData getTeamStatsData(){return teamStatsData;}


}
