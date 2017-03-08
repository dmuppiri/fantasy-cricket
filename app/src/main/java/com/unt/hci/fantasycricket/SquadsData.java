package com.unt.hci.fantasycricket;

import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.List;


public class SquadsData {


    private TournamentIdBean tournamentId;
    private List<SquadsBean> squads;

    public static SquadsData objectFromData(String str) {
        // expecting squads.json

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), SquadsData.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public TournamentIdBean getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(TournamentIdBean tournamentId) {
        this.tournamentId = tournamentId;
    }

    public List<SquadsBean> getSquads() {
        return squads;
    }

    public void setSquads(List<SquadsBean> squads) {
        this.squads = squads;
    }

    public static class TournamentIdBean {
        /**
         * name : ipl2015
         * id : 2785
         */

        private String name;
        private int id;

        public static TournamentIdBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), TournamentIdBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public static class SquadsBean {
        /**
         * players : [{"names":["MS Dhoni","MS Dhoni"],"dateOfBirth":363312000000,"shortName":"MS Dhoni","nationality":"Indian","id":1,"fullName":"MS Dhoni"},{"names":["Ashish Nehra","A Nehra"],"dateOfBirth":294192000000,"shortName":"A Nehra","nationality":"Indian","id":115,"fullName":"Ashish Nehra"},{"names":["Baba Aparajith","B Aparajith"],"dateOfBirth":773625600000,"rightHandedBat":true,"shortName":"B Aparajith","nationality":"Indian","id":1084,"fullName":"Baba Aparajith"},{"names":["Brendon McCullum","B McCullum"],"dateOfBirth":370396800000,"shortName":"B McCullum","nationality":"New Zealander","id":202,"fullName":"Brendon McCullum"},{"names":["Dwayne Bravo","DJ Bravo"],"dateOfBirth":434332800000,"shortName":"DJ Bravo","nationality":"West Indian","id":25,"fullName":"Dwayne Bravo"},{"names":["Dwayne Smith","DR Smith"],"dateOfBirth":418953600000,"shortName":"DR Smith","nationality":"West Indian","id":413,"fullName":"Dwayne Smith"},{"names":["Francois du Plessis","F du Plessis"],"dateOfBirth":458524800000,"shortName":"F du Plessis","nationality":"South African","id":24,"fullName":"Francois du Plessis"},{"names":["Ishwar Pandey","I Pandey"],"dateOfBirth":619142400000,"rightHandedBat":true,"shortName":"I Pandey","nationality":"Indian","id":1090,"fullName":"Ishwar Pandey"},{"names":["Matt Henry","M Henry"],"dateOfBirth":692668800000,"rightHandedBat":true,"shortName":"M Henry","nationality":"New Zealander","id":1505,"fullName":"Matt Henry"},{"names":["Mithun Manhas","M Manhas"],"dateOfBirth":308534400000,"shortName":"M Manhas","nationality":"Indian","id":124,"fullName":"Mithun Manhas"},{"names":["Mohit Sharma","M Sharma"],"dateOfBirth":693100800000,"rightHandedBat":true,"shortName":"M Sharma","nationality":"Indian","id":1107,"fullName":"Mohit Sharma"},{"names":["Pawan Negi","P Negi"],"dateOfBirth":410659200000,"shortName":"P Negi","nationality":"Indian","id":53,"fullName":"Pawan Negi"},{"names":["Ravichandran Ashwin","R Ashwin"],"dateOfBirth":527299200000,"shortName":"R Ashwin","nationality":"Indian","id":8,"fullName":"Ravichandran Ashwin"},{"names":["Ravindra Jadeja","R Jadeja"],"dateOfBirth":597369600000,"shortName":"R Jadeja","nationality":"Indian","id":9,"fullName":"Ravindra Jadeja"},{"names":["Samuel Badree","S Badree"],"dateOfBirth":352944000000,"rightHandedBat":true,"shortName":"S Badree","nationality":"West Indian","id":590,"fullName":"Samuel Badree"},{"names":["Suresh Raina","S Raina"],"dateOfBirth":533433600000,"shortName":"S Raina","nationality":"Indian","id":14,"fullName":"Suresh Raina"},{"names":["Ronit More","R More"],"dateOfBirth":697766400000,"shortName":"R More","nationality":"Indian","id":277,"fullName":"Ronit More"},{"names":["Michael Hussey","M Hussey"],"dateOfBirth":170380800000,"shortName":"M Hussey","nationality":"Australian","id":20,"fullName":"Michael Hussey"},{"names":["Rahul Sharma","R Sharma"],"dateOfBirth":533692800000,"shortName":"R Sharma","nationality":"Indian","id":126,"fullName":"Rahul Sharma"},{"names":["Kyle Abbott","K Abbott"],"dateOfBirth":550972800000,"rightHandedBat":true,"shortName":"K Abbott","nationality":"South African","id":1105,"fullName":"Kyle Abbott"},{"names":["Ankush Bains","A Bains"],"dateOfBirth":819072000000,"rightHandedBat":true,"shortName":"A Bains","nationality":"Indian","id":1558,"fullName":"Ankush Bains"},{"names":["Irfan Pathan","I Pathan"],"dateOfBirth":467683200000,"shortName":"I Pathan","nationality":"Indian","id":49,"fullName":"Irfan Pathan"},{"names":["Pratyush Singh","P Singh"],"dateOfBirth":778636800000,"rightHandedBat":true,"shortName":"P Singh","nationality":"Indian","id":2731,"fullName":"Pratyush Singh"},{"names":["Andrew Tye","A Tye"],"dateOfBirth":534729600000,"rightHandedBat":true,"shortName":"A Tye","nationality":"Australian","id":1480,"fullName":"Andrew Tye"},{"names":["Eklavya Dwivedi ","E Dwivedi "],"dateOfBirth":585532800000,"shortName":"E Dwivedi ","nationality":"Indian","id":118,"fullName":"Eklavya Dwivedi "}]
         * team : {"shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"FFFFFF","type":"m","fullName":"Chennai Super Kings","id":1}
         * captainId : 1
         * wicketKeeperId : 1
         * id : 460
         */

        private TeamBean team;
        private int captainId;
        private int wicketKeeperId;
        private int id;
        private List<PlayersBean> players;

        public static SquadsBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), SquadsBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public TeamBean getTeam() {
            return team;
        }

        public void setTeam(TeamBean team) {
            this.team = team;
        }

        public int getCaptainId() {
            return captainId;
        }

        public void setCaptainId(int captainId) {
            this.captainId = captainId;
        }

        public int getWicketKeeperId() {
            return wicketKeeperId;
        }

        public void setWicketKeeperId(int wicketKeeperId) {
            this.wicketKeeperId = wicketKeeperId;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public List<PlayersBean> getPlayers() {
            return players;
        }

        public void setPlayers(List<PlayersBean> players) {
            this.players = players;
        }

        public static class TeamBean {
            /**
             * shortName : Super Kings
             * abbreviation : CSK
             * primaryColor : FDB913
             * secondaryColor : FFFFFF
             * type : m
             * fullName : Chennai Super Kings
             * id : 1
             */

            private String shortName;
            private String abbreviation;
            private String primaryColor;
            private String secondaryColor;
            private String type;
            private String fullName;
            private int id;

            public static TeamBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), TeamBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public String getShortName() {
                return shortName;
            }

            public void setShortName(String shortName) {
                this.shortName = shortName;
            }

            public String getAbbreviation() {
                return abbreviation;
            }

            public void setAbbreviation(String abbreviation) {
                this.abbreviation = abbreviation;
            }

            public String getPrimaryColor() {
                return primaryColor;
            }

            public void setPrimaryColor(String primaryColor) {
                this.primaryColor = primaryColor;
            }

            public String getSecondaryColor() {
                return secondaryColor;
            }

            public void setSecondaryColor(String secondaryColor) {
                this.secondaryColor = secondaryColor;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getFullName() {
                return fullName;
            }

            public void setFullName(String fullName) {
                this.fullName = fullName;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class PlayersBean {
            /**
             * names : ["MS Dhoni","MS Dhoni"]
             * dateOfBirth : 363312000000
             * shortName : MS Dhoni
             * nationality : Indian
             * id : 1
             * fullName : MS Dhoni
             * rightHandedBat : true
             */

            private long dateOfBirth;
            private String shortName;
            private String nationality;
            private int id;
            private String fullName;
            private boolean rightHandedBat;
            private List<String> names;

            public static PlayersBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), PlayersBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public long getDateOfBirth() {
                return dateOfBirth;
            }

            public void setDateOfBirth(long dateOfBirth) {
                this.dateOfBirth = dateOfBirth;
            }

            public String getShortName() {
                return shortName;
            }

            public void setShortName(String shortName) {
                this.shortName = shortName;
            }

            public String getNationality() {
                return nationality;
            }

            public void setNationality(String nationality) {
                this.nationality = nationality;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getFullName() {
                return fullName;
            }

            public void setFullName(String fullName) {
                this.fullName = fullName;
            }

            public boolean isRightHandedBat() {
                return rightHandedBat;
            }

            public void setRightHandedBat(boolean rightHandedBat) {
                this.rightHandedBat = rightHandedBat;
            }

            public List<String> getNames() {
                return names;
            }

            public void setNames(List<String> names) {
                this.names = names;
            }
        }
    }
}


