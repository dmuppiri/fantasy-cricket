package com.unt.hci.fantasycricket;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by jt on 2/26/17.
 */

public class TournamentScheduleData {

    /**
     */

    private TournamentIdBean tournamentId;
    private List<ScheduleBean> schedule;

    public static TournamentScheduleData objectFromData(String str, String key) {
        // expects matchSchedule.json
        try {
            JSONObject jsonObject = new JSONObject(str);

            return new com.google.gson.Gson().fromJson(jsonObject.getString(str), TournamentScheduleData.class);
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

    public List<ScheduleBean> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<ScheduleBean> schedule) {
        this.schedule = schedule;
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

                return new com.google.gson.Gson().fromJson(jsonObject.getString(str), TournamentIdBean.class);
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

    public static class ScheduleBean {
        /**
         * photostreamLink : http://www.iplt20.com/photos/249/ipl-2015-match-1-kkr-v-mi
         * highlightsLink : http://www.iplt20.com/videos/media/id/4160910503001/m1-kkr-vs-mi-match-highlights
         * reportLink : http://www.iplt20.com/news/2015/match-reports/5780/report-m1-kkr-vs-mi
         * matchType : IPLT20
         * venue : {"shortName":"Eden Gardens","city":"Kolkata","id":2,"country":"India","fullName":"Eden Gardens"}
         * matchId : {"name":"ipl2015-01","id":3226}
         * groupName :
         * matchDate : 2015-04-08T20:00:00+0530
         * team1 : {"innings":[{"maxBalls":120,"runs":170,"wkts":3,"inningsNumber":2,"ballsFaced":111}],"team":{"shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","fullName":"Kolkata Knight Riders","id":5}}
         * team2 : {"innings":[{"maxBalls":120,"runs":168,"wkts":3,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","fullName":"Mumbai Indians","id":6}}
         * matchState : C
         * matchStatus : {"text":"Kolkata Knight Riders won by 7 wickets","outcome":"A"}
         * description : Match 1
         */

        private String matchType;
        private VenueBean venue;
        private MatchIdBean matchId;
        private String groupName;
        private String matchDate;
        private Team1Bean team1;
        private Team2Bean team2;
        private String matchState;
        private MatchStatusBean matchStatus;
        private String description;

        public static ScheduleBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new com.google.gson.Gson().fromJson(jsonObject.getString(str), ScheduleBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public String getMatchType() {
            return matchType;
        }

        public void setMatchType(String matchType) {
            this.matchType = matchType;
        }

        public VenueBean getVenue() {
            return venue;
        }

        public void setVenue(VenueBean venue) {
            this.venue = venue;
        }

        public MatchIdBean getMatchId() {
            return matchId;
        }

        public void setMatchId(MatchIdBean matchId) {
            this.matchId = matchId;
        }

        public String getGroupName() {
            return groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        public String getMatchDate() {
            return matchDate;
        }

        public void setMatchDate(String matchDate) {
            this.matchDate = matchDate;
        }

        public Team1Bean getTeam1() {
            return team1;
        }

        public void setTeam1(Team1Bean team1) {
            this.team1 = team1;
        }

        public Team2Bean getTeam2() {
            return team2;
        }

        public void setTeam2(Team2Bean team2) {
            this.team2 = team2;
        }

        public String getMatchState() {
            return matchState;
        }

        public void setMatchState(String matchState) {
            this.matchState = matchState;
        }

        public MatchStatusBean getMatchStatus() {
            return matchStatus;
        }

        public void setMatchStatus(MatchStatusBean matchStatus) {
            this.matchStatus = matchStatus;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public static class VenueBean {
            /**
             * shortName : Eden Gardens
             * city : Kolkata
             * id : 2
             * country : India
             * fullName : Eden Gardens
             */

            private String shortName;
            private String city;
            private int id;
            private String country;
            private String fullName;

            public static VenueBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new com.google.gson.Gson().fromJson(jsonObject.getString(str), VenueBean.class);
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

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public String getFullName() {
                return fullName;
            }

            public void setFullName(String fullName) {
                this.fullName = fullName;
            }
        }

        public static class MatchIdBean {
            /**
             * name : ipl2015-01
             * id : 3226
             */

            private String name;
            private int id;

            public static MatchIdBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new com.google.gson.Gson().fromJson(jsonObject.getString(str), MatchIdBean.class);
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

        public static class Team1Bean {
            /**
             * innings : [{"maxBalls":120,"runs":170,"wkts":3,"inningsNumber":2,"ballsFaced":111}]
             * team : {"shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","fullName":"Kolkata Knight Riders","id":5}
             */

            private TeamBean team;
            private List<InningsBean> innings;

            public static Team1Bean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new com.google.gson.Gson().fromJson(jsonObject.getString(str), Team1Bean.class);
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

            public List<InningsBean> getInnings() {
                return innings;
            }

            public void setInnings(List<InningsBean> innings) {
                this.innings = innings;
            }

            public static class TeamBean {
                /**
                 * shortName : Knight Riders
                 * abbreviation : KKR
                 * primaryColor : 6F2C91
                 * secondaryColor : FFFFFF
                 * type : m
                 * fullName : Kolkata Knight Riders
                 * id : 5
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

                        return new com.google.gson.Gson().fromJson(jsonObject.getString(str), TeamBean.class);
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

            public static class InningsBean {
                /**
                 * maxBalls : 120
                 * runs : 170
                 * wkts : 3
                 * inningsNumber : 2
                 * ballsFaced : 111
                 */

                private int maxBalls;
                private int runs;
                private int wkts;
                private int inningsNumber;
                private int ballsFaced;

                public static InningsBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new com.google.gson.Gson().fromJson(jsonObject.getString(str), InningsBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public int getMaxBalls() {
                    return maxBalls;
                }

                public void setMaxBalls(int maxBalls) {
                    this.maxBalls = maxBalls;
                }

                public int getRuns() {
                    return runs;
                }

                public void setRuns(int runs) {
                    this.runs = runs;
                }

                public int getWkts() {
                    return wkts;
                }

                public void setWkts(int wkts) {
                    this.wkts = wkts;
                }

                public int getInningsNumber() {
                    return inningsNumber;
                }

                public void setInningsNumber(int inningsNumber) {
                    this.inningsNumber = inningsNumber;
                }

                public int getBallsFaced() {
                    return ballsFaced;
                }

                public void setBallsFaced(int ballsFaced) {
                    this.ballsFaced = ballsFaced;
                }
            }
        }

        public static class Team2Bean {
            /**
             * innings : [{"maxBalls":120,"runs":168,"wkts":3,"inningsNumber":1,"ballsFaced":120}]
             * team : {"shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","fullName":"Mumbai Indians","id":6}
             */

            private TeamBeanX team;
            private List<InningsBeanX> innings;

            public static Team2Bean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new com.google.gson.Gson().fromJson(jsonObject.getString(str), Team2Bean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public TeamBeanX getTeam() {
                return team;
            }

            public void setTeam(TeamBeanX team) {
                this.team = team;
            }

            public List<InningsBeanX> getInnings() {
                return innings;
            }

            public void setInnings(List<InningsBeanX> innings) {
                this.innings = innings;
            }

            public static class TeamBeanX {
                /**
                 * shortName : Mumbai
                 * abbreviation : MI
                 * primaryColor : 00AEEF
                 * secondaryColor : FFFFFF
                 * type : m
                 * fullName : Mumbai Indians
                 * id : 6
                 */

                private String shortName;
                private String abbreviation;
                private String primaryColor;
                private String secondaryColor;
                private String type;
                private String fullName;
                private int id;

                public static TeamBeanX objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new com.google.gson.Gson().fromJson(jsonObject.getString(str), TeamBeanX.class);
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

            public static class InningsBeanX {
                /**
                 * maxBalls : 120
                 * runs : 168
                 * wkts : 3
                 * inningsNumber : 1
                 * ballsFaced : 120
                 */

                private int maxBalls;
                private int runs;
                private int wkts;
                private int inningsNumber;
                private int ballsFaced;

                public static InningsBeanX objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new com.google.gson.Gson().fromJson(jsonObject.getString(str), InningsBeanX.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public int getMaxBalls() {
                    return maxBalls;
                }

                public void setMaxBalls(int maxBalls) {
                    this.maxBalls = maxBalls;
                }

                public int getRuns() {
                    return runs;
                }

                public void setRuns(int runs) {
                    this.runs = runs;
                }

                public int getWkts() {
                    return wkts;
                }

                public void setWkts(int wkts) {
                    this.wkts = wkts;
                }

                public int getInningsNumber() {
                    return inningsNumber;
                }

                public void setInningsNumber(int inningsNumber) {
                    this.inningsNumber = inningsNumber;
                }

                public int getBallsFaced() {
                    return ballsFaced;
                }

                public void setBallsFaced(int ballsFaced) {
                    this.ballsFaced = ballsFaced;
                }
            }
        }

        public static class MatchStatusBean {
            /**
             * text : Kolkata Knight Riders won by 7 wickets
             * outcome : A
             */

            private String text;
            private String outcome;

            public static MatchStatusBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new com.google.gson.Gson().fromJson(jsonObject.getString(str), MatchStatusBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getOutcome() {
                return outcome;
            }

            public void setOutcome(String outcome) {
                this.outcome = outcome;
            }
        }
    }
}
