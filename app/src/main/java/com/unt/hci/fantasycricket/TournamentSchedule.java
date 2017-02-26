package com.unt.hci.fantasycricket;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by jt on 2/26/17.
 */

public class TournamentSchedule {

    /**
     * tournamentId : {"name":"ipl2015","id":2785}
     * schedule : [{"photostreamLink":"http://www.iplt20.com/photos/249/ipl-2015-match-1-kkr-v-mi","highlightsLink":"http://www.iplt20.com/videos/media/id/4160910503001/m1-kkr-vs-mi-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/5780/report-m1-kkr-vs-mi","matchType":"IPLT20","venue":{"shortName":"Eden Gardens","city":"Kolkata","id":2,"country":"India","fullName":"Eden Gardens"},"matchId":{"name":"ipl2015-01","id":3226},"groupName":"","matchDate":"2015-04-08T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":170,"wkts":3,"inningsNumber":2,"ballsFaced":111}],"team":{"shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","fullName":"Kolkata Knight Riders","id":5}},"team2":{"innings":[{"maxBalls":120,"runs":168,"wkts":3,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","fullName":"Mumbai Indians","id":6}},"matchState":"C","matchStatus":{"text":"Kolkata Knight Riders won by 7 wickets","outcome":"A"},"description":"Match 1"},{"photostreamLink":"http://www.iplt20.com/photos/250/ipl-2015-match-2-csk-v-dd","highlightsLink":"http://www.iplt20.com/videos/media/id/4163428593001/m2-csk-vs-dd-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/5807/report-m2-csk-vs-dd","matchType":"IPLT20","venue":{"shortName":"Chidambaram","city":"Chennai","id":1,"country":"India","fullName":"M. A. Chidambaram Stadium"},"matchId":{"name":"ipl2015-02","id":3227},"groupName":"","matchDate":"2015-04-09T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":150,"wkts":7,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"FFFFFF","type":"m","fullName":"Chennai Super Kings","id":1}},"team2":{"innings":[{"maxBalls":120,"runs":149,"wkts":9,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Daredevils","abbreviation":"DD","primaryColor":"B22E2A","secondaryColor":"FFFFFF","type":"m","fullName":"Delhi Daredevils","id":3}},"matchState":"C","matchStatus":{"text":"Chennai Super Kings won by 1 run","outcome":"A"},"description":"Match 2"},{"photostreamLink":"http://www.iplt20.com/photos/251/ipl-2015-match-3-kxip-v-rr","highlightsLink":"http://www.iplt20.com/videos/media/id/4165666167001/m3-kxip-vs-rr-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/5841/report-m3-kxip-vs-rr","matchType":"IPLT20","venue":{"shortName":"Maharashtra Cricket Association's International Stadium","city":"Pune","id":7,"country":"India","fullName":"Maharashtra Cricket Association's International Stadium"},"matchId":{"name":"ipl2015-03","id":3228},"groupName":"","matchDate":"2015-04-10T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":136,"wkts":8,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","fullName":"Kings XI Punjab","id":4}},"team2":{"innings":[{"maxBalls":120,"runs":162,"wkts":7,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","fullName":"Rajasthan Royals","id":8}},"matchState":"C","matchStatus":{"text":"Rajasthan Royals won by 26 runs","outcome":"B"},"description":"Match 3"},{"photostreamLink":"http://www.iplt20.com/photos/252/ipl-2015-match-4-csk-v-srh","highlightsLink":"http://www.iplt20.com/videos/media/id/4167143060001/m4-csk-vs-srh-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/5866/report-m4-csk-vs-srh","matchType":"IPLT20","venue":{"shortName":"Chidambaram","city":"Chennai","id":1,"country":"India","fullName":"M. A. Chidambaram Stadium"},"matchId":{"name":"ipl2015-04","id":3229},"groupName":"","matchDate":"2015-04-11T16:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":209,"wkts":4,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"FFFFFF","type":"m","fullName":"Chennai Super Kings","id":1}},"team2":{"innings":[{"maxBalls":120,"runs":164,"wkts":6,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","fullName":"Sunrisers Hyderabad","id":62}},"matchState":"C","matchStatus":{"text":"Chennai Super Kings won by 45 runs","outcome":"A"},"description":"Match 4"},{"photostreamLink":"http://www.iplt20.com/photos/253/ipl-2015-match-5-kkr-v-rcb","highlightsLink":"http://www.iplt20.com/videos/media/id/4167365891001/m5-kkr-vs-rcb-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/5874/report-m5-kkr-vs-rcb","matchType":"IPLT20","venue":{"shortName":"Eden Gardens","city":"Kolkata","id":2,"country":"India","fullName":"Eden Gardens"},"matchId":{"name":"ipl2015-05","id":3230},"groupName":"","matchDate":"2015-04-11T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":177,"wkts":6,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","fullName":"Kolkata Knight Riders","id":5}},"team2":{"innings":[{"maxBalls":120,"runs":179,"wkts":7,"inningsNumber":2,"ballsFaced":114}],"team":{"shortName":"Challengers","abbreviation":"RCB","primaryColor":"D33F46","secondaryColor":"FFFFFF","type":"m","fullName":"Royal Challengers Bangalore","id":9}},"matchState":"C","matchStatus":{"text":"Royal Challengers Bangalore won by 3 wickets","outcome":"B"},"description":"Match 5"},{"photostreamLink":"http://www.iplt20.com/photos/254/ipl-2015-match-6-dd-v-rr","highlightsLink":"http://www.iplt20.com/videos/media/id/4168407142001/m6-dd-vs-rr-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/5899/report-m6-dd-vs-rr","matchType":"IPLT20","venue":{"shortName":"Feroz Shah Kotla Ground","city":"Delhi","id":8,"country":"India","fullName":"Feroz Shah Kotla Ground"},"matchId":{"name":"ipl2015-06","id":3231},"groupName":"","matchDate":"2015-04-12T16:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":184,"wkts":3,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Daredevils","abbreviation":"DD","primaryColor":"B22E2A","secondaryColor":"FFFFFF","type":"m","fullName":"Delhi Daredevils","id":3}},"team2":{"innings":[{"maxBalls":120,"runs":186,"wkts":7,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","fullName":"Rajasthan Royals","id":8}},"matchState":"C","matchStatus":{"text":"Rajasthan Royals won by 3 wickets","outcome":"B"},"description":"Match 6"},{"photostreamLink":"http://www.iplt20.com/photos/255/ipl-2015-match-7-mi-v-kxip","highlightsLink":"http://www.iplt20.com/videos/media/id/4168613897001/match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/5909/report-m7-mi-vs-kxip","matchType":"IPLT20","venue":{"shortName":"Wankhede Stadium","city":"Mumbai","id":4,"country":"India","fullName":"Wankhede Stadium"},"matchId":{"name":"ipl2015-07","id":3232},"groupName":"","matchDate":"2015-04-12T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":159,"wkts":7,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","fullName":"Mumbai Indians","id":6}},"team2":{"innings":[{"maxBalls":120,"runs":177,"wkts":5,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","fullName":"Kings XI Punjab","id":4}},"matchState":"C","matchStatus":{"text":"Kings XI Punjab won by 18 runs","outcome":"B"},"description":"Match 7"},{"photostreamLink":"http://www.iplt20.com/photos/256/ipl-2015-match-8-rcb-v-srh","highlightsLink":"http://www.iplt20.com/videos/media/id/4170550766001/m8-rcb-vs-srh-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/5933/report-m8-rcb-vs-srh","matchType":"IPLT20","venue":{"shortName":"M. Chinnaswamy Stadium","city":"Bengaluru","id":5,"country":"India","fullName":"M. Chinnaswamy Stadium"},"matchId":{"name":"ipl2015-08","id":3233},"groupName":"","matchDate":"2015-04-13T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":166,"wkts":10,"allOut":true,"inningsNumber":1,"ballsFaced":119}],"team":{"shortName":"Challengers","abbreviation":"RCB","primaryColor":"D33F46","secondaryColor":"FFFFFF","type":"m","fullName":"Royal Challengers Bangalore","id":9}},"team2":{"innings":[{"maxBalls":120,"runs":172,"wkts":2,"inningsNumber":2,"ballsFaced":104}],"team":{"shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","fullName":"Sunrisers Hyderabad","id":62}},"matchState":"C","matchStatus":{"text":"Sunrisers Hyderabad won by 8 wickets","outcome":"B"},"description":"Match 8"},{"photostreamLink":"http://www.iplt20.com/photos/257/ipl-2015-match-9-rr-v-mi","highlightsLink":"http://www.iplt20.com/videos/media/id/4173065890001/m9-rr-vs-mi-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/5956/report-m9-rr-vs-mi","matchType":"IPLT20","venue":{"shortName":"Sardar Patel Stadium","city":"Ahmedabad","id":19,"country":"India","fullName":"Sardar Patel Stadium"},"matchId":{"name":"ipl2015-09","id":3234},"groupName":"","matchDate":"2015-04-14T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":165,"wkts":3,"inningsNumber":2,"ballsFaced":115}],"team":{"shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","fullName":"Rajasthan Royals","id":8}},"team2":{"innings":[{"maxBalls":120,"runs":164,"wkts":5,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","fullName":"Mumbai Indians","id":6}},"matchState":"C","matchStatus":{"text":"Rajasthan Royals won by 7 wickets","outcome":"A"},"description":"Match 9"},{"photostreamLink":"http://www.iplt20.com/photos/258/ipl-2015-match-10-kxip-v-dd","highlightsLink":"http://www.iplt20.com/videos/media/id/4175257924001/m10-kxip-vs-dd-match-highlights","reportLink":"http://www.iplt20.com/news/2015/more-news/5986/report-m10-kxip-vs-dd","matchType":"IPLT20","venue":{"shortName":"Maharashtra Cricket Association's International Stadium","city":"Pune","id":7,"country":"India","fullName":"Maharashtra Cricket Association's International Stadium"},"matchId":{"name":"ipl2015-10","id":3235},"groupName":"","matchDate":"2015-04-15T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":165,"wkts":7,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","fullName":"Kings XI Punjab","id":4}},"team2":{"innings":[{"maxBalls":120,"runs":169,"wkts":5,"inningsNumber":2,"ballsFaced":119}],"team":{"shortName":"Daredevils","abbreviation":"DD","primaryColor":"B22E2A","secondaryColor":"FFFFFF","type":"m","fullName":"Delhi Daredevils","id":3}},"matchState":"C","matchStatus":{"text":"Delhi Daredevils won by 5 wickets","outcome":"B"},"description":"Match 10"},{"photostreamLink":"http://www.iplt20.com/photos/259/ipl-2015-match-11-srh-v-rr","highlightsLink":"http://www.iplt20.com/videos/media/id/4177438285001/m11-srh-vs-rr-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6020/report-m11-srh-vs-rr","matchType":"IPLT20","venue":{"shortName":"ACA-VDCA Stadium","city":"Visakhapatnam","id":6,"country":"India","fullName":"ACA-VDCA Stadium"},"matchId":{"name":"ipl2015-11","id":3236},"groupName":"","matchDate":"2015-04-16T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":127,"wkts":5,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","fullName":"Sunrisers Hyderabad","id":62}},"team2":{"innings":[{"maxBalls":120,"runs":131,"wkts":4,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","fullName":"Rajasthan Royals","id":8}},"matchState":"C","matchStatus":{"text":"Rajasthan Royals won by 6 wickets","outcome":"B"},"description":"Match 11"},{"photostreamLink":"http://www.iplt20.com/photos/260/ipl-2015-match-12-mi-v-csk","highlightsLink":"http://www.iplt20.com/videos/media/id/4179809181001/m12-mi-vs-csk-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6047/report-m12-mi-vs-csk","matchType":"IPLT20","venue":{"shortName":"Wankhede Stadium","city":"Mumbai","id":4,"country":"India","fullName":"Wankhede Stadium"},"matchId":{"name":"ipl2015-12","id":3237},"groupName":"","matchDate":"2015-04-17T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":183,"wkts":7,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","fullName":"Mumbai Indians","id":6}},"team2":{"innings":[{"maxBalls":120,"runs":189,"wkts":4,"inningsNumber":2,"ballsFaced":100}],"team":{"shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"FFFFFF","type":"m","fullName":"Chennai Super Kings","id":1}},"matchState":"C","matchStatus":{"text":"Chennai Super Kings won by 6 wickets","outcome":"B"},"description":"Match 12"},{"photostreamLink":"http://www.iplt20.com/photos/261/ipl-2015-match-13-srh-v-dd","highlightsLink":"http://www.iplt20.com/videos/media/id/4181310844001/m13-srh-vs-dd-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6060/report-m13-srh-vs-dd","matchType":"IPLT20","venue":{"shortName":"ACA-VDCA Stadium","city":"Visakhapatnam","id":6,"country":"India","fullName":"ACA-VDCA Stadium"},"matchId":{"name":"ipl2015-13","id":3238},"groupName":"","matchDate":"2015-04-18T16:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":163,"wkts":8,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","fullName":"Sunrisers Hyderabad","id":62}},"team2":{"innings":[{"maxBalls":120,"runs":167,"wkts":4,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Daredevils","abbreviation":"DD","primaryColor":"B22E2A","secondaryColor":"FFFFFF","type":"m","fullName":"Delhi Daredevils","id":3}},"matchState":"C","matchStatus":{"text":"Delhi Daredevils won by 4 runs","outcome":"B"},"description":"Match 13"},{"photostreamLink":"http://www.iplt20.com/photos/262/ipl-2015-match-14-kxip-v-kkr","highlightsLink":"http://www.iplt20.com/videos/media/id/4181506612001/m14-kxip-vs-kkr-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6075/report-m14-kxip-vs-kkr","matchType":"IPLT20","venue":{"shortName":"Maharashtra Cricket Association's International Stadium","city":"Pune","id":7,"country":"India","fullName":"Maharashtra Cricket Association's International Stadium"},"matchId":{"name":"ipl2015-14","id":3239},"groupName":"","matchDate":"2015-04-18T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":155,"wkts":9,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","fullName":"Kings XI Punjab","id":4}},"team2":{"innings":[{"maxBalls":120,"runs":159,"wkts":6,"inningsNumber":2,"ballsFaced":107}],"team":{"shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","fullName":"Kolkata Knight Riders","id":5}},"matchState":"C","matchStatus":{"text":"Kolkata Knight Riders won by 4 wickets","outcome":"B"},"description":"Match 14"},{"photostreamLink":"http://www.iplt20.com/photos/263/ipl-2015-match-15-rr-v-csk","highlightsLink":"http://www.iplt20.com/videos/media/id/4182418457001/m15-rr-vs-csk-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6099/report-m15-rr-vs-csk","matchType":"IPLT20","venue":{"shortName":"Sardar Patel Stadium","city":"Ahmedabad","id":19,"country":"India","fullName":"Sardar Patel Stadium"},"matchId":{"name":"ipl2015-15","id":3240},"groupName":"","matchDate":"2015-04-19T16:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":157,"wkts":2,"inningsNumber":2,"ballsFaced":110}],"team":{"shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","fullName":"Rajasthan Royals","id":8}},"team2":{"innings":[{"maxBalls":120,"runs":156,"wkts":4,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"FFFFFF","type":"m","fullName":"Chennai Super Kings","id":1}},"matchState":"C","matchStatus":{"text":"Rajasthan Royals won by 8 wickets","outcome":"A"},"description":"Match 15"},{"photostreamLink":"http://www.iplt20.com/photos/264/ipl-2015-match-16-rcb-v-mi","highlightsLink":"http://www.iplt20.com/videos/media/id/4182653479001/m16-rcb-vs-mi-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6106/report-m16-rcb-vs-mi","matchType":"IPLT20","venue":{"shortName":"M. Chinnaswamy Stadium","city":"Bengaluru","id":5,"country":"India","fullName":"M. Chinnaswamy Stadium"},"matchId":{"name":"ipl2015-16","id":3241},"groupName":"","matchDate":"2015-04-19T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":191,"wkts":7,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Challengers","abbreviation":"RCB","primaryColor":"D33F46","secondaryColor":"FFFFFF","type":"m","fullName":"Royal Challengers Bangalore","id":9}},"team2":{"innings":[{"maxBalls":120,"runs":209,"wkts":7,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","fullName":"Mumbai Indians","id":6}},"matchState":"C","matchStatus":{"text":"Mumbai Indians won by 18 runs","outcome":"B"},"description":"Match 16"},{"photostreamLink":"http://www.iplt20.com/photos/265/ipl-2015-match-17-dd-v-kkr","highlightsLink":"http://www.iplt20.com/videos/media/id/4184594188001/m17-dd-vs-kkr-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6148/report-m17-dd-vs-kkr","matchType":"IPLT20","venue":{"shortName":"Feroz Shah Kotla Ground","city":"Delhi","id":8,"country":"India","fullName":"Feroz Shah Kotla Ground"},"matchId":{"name":"ipl2015-17","id":3242},"groupName":"","matchDate":"2015-04-20T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":146,"wkts":8,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Daredevils","abbreviation":"DD","primaryColor":"B22E2A","secondaryColor":"FFFFFF","type":"m","fullName":"Delhi Daredevils","id":3}},"team2":{"innings":[{"maxBalls":120,"runs":147,"wkts":4,"inningsNumber":2,"ballsFaced":109}],"team":{"shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","fullName":"Kolkata Knight Riders","id":5}},"matchState":"C","matchStatus":{"text":"Kolkata Knight Riders won by 6 wickets","outcome":"B"},"description":"Match 17"},{"photostreamLink":"http://www.iplt20.com/photos/266/ipl-2015-match-18-rr-v-kxip","highlightsLink":"http://www.iplt20.com/videos/media/id/4187002110001/m18-rr-vs-kxip-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6172/report-m18-rr-vs-kxip","matchType":"IPLT20","venue":{"shortName":"Sardar Patel Stadium","city":"Ahmedabad","id":19,"country":"India","fullName":"Sardar Patel Stadium"},"matchId":{"name":"ipl2015-18","id":3243},"groupName":"","matchDate":"2015-04-21T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":191,"wkts":6,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","fullName":"Rajasthan Royals","id":8}},"team2":{"innings":[{"maxBalls":120,"runs":191,"wkts":6,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","fullName":"Kings XI Punjab","id":4}},"matchState":"C","matchStatus":{"text":"Match Tied (Kings XI Punjab won Super Over)","outcome":"B"},"description":"Match 18"},{"photostreamLink":"http://www.iplt20.com/photos/267/ipl-2015-match-19-srh-v-kkr","highlightsLink":"http://www.iplt20.com/videos/media/id/4189246716001/m19-srh-vs-kkr-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6195/report-m19-srh-vs-kkr","matchType":"IPLT20","venue":{"shortName":"ACA-VDCA Stadium","city":"Visakhapatnam","id":6,"country":"India","fullName":"ACA-VDCA Stadium"},"matchId":{"name":"ipl2015-19","id":3244},"groupName":"","matchDate":"2015-04-22T16:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":176,"wkts":4,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","fullName":"Sunrisers Hyderabad","id":62}},"team2":{"innings":[{"maxBalls":72,"runs":101,"wkts":4,"inningsNumber":2,"ballsFaced":72}],"team":{"shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","fullName":"Kolkata Knight Riders","id":5}},"matchState":"C","matchStatus":{"text":"Sunrisers Hyderabad won by 16 runs (D/L Method)","outcome":"A"},"description":"Match 19"},{"photostreamLink":"http://www.iplt20.com/photos/268/ipl-2015-match-20-rcb-v-csk","highlightsLink":"http://www.iplt20.com/videos/media/id/4189563890001/m20-rcb-vs-csk-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6210/report-m20-rcb-vs-csk","matchType":"IPLT20","venue":{"shortName":"M. Chinnaswamy Stadium","city":"Bengaluru","id":5,"country":"India","fullName":"M. Chinnaswamy Stadium"},"matchId":{"name":"ipl2015-20","id":3245},"groupName":"","matchDate":"2015-04-22T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":154,"wkts":8,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Challengers","abbreviation":"RCB","primaryColor":"D33F46","secondaryColor":"FFFFFF","type":"m","fullName":"Royal Challengers Bangalore","id":9}},"team2":{"innings":[{"maxBalls":120,"runs":181,"wkts":8,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"FFFFFF","type":"m","fullName":"Chennai Super Kings","id":1}},"matchState":"C","matchStatus":{"text":"Chennai Super Kings won by 27 runs","outcome":"B"},"description":"Match 20"},{"photostreamLink":"http://www.iplt20.com/photos/269/ipl-2015-match-21-dd-v-mi","highlightsLink":"http://www.iplt20.com/videos/media/id/4192076285001/m21-dd-vs-mi-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6230/report-m21-dd-vs-mi","matchType":"IPLT20","venue":{"shortName":"Feroz Shah Kotla Ground","city":"Delhi","id":8,"country":"India","fullName":"Feroz Shah Kotla Ground"},"matchId":{"name":"ipl2015-21","id":3246},"groupName":"","matchDate":"2015-04-23T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":190,"wkts":4,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Daredevils","abbreviation":"DD","primaryColor":"B22E2A","secondaryColor":"FFFFFF","type":"m","fullName":"Delhi Daredevils","id":3}},"team2":{"innings":[{"maxBalls":120,"runs":153,"wkts":9,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","fullName":"Mumbai Indians","id":6}},"matchState":"C","matchStatus":{"text":"Delhi Daredevils won by 37 runs","outcome":"A"},"description":"Match 21"},{"photostreamLink":"http://www.iplt20.com/photos/270/ipl-2015-match-22-rr-v-rcb","highlightsLink":"http://www.iplt20.com/videos/media/id/4194395930001/m22-rr-vs-rcb-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6264/report-m22-rr-vs-rcb","matchType":"IPLT20","venue":{"shortName":"Sardar Patel Stadium","city":"Ahmedabad","id":19,"country":"India","fullName":"Sardar Patel Stadium"},"matchId":{"name":"ipl2015-22","id":3247},"groupName":"","matchDate":"2015-04-24T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":130,"wkts":9,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","fullName":"Rajasthan Royals","id":8}},"team2":{"innings":[{"maxBalls":120,"runs":134,"wkts":1,"inningsNumber":2,"ballsFaced":97}],"team":{"shortName":"Challengers","abbreviation":"RCB","primaryColor":"D33F46","secondaryColor":"FFFFFF","type":"m","fullName":"Royal Challengers Bangalore","id":9}},"matchState":"C","matchStatus":{"text":"Royal Challengers Bangalore won by 9 wickets","outcome":"B"},"description":"Match 22"},{"photostreamLink":"http://www.iplt20.com/photos/271/ipl-2015-match-23-mi-v-srh","highlightsLink":"http://www.iplt20.com/videos/media/id/4195998276001/m23-mi-vs-srh-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6283/report-m23-mi-vs-srh","matchType":"IPLT20","venue":{"shortName":"Wankhede Stadium","city":"Mumbai","id":4,"country":"India","fullName":"Wankhede Stadium"},"matchId":{"name":"ipl2015-23","id":3248},"groupName":"","matchDate":"2015-04-25T16:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":157,"wkts":8,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","fullName":"Mumbai Indians","id":6}},"team2":{"innings":[{"maxBalls":120,"runs":137,"wkts":8,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","fullName":"Sunrisers Hyderabad","id":62}},"matchState":"C","matchStatus":{"text":"Mumbai Indians won by 20 runs","outcome":"A"},"description":"Match 23"},{"photostreamLink":"http://www.iplt20.com/photos/272/ipl-2015-match-24-csk-v-kxip","highlightsLink":"http://www.iplt20.com/videos/media/id/4196247192001/m24-csk-vs-kxip-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6289/report-m24-csk-vs-kxip","matchType":"IPLT20","venue":{"shortName":"Chidambaram","city":"Chennai","id":1,"country":"India","fullName":"M. A. Chidambaram Stadium"},"matchId":{"name":"ipl2015-24","id":3249},"groupName":"","matchDate":"2015-04-25T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":192,"wkts":3,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"FFFFFF","type":"m","fullName":"Chennai Super Kings","id":1}},"team2":{"innings":[{"maxBalls":120,"runs":95,"wkts":9,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","fullName":"Kings XI Punjab","id":4}},"matchState":"C","matchStatus":{"text":"Chennai Super Kings won by 97 runs","outcome":"A"},"description":"Match 24"},{"photostreamLink":"http://www.iplt20.com/photos/273/ipl-2015-match-25-kkr-v-rr","reportLink":"http://www.iplt20.com/news/2015/match-reports/6307/report-m25-kkr-vs-rr","matchType":"IPLT20","venue":{"shortName":"Eden Gardens","city":"Kolkata","id":2,"country":"India","fullName":"Eden Gardens"},"matchId":{"name":"ipl2015-25","id":3250},"groupName":"","matchDate":"2015-04-26T16:00:00+0530","team1":{"innings":[{"maxBalls":120,"inningsNumber":1}],"team":{"shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","fullName":"Kolkata Knight Riders","id":5}},"team2":{"innings":[{"maxBalls":120,"inningsNumber":2}],"team":{"shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","fullName":"Rajasthan Royals","id":8}},"matchState":"C","matchStatus":{"text":"Match abandoned without a ball bowled","outcome":"N"},"description":"Match 25"},{"photostreamLink":"http://www.iplt20.com/photos/274/ipl-2015-match-26-dd-v-rcb","highlightsLink":"http://www.iplt20.com/videos/media/id/4197611123001/m26-dd-vs-rcb-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6314/report-m26-dd-vs-rcb","matchType":"IPLT20","venue":{"shortName":"Feroz Shah Kotla Ground","city":"Delhi","id":8,"country":"India","fullName":"Feroz Shah Kotla Ground"},"matchId":{"name":"ipl2015-26","id":3251},"groupName":"","matchDate":"2015-04-26T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":95,"wkts":10,"allOut":true,"inningsNumber":1,"ballsFaced":110}],"team":{"shortName":"Daredevils","abbreviation":"DD","primaryColor":"B22E2A","secondaryColor":"FFFFFF","type":"m","fullName":"Delhi Daredevils","id":3}},"team2":{"innings":[{"maxBalls":120,"runs":99,"inningsNumber":2,"ballsFaced":63}],"team":{"shortName":"Challengers","abbreviation":"RCB","primaryColor":"D33F46","secondaryColor":"FFFFFF","type":"m","fullName":"Royal Challengers Bangalore","id":9}},"matchState":"C","matchStatus":{"text":"Royal Challengers Bangalore won by 10 wickets","outcome":"B"},"description":"Match 26"},{"photostreamLink":"http://www.iplt20.com/photos/275/ipl-2015-match-27-kxip-v-srh","highlightsLink":"http://www.iplt20.com/videos/media/id/4199591665001/m27-kxip-vs-srh-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6346/report-m27-kxip-vs-srh","matchType":"IPLT20","venue":{"shortName":"IS Bindra Stadium","city":"Mohali","id":9,"country":"India","fullName":"IS Bindra Stadium"},"matchId":{"name":"ipl2015-27","id":3252},"groupName":"","matchDate":"2015-04-27T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":130,"wkts":9,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","fullName":"Kings XI Punjab","id":4}},"team2":{"innings":[{"maxBalls":120,"runs":150,"wkts":6,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","fullName":"Sunrisers Hyderabad","id":62}},"matchState":"C","matchStatus":{"text":"Sunrisers Hyderabad won by 20 runs","outcome":"B"},"description":"Match 27"},{"photostreamLink":"http://www.iplt20.com/photos/276/ipl-2015-match-28-csk-v-kkr","highlightsLink":"http://www.iplt20.com/videos/media/id/4202243892001/m28-csk-vs-kkr-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6368/report-m28-csk-vs-kkr","matchType":"IPLT20","venue":{"shortName":"Chidambaram","city":"Chennai","id":1,"country":"India","fullName":"M. A. Chidambaram Stadium"},"matchId":{"name":"ipl2015-28","id":3253},"groupName":"","matchDate":"2015-04-28T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":134,"wkts":6,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"FFFFFF","type":"m","fullName":"Chennai Super Kings","id":1}},"team2":{"innings":[{"maxBalls":120,"runs":132,"wkts":9,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","fullName":"Kolkata Knight Riders","id":5}},"matchState":"C","matchStatus":{"text":"Chennai Super Kings won by 2 runs","outcome":"A"},"description":"Match 28"},{"photostreamLink":"http://www.iplt20.com/photos/277/ipl-2015-match-29-rcb-v-rr","reportLink":"http://www.iplt20.com/news/2015/match-reports/6388/report-m29-rcb-vs-rr","matchType":"IPLT20","venue":{"shortName":"M. Chinnaswamy Stadium","city":"Bengaluru","id":5,"country":"India","fullName":"M. Chinnaswamy Stadium"},"matchId":{"name":"ipl2015-29","id":3254},"groupName":"","matchDate":"2015-04-29T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"inningsNumber":1}],"team":{"shortName":"Challengers","abbreviation":"RCB","primaryColor":"D33F46","secondaryColor":"FFFFFF","type":"m","fullName":"Royal Challengers Bangalore","id":9}},"team2":{"team":{"shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","fullName":"Rajasthan Royals","id":8}},"matchState":"C","matchStatus":{"text":"No Result","outcome":"N"},"description":"Match 29"},{"photostreamLink":"http://www.iplt20.com/photos/278/ipl-2015-match-30-kkr-v-csk","highlightsLink":"http://www.iplt20.com/videos/media/id/4207024615001/m30-kkr-vs-csk-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6410/report-m30-kkr-vs-csk","matchType":"IPLT20","venue":{"shortName":"Eden Gardens","city":"Kolkata","id":2,"country":"India","fullName":"Eden Gardens"},"matchId":{"name":"ipl2015-30","id":3255},"groupName":"","matchDate":"2015-04-30T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":169,"wkts":3,"inningsNumber":2,"ballsFaced":119}],"team":{"shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","fullName":"Kolkata Knight Riders","id":5}},"team2":{"innings":[{"maxBalls":120,"runs":165,"wkts":9,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"FFFFFF","type":"m","fullName":"Chennai Super Kings","id":1}},"matchState":"C","matchStatus":{"text":"Kolkata Knight Riders won by 7 wickets","outcome":"A"},"description":"Match 30"},{"photostreamLink":"http://www.iplt20.com/photos/279/ipl-2015-match-31-dd-v-kxip","highlightsLink":"http://www.iplt20.com/videos/media/id/4208834254001/m31-dd-vs-kxip-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6426/report-m31-dd-vs-kxip","matchType":"IPLT20","venue":{"shortName":"Feroz Shah Kotla Ground","city":"Delhi","id":8,"country":"India","fullName":"Feroz Shah Kotla Ground"},"matchId":{"name":"ipl2015-31","id":3256},"groupName":"","matchDate":"2015-05-01T16:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":119,"wkts":1,"inningsNumber":2,"ballsFaced":83}],"team":{"shortName":"Daredevils","abbreviation":"DD","primaryColor":"B22E2A","secondaryColor":"FFFFFF","type":"m","fullName":"Delhi Daredevils","id":3}},"team2":{"innings":[{"maxBalls":120,"runs":118,"wkts":8,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","fullName":"Kings XI Punjab","id":4}},"matchState":"C","matchStatus":{"text":"Delhi Daredevils won by 9 wickets","outcome":"A"},"description":"Match 31"},{"photostreamLink":"http://www.iplt20.com/photos/280/ipl-2015-match-32-mi-v-rr","highlightsLink":"http://www.iplt20.com/videos/media/id/4209400061001/m32-mi-vs-rr-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6434/report-m32-mi-vs-rr","matchType":"IPLT20","venue":{"shortName":"Wankhede Stadium","city":"Mumbai","id":4,"country":"India","fullName":"Wankhede Stadium"},"matchId":{"name":"ipl2015-32","id":3257},"groupName":"","matchDate":"2015-05-01T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":187,"wkts":5,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","fullName":"Mumbai Indians","id":6}},"team2":{"innings":[{"maxBalls":120,"runs":179,"wkts":7,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","fullName":"Rajasthan Royals","id":8}},"matchState":"C","matchStatus":{"text":"Mumbai Indians won by 8 runs","outcome":"A"},"description":"Match 32"},{"photostreamLink":"http://www.iplt20.com/photos/281/ipl-2015-match-33-rcb-v-kkr","highlightsLink":"http://www.iplt20.com/videos/media/id/4211130413001/m33-rcb-vs-kkr-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6452/report-m33-rcb-vs-kkr","matchType":"IPLT20","venue":{"shortName":"M. Chinnaswamy Stadium","city":"Bengaluru","id":5,"country":"India","fullName":"M. Chinnaswamy Stadium"},"matchId":{"name":"ipl2015-33","id":3258},"groupName":"","matchDate":"2015-05-02T16:00:00+0530","team1":{"innings":[{"maxBalls":60,"runs":115,"wkts":3,"inningsNumber":2,"ballsFaced":58}],"team":{"shortName":"Challengers","abbreviation":"RCB","primaryColor":"D33F46","secondaryColor":"FFFFFF","type":"m","fullName":"Royal Challengers Bangalore","id":9}},"team2":{"innings":[{"maxBalls":60,"runs":111,"wkts":4,"inningsNumber":1,"ballsFaced":60}],"team":{"shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","fullName":"Kolkata Knight Riders","id":5}},"matchState":"C","matchStatus":{"text":"Royal Challengers Bangalore won by 7 wickets","outcome":"A"},"description":"Match 33"},{"photostreamLink":"http://www.iplt20.com/photos/282/ipl-2015-match-34-srh-v-csk","highlightsLink":"http://www.iplt20.com/videos/media/id/4211437537001/m34-srh-vs-csk-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6457/report-m34-srh-vs-csk","matchType":"IPLT20","venue":{"shortName":"Rajiv Gandhi Intl. Cricket Stadium","city":"Hyderabad","id":10,"country":"India","fullName":"Rajiv Gandhi Intl. Cricket Stadium"},"matchId":{"name":"ipl2015-34","id":3259},"groupName":"","matchDate":"2015-05-02T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":192,"wkts":7,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","fullName":"Sunrisers Hyderabad","id":62}},"team2":{"innings":[{"maxBalls":120,"runs":170,"wkts":6,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"FFFFFF","type":"m","fullName":"Chennai Super Kings","id":1}},"matchState":"C","matchStatus":{"text":"Sunrisers Hyderabad won by 22 runs","outcome":"A"},"description":"Match 34"},{"photostreamLink":"http://www.iplt20.com/photos/283/ipl-2015-match-35-kxip-v-mi","highlightsLink":"http://www.iplt20.com/videos/media/id/4212971654001/m35-kxip-vs-mi-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6481/report-m35-kxip-vs-mi","matchType":"IPLT20","venue":{"shortName":"IS Bindra Stadium","city":"Mohali","id":9,"country":"India","fullName":"IS Bindra Stadium"},"matchId":{"name":"ipl2015-35","id":3260},"groupName":"","matchDate":"2015-05-03T16:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":149,"wkts":7,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","fullName":"Kings XI Punjab","id":4}},"team2":{"innings":[{"maxBalls":120,"runs":172,"wkts":3,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","fullName":"Mumbai Indians","id":6}},"matchState":"C","matchStatus":{"text":"Mumbai Indians won by 23 runs","outcome":"B"},"description":"Match 35"},{"photostreamLink":"http://www.iplt20.com/photos/284/ipl-2015-match-36-rr-v-dd","highlightsLink":"http://www.iplt20.com/videos/media/id/4213163063001/m36-rr-vs-dd-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6492/report-m36-rr-vs-dd","matchType":"IPLT20","venue":{"shortName":"Brabourne Stadium","city":"Mumbai","id":18,"country":"India","fullName":"Brabourne Stadium"},"matchId":{"name":"ipl2015-36","id":3261},"groupName":"","matchDate":"2015-05-03T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":189,"wkts":2,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","fullName":"Rajasthan Royals","id":8}},"team2":{"innings":[{"maxBalls":120,"runs":175,"wkts":7,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Daredevils","abbreviation":"DD","primaryColor":"B22E2A","secondaryColor":"FFFFFF","type":"m","fullName":"Delhi Daredevils","id":3}},"matchState":"C","matchStatus":{"text":"Rajasthan Royals won by 14 runs","outcome":"A"},"description":"Match 36"},{"photostreamLink":"http://www.iplt20.com/photos/285/ipl-2015-match-37-csk-v-rcb","highlightsLink":"http://www.iplt20.com/videos/media/id/4215027536001/m37-csk-vs-rcb-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6516/report-m37-csk-vs-rcb","matchType":"IPLT20","venue":{"shortName":"Chidambaram","city":"Chennai","id":1,"country":"India","fullName":"M. A. Chidambaram Stadium"},"matchId":{"name":"ipl2015-37","id":3262},"groupName":"","matchDate":"2015-05-04T16:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":148,"wkts":9,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"FFFFFF","type":"m","fullName":"Chennai Super Kings","id":1}},"team2":{"innings":[{"maxBalls":120,"runs":124,"wkts":10,"allOut":true,"inningsNumber":2,"ballsFaced":118}],"team":{"shortName":"Challengers","abbreviation":"RCB","primaryColor":"D33F46","secondaryColor":"FFFFFF","type":"m","fullName":"Royal Challengers Bangalore","id":9}},"matchState":"C","matchStatus":{"text":"Chennai Super Kings won by 24 runs","outcome":"A"},"description":"Match 37"},{"photostreamLink":"http://www.iplt20.com/photos/286/ipl-2015-match-38-kkr-v-srh","highlightsLink":"http://www.iplt20.com/videos/media/id/4215619777001/m38-kkr-vs-srh-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6524/report-m38-kkr-vs-srh","matchType":"IPLT20","venue":{"shortName":"Eden Gardens","city":"Kolkata","id":2,"country":"India","fullName":"Eden Gardens"},"matchId":{"name":"ipl2015-38","id":3263},"groupName":"","matchDate":"2015-05-04T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":167,"wkts":7,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","fullName":"Kolkata Knight Riders","id":5}},"team2":{"innings":[{"maxBalls":120,"runs":132,"wkts":9,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","fullName":"Sunrisers Hyderabad","id":62}},"matchState":"C","matchStatus":{"text":"Kolkata Knight Riders won by 35 runs","outcome":"A"},"description":"Match 38"},{"photostreamLink":"http://www.iplt20.com/photos/287/ipl-2015-match-39-mi-v-dd","highlightsLink":"http://www.iplt20.com/videos/media/id/4218742283001/m39-mi-vs-dd-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6543/report-m39-mi-vs-dd","matchType":"IPLT20","venue":{"shortName":"Wankhede Stadium","city":"Mumbai","id":4,"country":"India","fullName":"Wankhede Stadium"},"matchId":{"name":"ipl2015-39","id":3264},"groupName":"","matchDate":"2015-05-05T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":153,"wkts":5,"inningsNumber":2,"ballsFaced":117}],"team":{"shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","fullName":"Mumbai Indians","id":6}},"team2":{"innings":[{"maxBalls":120,"runs":152,"wkts":6,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Daredevils","abbreviation":"DD","primaryColor":"B22E2A","secondaryColor":"FFFFFF","type":"m","fullName":"Delhi Daredevils","id":3}},"matchState":"C","matchStatus":{"text":"Mumbai Indians won by 5 wickets","outcome":"A"},"description":"Match 39"},{"photostreamLink":"http://www.iplt20.com/photos/288/ipl-2015-match-40-rcb-v-kxip","highlightsLink":"http://www.iplt20.com/videos/media/id/4221067751001/m40-rcb-vs-kxip-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6571/report-m40-rcb-vs-kxip","matchType":"IPLT20","venue":{"shortName":"M. Chinnaswamy Stadium","city":"Bengaluru","id":5,"country":"India","fullName":"M. Chinnaswamy Stadium"},"matchId":{"name":"ipl2015-40","id":3265},"groupName":"","matchDate":"2015-05-06T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":226,"wkts":3,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Challengers","abbreviation":"RCB","primaryColor":"D33F46","secondaryColor":"FFFFFF","type":"m","fullName":"Royal Challengers Bangalore","id":9}},"team2":{"innings":[{"maxBalls":120,"runs":88,"wkts":10,"allOut":true,"inningsNumber":2,"ballsFaced":82}],"team":{"shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","fullName":"Kings XI Punjab","id":4}},"matchState":"C","matchStatus":{"text":"Royal Challengers Bangalore won by 138 runs","outcome":"A"},"description":"Match 40"},{"photostreamLink":"http://www.iplt20.com/photos/289/ipl-2015-match-41-rr-v-srh","highlightsLink":"http://www.iplt20.com/videos/media/id/4223092506001/m41-rr-vs-srh-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6588/report-m41-rr-vs-srh","matchType":"IPLT20","venue":{"shortName":"Brabourne Stadium","city":"Mumbai","id":18,"country":"India","fullName":"Brabourne Stadium"},"matchId":{"name":"ipl2015-41","id":3266},"groupName":"","matchDate":"2015-05-07T16:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":194,"wkts":7,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","fullName":"Rajasthan Royals","id":8}},"team2":{"innings":[{"maxBalls":120,"runs":201,"wkts":4,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","fullName":"Sunrisers Hyderabad","id":62}},"matchState":"C","matchStatus":{"text":"Sunrisers Hyderabad won by 7 runs","outcome":"B"},"description":"Match 41"},{"photostreamLink":"http://www.iplt20.com/photos/290/ipl-2015-match-42-kkr-v-dd","highlightsLink":"http://www.iplt20.com/videos/media/id/4223607758001/m42-kkr-vs-dd-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6602/report-m42-kkr-vs-dd","matchType":"IPLT20","venue":{"shortName":"Eden Gardens","city":"Kolkata","id":2,"country":"India","fullName":"Eden Gardens"},"matchId":{"name":"ipl2015-42","id":3267},"groupName":"","matchDate":"2015-05-07T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":171,"wkts":7,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","fullName":"Kolkata Knight Riders","id":5}},"team2":{"innings":[{"maxBalls":120,"runs":158,"wkts":6,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Daredevils","abbreviation":"DD","primaryColor":"B22E2A","secondaryColor":"FFFFFF","type":"m","fullName":"Delhi Daredevils","id":3}},"matchState":"C","matchStatus":{"text":"Kolkata Knight Riders won by 13 runs","outcome":"A"},"description":"Match 42"},{"photostreamLink":"http://www.iplt20.com/photos/291/ipl-2015-match-43-csk-v-mi","highlightsLink":"http://www.iplt20.com/videos/media/id/4226032919001/m43-csk-vs-mi-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6629/report-m43-csk-vs-mi","matchType":"IPLT20","venue":{"shortName":"Chidambaram","city":"Chennai","id":1,"country":"India","fullName":"M. A. Chidambaram Stadium"},"matchId":{"name":"ipl2015-43","id":3268},"groupName":"","matchDate":"2015-05-08T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":158,"wkts":5,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"FFFFFF","type":"m","fullName":"Chennai Super Kings","id":1}},"team2":{"innings":[{"maxBalls":120,"runs":159,"wkts":4,"inningsNumber":2,"ballsFaced":116}],"team":{"shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","fullName":"Mumbai Indians","id":6}},"matchState":"C","matchStatus":{"text":"Mumbai Indians won by 6 wickets","outcome":"B"},"description":"Match 43"},{"photostreamLink":"http://www.iplt20.com/photos/292/ipl-2015-match-44-kkr-v-kxip","highlightsLink":"http://www.iplt20.com/videos/media/id/4227220577001/m44-kkr-vs-kxip-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6641/report-m44-kkr-vs-kxip","matchType":"IPLT20","venue":{"shortName":"Eden Gardens","city":"Kolkata","id":2,"country":"India","fullName":"Eden Gardens"},"matchId":{"name":"ipl2015-44","id":3269},"groupName":"","matchDate":"2015-05-09T16:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":184,"wkts":9,"inningsNumber":2,"ballsFaced":119}],"team":{"shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","fullName":"Kolkata Knight Riders","id":5}},"team2":{"innings":[{"maxBalls":120,"runs":183,"wkts":5,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","fullName":"Kings XI Punjab","id":4}},"matchState":"C","matchStatus":{"text":"Kolkata Knight Riders won by 1 wicket","outcome":"A"},"description":"Match 44"},{"photostreamLink":"http://www.iplt20.com/photos/293/ipl-2015-match-45-dd-v-srh","highlightsLink":"http://www.iplt20.com/videos/media/id/4227526301001/m45-dd-vs-srh-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6653/report-m45-dd-vs-srh","matchType":"IPLT20","venue":{"shortName":"Shaheed Veer Narayan Singh International Cricket Stadium","city":"Naya Raipur","id":59,"country":"India","fullName":"Shaheed Veer Narayan Singh International Cricket Stadium"},"matchId":{"name":"ipl2015-45","id":3270},"groupName":"","matchDate":"2015-05-09T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":157,"wkts":4,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Daredevils","abbreviation":"DD","primaryColor":"B22E2A","secondaryColor":"FFFFFF","type":"m","fullName":"Delhi Daredevils","id":3}},"team2":{"innings":[{"maxBalls":120,"runs":163,"wkts":4,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","fullName":"Sunrisers Hyderabad","id":62}},"matchState":"C","matchStatus":{"text":"Sunrisers Hyderabad won by 6 runs","outcome":"B"},"description":"Match 45"},{"photostreamLink":"http://www.iplt20.com/photos/294/ipl-2015-match-46-mi-v-rcb","highlightsLink":"http://www.iplt20.com/videos/media/id/4228210803001/m46-mi-vs-rcb-match-highlights","reportLink":"http://www.iplt20.com/news/2015/more-news/6672/report-m46-mi-vs-rcb","matchType":"IPLT20","venue":{"shortName":"Wankhede Stadium","city":"Mumbai","id":4,"country":"India","fullName":"Wankhede Stadium"},"matchId":{"name":"ipl2015-46","id":3271},"groupName":"","matchDate":"2015-05-10T16:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":196,"wkts":7,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","fullName":"Mumbai Indians","id":6}},"team2":{"innings":[{"maxBalls":120,"runs":235,"wkts":1,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Challengers","abbreviation":"RCB","primaryColor":"D33F46","secondaryColor":"FFFFFF","type":"m","fullName":"Royal Challengers Bangalore","id":9}},"matchState":"C","matchStatus":{"text":"Royal Challengers Bangalore won by 39 runs","outcome":"B"},"description":"Match 46"},{"photostreamLink":"http://www.iplt20.com/photos/295/ipl-2015-match-47-csk-v-rr","highlightsLink":"http://www.iplt20.com/videos/media/id/4228525243001/m47-csk-vs-rr-match-highlights","reportLink":"http://www.iplt20.com/news/2015/more-news/6679/report-m47-csk-vs-rr","matchType":"IPLT20","venue":{"shortName":"Chidambaram","city":"Chennai","id":1,"country":"India","fullName":"M. A. Chidambaram Stadium"},"matchId":{"name":"ipl2015-47","id":3272},"groupName":"","matchDate":"2015-05-10T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":157,"wkts":5,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"FFFFFF","type":"m","fullName":"Chennai Super Kings","id":1}},"team2":{"innings":[{"maxBalls":120,"runs":145,"wkts":9,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","fullName":"Rajasthan Royals","id":8}},"matchState":"C","matchStatus":{"text":"Chennai Super Kings won by 12 runs","outcome":"A"},"description":"Match 47"},{"photostreamLink":"http://www.iplt20.com/photos/296/ipl-2015-match-48-srh-v-kxip","highlightsLink":"http://www.iplt20.com/videos/media/id/4230051751001/m48-srh-vs-kxip-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6708/report-m48-srh-vs-kxip","matchType":"IPLT20","venue":{"shortName":"Rajiv Gandhi Intl. Cricket Stadium","city":"Hyderabad","id":10,"country":"India","fullName":"Rajiv Gandhi Intl. Cricket Stadium"},"matchId":{"name":"ipl2015-48","id":3273},"groupName":"","matchDate":"2015-05-11T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":185,"wkts":5,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","fullName":"Sunrisers Hyderabad","id":62}},"team2":{"innings":[{"maxBalls":120,"runs":180,"wkts":7,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","fullName":"Kings XI Punjab","id":4}},"matchState":"C","matchStatus":{"text":"Sunrisers Hyderabad won by 5 runs","outcome":"A"},"description":"Match 48"},{"photostreamLink":"http://www.iplt20.com/photos/297/ipl-2015-match-49-dd-v-csk","highlightsLink":"http://www.iplt20.com/videos/media/id/4232268524001/m49-dd-vs-csk-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6729/report-m49-dd-vs-csk","matchType":"IPLT20","venue":{"shortName":"Shaheed Veer Narayan Singh International Cricket Stadium","city":"Naya Raipur","id":59,"country":"India","fullName":"Shaheed Veer Narayan Singh International Cricket Stadium"},"matchId":{"name":"ipl2015-49","id":3274},"groupName":"","matchDate":"2015-05-12T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":120,"wkts":4,"inningsNumber":2,"ballsFaced":100}],"team":{"shortName":"Daredevils","abbreviation":"DD","primaryColor":"B22E2A","secondaryColor":"FFFFFF","type":"m","fullName":"Delhi Daredevils","id":3}},"team2":{"innings":[{"maxBalls":120,"runs":119,"wkts":6,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"FFFFFF","type":"m","fullName":"Chennai Super Kings","id":1}},"matchState":"C","matchStatus":{"text":"Delhi Daredevils won by 6 wickets","outcome":"A"},"description":"Match 49"},{"photostreamLink":"http://www.iplt20.com/photos/298/ipl-2015-match-50-kxip-v-rcb","highlightsLink":"http://www.iplt20.com/videos/media/id/4234678654001/m50-kxip-vs-rcb-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6751/report-m50-kxip-vs-rcb","matchType":"IPLT20","venue":{"shortName":"IS Bindra Stadium","city":"Mohali","id":9,"country":"India","fullName":"IS Bindra Stadium"},"matchId":{"name":"ipl2015-50","id":3275},"groupName":"","matchDate":"2015-05-13T20:00:00+0530","team1":{"innings":[{"maxBalls":60,"runs":106,"wkts":6,"inningsNumber":1,"ballsFaced":60}],"team":{"shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","fullName":"Kings XI Punjab","id":4}},"team2":{"innings":[{"maxBalls":60,"runs":84,"wkts":6,"inningsNumber":2,"ballsFaced":60}],"team":{"shortName":"Challengers","abbreviation":"RCB","primaryColor":"D33F46","secondaryColor":"FFFFFF","type":"m","fullName":"Royal Challengers Bangalore","id":9}},"matchState":"C","matchStatus":{"text":"Kings XI Punjab won by 22 runs","outcome":"A"},"description":"Match 50"},{"photostreamLink":"http://www.iplt20.com/photos/299/ipl-2015-match-51-mi-v-kkr","highlightsLink":"http://www.iplt20.com/videos/media/id/4236911128001/m51-mi-vs-kkr-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6769/report-m51-mi-vs-kkr","matchType":"IPLT20","venue":{"shortName":"Wankhede Stadium","city":"Mumbai","id":4,"country":"India","fullName":"Wankhede Stadium"},"matchId":{"name":"ipl2015-51","id":3276},"groupName":"","matchDate":"2015-05-14T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":171,"wkts":4,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","fullName":"Mumbai Indians","id":6}},"team2":{"innings":[{"maxBalls":120,"runs":166,"wkts":7,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","fullName":"Kolkata Knight Riders","id":5}},"matchState":"C","matchStatus":{"text":"Mumbai Indians won by 5 runs","outcome":"A"},"description":"Match 51"},{"photostreamLink":"http://www.iplt20.com/photos/300/ipl-2015-match-52-srh-v-rcb","highlightsLink":"http://www.iplt20.com/videos/media/id/4239086912001/m52-srh-vs-rcb-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6797/report-m52-srh-vs-rcb","matchType":"IPLT20","venue":{"shortName":"Rajiv Gandhi Intl. Cricket Stadium","city":"Hyderabad","id":10,"country":"India","fullName":"Rajiv Gandhi Intl. Cricket Stadium"},"matchId":{"name":"ipl2015-52","id":3277},"groupName":"","matchDate":"2015-05-15T20:00:00+0530","team1":{"innings":[{"maxBalls":66,"runs":135,"wkts":3,"inningsNumber":1,"ballsFaced":66}],"team":{"shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","fullName":"Sunrisers Hyderabad","id":62}},"team2":{"innings":[{"maxBalls":36,"runs":83,"wkts":4,"inningsNumber":2,"ballsFaced":35}],"team":{"shortName":"Challengers","abbreviation":"RCB","primaryColor":"D33F46","secondaryColor":"FFFFFF","type":"m","fullName":"Royal Challengers Bangalore","id":9}},"matchState":"C","matchStatus":{"text":"Royal Challengers Bangalore won by 6 wickets (D/L method)","outcome":"B"},"description":"Match 52"},{"photostreamLink":"http://www.iplt20.com/photos/301/ipl-2015-match-53-kxip-v-csk","highlightsLink":"http://www.iplt20.com/videos/media/id/4239935138001/m53-kxip-vs-csk-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6810/report-m53-kxip-vs-csk","matchType":"IPLT20","venue":{"shortName":"IS Bindra Stadium","city":"Mohali","id":9,"country":"India","fullName":"IS Bindra Stadium"},"matchId":{"name":"ipl2015-53","id":3278},"groupName":"","matchDate":"2015-05-16T16:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":130,"wkts":7,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","fullName":"Kings XI Punjab","id":4}},"team2":{"innings":[{"maxBalls":120,"runs":134,"wkts":3,"inningsNumber":2,"ballsFaced":101}],"team":{"shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"FFFFFF","type":"m","fullName":"Chennai Super Kings","id":1}},"matchState":"C","matchStatus":{"text":"Chennai Super Kings won by 7 wickets","outcome":"B"},"description":"Match 53"},{"photostreamLink":"http://www.iplt20.com/photos/302/ipl-2015-match-54-rr-v-kkr","highlightsLink":"http://www.iplt20.com/videos/media/id/4240477463001/m54-rr-vs-kkr-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6822/report-m54-rr-vs-kkr","matchType":"IPLT20","venue":{"shortName":"Brabourne Stadium","city":"Mumbai","id":18,"country":"India","fullName":"Brabourne Stadium"},"matchId":{"name":"ipl2015-54","id":3279},"groupName":"","matchDate":"2015-05-16T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":199,"wkts":6,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","fullName":"Rajasthan Royals","id":8}},"team2":{"innings":[{"maxBalls":120,"runs":190,"wkts":9,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","fullName":"Kolkata Knight Riders","id":5}},"matchState":"C","matchStatus":{"text":"Rajasthan Royals won by 9 runs","outcome":"A"},"description":"Match 54"},{"photostreamLink":"http://www.iplt20.com/photos/303/ipl-2015-match-55-rcb-v-dd","highlightsLink":"http://www.iplt20.com/videos/media/id/4241093295001/m55-rcb-vs-dd-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6850/report-m55-rcb-vs-dd","matchType":"IPLT20","venue":{"shortName":"M. Chinnaswamy Stadium","city":"Bengaluru","id":5,"country":"India","fullName":"M. Chinnaswamy Stadium"},"matchId":{"name":"ipl2015-55","id":3280},"groupName":"","matchDate":"2015-05-17T16:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":2,"inningsNumber":2,"ballsFaced":7}],"team":{"shortName":"Challengers","abbreviation":"RCB","primaryColor":"D33F46","secondaryColor":"FFFFFF","type":"m","fullName":"Royal Challengers Bangalore","id":9}},"team2":{"innings":[{"maxBalls":120,"runs":187,"wkts":5,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Daredevils","abbreviation":"DD","primaryColor":"B22E2A","secondaryColor":"FFFFFF","type":"m","fullName":"Delhi Daredevils","id":3}},"matchState":"C","matchStatus":{"text":"No result","outcome":"N"},"description":"Match 55"},{"photostreamLink":"http://www.iplt20.com/photos/304/ipl-2015-match-56-srh-v-mi","highlightsLink":"http://www.iplt20.com/videos/media/id/4241409323001/m56-srh-vs-mi-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6855/report-m56-srh-vs-mi","matchType":"IPLT20","venue":{"shortName":"Rajiv Gandhi Intl. Cricket Stadium","city":"Hyderabad","id":10,"country":"India","fullName":"Rajiv Gandhi Intl. Cricket Stadium"},"matchId":{"name":"ipl2015-56","id":3281},"groupName":"","matchDate":"2015-05-17T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":113,"wkts":10,"allOut":true,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","fullName":"Sunrisers Hyderabad","id":62}},"team2":{"innings":[{"maxBalls":120,"runs":114,"wkts":1,"inningsNumber":2,"ballsFaced":83}],"team":{"shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","fullName":"Mumbai Indians","id":6}},"matchState":"C","matchStatus":{"text":"Mumbai Indians won by 9 wickets","outcome":"B"},"description":"Match 56"},{"photostreamLink":"http://www.iplt20.com/photos/305/ipl-2015-match-57-qualifier-1","highlightsLink":"http://www.iplt20.com/videos/media/id/4245319580001/m57-csk-vs-mi-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6872/report-q1-csk-vs-mi","matchType":"IPLT20","venue":{"shortName":"Wankhede Stadium","city":"Mumbai","id":4,"country":"India","fullName":"Wankhede Stadium"},"matchId":{"name":"ipl2015-57","id":3282},"groupName":"Playoffs","matchDate":"2015-05-19T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":162,"wkts":10,"allOut":true,"inningsNumber":2,"ballsFaced":114}],"team":{"shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"FFFFFF","type":"m","fullName":"Chennai Super Kings","id":1}},"team2":{"innings":[{"maxBalls":120,"runs":187,"wkts":6,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","fullName":"Mumbai Indians","id":6}},"matchState":"C","matchStatus":{"text":"Mumbai Indians won by 25 runs","outcome":"B"},"description":"Qualifier 1"},{"photostreamLink":"http://www.iplt20.com/photos/306/ipl-2015-match-58-eliminator","highlightsLink":"http://www.iplt20.com/videos/media/id/4247579482001/m58-rcb-vs-rr-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6894/report-q2-rcb-vs-rr","matchType":"IPLT20","venue":{"shortName":"Maharashtra Cricket Association's International Stadium","city":"Pune","id":7,"country":"India","fullName":"Maharashtra Cricket Association's International Stadium"},"matchId":{"name":"ipl2015-58","id":3283},"groupName":"Playoffs","matchDate":"2015-05-20T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":180,"wkts":4,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Challengers","abbreviation":"RCB","primaryColor":"D33F46","secondaryColor":"FFFFFF","type":"m","fullName":"Royal Challengers Bangalore","id":9}},"team2":{"innings":[{"maxBalls":120,"runs":109,"wkts":10,"allOut":true,"inningsNumber":2,"ballsFaced":114}],"team":{"shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","fullName":"Rajasthan Royals","id":8}},"matchState":"C","matchStatus":{"text":"Royal Challengers Bangalore won by 71 runs","outcome":"A"},"description":"Eliminator"},{"photostreamLink":"http://www.iplt20.com/photos/307/ipl-2015-match-59-qualifier-2","highlightsLink":"http://www.iplt20.com/videos/media/id/4251841620001/m59-csk-vs-rcb-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6916/report-q2-csk-vs-rcb","matchType":"IPLT20","venue":{"shortName":"JSCA Stadium","city":"Ranchi","id":55,"country":"India","fullName":"JSCA International Cricket Stadium"},"matchId":{"name":"ipl2015-59","id":3284},"groupName":"Playoffs","matchDate":"2015-05-22T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":140,"wkts":7,"inningsNumber":2,"ballsFaced":119}],"team":{"shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"FFFFFF","type":"m","fullName":"Chennai Super Kings","id":1}},"team2":{"innings":[{"maxBalls":120,"runs":139,"wkts":8,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Challengers","abbreviation":"RCB","primaryColor":"D33F46","secondaryColor":"FFFFFF","type":"m","fullName":"Royal Challengers Bangalore","id":9}},"matchState":"C","matchStatus":{"text":"Chennai Super Kings won by 3 wickets","outcome":"A"},"description":"Qualifier 2"},{"photostreamLink":"http://www.iplt20.com/photos/308/ipl-2015-match-60-final","highlightsLink":"http://www.iplt20.com/videos/media/id/4254504315001/m60-mi-vs-csk-match-highlights","reportLink":"http://www.iplt20.com/news/2015/match-reports/6937/report-final-mi-vs-csk","matchType":"IPLT20","venue":{"shortName":"Eden Gardens","city":"Kolkata","id":2,"country":"India","fullName":"Eden Gardens"},"matchId":{"name":"ipl2015-60","id":3285},"groupName":"Playoffs","matchDate":"2015-05-24T20:00:00+0530","team1":{"innings":[{"maxBalls":120,"runs":202,"wkts":5,"inningsNumber":1,"ballsFaced":120}],"team":{"shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","fullName":"Mumbai Indians","id":6}},"team2":{"innings":[{"maxBalls":120,"runs":161,"wkts":8,"inningsNumber":2,"ballsFaced":120}],"team":{"shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"FFFFFF","type":"m","fullName":"Chennai Super Kings","id":1}},"matchState":"C","matchStatus":{"text":"Mumbai Indians won by 41 runs","outcome":"A"},"description":"Final"}]
     */

    private TournamentIdBean tournamentId;
    private List<ScheduleBean> schedule;

    public static TournamentSchedule objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new com.google.gson.Gson().fromJson(jsonObject.getString(str), TournamentSchedule.class);
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
