package com.unt.hci.fantasycricket;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by jt on 2/26/17.
 */

public class ScoreData {


    /**
     * matchInfo : {"matchDate":"2015-04-08T20:00:00+0530","teams":[{"team":{"shortName":"Knight Riders","secondaryColor":"FFFFFF","abbreviation":"KKR","primaryColor":"6F2C91","type":"m","fullName":"Kolkata Knight Riders","id":5},"players":[{"names":["Gautam Gambhir","G Gambhir"],"dateOfBirth":371865600000,"shortName":"G Gambhir","nationality":"Indian","id":84,"fullName":"Gautam Gambhir","rightHandedBat":true},{"names":["Robin Uthappa","R Uthappa"],"dateOfBirth":500515200000,"shortName":"R Uthappa","nationality":"Indian","id":127,"fullName":"Robin Uthappa"},{"names":["Manish Pandey","M Pandey"],"dateOfBirth":621388800000,"shortName":"M Pandey","nationality":"Indian","id":123,"fullName":"Manish Pandey"},{"names":["Suryakumar Yadav","S Yadav"],"rightHandedBat":true,"dateOfBirth":653270400000,"shortName":"S Yadav","nationality":"Indian","id":108,"fullName":"Suryakumar Yadav"},{"names":["Yusuf Pathan","Y Pathan"],"dateOfBirth":406339200000,"shortName":"Y Pathan","nationality":"Indian","id":96,"fullName":"Yusuf Pathan"},{"names":["Shakib Al Hasan","S Al Hasan"],"dateOfBirth":543542400000,"shortName":"S Al Hasan","nationality":"Bangladeshi","id":201,"fullName":"Shakib Al Hasan"},{"names":["Andre Russell","A Russell"],"dateOfBirth":578275200000,"shortName":"A Russell","nationality":"West Indian","id":177,"fullName":"Andre Russell"},{"names":["Piyush Chawla","P Chawla"],"dateOfBirth":598924800000,"shortName":"P Chawla","nationality":"Indian","id":76,"fullName":"Piyush Chawla"},{"names":["Sunil Narine","S Narine"],"dateOfBirth":580608000000,"shortName":"S Narine","nationality":"West Indian","id":203,"fullName":"Sunil Narine"},{"names":["Umesh Yadav","U Yadav"],"dateOfBirth":562118400000,"shortName":"U Yadav","nationality":"Indian","id":59,"fullName":"Umesh Yadav"},{"names":["Morne Morkel","M Morkel"],"dateOfBirth":465868800000,"shortName":"M Morkel","nationality":"South African","id":169,"fullName":"Morne Morkel"}],"wicketKeeper":{"names":["Robin Uthappa","R Uthappa"],"dateOfBirth":500515200000,"shortName":"R Uthappa","nationality":"Indian","id":127,"fullName":"Robin Uthappa"},"captain":{"names":["Gautam Gambhir","G Gambhir"],"dateOfBirth":371865600000,"shortName":"G Gambhir","nationality":"Indian","id":84,"fullName":"Gautam Gambhir"},"id":3645},{"team":{"shortName":"Mumbai","secondaryColor":"FFFFFF","abbreviation":"MI","primaryColor":"00AEEF","type":"m","fullName":"Mumbai Indians","id":6},"players":[{"names":["Rohit Sharma","RG Sharma"],"rightHandedBat":true,"dateOfBirth":546739200000,"shortName":"RG Sharma","nationality":"Indian","id":107,"fullName":"Rohit Sharma"},{"names":["Aaron Finch","A Finch"],"dateOfBirth":532569600000,"shortName":"A Finch","nationality":"Australian","id":167,"fullName":"Aaron Finch"},{"names":["Ambati Rayudu","A Rayudu"],"rightHandedBat":true,"dateOfBirth":496281600000,"shortName":"A Rayudu","nationality":"Indian","id":100,"fullName":"Ambati Rayudu"},{"names":["Aditya Tare","A Tare"],"rightHandedBat":true,"dateOfBirth":1330300800000,"shortName":"A Tare","nationality":"Indian","id":99,"fullName":"Aditya Tare"},{"names":["Corey Anderson","C Anderson"],"dateOfBirth":661046400000,"shortName":"C Anderson","nationality":"New Zealander","id":968,"fullName":"Corey Anderson"},{"names":["Kieron Pollard","K Pollard"],"rightHandedBat":true,"dateOfBirth":547776000000,"shortName":"K Pollard","nationality":"West Indian","id":210,"fullName":"Kieron Pollard"},{"names":["Harbhajan Singh","H Singh"],"rightHandedBat":true,"dateOfBirth":331430400000,"shortName":"H Singh","nationality":"Indian","id":103,"fullName":"Harbhajan Singh"},{"names":["Lasith Malinga","L Malinga"],"rightHandedBat":true,"dateOfBirth":430876800000,"shortName":"L Malinga","nationality":"Sri Lankan","id":211,"fullName":"Lasith Malinga"},{"names":["Vinay Kumar","V Kumar"],"dateOfBirth":445392000000,"shortName":"V Kumar","nationality":"Indian","id":166,"fullName":"Vinay Kumar"},{"names":["Jasprit Bumrah","J Bumrah"],"rightHandedBat":true,"dateOfBirth":755136000000,"shortName":"J Bumrah","nationality":"Indian","id":1124,"fullName":"Jasprit Bumrah"},{"names":["Pragyan Ojha","P Ojha"],"rightHandedBat":true,"dateOfBirth":1330300800000,"shortName":"P Ojha","nationality":"Indian","id":106,"fullName":"Pragyan Ojha"}],"wicketKeeper":{"names":["Aditya Tare","A Tare"],"rightHandedBat":true,"dateOfBirth":1330300800000,"shortName":"A Tare","nationality":"Indian","id":99,"fullName":"Aditya Tare"},"captain":{"names":["Rohit Sharma","RG Sharma"],"rightHandedBat":true,"dateOfBirth":546739200000,"shortName":"RG Sharma","nationality":"Indian","id":107,"fullName":"Rohit Sharma"},"id":3644}],"isLimitedOvers":true,"matchStatus":{"text":"Kolkata Knight Riders won by 7 wickets","outcome":"A"},"matchSummary":"","tournamentLabel":"IPL 2015","matchState":"C","matchType":"IPLT20","battingOrder":[1,0],"venue":{"shortName":"Eden Gardens","city":"Kolkata","id":2,"country":"India","fullName":"Eden Gardens"},"additionalInfo":{"toss.elected":"Kolkata Knight Riders, who chose to field","match.video.id":"4160910503001","stats.link":"http://www.iplt20.com/news/2015/more-news/5805/quick-stats-m1-kkr-vs-mi","match.summary":"","photostream.link":"http://www.iplt20.com/photos/249/ipl-2015-match-1-kkr-v-mi","mom.video.id":"4160910506001","home.team.fan.total":"31514","notes.1.1":"Powerplay 1 - 37 runs, 3 wickets","away.team.fan.total":"15640","notes.1.2":"MI: 50 runs in 8.5 overs","umpire.name.3":"Pashchim Pathak","notes.1.3":"Rohit Sharma: 50 off 46 balls (6 x four, 1 x six)","umpire.name.4":"Virender Sharma","umpire.name.1":"S Ravi","notes.1.4":"4th Wicket: 50 runs in 55 balls (Rohit Sharma 27, Corey Anderson 23)","umpire.name.2":"Chettithody Shamshuddin","notes.1.5":"MI: 100 runs in 14.6 overs","notes.1.6":"MI: 150 runs in 19.1 overs","notes.1.7":"Corey Anderson: 50 off 41 balls (4 x fours, 3 x sixes)","notes.1.8":"Innings Break: MI - 168/3 in 20 overs","highlights.link":"http://www.iplt20.com/videos/media/id/4160910503001/m1-kkr-vs-mi-match-highlights","result.playerofthematch":"Morne Morkel","mom.video.thumb":"http://brightcove.vo.llnwd.net/v1/unsecured/media/3588749423001/201504/3233/3588749423001_4161115685001_video-still-for-video-4160910506001.jpg?pubId=3588749423001","interview.link":"http://www.iplt20.com/news/2015/features/5789/morkel-relishes-day-out-at-eden-gardens","sixes.video.id":"4160910475001","interview.thumb":"http://static2.iplt20.com/cms/media/images/320x213/34398.jpg","referee.name":"Javagal Srinath","match.video.thumb":"http://brightcove.vo.llnwd.net/v1/unsecured/media/3588749423001/201504/2063/3588749423001_4161115675001_video-still-for-video-4160910503001.jpg?pubId=3588749423001","stats.thumb":"http://static2.iplt20.com/cms/media/images/320x213/34468.jpg","toss.winner":"Kolkata Knight Riders","notes.2.5":"Gautam Gambhir: 50 off 39 balls (6 x fours, 1 x six)","sixes.video.thumb":"http://brightcove.vo.llnwd.net/v1/unsecured/media/3588749423001/201504/3105/3588749423001_4161009085001_video-still-for-video-4160910475001.jpg?pubId=3588749423001","notes.2.6":"KKR: 150 runs in 16.6 overs","notes.2.3":"2nd Wicket: 50 runs in 32 balls (Gautam Gambhir 29, Manish Pandey 20)","notes.2.4":"KKR: 100 runs in 12.2 overs","report.thumb":"http://static2.iplt20.com/cms/media/images/320x213/34393.jpg","notes.2.1":"Powerplay 1 - 38 runs, 1 wicket","notes.2.2":"KKR: 50 runs in 7.1 overs","report.link":"http://www.iplt20.com/news/2015/match-reports/5780/report-m1-kkr-vs-mi"},"oversLimit":20,"description":"Match 1"}
     * currentState : {"currentInningsIndex":1,"currentBowler":166,"currentBatsmen":[108,96],"recentOvers":[{"ovNo":14,"ovBalls":["1","4","1","1","1","2"]},{"ovNo":15,"ovBalls":["4","W","6","1",".","1"]},{"ovNo":16,"ovBalls":[".",".",".","1",".","1"]},{"ovNo":17,"ovBalls":["1Wd",".","6",".","6","1","6"]},{"ovNo":18,"ovBalls":["1","4",".","1","6","2"]},{"ovNo":19,"ovBalls":[".","1","4"]}],"currentPartnership":49,"phase":"C","nonFacingBatsman":96,"facingBatsman":108}
     * matchId : {"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-01","id":3226}
     * innings : [{"overHistory":[{"ovNo":1,"ovBalls":[".","1","1","1","1Lb","."]},{"ovNo":2,"ovBalls":["4",".","W",".",".","1"]},{"ovNo":3,"ovBalls":["4",".",".","4",".","4"]},{"ovNo":4,"ovBalls":[".","4","1",".","1","1"]},{"ovNo":5,"ovBalls":["1",".","6","1",".","1Wd","W"]},{"ovNo":6,"ovBalls":[".","W",".",".",".","."]},{"ovNo":7,"ovBalls":["4",".",".","1",".","."]},{"ovNo":8,"ovBalls":["1",".",".","4",".","1"]},{"ovNo":9,"ovBalls":["1",".",".",".","4","1"]},{"ovNo":10,"ovBalls":[".",".","1",".","1","1"]},{"ovNo":11,"ovBalls":["2","1",".","1","1","4"]},{"ovNo":12,"ovBalls":["1",".",".","1","1","."]},{"ovNo":13,"ovBalls":[".","1","1",".","1","4"]},{"ovNo":14,"ovBalls":["1","1","1","1",".","."]},{"ovNo":15,"ovBalls":["2","1","4","4","6","4"]},{"ovNo":16,"ovBalls":["1",".",".","4","1","2"]},{"ovNo":17,"ovBalls":["1","1",".","4","6","1"]},{"ovNo":18,"ovBalls":["1Wd","4",".","1",".","4","1"]},{"ovNo":19,"ovBalls":["6","1","6","1",".","1"]},{"ovNo":20,"ovBalls":["6","2","1","4","1","6"]}],"scorecard":{"fow":[{"playerId":167,"r":8,"w":1,"bp":{"innings":1,"over":2,"ball":3}},{"playerId":99,"r":37,"w":2,"bp":{"innings":1,"over":5,"ball":6}},{"playerId":100,"r":37,"w":3,"bp":{"innings":1,"over":6,"ball":2}}],"battingStats":[{"playerId":107,"r":98,"b":65,"4s":12,"6s":4,"sr":"150.76"},{"mod":{"text":"c Umesh Yadav b Morne Morkel","additionalPlayerIds":[59],"dismissedMethod":"ct","dismissedBp":{"innings":1,"over":2,"ball":3},"countingBp":{"innings":1,"over":2,"ball":3},"bowlerId":169},"playerId":167,"r":5,"b":5,"4s":1,"6s":0,"sr":"100.00"},{"mod":{"text":"c Umesh Yadav b Shakib Al Hasan","additionalPlayerIds":[59],"dismissedMethod":"ct","dismissedBp":{"innings":1,"over":5,"ball":7},"countingBp":{"innings":1,"over":5,"ball":6},"bowlerId":201},"playerId":99,"r":7,"b":7,"4s":1,"6s":0,"sr":"100.00"},{"mod":{"text":"c Yusuf Pathan b Morne Morkel","additionalPlayerIds":[96],"dismissedMethod":"ct","dismissedBp":{"innings":1,"over":6,"ball":2},"countingBp":{"innings":1,"over":6,"ball":2},"bowlerId":169},"playerId":100,"r":0,"b":2,"4s":0,"6s":0,"sr":"0.00"},{"playerId":968,"r":55,"b":41,"4s":4,"6s":3,"sr":"134.14"}],"bowlingStats":[{"playerId":59,"r":36,"w":0,"ov":"3","d":6,"maid":0,"e":"12.00","wd":0,"nb":0},{"playerId":169,"r":18,"w":2,"ov":"4","d":15,"maid":1,"e":"4.50","wd":0,"nb":0},{"playerId":201,"r":48,"w":1,"ov":"4","d":7,"maid":0,"e":"12.00","wd":2,"nb":0},{"playerId":203,"r":28,"w":0,"ov":"4","d":10,"maid":0,"e":"7.00","wd":0,"nb":0},{"playerId":177,"r":21,"w":0,"ov":"3","d":7,"maid":0,"e":"7.00","wd":0,"nb":0},{"playerId":76,"r":16,"w":0,"ov":"2","d":3,"maid":0,"e":"8.00","wd":0,"nb":0}],"wkts":3,"extras":{"wideRuns":2,"legByeRuns":1},"runs":168},"overProgress":"20","runRate":"8.40","inningsNumber":1},{"overHistory":[{"ovNo":1,"ovBalls":["1","1Wd","1Lb",".",".",".","."]},{"ovNo":2,"ovBalls":[".","1",".",".","1","."]},{"ovNo":3,"ovBalls":["6",".","1","1","W","."]},{"ovNo":4,"ovBalls":["4","1Lb","1",".",".","."]},{"ovNo":5,"ovBalls":[".","6","4","2","1","."]},{"ovNo":6,"ovBalls":["4",".","1",".",".","1"]},{"ovNo":7,"ovBalls":[".","2","6","1","1","1"]},{"ovNo":8,"ovBalls":["4","2","2","4",".","1"]},{"ovNo":9,"ovBalls":["1","6","1","1","1","2"]},{"ovNo":10,"ovBalls":["1","1",".","1","4","4"]},{"ovNo":11,"ovBalls":[".","6","1",".","1","1"]},{"ovNo":12,"ovBalls":["1",".","1","1","1","W"]},{"ovNo":13,"ovBalls":[".","6","1","1","1","."]},{"ovNo":14,"ovBalls":["1","4","1","1","1","2"]},{"ovNo":15,"ovBalls":["4","W","6","1",".","1"]},{"ovNo":16,"ovBalls":[".",".",".","1",".","1"]},{"ovNo":17,"ovBalls":["1Wd",".","6",".","6","1","6"]},{"ovNo":18,"ovBalls":["1","4",".","1","6","2"]},{"ovNo":19,"ovBalls":[".","1","4"]}],"scorecard":{"fow":[{"playerId":127,"r":13,"w":1,"bp":{"innings":2,"over":3,"ball":5}},{"playerId":123,"r":98,"w":2,"bp":{"innings":2,"over":12,"ball":6}},{"playerId":84,"r":121,"w":3,"bp":{"innings":2,"over":15,"ball":2}}],"battingStats":[{"mod":{"text":"c Harbhajan Singh b Corey Anderson","additionalPlayerIds":[103],"dismissedMethod":"ct","dismissedBp":{"innings":2,"over":3,"ball":5},"countingBp":{"innings":2,"over":3,"ball":5},"bowlerId":968},"playerId":127,"r":9,"b":12,"4s":0,"6s":1,"sr":"75.00"},{"mod":{"text":"c Ambati Rayudu b Jasprit Bumrah","additionalPlayerIds":[100],"dismissedMethod":"ct","dismissedBp":{"innings":2,"over":15,"ball":2},"countingBp":{"innings":2,"over":15,"ball":2},"bowlerId":1124},"playerId":84,"r":57,"b":43,"4s":7,"6s":1,"sr":"132.55"},{"mod":{"text":"c Kieron Pollard b Harbhajan Singh","additionalPlayerIds":[210],"dismissedMethod":"ct","dismissedBp":{"innings":2,"over":12,"ball":6},"countingBp":{"innings":2,"over":12,"ball":6},"bowlerId":103},"playerId":123,"r":40,"b":24,"4s":2,"6s":3,"sr":"166.66"},{"playerId":108,"r":46,"b":20,"4s":1,"6s":5,"sr":"230.00"},{"playerId":96,"r":14,"b":12,"4s":1,"6s":1,"sr":"116.66"}],"bowlingStats":[{"playerId":211,"r":27,"w":0,"ov":"4","d":12,"maid":0,"e":"6.75","wd":1,"nb":0},{"playerId":166,"r":21,"w":0,"ov":"3.3","d":11,"maid":0,"e":"6.00","wd":0,"nb":0},{"playerId":968,"r":21,"w":1,"ov":"2","d":5,"maid":0,"e":"10.50","wd":0,"nb":0},{"playerId":1124,"r":38,"w":1,"ov":"3","d":7,"maid":0,"e":"12.66","wd":1,"nb":0},{"playerId":106,"r":23,"w":0,"ov":"2","d":1,"maid":0,"e":"11.50","wd":0,"nb":0},{"playerId":103,"r":38,"w":1,"ov":"4","d":4,"maid":0,"e":"9.50","wd":0,"nb":0}],"wkts":3,"extras":{"wideRuns":2,"legByeRuns":2},"runs":170},"overProgress":"18.3","runRate":"9.18","inningsNumber":2}]
     */

    private MatchInfoBean matchInfo;
    private CurrentStateBean currentState;
    private MatchIdBean matchId;
    private List<InningsBean> innings;

    public static ScoreData objectFromData(String str, String key) {

        // expecting scoring.json
        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), ScoreData.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public MatchInfoBean getMatchInfo() {
        return matchInfo;
    }

    public void setMatchInfo(MatchInfoBean matchInfo) {
        this.matchInfo = matchInfo;
    }

    public CurrentStateBean getCurrentState() {
        return currentState;
    }

    public void setCurrentState(CurrentStateBean currentState) {
        this.currentState = currentState;
    }

    public MatchIdBean getMatchId() {
        return matchId;
    }

    public void setMatchId(MatchIdBean matchId) {
        this.matchId = matchId;
    }

    public List<InningsBean> getInnings() {
        return innings;
    }

    public void setInnings(List<InningsBean> innings) {
        this.innings = innings;
    }

    public static class MatchInfoBean {
        /**
         * matchDate : 2015-04-08T20:00:00+0530
         * teams : [{"team":{"shortName":"Knight Riders","secondaryColor":"FFFFFF","abbreviation":"KKR","primaryColor":"6F2C91","type":"m","fullName":"Kolkata Knight Riders","id":5},"players":[{"names":["Gautam Gambhir","G Gambhir"],"dateOfBirth":371865600000,"shortName":"G Gambhir","nationality":"Indian","id":84,"fullName":"Gautam Gambhir"},{"names":["Robin Uthappa","R Uthappa"],"dateOfBirth":500515200000,"shortName":"R Uthappa","nationality":"Indian","id":127,"fullName":"Robin Uthappa"},{"names":["Manish Pandey","M Pandey"],"dateOfBirth":621388800000,"shortName":"M Pandey","nationality":"Indian","id":123,"fullName":"Manish Pandey"},{"names":["Suryakumar Yadav","S Yadav"],"rightHandedBat":true,"dateOfBirth":653270400000,"shortName":"S Yadav","nationality":"Indian","id":108,"fullName":"Suryakumar Yadav"},{"names":["Yusuf Pathan","Y Pathan"],"dateOfBirth":406339200000,"shortName":"Y Pathan","nationality":"Indian","id":96,"fullName":"Yusuf Pathan"},{"names":["Shakib Al Hasan","S Al Hasan"],"dateOfBirth":543542400000,"shortName":"S Al Hasan","nationality":"Bangladeshi","id":201,"fullName":"Shakib Al Hasan"},{"names":["Andre Russell","A Russell"],"dateOfBirth":578275200000,"shortName":"A Russell","nationality":"West Indian","id":177,"fullName":"Andre Russell"},{"names":["Piyush Chawla","P Chawla"],"dateOfBirth":598924800000,"shortName":"P Chawla","nationality":"Indian","id":76,"fullName":"Piyush Chawla"},{"names":["Sunil Narine","S Narine"],"dateOfBirth":580608000000,"shortName":"S Narine","nationality":"West Indian","id":203,"fullName":"Sunil Narine"},{"names":["Umesh Yadav","U Yadav"],"dateOfBirth":562118400000,"shortName":"U Yadav","nationality":"Indian","id":59,"fullName":"Umesh Yadav"},{"names":["Morne Morkel","M Morkel"],"dateOfBirth":465868800000,"shortName":"M Morkel","nationality":"South African","id":169,"fullName":"Morne Morkel"}],"wicketKeeper":{"names":["Robin Uthappa","R Uthappa"],"dateOfBirth":500515200000,"shortName":"R Uthappa","nationality":"Indian","id":127,"fullName":"Robin Uthappa"},"captain":{"names":["Gautam Gambhir","G Gambhir"],"dateOfBirth":371865600000,"shortName":"G Gambhir","nationality":"Indian","id":84,"fullName":"Gautam Gambhir"},"id":3645},{"team":{"shortName":"Mumbai","secondaryColor":"FFFFFF","abbreviation":"MI","primaryColor":"00AEEF","type":"m","fullName":"Mumbai Indians","id":6},"players":[{"names":["Rohit Sharma","RG Sharma"],"rightHandedBat":true,"dateOfBirth":546739200000,"shortName":"RG Sharma","nationality":"Indian","id":107,"fullName":"Rohit Sharma"},{"names":["Aaron Finch","A Finch"],"dateOfBirth":532569600000,"shortName":"A Finch","nationality":"Australian","id":167,"fullName":"Aaron Finch"},{"names":["Ambati Rayudu","A Rayudu"],"rightHandedBat":true,"dateOfBirth":496281600000,"shortName":"A Rayudu","nationality":"Indian","id":100,"fullName":"Ambati Rayudu"},{"names":["Aditya Tare","A Tare"],"rightHandedBat":true,"dateOfBirth":1330300800000,"shortName":"A Tare","nationality":"Indian","id":99,"fullName":"Aditya Tare"},{"names":["Corey Anderson","C Anderson"],"dateOfBirth":661046400000,"shortName":"C Anderson","nationality":"New Zealander","id":968,"fullName":"Corey Anderson"},{"names":["Kieron Pollard","K Pollard"],"rightHandedBat":true,"dateOfBirth":547776000000,"shortName":"K Pollard","nationality":"West Indian","id":210,"fullName":"Kieron Pollard"},{"names":["Harbhajan Singh","H Singh"],"rightHandedBat":true,"dateOfBirth":331430400000,"shortName":"H Singh","nationality":"Indian","id":103,"fullName":"Harbhajan Singh"},{"names":["Lasith Malinga","L Malinga"],"rightHandedBat":true,"dateOfBirth":430876800000,"shortName":"L Malinga","nationality":"Sri Lankan","id":211,"fullName":"Lasith Malinga"},{"names":["Vinay Kumar","V Kumar"],"dateOfBirth":445392000000,"shortName":"V Kumar","nationality":"Indian","id":166,"fullName":"Vinay Kumar"},{"names":["Jasprit Bumrah","J Bumrah"],"rightHandedBat":true,"dateOfBirth":755136000000,"shortName":"J Bumrah","nationality":"Indian","id":1124,"fullName":"Jasprit Bumrah"},{"names":["Pragyan Ojha","P Ojha"],"rightHandedBat":true,"dateOfBirth":1330300800000,"shortName":"P Ojha","nationality":"Indian","id":106,"fullName":"Pragyan Ojha"}],"wicketKeeper":{"names":["Aditya Tare","A Tare"],"rightHandedBat":true,"dateOfBirth":1330300800000,"shortName":"A Tare","nationality":"Indian","id":99,"fullName":"Aditya Tare"},"captain":{"names":["Rohit Sharma","RG Sharma"],"rightHandedBat":true,"dateOfBirth":546739200000,"shortName":"RG Sharma","nationality":"Indian","id":107,"fullName":"Rohit Sharma"},"id":3644}]
         * isLimitedOvers : true
         * matchStatus : {"text":"Kolkata Knight Riders won by 7 wickets","outcome":"A"}
         * matchSummary :
         * tournamentLabel : IPL 2015
         * matchState : C
         * matchType : IPLT20
         * battingOrder : [1,0]
         * venue : {"shortName":"Eden Gardens","city":"Kolkata","id":2,"country":"India","fullName":"Eden Gardens"}
         * additionalInfo : {"toss.elected":"Kolkata Knight Riders, who chose to field","match.video.id":"4160910503001","stats.link":"http://www.iplt20.com/news/2015/more-news/5805/quick-stats-m1-kkr-vs-mi","match.summary":"","photostream.link":"http://www.iplt20.com/photos/249/ipl-2015-match-1-kkr-v-mi","mom.video.id":"4160910506001","home.team.fan.total":"31514","notes.1.1":"Powerplay 1 - 37 runs, 3 wickets","away.team.fan.total":"15640","notes.1.2":"MI: 50 runs in 8.5 overs","umpire.name.3":"Pashchim Pathak","notes.1.3":"Rohit Sharma: 50 off 46 balls (6 x four, 1 x six)","umpire.name.4":"Virender Sharma","umpire.name.1":"S Ravi","notes.1.4":"4th Wicket: 50 runs in 55 balls (Rohit Sharma 27, Corey Anderson 23)","umpire.name.2":"Chettithody Shamshuddin","notes.1.5":"MI: 100 runs in 14.6 overs","notes.1.6":"MI: 150 runs in 19.1 overs","notes.1.7":"Corey Anderson: 50 off 41 balls (4 x fours, 3 x sixes)","notes.1.8":"Innings Break: MI - 168/3 in 20 overs","highlights.link":"http://www.iplt20.com/videos/media/id/4160910503001/m1-kkr-vs-mi-match-highlights","result.playerofthematch":"Morne Morkel","mom.video.thumb":"http://brightcove.vo.llnwd.net/v1/unsecured/media/3588749423001/201504/3233/3588749423001_4161115685001_video-still-for-video-4160910506001.jpg?pubId=3588749423001","interview.link":"http://www.iplt20.com/news/2015/features/5789/morkel-relishes-day-out-at-eden-gardens","sixes.video.id":"4160910475001","interview.thumb":"http://static2.iplt20.com/cms/media/images/320x213/34398.jpg","referee.name":"Javagal Srinath","match.video.thumb":"http://brightcove.vo.llnwd.net/v1/unsecured/media/3588749423001/201504/2063/3588749423001_4161115675001_video-still-for-video-4160910503001.jpg?pubId=3588749423001","stats.thumb":"http://static2.iplt20.com/cms/media/images/320x213/34468.jpg","toss.winner":"Kolkata Knight Riders","notes.2.5":"Gautam Gambhir: 50 off 39 balls (6 x fours, 1 x six)","sixes.video.thumb":"http://brightcove.vo.llnwd.net/v1/unsecured/media/3588749423001/201504/3105/3588749423001_4161009085001_video-still-for-video-4160910475001.jpg?pubId=3588749423001","notes.2.6":"KKR: 150 runs in 16.6 overs","notes.2.3":"2nd Wicket: 50 runs in 32 balls (Gautam Gambhir 29, Manish Pandey 20)","notes.2.4":"KKR: 100 runs in 12.2 overs","report.thumb":"http://static2.iplt20.com/cms/media/images/320x213/34393.jpg","notes.2.1":"Powerplay 1 - 38 runs, 1 wicket","notes.2.2":"KKR: 50 runs in 7.1 overs","report.link":"http://www.iplt20.com/news/2015/match-reports/5780/report-m1-kkr-vs-mi"}
         * oversLimit : 20
         * description : Match 1
         */

        private String matchDate;
        private boolean isLimitedOvers;
        private MatchStatusBean matchStatus;
        private String matchSummary;
        private String tournamentLabel;
        private String matchState;
        private String matchType;
        private VenueBean venue;
        private AdditionalInfoBean additionalInfo;
        private int oversLimit;
        private String description;
        private List<TeamsBean> teams;
        private List<Integer> battingOrder;

        public static MatchInfoBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), MatchInfoBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public String getMatchDate() {
            return matchDate;
        }

        public void setMatchDate(String matchDate) {
            this.matchDate = matchDate;
        }

        public boolean isIsLimitedOvers() {
            return isLimitedOvers;
        }

        public void setIsLimitedOvers(boolean isLimitedOvers) {
            this.isLimitedOvers = isLimitedOvers;
        }

        public MatchStatusBean getMatchStatus() {
            return matchStatus;
        }

        public void setMatchStatus(MatchStatusBean matchStatus) {
            this.matchStatus = matchStatus;
        }

        public String getMatchSummary() {
            return matchSummary;
        }

        public void setMatchSummary(String matchSummary) {
            this.matchSummary = matchSummary;
        }

        public String getTournamentLabel() {
            return tournamentLabel;
        }

        public void setTournamentLabel(String tournamentLabel) {
            this.tournamentLabel = tournamentLabel;
        }

        public String getMatchState() {
            return matchState;
        }

        public void setMatchState(String matchState) {
            this.matchState = matchState;
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

        public AdditionalInfoBean getAdditionalInfo() {
            return additionalInfo;
        }

        public void setAdditionalInfo(AdditionalInfoBean additionalInfo) {
            this.additionalInfo = additionalInfo;
        }

        public int getOversLimit() {
            return oversLimit;
        }

        public void setOversLimit(int oversLimit) {
            this.oversLimit = oversLimit;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public List<TeamsBean> getTeams() {
            return teams;
        }

        public void setTeams(List<TeamsBean> teams) {
            this.teams = teams;
        }

        public List<Integer> getBattingOrder() {
            return battingOrder;
        }

        public void setBattingOrder(List<Integer> battingOrder) {
            this.battingOrder = battingOrder;
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

                    return new Gson().fromJson(jsonObject.getString(str), MatchStatusBean.class);
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

                    return new Gson().fromJson(jsonObject.getString(str), VenueBean.class);
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

        public static class AdditionalInfoBean {
            @SerializedName("toss.elected")
            private String _$TossElected295; // FIXME check this code
            @SerializedName("match.video.id")
            private String _$MatchVideoId159; // FIXME check this code
            @SerializedName("stats.link")
            private String _$StatsLink1; // FIXME check this code
            @SerializedName("match.summary")
            private String _$MatchSummary19; // FIXME check this code
            @SerializedName("photostream.link")
            private String _$PhotostreamLink169; // FIXME check this code
            @SerializedName("mom.video.id")
            private String _$MomVideoId187; // FIXME check this code
            @SerializedName("home.team.fan.total")
            private String _$HomeTeamFanTotal41; // FIXME check this code
            @SerializedName("notes.1.1")
            private String _$Notes11282; // FIXME check this code
            @SerializedName("away.team.fan.total")
            private String _$AwayTeamFanTotal0; // FIXME check this code
            @SerializedName("notes.1.2")
            private String _$Notes12215; // FIXME check this code
            @SerializedName("umpire.name.3")
            private String _$UmpireName3278; // FIXME check this code
            @SerializedName("notes.1.3")
            private String _$Notes1346; // FIXME check this code
            @SerializedName("umpire.name.4")
            private String _$UmpireName450; // FIXME check this code
            @SerializedName("umpire.name.1")
            private String _$UmpireName1148; // FIXME check this code
            @SerializedName("notes.1.4")
            private String _$Notes14143; // FIXME check this code
            @SerializedName("umpire.name.2")
            private String _$UmpireName269; // FIXME check this code
            @SerializedName("notes.1.5")
            private String _$Notes15207; // FIXME check this code
            @SerializedName("notes.1.6")
            private String _$Notes16173; // FIXME check this code
            @SerializedName("notes.1.7")
            private String _$Notes17323; // FIXME check this code
            @SerializedName("notes.1.8")
            private String _$Notes1843; // FIXME check this code
            @SerializedName("highlights.link")
            private String _$HighlightsLink239; // FIXME check this code
            @SerializedName("result.playerofthematch")
            private String _$ResultPlayerofthematch326; // FIXME check this code
            @SerializedName("mom.video.thumb")
            private String _$MomVideoThumb251; // FIXME check this code
            @SerializedName("interview.link")
            private String _$InterviewLink286; // FIXME check this code
            @SerializedName("sixes.video.id")
            private String _$SixesVideoId117; // FIXME check this code
            @SerializedName("interview.thumb")
            private String _$InterviewThumb111; // FIXME check this code
            @SerializedName("referee.name")
            private String _$RefereeName280; // FIXME check this code
            @SerializedName("match.video.thumb")
            private String _$MatchVideoThumb252; // FIXME check this code
            @SerializedName("stats.thumb")
            private String _$StatsThumb213; // FIXME check this code
            @SerializedName("toss.winner")
            private String _$TossWinner267; // FIXME check this code
            @SerializedName("notes.2.5")
            private String _$Notes25287; // FIXME check this code
            @SerializedName("sixes.video.thumb")
            private String _$SixesVideoThumb36; // FIXME check this code
            @SerializedName("notes.2.6")
            private String _$Notes26292; // FIXME check this code
            @SerializedName("notes.2.3")
            private String _$Notes23147; // FIXME check this code
            @SerializedName("notes.2.4")
            private String _$Notes24147; // FIXME check this code
            @SerializedName("report.thumb")
            private String _$ReportThumb91; // FIXME check this code
            @SerializedName("notes.2.1")
            private String _$Notes21119; // FIXME check this code
            @SerializedName("notes.2.2")
            private String _$Notes22119; // FIXME check this code
            @SerializedName("report.link")
            private String _$ReportLink254; // FIXME check this code

            public static AdditionalInfoBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), AdditionalInfoBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public String get_$TossElected295() {
                return _$TossElected295;
            }

            public void set_$TossElected295(String _$TossElected295) {
                this._$TossElected295 = _$TossElected295;
            }

            public String get_$MatchVideoId159() {
                return _$MatchVideoId159;
            }

            public void set_$MatchVideoId159(String _$MatchVideoId159) {
                this._$MatchVideoId159 = _$MatchVideoId159;
            }

            public String get_$StatsLink1() {
                return _$StatsLink1;
            }

            public void set_$StatsLink1(String _$StatsLink1) {
                this._$StatsLink1 = _$StatsLink1;
            }

            public String get_$MatchSummary19() {
                return _$MatchSummary19;
            }

            public void set_$MatchSummary19(String _$MatchSummary19) {
                this._$MatchSummary19 = _$MatchSummary19;
            }

            public String get_$PhotostreamLink169() {
                return _$PhotostreamLink169;
            }

            public void set_$PhotostreamLink169(String _$PhotostreamLink169) {
                this._$PhotostreamLink169 = _$PhotostreamLink169;
            }

            public String get_$MomVideoId187() {
                return _$MomVideoId187;
            }

            public void set_$MomVideoId187(String _$MomVideoId187) {
                this._$MomVideoId187 = _$MomVideoId187;
            }

            public String get_$HomeTeamFanTotal41() {
                return _$HomeTeamFanTotal41;
            }

            public void set_$HomeTeamFanTotal41(String _$HomeTeamFanTotal41) {
                this._$HomeTeamFanTotal41 = _$HomeTeamFanTotal41;
            }

            public String get_$Notes11282() {
                return _$Notes11282;
            }

            public void set_$Notes11282(String _$Notes11282) {
                this._$Notes11282 = _$Notes11282;
            }

            public String get_$AwayTeamFanTotal0() {
                return _$AwayTeamFanTotal0;
            }

            public void set_$AwayTeamFanTotal0(String _$AwayTeamFanTotal0) {
                this._$AwayTeamFanTotal0 = _$AwayTeamFanTotal0;
            }

            public String get_$Notes12215() {
                return _$Notes12215;
            }

            public void set_$Notes12215(String _$Notes12215) {
                this._$Notes12215 = _$Notes12215;
            }

            public String get_$UmpireName3278() {
                return _$UmpireName3278;
            }

            public void set_$UmpireName3278(String _$UmpireName3278) {
                this._$UmpireName3278 = _$UmpireName3278;
            }

            public String get_$Notes1346() {
                return _$Notes1346;
            }

            public void set_$Notes1346(String _$Notes1346) {
                this._$Notes1346 = _$Notes1346;
            }

            public String get_$UmpireName450() {
                return _$UmpireName450;
            }

            public void set_$UmpireName450(String _$UmpireName450) {
                this._$UmpireName450 = _$UmpireName450;
            }

            public String get_$UmpireName1148() {
                return _$UmpireName1148;
            }

            public void set_$UmpireName1148(String _$UmpireName1148) {
                this._$UmpireName1148 = _$UmpireName1148;
            }

            public String get_$Notes14143() {
                return _$Notes14143;
            }

            public void set_$Notes14143(String _$Notes14143) {
                this._$Notes14143 = _$Notes14143;
            }

            public String get_$UmpireName269() {
                return _$UmpireName269;
            }

            public void set_$UmpireName269(String _$UmpireName269) {
                this._$UmpireName269 = _$UmpireName269;
            }

            public String get_$Notes15207() {
                return _$Notes15207;
            }

            public void set_$Notes15207(String _$Notes15207) {
                this._$Notes15207 = _$Notes15207;
            }

            public String get_$Notes16173() {
                return _$Notes16173;
            }

            public void set_$Notes16173(String _$Notes16173) {
                this._$Notes16173 = _$Notes16173;
            }

            public String get_$Notes17323() {
                return _$Notes17323;
            }

            public void set_$Notes17323(String _$Notes17323) {
                this._$Notes17323 = _$Notes17323;
            }

            public String get_$Notes1843() {
                return _$Notes1843;
            }

            public void set_$Notes1843(String _$Notes1843) {
                this._$Notes1843 = _$Notes1843;
            }

            public String get_$HighlightsLink239() {
                return _$HighlightsLink239;
            }

            public void set_$HighlightsLink239(String _$HighlightsLink239) {
                this._$HighlightsLink239 = _$HighlightsLink239;
            }

            public String get_$ResultPlayerofthematch326() {
                return _$ResultPlayerofthematch326;
            }

            public void set_$ResultPlayerofthematch326(String _$ResultPlayerofthematch326) {
                this._$ResultPlayerofthematch326 = _$ResultPlayerofthematch326;
            }

            public String get_$MomVideoThumb251() {
                return _$MomVideoThumb251;
            }

            public void set_$MomVideoThumb251(String _$MomVideoThumb251) {
                this._$MomVideoThumb251 = _$MomVideoThumb251;
            }

            public String get_$InterviewLink286() {
                return _$InterviewLink286;
            }

            public void set_$InterviewLink286(String _$InterviewLink286) {
                this._$InterviewLink286 = _$InterviewLink286;
            }

            public String get_$SixesVideoId117() {
                return _$SixesVideoId117;
            }

            public void set_$SixesVideoId117(String _$SixesVideoId117) {
                this._$SixesVideoId117 = _$SixesVideoId117;
            }

            public String get_$InterviewThumb111() {
                return _$InterviewThumb111;
            }

            public void set_$InterviewThumb111(String _$InterviewThumb111) {
                this._$InterviewThumb111 = _$InterviewThumb111;
            }

            public String get_$RefereeName280() {
                return _$RefereeName280;
            }

            public void set_$RefereeName280(String _$RefereeName280) {
                this._$RefereeName280 = _$RefereeName280;
            }

            public String get_$MatchVideoThumb252() {
                return _$MatchVideoThumb252;
            }

            public void set_$MatchVideoThumb252(String _$MatchVideoThumb252) {
                this._$MatchVideoThumb252 = _$MatchVideoThumb252;
            }

            public String get_$StatsThumb213() {
                return _$StatsThumb213;
            }

            public void set_$StatsThumb213(String _$StatsThumb213) {
                this._$StatsThumb213 = _$StatsThumb213;
            }

            public String get_$TossWinner267() {
                return _$TossWinner267;
            }

            public void set_$TossWinner267(String _$TossWinner267) {
                this._$TossWinner267 = _$TossWinner267;
            }

            public String get_$Notes25287() {
                return _$Notes25287;
            }

            public void set_$Notes25287(String _$Notes25287) {
                this._$Notes25287 = _$Notes25287;
            }

            public String get_$SixesVideoThumb36() {
                return _$SixesVideoThumb36;
            }

            public void set_$SixesVideoThumb36(String _$SixesVideoThumb36) {
                this._$SixesVideoThumb36 = _$SixesVideoThumb36;
            }

            public String get_$Notes26292() {
                return _$Notes26292;
            }

            public void set_$Notes26292(String _$Notes26292) {
                this._$Notes26292 = _$Notes26292;
            }

            public String get_$Notes23147() {
                return _$Notes23147;
            }

            public void set_$Notes23147(String _$Notes23147) {
                this._$Notes23147 = _$Notes23147;
            }

            public String get_$Notes24147() {
                return _$Notes24147;
            }

            public void set_$Notes24147(String _$Notes24147) {
                this._$Notes24147 = _$Notes24147;
            }

            public String get_$ReportThumb91() {
                return _$ReportThumb91;
            }

            public void set_$ReportThumb91(String _$ReportThumb91) {
                this._$ReportThumb91 = _$ReportThumb91;
            }

            public String get_$Notes21119() {
                return _$Notes21119;
            }

            public void set_$Notes21119(String _$Notes21119) {
                this._$Notes21119 = _$Notes21119;
            }

            public String get_$Notes22119() {
                return _$Notes22119;
            }

            public void set_$Notes22119(String _$Notes22119) {
                this._$Notes22119 = _$Notes22119;
            }

            public String get_$ReportLink254() {
                return _$ReportLink254;
            }

            public void set_$ReportLink254(String _$ReportLink254) {
                this._$ReportLink254 = _$ReportLink254;
            }
        }

        public static class TeamsBean {
            /**
             * team : {"shortName":"Knight Riders","secondaryColor":"FFFFFF","abbreviation":"KKR","primaryColor":"6F2C91","type":"m","fullName":"Kolkata Knight Riders","id":5}
             * players : [{"names":["Gautam Gambhir","G Gambhir"],"dateOfBirth":371865600000,"shortName":"G Gambhir","nationality":"Indian","id":84,"fullName":"Gautam Gambhir"},{"names":["Robin Uthappa","R Uthappa"],"dateOfBirth":500515200000,"shortName":"R Uthappa","nationality":"Indian","id":127,"fullName":"Robin Uthappa"},{"names":["Manish Pandey","M Pandey"],"dateOfBirth":621388800000,"shortName":"M Pandey","nationality":"Indian","id":123,"fullName":"Manish Pandey"},{"names":["Suryakumar Yadav","S Yadav"],"rightHandedBat":true,"dateOfBirth":653270400000,"shortName":"S Yadav","nationality":"Indian","id":108,"fullName":"Suryakumar Yadav"},{"names":["Yusuf Pathan","Y Pathan"],"dateOfBirth":406339200000,"shortName":"Y Pathan","nationality":"Indian","id":96,"fullName":"Yusuf Pathan"},{"names":["Shakib Al Hasan","S Al Hasan"],"dateOfBirth":543542400000,"shortName":"S Al Hasan","nationality":"Bangladeshi","id":201,"fullName":"Shakib Al Hasan"},{"names":["Andre Russell","A Russell"],"dateOfBirth":578275200000,"shortName":"A Russell","nationality":"West Indian","id":177,"fullName":"Andre Russell"},{"names":["Piyush Chawla","P Chawla"],"dateOfBirth":598924800000,"shortName":"P Chawla","nationality":"Indian","id":76,"fullName":"Piyush Chawla"},{"names":["Sunil Narine","S Narine"],"dateOfBirth":580608000000,"shortName":"S Narine","nationality":"West Indian","id":203,"fullName":"Sunil Narine"},{"names":["Umesh Yadav","U Yadav"],"dateOfBirth":562118400000,"shortName":"U Yadav","nationality":"Indian","id":59,"fullName":"Umesh Yadav"},{"names":["Morne Morkel","M Morkel"],"dateOfBirth":465868800000,"shortName":"M Morkel","nationality":"South African","id":169,"fullName":"Morne Morkel"}]
             * wicketKeeper : {"names":["Robin Uthappa","R Uthappa"],"dateOfBirth":500515200000,"shortName":"R Uthappa","nationality":"Indian","id":127,"fullName":"Robin Uthappa"}
             * captain : {"names":["Gautam Gambhir","G Gambhir"],"dateOfBirth":371865600000,"shortName":"G Gambhir","nationality":"Indian","id":84,"fullName":"Gautam Gambhir"}
             * id : 3645
             */

            private TeamBean team;
            private WicketKeeperBean wicketKeeper;
            private CaptainBean captain;
            private int id;
            private List<PlayersBean> players;

            public static TeamsBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), TeamsBean.class);
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

            public WicketKeeperBean getWicketKeeper() {
                return wicketKeeper;
            }

            public void setWicketKeeper(WicketKeeperBean wicketKeeper) {
                this.wicketKeeper = wicketKeeper;
            }

            public CaptainBean getCaptain() {
                return captain;
            }

            public void setCaptain(CaptainBean captain) {
                this.captain = captain;
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
                 * shortName : Knight Riders
                 * secondaryColor : FFFFFF
                 * abbreviation : KKR
                 * primaryColor : 6F2C91
                 * type : m
                 * fullName : Kolkata Knight Riders
                 * id : 5
                 */

                private String shortName;
                private String secondaryColor;
                private String abbreviation;
                private String primaryColor;
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

                public String getSecondaryColor() {
                    return secondaryColor;
                }

                public void setSecondaryColor(String secondaryColor) {
                    this.secondaryColor = secondaryColor;
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

            public static class WicketKeeperBean {
                /**
                 * names : ["Robin Uthappa","R Uthappa"]
                 * dateOfBirth : 500515200000
                 * shortName : R Uthappa
                 * nationality : Indian
                 * id : 127
                 * fullName : Robin Uthappa
                 */

                private long dateOfBirth;
                private String shortName;
                private String nationality;
                private int id;
                private String fullName;
                private List<String> names;

                public static WicketKeeperBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), WicketKeeperBean.class);
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

                public List<String> getNames() {
                    return names;
                }

                public void setNames(List<String> names) {
                    this.names = names;
                }
            }

            public static class CaptainBean {
                /**
                 * names : ["Gautam Gambhir","G Gambhir"]
                 * dateOfBirth : 371865600000
                 * shortName : G Gambhir
                 * nationality : Indian
                 * id : 84
                 * fullName : Gautam Gambhir
                 */

                private long dateOfBirth;
                private String shortName;
                private String nationality;
                private int id;
                private String fullName;
                private List<String> names;

                public static CaptainBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), CaptainBean.class);
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

                public List<String> getNames() {
                    return names;
                }

                public void setNames(List<String> names) {
                    this.names = names;
                }
            }

            public static class PlayersBean {
                /**
                 * names : ["Gautam Gambhir","G Gambhir"]
                 * dateOfBirth : 371865600000
                 * shortName : G Gambhir
                 * nationality : Indian
                 * id : 84
                 * fullName : Gautam Gambhir
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

    public static class CurrentStateBean {
        /**
         * currentInningsIndex : 1
         * currentBowler : 166
         * currentBatsmen : [108,96]
         * recentOvers : [{"ovNo":14,"ovBalls":["1","4","1","1","1","2"]},{"ovNo":15,"ovBalls":["4","W","6","1",".","1"]},{"ovNo":16,"ovBalls":[".",".",".","1",".","1"]},{"ovNo":17,"ovBalls":["1Wd",".","6",".","6","1","6"]},{"ovNo":18,"ovBalls":["1","4",".","1","6","2"]},{"ovNo":19,"ovBalls":[".","1","4"]}]
         * currentPartnership : 49
         * phase : C
         * nonFacingBatsman : 96
         * facingBatsman : 108
         */

        private int currentInningsIndex;
        private int currentBowler;
        private int currentPartnership;
        private String phase;
        private int nonFacingBatsman;
        private int facingBatsman;
        private List<Integer> currentBatsmen;
        private List<RecentOversBean> recentOvers;

        public static CurrentStateBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), CurrentStateBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public int getCurrentInningsIndex() {
            return currentInningsIndex;
        }

        public void setCurrentInningsIndex(int currentInningsIndex) {
            this.currentInningsIndex = currentInningsIndex;
        }

        public int getCurrentBowler() {
            return currentBowler;
        }

        public void setCurrentBowler(int currentBowler) {
            this.currentBowler = currentBowler;
        }

        public int getCurrentPartnership() {
            return currentPartnership;
        }

        public void setCurrentPartnership(int currentPartnership) {
            this.currentPartnership = currentPartnership;
        }

        public String getPhase() {
            return phase;
        }

        public void setPhase(String phase) {
            this.phase = phase;
        }

        public int getNonFacingBatsman() {
            return nonFacingBatsman;
        }

        public void setNonFacingBatsman(int nonFacingBatsman) {
            this.nonFacingBatsman = nonFacingBatsman;
        }

        public int getFacingBatsman() {
            return facingBatsman;
        }

        public void setFacingBatsman(int facingBatsman) {
            this.facingBatsman = facingBatsman;
        }

        public List<Integer> getCurrentBatsmen() {
            return currentBatsmen;
        }

        public void setCurrentBatsmen(List<Integer> currentBatsmen) {
            this.currentBatsmen = currentBatsmen;
        }

        public List<RecentOversBean> getRecentOvers() {
            return recentOvers;
        }

        public void setRecentOvers(List<RecentOversBean> recentOvers) {
            this.recentOvers = recentOvers;
        }

        public static class RecentOversBean {
            /**
             * ovNo : 14
             * ovBalls : ["1","4","1","1","1","2"]
             */

            private int ovNo;
            private List<String> ovBalls;

            public static RecentOversBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), RecentOversBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public int getOvNo() {
                return ovNo;
            }

            public void setOvNo(int ovNo) {
                this.ovNo = ovNo;
            }

            public List<String> getOvBalls() {
                return ovBalls;
            }

            public void setOvBalls(List<String> ovBalls) {
                this.ovBalls = ovBalls;
            }
        }
    }

    public static class MatchIdBean {
        /**
         * tournamentId : {"name":"ipl2015","id":2785}
         * parentId : {"name":"ipl2015","id":2785}
         * name : ipl2015-01
         * id : 3226
         */

        private TournamentIdBean tournamentId;
        private ParentIdBean parentId;
        private String name;
        private int id;

        public static MatchIdBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), MatchIdBean.class);
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

        public ParentIdBean getParentId() {
            return parentId;
        }

        public void setParentId(ParentIdBean parentId) {
            this.parentId = parentId;
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

        public static class ParentIdBean {
            /**
             * name : ipl2015
             * id : 2785
             */

            private String name;
            private int id;

            public static ParentIdBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), ParentIdBean.class);
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
    }

    public static class InningsBean {
        /**
         * overHistory : [{"ovNo":1,"ovBalls":[".","1","1","1","1Lb","."]},{"ovNo":2,"ovBalls":["4",".","W",".",".","1"]},{"ovNo":3,"ovBalls":["4",".",".","4",".","4"]},{"ovNo":4,"ovBalls":[".","4","1",".","1","1"]},{"ovNo":5,"ovBalls":["1",".","6","1",".","1Wd","W"]},{"ovNo":6,"ovBalls":[".","W",".",".",".","."]},{"ovNo":7,"ovBalls":["4",".",".","1",".","."]},{"ovNo":8,"ovBalls":["1",".",".","4",".","1"]},{"ovNo":9,"ovBalls":["1",".",".",".","4","1"]},{"ovNo":10,"ovBalls":[".",".","1",".","1","1"]},{"ovNo":11,"ovBalls":["2","1",".","1","1","4"]},{"ovNo":12,"ovBalls":["1",".",".","1","1","."]},{"ovNo":13,"ovBalls":[".","1","1",".","1","4"]},{"ovNo":14,"ovBalls":["1","1","1","1",".","."]},{"ovNo":15,"ovBalls":["2","1","4","4","6","4"]},{"ovNo":16,"ovBalls":["1",".",".","4","1","2"]},{"ovNo":17,"ovBalls":["1","1",".","4","6","1"]},{"ovNo":18,"ovBalls":["1Wd","4",".","1",".","4","1"]},{"ovNo":19,"ovBalls":["6","1","6","1",".","1"]},{"ovNo":20,"ovBalls":["6","2","1","4","1","6"]}]
         * scorecard : {"fow":[{"playerId":167,"r":8,"w":1,"bp":{"innings":1,"over":2,"ball":3}},{"playerId":99,"r":37,"w":2,"bp":{"innings":1,"over":5,"ball":6}},{"playerId":100,"r":37,"w":3,"bp":{"innings":1,"over":6,"ball":2}}],"battingStats":[{"playerId":107,"r":98,"b":65,"4s":12,"6s":4,"sr":"150.76","mod":{"text":"c Umesh Yadav b Morne Morkel","additionalPlayerIds":[59],"dismissedMethod":"ct","dismissedBp":{"innings":1,"over":2,"ball":3},"countingBp":{"innings":1,"over":2,"ball":3},"bowlerId":169}},{"mod":{"text":"c Umesh Yadav b Morne Morkel","additionalPlayerIds":[59],"dismissedMethod":"ct","dismissedBp":{"innings":1,"over":2,"ball":3},"countingBp":{"innings":1,"over":2,"ball":3},"bowlerId":169},"playerId":167,"r":5,"b":5,"4s":1,"6s":0,"sr":"100.00"},{"mod":{"text":"c Umesh Yadav b Shakib Al Hasan","additionalPlayerIds":[59],"dismissedMethod":"ct","dismissedBp":{"innings":1,"over":5,"ball":7},"countingBp":{"innings":1,"over":5,"ball":6},"bowlerId":201},"playerId":99,"r":7,"b":7,"4s":1,"6s":0,"sr":"100.00"},{"mod":{"text":"c Yusuf Pathan b Morne Morkel","additionalPlayerIds":[96],"dismissedMethod":"ct","dismissedBp":{"innings":1,"over":6,"ball":2},"countingBp":{"innings":1,"over":6,"ball":2},"bowlerId":169},"playerId":100,"r":0,"b":2,"4s":0,"6s":0,"sr":"0.00"},{"playerId":968,"r":55,"b":41,"4s":4,"6s":3,"sr":"134.14"}],"bowlingStats":[{"playerId":59,"r":36,"w":0,"ov":"3","d":6,"maid":0,"e":"12.00","wd":0,"nb":0},{"playerId":169,"r":18,"w":2,"ov":"4","d":15,"maid":1,"e":"4.50","wd":0,"nb":0},{"playerId":201,"r":48,"w":1,"ov":"4","d":7,"maid":0,"e":"12.00","wd":2,"nb":0},{"playerId":203,"r":28,"w":0,"ov":"4","d":10,"maid":0,"e":"7.00","wd":0,"nb":0},{"playerId":177,"r":21,"w":0,"ov":"3","d":7,"maid":0,"e":"7.00","wd":0,"nb":0},{"playerId":76,"r":16,"w":0,"ov":"2","d":3,"maid":0,"e":"8.00","wd":0,"nb":0}],"wkts":3,"extras":{"wideRuns":2,"legByeRuns":1},"runs":168}
         * overProgress : 20
         * runRate : 8.40
         * inningsNumber : 1
         */

        private ScorecardBean scorecard;
        private String overProgress;
        private String runRate;
        private int inningsNumber;
        private List<OverHistoryBean> overHistory;

        public static InningsBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), InningsBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public ScorecardBean getScorecard() {
            return scorecard;
        }

        public void setScorecard(ScorecardBean scorecard) {
            this.scorecard = scorecard;
        }

        public String getOverProgress() {
            return overProgress;
        }

        public void setOverProgress(String overProgress) {
            this.overProgress = overProgress;
        }

        public String getRunRate() {
            return runRate;
        }

        public void setRunRate(String runRate) {
            this.runRate = runRate;
        }

        public int getInningsNumber() {
            return inningsNumber;
        }

        public void setInningsNumber(int inningsNumber) {
            this.inningsNumber = inningsNumber;
        }

        public List<OverHistoryBean> getOverHistory() {
            return overHistory;
        }

        public void setOverHistory(List<OverHistoryBean> overHistory) {
            this.overHistory = overHistory;
        }

        public static class ScorecardBean {
            /**
             * fow : [{"playerId":167,"r":8,"w":1,"bp":{"innings":1,"over":2,"ball":3}},{"playerId":99,"r":37,"w":2,"bp":{"innings":1,"over":5,"ball":6}},{"playerId":100,"r":37,"w":3,"bp":{"innings":1,"over":6,"ball":2}}]
             * battingStats : [{"playerId":107,"r":98,"b":65,"4s":12,"6s":4,"sr":"150.76"},{"mod":{"text":"c Umesh Yadav b Morne Morkel","additionalPlayerIds":[59],"dismissedMethod":"ct","dismissedBp":{"innings":1,"over":2,"ball":3},"countingBp":{"innings":1,"over":2,"ball":3},"bowlerId":169},"playerId":167,"r":5,"b":5,"4s":1,"6s":0,"sr":"100.00"},{"mod":{"text":"c Umesh Yadav b Shakib Al Hasan","additionalPlayerIds":[59],"dismissedMethod":"ct","dismissedBp":{"innings":1,"over":5,"ball":7},"countingBp":{"innings":1,"over":5,"ball":6},"bowlerId":201},"playerId":99,"r":7,"b":7,"4s":1,"6s":0,"sr":"100.00"},{"mod":{"text":"c Yusuf Pathan b Morne Morkel","additionalPlayerIds":[96],"dismissedMethod":"ct","dismissedBp":{"innings":1,"over":6,"ball":2},"countingBp":{"innings":1,"over":6,"ball":2},"bowlerId":169},"playerId":100,"r":0,"b":2,"4s":0,"6s":0,"sr":"0.00"},{"playerId":968,"r":55,"b":41,"4s":4,"6s":3,"sr":"134.14"}]
             * bowlingStats : [{"playerId":59,"r":36,"w":0,"ov":"3","d":6,"maid":0,"e":"12.00","wd":0,"nb":0},{"playerId":169,"r":18,"w":2,"ov":"4","d":15,"maid":1,"e":"4.50","wd":0,"nb":0},{"playerId":201,"r":48,"w":1,"ov":"4","d":7,"maid":0,"e":"12.00","wd":2,"nb":0},{"playerId":203,"r":28,"w":0,"ov":"4","d":10,"maid":0,"e":"7.00","wd":0,"nb":0},{"playerId":177,"r":21,"w":0,"ov":"3","d":7,"maid":0,"e":"7.00","wd":0,"nb":0},{"playerId":76,"r":16,"w":0,"ov":"2","d":3,"maid":0,"e":"8.00","wd":0,"nb":0}]
             * wkts : 3
             * extras : {"wideRuns":2,"legByeRuns":1}
             * runs : 168
             */

            private int wkts;
            private ExtrasBean extras;
            private int runs;
            private List<FowBean> fow;
            private List<BattingStatsBean> battingStats;
            private List<BowlingStatsBean> bowlingStats;

            public static ScorecardBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), ScorecardBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public int getWkts() {
                return wkts;
            }

            public void setWkts(int wkts) {
                this.wkts = wkts;
            }

            public ExtrasBean getExtras() {
                return extras;
            }

            public void setExtras(ExtrasBean extras) {
                this.extras = extras;
            }

            public int getRuns() {
                return runs;
            }

            public void setRuns(int runs) {
                this.runs = runs;
            }

            public List<FowBean> getFow() {
                return fow;
            }

            public void setFow(List<FowBean> fow) {
                this.fow = fow;
            }

            public List<BattingStatsBean> getBattingStats() {
                return battingStats;
            }

            public void setBattingStats(List<BattingStatsBean> battingStats) {
                this.battingStats = battingStats;
            }

            public List<BowlingStatsBean> getBowlingStats() {
                return bowlingStats;
            }

            public void setBowlingStats(List<BowlingStatsBean> bowlingStats) {
                this.bowlingStats = bowlingStats;
            }

            public static class ExtrasBean {
                /**
                 * wideRuns : 2
                 * legByeRuns : 1
                 */

                private int wideRuns;
                private int legByeRuns;

                public static ExtrasBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), ExtrasBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public int getWideRuns() {
                    return wideRuns;
                }

                public void setWideRuns(int wideRuns) {
                    this.wideRuns = wideRuns;
                }

                public int getLegByeRuns() {
                    return legByeRuns;
                }

                public void setLegByeRuns(int legByeRuns) {
                    this.legByeRuns = legByeRuns;
                }
            }

            public static class FowBean {
                /**
                 * Fall of wicket
                 * playerId : 167
                 * r : 8
                 * w : 1
                 * bp : {"innings":1,"over":2,"ball":3}
                 */

                private int playerId;
                private int r;
                private int w;
                private BpBean bp;

                public static FowBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), FowBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public int getPlayerId() {
                    return playerId;
                }

                public void setPlayerId(int playerId) {
                    this.playerId = playerId;
                }

                public int getR() {
                    return r;
                }

                public void setR(int r) {
                    this.r = r;
                }

                public int getW() {
                    return w;
                }

                public void setW(int w) {
                    this.w = w;
                }

                public BpBean getBp() {
                    return bp;
                }

                public void setBp(BpBean bp) {
                    this.bp = bp;
                }

                public static class BpBean {
                    /**
                     * innings : 1
                     * over : 2
                     * ball : 3
                     */

                    private int innings;
                    private int over;
                    private int ball;

                    public static BpBean objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new Gson().fromJson(jsonObject.getString(str), BpBean.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }

                    public int getInnings() {
                        return innings;
                    }

                    public void setInnings(int innings) {
                        this.innings = innings;
                    }

                    public int getOver() {
                        return over;
                    }

                    public void setOver(int over) {
                        this.over = over;
                    }

                    public int getBall() {
                        return ball;
                    }

                    public void setBall(int ball) {
                        this.ball = ball;
                    }
                }
            }

            public static class BattingStatsBean {
                /**
                 * playerId : 107
                 * r : 98
                 * b : 65
                 * 4s : 12
                 * 6s : 4
                 * sr : 150.76
                 * mod : {"text":"c Umesh Yadav b Morne Morkel","additionalPlayerIds":[59],"dismissedMethod":"ct","dismissedBp":{"innings":1,"over":2,"ball":3},"countingBp":{"innings":1,"over":2,"ball":3},"bowlerId":169}
                 */

                private int playerId;
                private int r;
                private int b;
                @SerializedName("4s")
                private int _$4s;
                @SerializedName("6s")
                private int _$6s;
                private String sr;
                private ModBean mod;

                public static BattingStatsBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), BattingStatsBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public int getPlayerId() {
                    return playerId;
                }

                public void setPlayerId(int playerId) {
                    this.playerId = playerId;
                }

                public int getR() {
                    return r;
                }

                public void setR(int r) {
                    this.r = r;
                }

                public int getB() {
                    return b;
                }

                public void setB(int b) {
                    this.b = b;
                }

                public int get_$4s() {
                    return _$4s;
                }

                public void set_$4s(int _$4s) {
                    this._$4s = _$4s;
                }

                public int get_$6s() {
                    return _$6s;
                }

                public void set_$6s(int _$6s) {
                    this._$6s = _$6s;
                }

                public String getSr() {
                    return sr;
                }

                public void setSr(String sr) {
                    this.sr = sr;
                }

                public ModBean getMod() {
                    return mod;
                }

                public void setMod(ModBean mod) {
                    this.mod = mod;
                }

                public static class ModBean {
                    /**
                     * text : c Umesh Yadav b Morne Morkel
                     * additionalPlayerIds : [59]
                     * dismissedMethod : ct
                     * dismissedBp : {"innings":1,"over":2,"ball":3}
                     * countingBp : {"innings":1,"over":2,"ball":3}
                     * bowlerId : 169
                     */

                    private String text;
                    private String dismissedMethod;
                    private DismissedBpBean dismissedBp;
                    private CountingBpBean countingBp;
                    private int bowlerId;
                    private List<Integer> additionalPlayerIds;

                    public static ModBean objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new Gson().fromJson(jsonObject.getString(str), ModBean.class);
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

                    public String getDismissedMethod() {
                        return dismissedMethod;
                    }

                    public void setDismissedMethod(String dismissedMethod) {
                        this.dismissedMethod = dismissedMethod;
                    }

                    public DismissedBpBean getDismissedBp() {
                        return dismissedBp;
                    }

                    public void setDismissedBp(DismissedBpBean dismissedBp) {
                        this.dismissedBp = dismissedBp;
                    }

                    public CountingBpBean getCountingBp() {
                        return countingBp;
                    }

                    public void setCountingBp(CountingBpBean countingBp) {
                        this.countingBp = countingBp;
                    }

                    public int getBowlerId() {
                        return bowlerId;
                    }

                    public void setBowlerId(int bowlerId) {
                        this.bowlerId = bowlerId;
                    }

                    public List<Integer> getAdditionalPlayerIds() {
                        return additionalPlayerIds;
                    }

                    public void setAdditionalPlayerIds(List<Integer> additionalPlayerIds) {
                        this.additionalPlayerIds = additionalPlayerIds;
                    }

                    public static class DismissedBpBean {
                        /**
                         * innings : 1
                         * over : 2
                         * ball : 3
                         */

                        private int innings;
                        private int over;
                        private int ball;

                        public static DismissedBpBean objectFromData(String str, String key) {

                            try {
                                JSONObject jsonObject = new JSONObject(str);

                                return new Gson().fromJson(jsonObject.getString(str), DismissedBpBean.class);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                            return null;
                        }

                        public int getInnings() {
                            return innings;
                        }

                        public void setInnings(int innings) {
                            this.innings = innings;
                        }

                        public int getOver() {
                            return over;
                        }

                        public void setOver(int over) {
                            this.over = over;
                        }

                        public int getBall() {
                            return ball;
                        }

                        public void setBall(int ball) {
                            this.ball = ball;
                        }
                    }

                    public static class CountingBpBean {
                        /**
                         * innings : 1
                         * over : 2
                         * ball : 3
                         */

                        private int innings;
                        private int over;
                        private int ball;

                        public static CountingBpBean objectFromData(String str, String key) {

                            try {
                                JSONObject jsonObject = new JSONObject(str);

                                return new Gson().fromJson(jsonObject.getString(str), CountingBpBean.class);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                            return null;
                        }

                        public int getInnings() {
                            return innings;
                        }

                        public void setInnings(int innings) {
                            this.innings = innings;
                        }

                        public int getOver() {
                            return over;
                        }

                        public void setOver(int over) {
                            this.over = over;
                        }

                        public int getBall() {
                            return ball;
                        }

                        public void setBall(int ball) {
                            this.ball = ball;
                        }
                    }
                }
            }

            public static class BowlingStatsBean {
                /**
                 * playerId : 59
                 * r : 36
                 * w : 0
                 * ov : 3
                 * d : 6
                 * maid : 0
                 * e : 12.00
                 * wd : 0
                 * nb : 0
                 */

                private int playerId;
                private int r;
                private int w;
                private String ov;
                private int d;
                private int maid;
                private String e;
                private int wd;
                private int nb;

                public static BowlingStatsBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), BowlingStatsBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public int getPlayerId() {
                    return playerId;
                }

                public void setPlayerId(int playerId) {
                    this.playerId = playerId;
                }

                public int getR() {
                    return r;
                }

                public void setR(int r) {
                    this.r = r;
                }

                public int getW() {
                    return w;
                }

                public void setW(int w) {
                    this.w = w;
                }

                public String getOv() {
                    return ov;
                }

                public void setOv(String ov) {
                    this.ov = ov;
                }

                public int getD() {
                    return d;
                }

                public void setD(int d) {
                    this.d = d;
                }

                public int getMaid() {
                    return maid;
                }

                public void setMaid(int maid) {
                    this.maid = maid;
                }

                public String getE() {
                    return e;
                }

                public void setE(String e) {
                    this.e = e;
                }

                public int getWd() {
                    return wd;
                }

                public void setWd(int wd) {
                    this.wd = wd;
                }

                public int getNb() {
                    return nb;
                }

                public void setNb(int nb) {
                    this.nb = nb;
                }
            }
        }

        public static class OverHistoryBean {
            /**
             * ovNo : 1
             * ovBalls : [".","1","1","1","1Lb","."]
             */

            private int ovNo;
            private List<String> ovBalls;

            public static OverHistoryBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), OverHistoryBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public int getOvNo() {
                return ovNo;
            }

            public void setOvNo(int ovNo) {
                this.ovNo = ovNo;
            }

            public List<String> getOvBalls() {
                return ovBalls;
            }

            public void setOvBalls(List<String> ovBalls) {
                this.ovBalls = ovBalls;
            }
        }
    }
}
