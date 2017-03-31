package com.unt.hci.fantasycricket;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import com.google.gson.Gson;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import android.content.res.AssetManager;

/**
 * Created by jt on 3/8/17.
 * Modified by deepak 3/23/2017
 */

public class DataLoader {

    private static DataLoader instance = null;
    private static String path = MenuActivity.ApplicationPath;
    //Read Data file into classes
    private StandingsData standings;
    private SquadsData squads;
    private MyTeamData myTeam;
    private ScoreData score; //reads scoring.json
    private TeamStatsData teamStatsData;
    private AssetManager assetManager;
    private int match_number;
    HashMap<Integer, TeamStatsData> teamStats;
    HashMap<Integer, TeamStatsData.PlayersStatsBean> players;
    HashMap<Integer, ScoreData> scores;

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
        players = new HashMap<>();
        teamStats = new HashMap<>();
        scores = new HashMap<>();

        String s;
        try {
            s =  IOUtils.toString(assetManager.open("tournament/squads.json"), "UTF-8");
            squads = g.fromJson(s,SquadsData.class);
            s =  IOUtils.toString(assetManager.open("tournament/groupStandings.json"), "UTF-8");
            standings = g.fromJson(s,StandingsData.class);

            //Read Myteam Json from internal Storage

            File file = new File(path);
            if(file.exists()) {
                System.out.println("MyTeam.json found");
                InputStream fs = new FileInputStream(path);
                s = IOUtils.toString(fs);
                System.out.println("MyTeam.json" + s);
                myTeam = g.fromJson(s, MyTeamData.class);
            }
            // If file doesn't exist read one from the assets folder
            else {
                System.out.println("File not Found");
                s =  IOUtils.toString(assetManager.open("myTeam.json"), "UTF-8");
                myTeam = g.fromJson(s,MyTeamData.class);
                String json = g.toJson(myTeam);
                FileOutputStream outputStream ;
                try {
                    outputStream = new FileOutputStream(path);
                    outputStream.write(json.getBytes());
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //read all scoring files and put into hash map
            for (int i =0; i < 60 ;i++){
                s =  IOUtils.toString(assetManager.open("tournament/match/"+(i+1)+"/scoring.json"), "UTF-8");
                score = g.fromJson(s, ScoreData.class);
                scores.put(i, score);
            }



            //collect and combine TeamStatsData. Make hash map of player id --> playerStats
            String [] teamids = {"1", "3","4","5","6","8","9","62"};
            TeamStatsData t;
            for (int i =0; i < teamids.length;i++){
                Log.e("INFO", "opening "+teamids[i]+"_tournamentStats.json");

                //collect team stats
                s =  IOUtils.toString(assetManager.open("tournament/"+teamids[i]+"_tournamentStats.json"), "UTF-8");
                t = g.fromJson(s, TeamStatsData.class);
                teamStats.put(t.getTeam().getId(), t);

                //create additional global player list
                TeamStatsData.PlayersStatsBean p;
                for (int j = 0; j < t.getPlayersStats().size(); j++) {
                    p = t.getPlayersStats().get(j);
                    players.put(p.getPlayer().getId(), p);
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
            Log.e("ERROR", "Invalid file access");
        }

        //create players by id

    }



    public ScoreData getScore(int match_number){return scores.get(match_number);}
    public SquadsData getSquads(){return squads;}
    public MyTeamData getMyTeam(){return myTeam;}
    public StandingsData getStandings(){return standings;}
    public TeamStatsData getTeamStatsData(){return teamStatsData;}
    public void WriteMyTeamData(MyTeamData myTeamData){
        Gson g = new Gson();
        String json = g.toJson(myTeamData);
        FileOutputStream outputStream ;
        try {
            outputStream = new FileOutputStream(path);
            outputStream.write(json.getBytes());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
