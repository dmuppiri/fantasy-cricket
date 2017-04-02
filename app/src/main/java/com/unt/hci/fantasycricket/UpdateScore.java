package com.unt.hci.fantasycricket;

import android.util.Log;

import java.util.List;

/**
 * Created by jt on 3/9/17.
 * Updated by Manoj on 04/01/2017
 */

public class UpdateScore {

    private int match_number;
    private List<MyTeamData.PlayersBean> myPlayers;
    private List<ScoreData.InningsBean.ScorecardBean.BattingStatsBean> battingStatsBeanList_innings_1;
    private List<ScoreData.InningsBean.ScorecardBean.BowlingStatsBean> bowlingStatsBeanList_innings_1;
    private List<ScoreData.InningsBean.ScorecardBean.BattingStatsBean> battingStatsBeanList_innings_2;
    private List<ScoreData.InningsBean.ScorecardBean.BowlingStatsBean> bowlingStatsBeanList_innings_2;
    private int batting_score;
    private int bowling_score;
    private int innings1_Runs=0;
    private int innings2_Runs=0;
    private int totalScore=0;
    private String TAG = "UPDATE_SCORE";
    public UpdateScore(MyTeamData teamData){

        //pre calculate fantasy scores
        DataLoader loader= DataLoader.getInstance(null);
        match_number = teamData.getMatch();
        myPlayers = teamData.getPlayers();

        battingStatsBeanList_innings_1 = loader.getScore(match_number).getInnings().get(0).getScorecard().getBattingStats();
        bowlingStatsBeanList_innings_1 = loader.getScore(match_number).getInnings().get(0).getScorecard().getBowlingStats();
        battingStatsBeanList_innings_2 = loader.getScore(match_number).getInnings().get(1).getScorecard().getBattingStats();
        bowlingStatsBeanList_innings_2 = loader.getScore(match_number).getInnings().get(1).getScorecard().getBowlingStats();
        innings1_Runs=loader.getScore(match_number).getInnings().get(0).getScorecard().getRuns();
        innings2_Runs=loader.getScore(match_number).getInnings().get(1).getScorecard().getRuns();
        batting_score = 0;
        bowling_score = 0;
        Log.d(TAG,"Innings 1 Runs  " +innings1_Runs);
        for(int i=0; i<battingStatsBeanList_innings_1.size();i++){
            for(int j=0; j<myPlayers.size();j++) {
                if(battingStatsBeanList_innings_1.get(i).getPlayerId()==myPlayers.get(j).getId()){
                    if(battingStatsBeanList_innings_1.get(i).getR()>0) {
                        int player_Score;
                        float playerRuns =((float)battingStatsBeanList_innings_1.get(i).getR()/(float)innings1_Runs) *100;
                        float playerStrikerate = Float.parseFloat(battingStatsBeanList_innings_1.get(i).getSr())/100;
                        player_Score = Math.round(playerRuns*playerStrikerate);
                        batting_score = batting_score + player_Score;
                    }
                }
            }
        }
        Log.d(TAG,"Innings 1 Batting score "+ batting_score);
        for(int i=0;i<bowlingStatsBeanList_innings_1.size();i++){
            for(int j=0;j<myPlayers.size();j++){
                if(bowlingStatsBeanList_innings_1.get(i).getPlayerId()==myPlayers.get(j).getId()){
                    int wickets = bowlingStatsBeanList_innings_1.get(i).getW()*10;
                    bowling_score = bowling_score + wickets;
                }
            }
        }
        Log.d(TAG,"Innings 1 Bowling Score"+ bowling_score);
        int innings1_points = (bowling_score + batting_score )/2;
        Log.d(TAG, "Innings 1 Score "+ innings1_points);




        //Innings 2
        batting_score = 0;
        bowling_score = 0;
        for(int i=0; i<battingStatsBeanList_innings_2.size();i++){
            for(int j=0; j<myPlayers.size();j++) {
                if(battingStatsBeanList_innings_2.get(i).getPlayerId()==myPlayers.get(j).getId()){
                    if(battingStatsBeanList_innings_2.get(i).getR()>0) {
                        int player_Score;
                        float playerRuns =((float)battingStatsBeanList_innings_2.get(i).getR()/(float)innings2_Runs) *100;
                        float playerStrikerate = Float.parseFloat(battingStatsBeanList_innings_2.get(i).getSr())/100;
                        player_Score = Math.round(playerRuns*playerStrikerate);
                        batting_score = batting_score + player_Score;
                    }
                }
            }
        }
        Log.d(TAG,"Innings 2 Batting score "+ batting_score);

        for(int i=0;i<bowlingStatsBeanList_innings_2.size();i++){
            for(int j=0;j<myPlayers.size();j++){
                if(bowlingStatsBeanList_innings_2.get(i).getPlayerId()==myPlayers.get(j).getId()){
                    int wickets = bowlingStatsBeanList_innings_2.get(i).getW()*10;
                    bowling_score = bowling_score + wickets;
                }
            }
        }
        Log.d(TAG,"Innings 2 Bowling Score"+ bowling_score);
        int innings2_points = (bowling_score + batting_score )/2;
        Log.d(TAG, "Innings 2 Score "+ innings2_points);
        totalScore = (innings1_points + innings2_points)/2;
        Log.d(TAG, "Total Score " + totalScore);
    }

    //take Myteam and match number
    //return fantasy score
    public int getScore(){
        return totalScore;
    }

}
