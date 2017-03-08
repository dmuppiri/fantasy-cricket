package com.unt.hci.fantasycricket;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by jt on 3/8/17.
 */

public class MyTeamData {


    /**
     * players : [{"id":1},{"id":2},{"id":3}]
     * match : 1
     * score : 30
     */

    private int match;
    private int score;
    private List<PlayersBean> players;

    public static MyTeamData objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), MyTeamData.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public int getMatch() {
        return match;
    }

    public void setMatch(int match) {
        this.match = match;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<PlayersBean> getPlayers() {
        return players;
    }

    public void setPlayers(List<PlayersBean> players) {
        this.players = players;
    }

    public static class PlayersBean {
        /**
         * id : 1
         */

        private int id;

        public static PlayersBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), PlayersBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
