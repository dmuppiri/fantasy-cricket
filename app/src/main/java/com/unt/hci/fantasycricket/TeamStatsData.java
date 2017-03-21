package com.unt.hci.fantasycricket;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by jt on 2/26/17.
 */

public class TeamStatsData {

    /**
     * team : {"shortName":"Knight Riders","secondaryColor":"FFFFFF","primaryColor":"6F2C91","abbreviation":"KKR","type":"m","fullName":"Kolkata Knight Riders","id":5}
     * tournamentId : {"name":"ipl2015","id":2785}
     * playersStats : [{"player":{"dateOfBirth":"1981/10/14","nationality":"Indian","id":84,"fullName":"Gautam Gambhir"},"stats":[{"matchType":"ALL","battingStats":{"a":"25.15","sr":"117.62","no":0,"hs":"60","50s":3,"100s":0,"4s":41,"6s":4,"r":"327","b":278,"inns":13,"m":13},"bowlingStats":{"a":"-","sr":"-","d":0,"e":"-","wb":0,"bbiw":0,"bbir":0,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"-","r":0,"w":0,"maid":0,"nb":0,"b":0,"inns":0,"m":13},"fieldingStats":{"c":3,"ro":1,"s":0,"inns":4,"m":13}},{"matchType":"AGG","battingStats":{"a":"25.15","sr":"117.62","no":0,"hs":"60","50s":3,"100s":0,"4s":41,"6s":4,"r":"327","b":278,"inns":13,"m":13},"bowlingStats":{"a":"-","sr":"-","d":0,"e":"-","wb":0,"bbiw":0,"bbir":0,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"-","r":0,"w":0,"maid":0,"nb":0,"b":0,"inns":0,"m":13},"fieldingStats":{"c":3,"ro":1,"s":0,"inns":4,"m":13}},{"matchType":"IPLT20","battingStats":{"a":"25.15","sr":"117.62","no":0,"hs":"60","50s":3,"100s":0,"4s":41,"6s":4,"r":"327","b":278,"inns":13,"m":13},"bowlingStats":{"a":"-","sr":"-","d":0,"e":"-","wb":0,"bbiw":0,"bbir":0,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"-","r":0,"w":0,"maid":0,"nb":0,"b":0,"inns":0,"m":13},"fieldingStats":{"c":3,"ro":1,"s":0,"inns":4,"m":13}},{"matchType":"T20","battingStats":{"a":"25.15","sr":"117.62","no":0,"hs":"60","50s":3,"100s":0,"4s":41,"6s":4,"r":"327","b":278,"inns":13,"m":13},"bowlingStats":{"a":"-","sr":"-","d":0,"e":"-","wb":0,"bbiw":0,"bbir":0,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"-","r":0,"w":0,"maid":0,"nb":0,"b":0,"inns":0,"m":13},"fieldingStats":{"c":3,"ro":1,"s":0,"inns":4,"m":13}}]},{"player":{"dateOfBirth":"1988/05/26","nationality":"West Indian","id":203,"fullName":"Sunil Narine"},"stats":[{"matchType":"ALL","battingStats":{"a":"-","sr":"0.00","no":1,"hs":"0*","50s":0,"100s":0,"4s":0,"6s":0,"r":"0","b":1,"inns":1,"m":8},"bowlingStats":{"a":"33.42","sr":"27.42","d":74,"e":"7.31","wb":4,"bbiw":4,"bbir":19,"bbmw":4,"bbmr":19,"4w":1,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":17,"6s":11,"ov":"32.00","r":234,"w":7,"maid":0,"nb":0,"b":192,"inns":8,"m":8},"fieldingStats":{"c":1,"ro":0,"s":0,"inns":1,"m":8}},{"matchType":"AGG","battingStats":{"a":"-","sr":"0.00","no":1,"hs":"0*","50s":0,"100s":0,"4s":0,"6s":0,"r":"0","b":1,"inns":1,"m":8},"bowlingStats":{"a":"33.42","sr":"27.42","d":74,"e":"7.31","wb":4,"bbiw":4,"bbir":19,"bbmw":4,"bbmr":19,"4w":1,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":17,"6s":11,"ov":"32.00","r":234,"w":7,"maid":0,"nb":0,"b":192,"inns":8,"m":8},"fieldingStats":{"c":1,"ro":0,"s":0,"inns":1,"m":8}},{"matchType":"IPLT20","battingStats":{"a":"-","sr":"0.00","no":1,"hs":"0*","50s":0,"100s":0,"4s":0,"6s":0,"r":"0","b":1,"inns":1,"m":8},"bowlingStats":{"a":"33.42","sr":"27.42","d":74,"e":"7.31","wb":4,"bbiw":4,"bbir":19,"bbmw":4,"bbmr":19,"4w":1,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":17,"6s":11,"ov":"32.00","r":234,"w":7,"maid":0,"nb":0,"b":192,"inns":8,"m":8},"fieldingStats":{"c":1,"ro":0,"s":0,"inns":1,"m":8}},{"matchType":"T20","battingStats":{"a":"-","sr":"0.00","no":1,"hs":"0*","50s":0,"100s":0,"4s":0,"6s":0,"r":"0","b":1,"inns":1,"m":8},"bowlingStats":{"a":"33.42","sr":"27.42","d":74,"e":"7.31","wb":4,"bbiw":4,"bbir":19,"bbmw":4,"bbmr":19,"4w":1,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":17,"6s":11,"ov":"32.00","r":234,"w":7,"maid":0,"nb":0,"b":192,"inns":8,"m":8},"fieldingStats":{"c":1,"ro":0,"s":0,"inns":1,"m":8}}]},{"player":{"dateOfBirth":"1985/11/11","nationality":"Indian","id":127,"fullName":"Robin Uthappa"},"stats":[{"matchType":"ALL","battingStats":{"a":"30.33","sr":"131.40","no":1,"hs":"80*","50s":1,"100s":0,"4s":42,"6s":7,"r":"364","b":277,"inns":13,"m":13},"bowlingStats":{"a":"-","sr":"-","d":0,"e":"-","wb":0,"bbiw":0,"bbir":0,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"-","r":0,"w":0,"maid":0,"nb":0,"b":0,"inns":0,"m":13},"fieldingStats":{"c":7,"ro":0,"s":5,"inns":7,"m":13}},{"matchType":"AGG","battingStats":{"a":"30.33","sr":"131.40","no":1,"hs":"80*","50s":1,"100s":0,"4s":42,"6s":7,"r":"364","b":277,"inns":13,"m":13},"bowlingStats":{"a":"-","sr":"-","d":0,"e":"-","wb":0,"bbiw":0,"bbir":0,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"-","r":0,"w":0,"maid":0,"nb":0,"b":0,"inns":0,"m":13},"fieldingStats":{"c":7,"ro":0,"s":5,"inns":7,"m":13}},{"matchType":"IPLT20","battingStats":{"a":"30.33","sr":"131.40","no":1,"hs":"80*","50s":1,"100s":0,"4s":42,"6s":7,"r":"364","b":277,"inns":13,"m":13},"bowlingStats":{"a":"-","sr":"-","d":0,"e":"-","wb":0,"bbiw":0,"bbir":0,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"-","r":0,"w":0,"maid":0,"nb":0,"b":0,"inns":0,"m":13},"fieldingStats":{"c":7,"ro":0,"s":5,"inns":7,"m":13}},{"matchType":"T20","battingStats":{"a":"30.33","sr":"131.40","no":1,"hs":"80*","50s":1,"100s":0,"4s":42,"6s":7,"r":"364","b":277,"inns":13,"m":13},"bowlingStats":{"a":"-","sr":"-","d":0,"e":"-","wb":0,"bbiw":0,"bbir":0,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"-","r":0,"w":0,"maid":0,"nb":0,"b":0,"inns":0,"m":13},"fieldingStats":{"c":7,"ro":0,"s":5,"inns":7,"m":13}}]},{"player":{"dateOfBirth":"1988/12/24","nationality":"Indian","id":76,"fullName":"Piyush Chawla"},"stats":[{"matchType":"ALL","battingStats":{"a":"13.50","sr":"114.89","no":4,"hs":"22","50s":0,"100s":0,"4s":5,"6s":2,"r":"54","b":47,"inns":8,"m":13},"bowlingStats":{"a":"24.45","sr":"19.09","d":65,"e":"7.68","wb":2,"bbiw":4,"bbir":32,"bbmw":4,"bbmr":32,"4w":1,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":18,"6s":11,"ov":"35.00","r":269,"w":11,"maid":0,"nb":0,"b":210,"inns":13,"m":13},"fieldingStats":{"c":2,"ro":0,"s":0,"inns":2,"m":13}},{"matchType":"AGG","battingStats":{"a":"13.50","sr":"114.89","no":4,"hs":"22","50s":0,"100s":0,"4s":5,"6s":2,"r":"54","b":47,"inns":8,"m":13},"bowlingStats":{"a":"24.45","sr":"19.09","d":65,"e":"7.68","wb":2,"bbiw":4,"bbir":32,"bbmw":4,"bbmr":32,"4w":1,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":18,"6s":11,"ov":"35.00","r":269,"w":11,"maid":0,"nb":0,"b":210,"inns":13,"m":13},"fieldingStats":{"c":2,"ro":0,"s":0,"inns":2,"m":13}},{"matchType":"IPLT20","battingStats":{"a":"13.50","sr":"114.89","no":4,"hs":"22","50s":0,"100s":0,"4s":5,"6s":2,"r":"54","b":47,"inns":8,"m":13},"bowlingStats":{"a":"24.45","sr":"19.09","d":65,"e":"7.68","wb":2,"bbiw":4,"bbir":32,"bbmw":4,"bbmr":32,"4w":1,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":18,"6s":11,"ov":"35.00","r":269,"w":11,"maid":0,"nb":0,"b":210,"inns":13,"m":13},"fieldingStats":{"c":2,"ro":0,"s":0,"inns":2,"m":13}},{"matchType":"T20","battingStats":{"a":"13.50","sr":"114.89","no":4,"hs":"22","50s":0,"100s":0,"4s":5,"6s":2,"r":"54","b":47,"inns":8,"m":13},"bowlingStats":{"a":"24.45","sr":"19.09","d":65,"e":"7.68","wb":2,"bbiw":4,"bbir":32,"bbmw":4,"bbmr":32,"4w":1,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":18,"6s":11,"ov":"35.00","r":269,"w":11,"maid":0,"nb":0,"b":210,"inns":13,"m":13},"fieldingStats":{"c":2,"ro":0,"s":0,"inns":2,"m":13}}]},{"player":{"dateOfBirth":"1982/11/17","nationality":"Indian","id":96,"fullName":"Yusuf Pathan"},"stats":[{"matchType":"ALL","battingStats":{"a":"44.57","sr":"135.06","no":5,"hs":"52","50s":1,"100s":0,"4s":29,"6s":12,"r":"312","b":231,"inns":12,"m":13},"bowlingStats":{"a":"48.50","sr":"30.00","d":12,"e":"9.70","wb":0,"bbiw":0,"bbir":0,"bbmw":2,"bbmr":40,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":5,"6s":7,"ov":"10.00","r":97,"w":2,"maid":0,"nb":0,"b":60,"inns":5,"m":13},"fieldingStats":{"c":3,"ro":1,"s":0,"inns":4,"m":13}},{"matchType":"AGG","battingStats":{"a":"44.57","sr":"135.06","no":5,"hs":"52","50s":1,"100s":0,"4s":29,"6s":12,"r":"312","b":231,"inns":12,"m":13},"bowlingStats":{"a":"48.50","sr":"30.00","d":12,"e":"9.70","wb":0,"bbiw":0,"bbir":0,"bbmw":2,"bbmr":40,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":5,"6s":7,"ov":"10.00","r":97,"w":2,"maid":0,"nb":0,"b":60,"inns":5,"m":13},"fieldingStats":{"c":3,"ro":1,"s":0,"inns":4,"m":13}},{"matchType":"IPLT20","battingStats":{"a":"44.57","sr":"135.06","no":5,"hs":"52","50s":1,"100s":0,"4s":29,"6s":12,"r":"312","b":231,"inns":12,"m":13},"bowlingStats":{"a":"48.50","sr":"30.00","d":12,"e":"9.70","wb":0,"bbiw":0,"bbir":0,"bbmw":2,"bbmr":40,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":5,"6s":7,"ov":"10.00","r":97,"w":2,"maid":0,"nb":0,"b":60,"inns":5,"m":13},"fieldingStats":{"c":3,"ro":1,"s":0,"inns":4,"m":13}},{"matchType":"T20","battingStats":{"a":"44.57","sr":"135.06","no":5,"hs":"52","50s":1,"100s":0,"4s":29,"6s":12,"r":"312","b":231,"inns":12,"m":13},"bowlingStats":{"a":"48.50","sr":"30.00","d":12,"e":"9.70","wb":0,"bbiw":0,"bbir":0,"bbmw":2,"bbmr":40,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":5,"6s":7,"ov":"10.00","r":97,"w":2,"maid":0,"nb":0,"b":60,"inns":5,"m":13},"fieldingStats":{"c":3,"ro":1,"s":0,"inns":4,"m":13}}]},{"player":{"dateOfBirth":"1987/03/24","nationality":"Bangladeshi","id":201,"fullName":"Shakib Al Hasan"},"stats":[{"matchType":"ALL","battingStats":{"a":"12.00","sr":"133.33","no":0,"hs":"23","50s":0,"100s":0,"4s":5,"6s":0,"r":"36","b":27,"inns":3,"m":4},"bowlingStats":{"a":"30.75","sr":"21.00","d":34,"e":"8.78","wb":5,"bbiw":2,"bbir":22,"bbmw":2,"bbmr":22,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":9,"6s":7,"ov":"14.00","r":123,"w":4,"maid":0,"nb":0,"b":84,"inns":4,"m":4},"fieldingStats":{"c":0,"ro":1,"s":0,"inns":1,"m":4}},{"matchType":"AGG","battingStats":{"a":"12.00","sr":"133.33","no":0,"hs":"23","50s":0,"100s":0,"4s":5,"6s":0,"r":"36","b":27,"inns":3,"m":4},"bowlingStats":{"a":"30.75","sr":"21.00","d":34,"e":"8.78","wb":5,"bbiw":2,"bbir":22,"bbmw":2,"bbmr":22,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":9,"6s":7,"ov":"14.00","r":123,"w":4,"maid":0,"nb":0,"b":84,"inns":4,"m":4},"fieldingStats":{"c":0,"ro":1,"s":0,"inns":1,"m":4}},{"matchType":"IPLT20","battingStats":{"a":"12.00","sr":"133.33","no":0,"hs":"23","50s":0,"100s":0,"4s":5,"6s":0,"r":"36","b":27,"inns":3,"m":4},"bowlingStats":{"a":"30.75","sr":"21.00","d":34,"e":"8.78","wb":5,"bbiw":2,"bbir":22,"bbmw":2,"bbmr":22,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":9,"6s":7,"ov":"14.00","r":123,"w":4,"maid":0,"nb":0,"b":84,"inns":4,"m":4},"fieldingStats":{"c":0,"ro":1,"s":0,"inns":1,"m":4}},{"matchType":"T20","battingStats":{"a":"12.00","sr":"133.33","no":0,"hs":"23","50s":0,"100s":0,"4s":5,"6s":0,"r":"36","b":27,"inns":3,"m":4},"bowlingStats":{"a":"30.75","sr":"21.00","d":34,"e":"8.78","wb":5,"bbiw":2,"bbir":22,"bbmw":2,"bbmr":22,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":9,"6s":7,"ov":"14.00","r":123,"w":4,"maid":0,"nb":0,"b":84,"inns":4,"m":4},"fieldingStats":{"c":0,"ro":1,"s":0,"inns":1,"m":4}}]},{"player":{"dateOfBirth":"1984/10/06","nationality":"South African","id":169,"fullName":"Morne Morkel"},"stats":[{"matchType":"ALL","battingStats":{"a":"-","sr":"133.33","no":1,"hs":"4*","50s":0,"100s":0,"4s":0,"6s":0,"r":"4","b":3,"inns":1,"m":7},"bowlingStats":{"a":"20.60","sr":"16.80","d":76,"e":"7.35","wb":5,"bbiw":2,"bbir":18,"bbmw":2,"bbmr":18,"4w":0,"5w":0,"10w":0,"wmaid":1,"ht":0,"4s":20,"6s":8,"ov":"28.00","r":206,"w":10,"maid":1,"nb":1,"b":168,"inns":7,"m":7},"fieldingStats":{"c":1,"ro":1,"s":0,"inns":2,"m":7}},{"matchType":"AGG","battingStats":{"a":"-","sr":"133.33","no":1,"hs":"4*","50s":0,"100s":0,"4s":0,"6s":0,"r":"4","b":3,"inns":1,"m":7},"bowlingStats":{"a":"20.60","sr":"16.80","d":76,"e":"7.35","wb":5,"bbiw":2,"bbir":18,"bbmw":2,"bbmr":18,"4w":0,"5w":0,"10w":0,"wmaid":1,"ht":0,"4s":20,"6s":8,"ov":"28.00","r":206,"w":10,"maid":1,"nb":1,"b":168,"inns":7,"m":7},"fieldingStats":{"c":1,"ro":1,"s":0,"inns":2,"m":7}},{"matchType":"IPLT20","battingStats":{"a":"-","sr":"133.33","no":1,"hs":"4*","50s":0,"100s":0,"4s":0,"6s":0,"r":"4","b":3,"inns":1,"m":7},"bowlingStats":{"a":"20.60","sr":"16.80","d":76,"e":"7.35","wb":5,"bbiw":2,"bbir":18,"bbmw":2,"bbmr":18,"4w":0,"5w":0,"10w":0,"wmaid":1,"ht":0,"4s":20,"6s":8,"ov":"28.00","r":206,"w":10,"maid":1,"nb":1,"b":168,"inns":7,"m":7},"fieldingStats":{"c":1,"ro":1,"s":0,"inns":2,"m":7}},{"matchType":"T20","battingStats":{"a":"-","sr":"133.33","no":1,"hs":"4*","50s":0,"100s":0,"4s":0,"6s":0,"r":"4","b":3,"inns":1,"m":7},"bowlingStats":{"a":"20.60","sr":"16.80","d":76,"e":"7.35","wb":5,"bbiw":2,"bbir":18,"bbmw":2,"bbmr":18,"4w":0,"5w":0,"10w":0,"wmaid":1,"ht":0,"4s":20,"6s":8,"ov":"28.00","r":206,"w":10,"maid":1,"nb":1,"b":168,"inns":7,"m":7},"fieldingStats":{"c":1,"ro":1,"s":0,"inns":2,"m":7}}]},{"player":{"dateOfBirth":"1987/10/25","nationality":"Indian","id":59,"fullName":"Umesh Yadav"},"stats":[{"matchType":"ALL","battingStats":{"a":"29.00","sr":"207.14","no":3,"hs":"24*","50s":0,"100s":0,"4s":5,"6s":1,"r":"29","b":14,"inns":4,"m":12},"bowlingStats":{"a":"38.20","sr":"25.20","d":92,"e":"9.09","wb":12,"bbiw":3,"bbir":33,"bbmw":3,"bbmr":33,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":50,"6s":10,"ov":"42.00","r":382,"w":10,"maid":0,"nb":2,"b":252,"inns":12,"m":12},"fieldingStats":{"c":5,"ro":0,"s":0,"inns":4,"m":12}},{"matchType":"AGG","battingStats":{"a":"29.00","sr":"207.14","no":3,"hs":"24*","50s":0,"100s":0,"4s":5,"6s":1,"r":"29","b":14,"inns":4,"m":12},"bowlingStats":{"a":"38.20","sr":"25.20","d":92,"e":"9.09","wb":12,"bbiw":3,"bbir":33,"bbmw":3,"bbmr":33,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":50,"6s":10,"ov":"42.00","r":382,"w":10,"maid":0,"nb":2,"b":252,"inns":12,"m":12},"fieldingStats":{"c":5,"ro":0,"s":0,"inns":4,"m":12}},{"matchType":"IPLT20","battingStats":{"a":"29.00","sr":"207.14","no":3,"hs":"24*","50s":0,"100s":0,"4s":5,"6s":1,"r":"29","b":14,"inns":4,"m":12},"bowlingStats":{"a":"38.20","sr":"25.20","d":92,"e":"9.09","wb":12,"bbiw":3,"bbir":33,"bbmw":3,"bbmr":33,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":50,"6s":10,"ov":"42.00","r":382,"w":10,"maid":0,"nb":2,"b":252,"inns":12,"m":12},"fieldingStats":{"c":5,"ro":0,"s":0,"inns":4,"m":12}},{"matchType":"T20","battingStats":{"a":"29.00","sr":"207.14","no":3,"hs":"24*","50s":0,"100s":0,"4s":5,"6s":1,"r":"29","b":14,"inns":4,"m":12},"bowlingStats":{"a":"38.20","sr":"25.20","d":92,"e":"9.09","wb":12,"bbiw":3,"bbir":33,"bbmw":3,"bbmr":33,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":50,"6s":10,"ov":"42.00","r":382,"w":10,"maid":0,"nb":2,"b":252,"inns":12,"m":12},"fieldingStats":{"c":5,"ro":0,"s":0,"inns":4,"m":12}}]},{"player":{"dateOfBirth":"1989/09/10","nationality":"Indian","id":123,"fullName":"Manish Pandey"},"stats":[{"matchType":"ALL","battingStats":{"a":"20.45","sr":"122.28","no":1,"hs":"40","50s":0,"100s":0,"4s":22,"6s":7,"r":"225","b":184,"inns":12,"m":13},"bowlingStats":{"a":"-","sr":"-","d":0,"e":"-","wb":0,"bbiw":0,"bbir":0,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"-","r":0,"w":0,"maid":0,"nb":0,"b":0,"inns":0,"m":13},"fieldingStats":{"c":5,"ro":3,"s":0,"inns":6,"m":13}},{"matchType":"AGG","battingStats":{"a":"20.45","sr":"122.28","no":1,"hs":"40","50s":0,"100s":0,"4s":22,"6s":7,"r":"225","b":184,"inns":12,"m":13},"bowlingStats":{"a":"-","sr":"-","d":0,"e":"-","wb":0,"bbiw":0,"bbir":0,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"-","r":0,"w":0,"maid":0,"nb":0,"b":0,"inns":0,"m":13},"fieldingStats":{"c":5,"ro":3,"s":0,"inns":6,"m":13}},{"matchType":"IPLT20","battingStats":{"a":"20.45","sr":"122.28","no":1,"hs":"40","50s":0,"100s":0,"4s":22,"6s":7,"r":"225","b":184,"inns":12,"m":13},"bowlingStats":{"a":"-","sr":"-","d":0,"e":"-","wb":0,"bbiw":0,"bbir":0,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"-","r":0,"w":0,"maid":0,"nb":0,"b":0,"inns":0,"m":13},"fieldingStats":{"c":5,"ro":3,"s":0,"inns":6,"m":13}},{"matchType":"T20","battingStats":{"a":"20.45","sr":"122.28","no":1,"hs":"40","50s":0,"100s":0,"4s":22,"6s":7,"r":"225","b":184,"inns":12,"m":13},"bowlingStats":{"a":"-","sr":"-","d":0,"e":"-","wb":0,"bbiw":0,"bbir":0,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"-","r":0,"w":0,"maid":0,"nb":0,"b":0,"inns":0,"m":13},"fieldingStats":{"c":5,"ro":3,"s":0,"inns":6,"m":13}}]},{"player":{"dateOfBirth":"1993/05/08","nationality":"Australian","rightHandedBat":true,"id":488,"fullName":"Pat Cummins"},"stats":[{"matchType":"ALL","battingStats":{"a":"0.00","sr":"0.00","no":0,"hs":"0*","50s":0,"100s":0,"4s":0,"6s":0,"r":"0","b":2,"inns":1,"m":3},"bowlingStats":{"a":"97.00","sr":"60.00","d":22,"e":"9.70","wb":6,"bbiw":1,"bbir":54,"bbmw":1,"bbmr":54,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":9,"6s":5,"ov":"10.00","r":97,"w":1,"maid":0,"nb":0,"b":60,"inns":3,"m":3},"fieldingStats":{"c":1,"ro":0,"s":0,"inns":1,"m":3}},{"matchType":"AGG","battingStats":{"a":"0.00","sr":"0.00","no":0,"hs":"0*","50s":0,"100s":0,"4s":0,"6s":0,"r":"0","b":2,"inns":1,"m":3},"bowlingStats":{"a":"97.00","sr":"60.00","d":22,"e":"9.70","wb":6,"bbiw":1,"bbir":54,"bbmw":1,"bbmr":54,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":9,"6s":5,"ov":"10.00","r":97,"w":1,"maid":0,"nb":0,"b":60,"inns":3,"m":3},"fieldingStats":{"c":1,"ro":0,"s":0,"inns":1,"m":3}},{"matchType":"IPLT20","battingStats":{"a":"0.00","sr":"0.00","no":0,"hs":"0*","50s":0,"100s":0,"4s":0,"6s":0,"r":"0","b":2,"inns":1,"m":3},"bowlingStats":{"a":"97.00","sr":"60.00","d":22,"e":"9.70","wb":6,"bbiw":1,"bbir":54,"bbmw":1,"bbmr":54,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":9,"6s":5,"ov":"10.00","r":97,"w":1,"maid":0,"nb":0,"b":60,"inns":3,"m":3},"fieldingStats":{"c":1,"ro":0,"s":0,"inns":1,"m":3}},{"matchType":"T20","battingStats":{"a":"0.00","sr":"0.00","no":0,"hs":"0*","50s":0,"100s":0,"4s":0,"6s":0,"r":"0","b":2,"inns":1,"m":3},"bowlingStats":{"a":"97.00","sr":"60.00","d":22,"e":"9.70","wb":6,"bbiw":1,"bbir":54,"bbmw":1,"bbmr":54,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":9,"6s":5,"ov":"10.00","r":97,"w":1,"maid":0,"nb":0,"b":60,"inns":3,"m":3},"fieldingStats":{"c":1,"ro":0,"s":0,"inns":1,"m":3}}]},{"player":{"dateOfBirth":"1980/06/30","nationality":"Dutch","id":200,"fullName":"Ryan ten Doeschate"},"stats":[{"matchType":"ALL","battingStats":{"a":"20.33","sr":"135.55","no":2,"hs":"38*","50s":0,"100s":0,"4s":4,"6s":3,"r":"61","b":45,"inns":5,"m":6},"bowlingStats":{"a":"-","sr":"-","d":3,"e":"4.00","wb":1,"bbiw":0,"bbir":4,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"1.00","r":4,"w":0,"maid":0,"nb":0,"b":6,"inns":1,"m":6},"fieldingStats":{"c":1,"ro":2,"s":0,"inns":3,"m":6}},{"matchType":"AGG","battingStats":{"a":"20.33","sr":"135.55","no":2,"hs":"38*","50s":0,"100s":0,"4s":4,"6s":3,"r":"61","b":45,"inns":5,"m":6},"bowlingStats":{"a":"-","sr":"-","d":3,"e":"4.00","wb":1,"bbiw":0,"bbir":4,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"1.00","r":4,"w":0,"maid":0,"nb":0,"b":6,"inns":1,"m":6},"fieldingStats":{"c":1,"ro":2,"s":0,"inns":3,"m":6}},{"matchType":"IPLT20","battingStats":{"a":"20.33","sr":"135.55","no":2,"hs":"38*","50s":0,"100s":0,"4s":4,"6s":3,"r":"61","b":45,"inns":5,"m":6},"bowlingStats":{"a":"-","sr":"-","d":3,"e":"4.00","wb":1,"bbiw":0,"bbir":4,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"1.00","r":4,"w":0,"maid":0,"nb":0,"b":6,"inns":1,"m":6},"fieldingStats":{"c":1,"ro":2,"s":0,"inns":3,"m":6}},{"matchType":"T20","battingStats":{"a":"20.33","sr":"135.55","no":2,"hs":"38*","50s":0,"100s":0,"4s":4,"6s":3,"r":"61","b":45,"inns":5,"m":6},"bowlingStats":{"a":"-","sr":"-","d":3,"e":"4.00","wb":1,"bbiw":0,"bbir":4,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"1.00","r":4,"w":0,"maid":0,"nb":0,"b":6,"inns":1,"m":6},"fieldingStats":{"c":1,"ro":2,"s":0,"inns":3,"m":6}}]},{"player":{"dateOfBirth":"1990/09/14","nationality":"Indian","rightHandedBat":true,"id":108,"fullName":"Suryakumar Yadav"},"stats":[{"matchType":"ALL","battingStats":{"a":"17.44","sr":"138.93","no":4,"hs":"46*","50s":0,"100s":0,"4s":12,"6s":8,"r":"157","b":113,"inns":13,"m":13},"bowlingStats":{"a":"-","sr":"-","d":0,"e":"-","wb":0,"bbiw":0,"bbir":0,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"-","r":0,"w":0,"maid":0,"nb":0,"b":0,"inns":0,"m":13},"fieldingStats":{"c":7,"ro":0,"s":0,"inns":6,"m":13}},{"matchType":"AGG","battingStats":{"a":"17.44","sr":"138.93","no":4,"hs":"46*","50s":0,"100s":0,"4s":12,"6s":8,"r":"157","b":113,"inns":13,"m":13},"bowlingStats":{"a":"-","sr":"-","d":0,"e":"-","wb":0,"bbiw":0,"bbir":0,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"-","r":0,"w":0,"maid":0,"nb":0,"b":0,"inns":0,"m":13},"fieldingStats":{"c":7,"ro":0,"s":0,"inns":6,"m":13}},{"matchType":"IPLT20","battingStats":{"a":"17.44","sr":"138.93","no":4,"hs":"46*","50s":0,"100s":0,"4s":12,"6s":8,"r":"157","b":113,"inns":13,"m":13},"bowlingStats":{"a":"-","sr":"-","d":0,"e":"-","wb":0,"bbiw":0,"bbir":0,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"-","r":0,"w":0,"maid":0,"nb":0,"b":0,"inns":0,"m":13},"fieldingStats":{"c":7,"ro":0,"s":0,"inns":6,"m":13}},{"matchType":"T20","battingStats":{"a":"17.44","sr":"138.93","no":4,"hs":"46*","50s":0,"100s":0,"4s":12,"6s":8,"r":"157","b":113,"inns":13,"m":13},"bowlingStats":{"a":"-","sr":"-","d":0,"e":"-","wb":0,"bbiw":0,"bbir":0,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"-","r":0,"w":0,"maid":0,"nb":0,"b":0,"inns":0,"m":13},"fieldingStats":{"c":7,"ro":0,"s":0,"inns":6,"m":13}}]},{"player":{"dateOfBirth":"1988/04/29","nationality":"West Indian","id":177,"fullName":"Andre Russell"},"stats":[{"matchType":"ALL","battingStats":{"a":"36.22","sr":"192.89","no":2,"hs":"66","50s":3,"100s":0,"4s":35,"6s":19,"r":"326","b":169,"inns":11,"m":13},"bowlingStats":{"a":"23.14","sr":"17.42","d":94,"e":"7.96","wb":9,"bbiw":3,"bbir":32,"bbmw":3,"bbmr":32,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":29,"6s":13,"ov":"40.66","r":324,"w":14,"maid":0,"nb":1,"b":244,"inns":13,"m":13},"fieldingStats":{"c":6,"ro":0,"s":0,"inns":5,"m":13}},{"matchType":"AGG","battingStats":{"a":"36.22","sr":"192.89","no":2,"hs":"66","50s":3,"100s":0,"4s":35,"6s":19,"r":"326","b":169,"inns":11,"m":13},"bowlingStats":{"a":"23.14","sr":"17.42","d":94,"e":"7.96","wb":9,"bbiw":3,"bbir":32,"bbmw":3,"bbmr":32,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":29,"6s":13,"ov":"40.66","r":324,"w":14,"maid":0,"nb":1,"b":244,"inns":13,"m":13},"fieldingStats":{"c":6,"ro":0,"s":0,"inns":5,"m":13}},{"matchType":"IPLT20","battingStats":{"a":"36.22","sr":"192.89","no":2,"hs":"66","50s":3,"100s":0,"4s":35,"6s":19,"r":"326","b":169,"inns":11,"m":13},"bowlingStats":{"a":"23.14","sr":"17.42","d":94,"e":"7.96","wb":9,"bbiw":3,"bbir":32,"bbmw":3,"bbmr":32,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":29,"6s":13,"ov":"40.66","r":324,"w":14,"maid":0,"nb":1,"b":244,"inns":13,"m":13},"fieldingStats":{"c":6,"ro":0,"s":0,"inns":5,"m":13}},{"matchType":"T20","battingStats":{"a":"36.22","sr":"192.89","no":2,"hs":"66","50s":3,"100s":0,"4s":35,"6s":19,"r":"326","b":169,"inns":11,"m":13},"bowlingStats":{"a":"23.14","sr":"17.42","d":94,"e":"7.96","wb":9,"bbiw":3,"bbir":32,"bbmw":3,"bbmr":32,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":29,"6s":13,"ov":"40.66","r":324,"w":14,"maid":0,"nb":1,"b":244,"inns":13,"m":13},"fieldingStats":{"c":6,"ro":0,"s":0,"inns":5,"m":13}}]},{"player":{"dateOfBirth":"1992/05/03","nationality":"Indian","id":250,"fullName":"Veer Pratap Singh"}},{"player":{"dateOfBirth":"1994/12/14","nationality":"Indian","rightHandedBat":true,"id":261,"fullName":"Kuldeep Yadav"}},{"player":{"dateOfBirth":"1971/02/06","nationality":"Australian","id":231,"fullName":"Brad Hogg"},"stats":[{"matchType":"ALL","battingStats":{"a":"7.00","sr":"116.66","no":1,"hs":"5","50s":0,"100s":0,"4s":0,"6s":0,"r":"7","b":6,"inns":2,"m":6},"bowlingStats":{"a":"16.00","sr":"14.00","d":50,"e":"6.85","wb":1,"bbiw":4,"bbir":29,"bbmw":4,"bbmr":29,"4w":1,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":8,"6s":9,"ov":"21.00","r":144,"w":9,"maid":0,"nb":0,"b":126,"inns":6,"m":6},"fieldingStats":{"c":0,"ro":0,"s":0,"inns":0,"m":6}},{"matchType":"AGG","battingStats":{"a":"7.00","sr":"116.66","no":1,"hs":"5","50s":0,"100s":0,"4s":0,"6s":0,"r":"7","b":6,"inns":2,"m":6},"bowlingStats":{"a":"16.00","sr":"14.00","d":50,"e":"6.85","wb":1,"bbiw":4,"bbir":29,"bbmw":4,"bbmr":29,"4w":1,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":8,"6s":9,"ov":"21.00","r":144,"w":9,"maid":0,"nb":0,"b":126,"inns":6,"m":6},"fieldingStats":{"c":0,"ro":0,"s":0,"inns":0,"m":6}},{"matchType":"IPLT20","battingStats":{"a":"7.00","sr":"116.66","no":1,"hs":"5","50s":0,"100s":0,"4s":0,"6s":0,"r":"7","b":6,"inns":2,"m":6},"bowlingStats":{"a":"16.00","sr":"14.00","d":50,"e":"6.85","wb":1,"bbiw":4,"bbir":29,"bbmw":4,"bbmr":29,"4w":1,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":8,"6s":9,"ov":"21.00","r":144,"w":9,"maid":0,"nb":0,"b":126,"inns":6,"m":6},"fieldingStats":{"c":0,"ro":0,"s":0,"inns":0,"m":6}},{"matchType":"T20","battingStats":{"a":"7.00","sr":"116.66","no":1,"hs":"5","50s":0,"100s":0,"4s":0,"6s":0,"r":"7","b":6,"inns":2,"m":6},"bowlingStats":{"a":"16.00","sr":"14.00","d":50,"e":"6.85","wb":1,"bbiw":4,"bbir":29,"bbmw":4,"bbmr":29,"4w":1,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":8,"6s":9,"ov":"21.00","r":144,"w":9,"maid":0,"nb":0,"b":126,"inns":6,"m":6},"fieldingStats":{"c":0,"ro":0,"s":0,"inns":0,"m":6}}]},{"player":{"dateOfBirth":"1982/04/16","nationality":"Indian","id":149,"fullName":"Sumit Narwal"}},{"player":{"dateOfBirth":"1986/09/27","nationality":"Indian","rightHandedBat":true,"id":1116,"fullName":"Sheldon Jackson"}},{"player":{"dateOfBirth":"1996/04/15","nationality":"Indian","rightHandedBat":true,"id":2742,"fullName":"Aditya Garhwal"}},{"player":{"dateOfBirth":"1994/04/13","nationality":"Indian","rightHandedBat":true,"id":2743,"fullName":"KC Cariappa"},"stats":[{"matchType":"ALL","battingStats":{"a":"-","sr":"-","no":0,"hs":"0*","50s":0,"100s":0,"4s":0,"6s":0,"r":"0","inns":0,"m":1},"bowlingStats":{"a":"28.00","sr":"12.00","d":3,"e":"14.00","wb":0,"bbiw":1,"bbir":28,"bbmw":1,"bbmr":28,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":3,"6s":2,"ov":"2.00","r":28,"w":1,"maid":0,"nb":0,"b":12,"inns":1,"m":1},"fieldingStats":{"c":0,"ro":0,"s":0,"inns":0,"m":1}},{"matchType":"AGG","battingStats":{"a":"-","sr":"-","no":0,"hs":"0*","50s":0,"100s":0,"4s":0,"6s":0,"r":"0","inns":0,"m":1},"bowlingStats":{"a":"28.00","sr":"12.00","d":3,"e":"14.00","wb":0,"bbiw":1,"bbir":28,"bbmw":1,"bbmr":28,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":3,"6s":2,"ov":"2.00","r":28,"w":1,"maid":0,"nb":0,"b":12,"inns":1,"m":1},"fieldingStats":{"c":0,"ro":0,"s":0,"inns":0,"m":1}},{"matchType":"IPLT20","battingStats":{"a":"-","sr":"-","no":0,"hs":"0*","50s":0,"100s":0,"4s":0,"6s":0,"r":"0","inns":0,"m":1},"bowlingStats":{"a":"28.00","sr":"12.00","d":3,"e":"14.00","wb":0,"bbiw":1,"bbir":28,"bbmw":1,"bbmr":28,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":3,"6s":2,"ov":"2.00","r":28,"w":1,"maid":0,"nb":0,"b":12,"inns":1,"m":1},"fieldingStats":{"c":0,"ro":0,"s":0,"inns":0,"m":1}},{"matchType":"T20","battingStats":{"a":"-","sr":"-","no":0,"hs":"0*","50s":0,"100s":0,"4s":0,"6s":0,"r":"0","inns":0,"m":1},"bowlingStats":{"a":"28.00","sr":"12.00","d":3,"e":"14.00","wb":0,"bbiw":1,"bbir":28,"bbmw":1,"bbmr":28,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":3,"6s":2,"ov":"2.00","r":28,"w":1,"maid":0,"nb":0,"b":12,"inns":1,"m":1},"fieldingStats":{"c":0,"ro":0,"s":0,"inns":0,"m":1}}]},{"player":{"dateOfBirth":"1991/11/09","nationality":"Indian","id":2744,"fullName":"Vaibhav Rawal"}},{"player":{"dateOfBirth":"1975/02/28","nationality":"English","id":194,"fullName":"Azhar Mahmood"},"stats":[{"matchType":"ALL","battingStats":{"a":"6.00","sr":"85.71","no":0,"hs":"6","50s":0,"100s":0,"4s":1,"6s":0,"r":"6","b":7,"inns":1,"m":1},"bowlingStats":{"a":"-","sr":"-","d":5,"e":"13.66","wb":0,"bbiw":0,"bbir":41,"bbmw":0,"bbmr":41,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":5,"6s":2,"ov":"3.00","r":41,"w":0,"maid":0,"nb":2,"b":18,"inns":1,"m":1},"fieldingStats":{"c":0,"ro":0,"s":0,"inns":0,"m":1}},{"matchType":"AGG","battingStats":{"a":"6.00","sr":"85.71","no":0,"hs":"6","50s":0,"100s":0,"4s":1,"6s":0,"r":"6","b":7,"inns":1,"m":1},"bowlingStats":{"a":"-","sr":"-","d":5,"e":"13.66","wb":0,"bbiw":0,"bbir":41,"bbmw":0,"bbmr":41,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":5,"6s":2,"ov":"3.00","r":41,"w":0,"maid":0,"nb":2,"b":18,"inns":1,"m":1},"fieldingStats":{"c":0,"ro":0,"s":0,"inns":0,"m":1}},{"matchType":"IPLT20","battingStats":{"a":"6.00","sr":"85.71","no":0,"hs":"6","50s":0,"100s":0,"4s":1,"6s":0,"r":"6","b":7,"inns":1,"m":1},"bowlingStats":{"a":"-","sr":"-","d":5,"e":"13.66","wb":0,"bbiw":0,"bbir":41,"bbmw":0,"bbmr":41,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":5,"6s":2,"ov":"3.00","r":41,"w":0,"maid":0,"nb":2,"b":18,"inns":1,"m":1},"fieldingStats":{"c":0,"ro":0,"s":0,"inns":0,"m":1}},{"matchType":"T20","battingStats":{"a":"6.00","sr":"85.71","no":0,"hs":"6","50s":0,"100s":0,"4s":1,"6s":0,"r":"6","b":7,"inns":1,"m":1},"bowlingStats":{"a":"-","sr":"-","d":5,"e":"13.66","wb":0,"bbiw":0,"bbir":41,"bbmw":0,"bbmr":41,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":5,"6s":2,"ov":"3.00","r":41,"w":0,"maid":0,"nb":2,"b":18,"inns":1,"m":1},"fieldingStats":{"c":0,"ro":0,"s":0,"inns":0,"m":1}}]},{"player":{"dateOfBirth":"1982/05/02","nationality":"South African","id":224,"fullName":"Johan Botha"},"stats":[{"matchType":"ALL","battingStats":{"a":"10.33","sr":"206.66","no":0,"hs":"17","50s":0,"100s":0,"4s":5,"6s":1,"r":"31","b":15,"inns":3,"m":4},"bowlingStats":{"a":"81.00","sr":"60.00","d":19,"e":"8.10","wb":2,"bbiw":1,"bbir":32,"bbmw":1,"bbmr":32,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":4,"6s":5,"ov":"10.00","r":81,"w":1,"maid":0,"nb":0,"b":60,"inns":4,"m":4},"fieldingStats":{"c":4,"ro":0,"s":0,"inns":3,"m":4}},{"matchType":"AGG","battingStats":{"a":"10.33","sr":"206.66","no":0,"hs":"17","50s":0,"100s":0,"4s":5,"6s":1,"r":"31","b":15,"inns":3,"m":4},"bowlingStats":{"a":"81.00","sr":"60.00","d":19,"e":"8.10","wb":2,"bbiw":1,"bbir":32,"bbmw":1,"bbmr":32,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":4,"6s":5,"ov":"10.00","r":81,"w":1,"maid":0,"nb":0,"b":60,"inns":4,"m":4},"fieldingStats":{"c":4,"ro":0,"s":0,"inns":3,"m":4}},{"matchType":"IPLT20","battingStats":{"a":"10.33","sr":"206.66","no":0,"hs":"17","50s":0,"100s":0,"4s":5,"6s":1,"r":"31","b":15,"inns":3,"m":4},"bowlingStats":{"a":"81.00","sr":"60.00","d":19,"e":"8.10","wb":2,"bbiw":1,"bbir":32,"bbmw":1,"bbmr":32,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":4,"6s":5,"ov":"10.00","r":81,"w":1,"maid":0,"nb":0,"b":60,"inns":4,"m":4},"fieldingStats":{"c":4,"ro":0,"s":0,"inns":3,"m":4}},{"matchType":"T20","battingStats":{"a":"10.33","sr":"206.66","no":0,"hs":"17","50s":0,"100s":0,"4s":5,"6s":1,"r":"31","b":15,"inns":3,"m":4},"bowlingStats":{"a":"81.00","sr":"60.00","d":19,"e":"8.10","wb":2,"bbiw":1,"bbir":32,"bbmw":1,"bbmr":32,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":4,"6s":5,"ov":"10.00","r":81,"w":1,"maid":0,"nb":0,"b":60,"inns":4,"m":4},"fieldingStats":{"c":4,"ro":0,"s":0,"inns":3,"m":4}}]}]
     */

    private TeamBean team;
    private TournamentIdBean tournamentId;
    private List<PlayersStatsBean> playersStats;

    public static TeamStatsData objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), TeamStatsData.class);
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

    public TournamentIdBean getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(TournamentIdBean tournamentId) {
        this.tournamentId = tournamentId;
    }

    public List<PlayersStatsBean> getPlayersStats() {
        return playersStats;
    }

    public void setPlayersStats(List<PlayersStatsBean> playersStats) {
        this.playersStats = playersStats;
    }

    public static class TeamBean {
        /**
         * shortName : Knight Riders
         * secondaryColor : FFFFFF
         * primaryColor : 6F2C91
         * abbreviation : KKR
         * type : m
         * fullName : Kolkata Knight Riders
         * id : 5
         */

        private String shortName;
        private String secondaryColor;
        private String primaryColor;
        private String abbreviation;
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

        public String getPrimaryColor() {
            return primaryColor;
        }

        public void setPrimaryColor(String primaryColor) {
            this.primaryColor = primaryColor;
        }

        public String getAbbreviation() {
            return abbreviation;
        }

        public void setAbbreviation(String abbreviation) {
            this.abbreviation = abbreviation;
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

    public static class PlayersStatsBean {
        /**
         * player : {"dateOfBirth":"1981/10/14","nationality":"Indian","id":84,"fullName":"Gautam Gambhir"}
         * stats : [{"matchType":"ALL","battingStats":{"a":"25.15","sr":"117.62","no":0,"hs":"60","50s":3,"100s":0,"4s":41,"6s":4,"r":"327","b":278,"inns":13,"m":13},"bowlingStats":{"a":"-","sr":"-","d":0,"e":"-","wb":0,"bbiw":0,"bbir":0,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"-","r":0,"w":0,"maid":0,"nb":0,"b":0,"inns":0,"m":13},"fieldingStats":{"c":3,"ro":1,"s":0,"inns":4,"m":13}},{"matchType":"AGG","battingStats":{"a":"25.15","sr":"117.62","no":0,"hs":"60","50s":3,"100s":0,"4s":41,"6s":4,"r":"327","b":278,"inns":13,"m":13},"bowlingStats":{"a":"-","sr":"-","d":0,"e":"-","wb":0,"bbiw":0,"bbir":0,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"-","r":0,"w":0,"maid":0,"nb":0,"b":0,"inns":0,"m":13},"fieldingStats":{"c":3,"ro":1,"s":0,"inns":4,"m":13}},{"matchType":"IPLT20","battingStats":{"a":"25.15","sr":"117.62","no":0,"hs":"60","50s":3,"100s":0,"4s":41,"6s":4,"r":"327","b":278,"inns":13,"m":13},"bowlingStats":{"a":"-","sr":"-","d":0,"e":"-","wb":0,"bbiw":0,"bbir":0,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"-","r":0,"w":0,"maid":0,"nb":0,"b":0,"inns":0,"m":13},"fieldingStats":{"c":3,"ro":1,"s":0,"inns":4,"m":13}},{"matchType":"T20","battingStats":{"a":"25.15","sr":"117.62","no":0,"hs":"60","50s":3,"100s":0,"4s":41,"6s":4,"r":"327","b":278,"inns":13,"m":13},"bowlingStats":{"a":"-","sr":"-","d":0,"e":"-","wb":0,"bbiw":0,"bbir":0,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"-","r":0,"w":0,"maid":0,"nb":0,"b":0,"inns":0,"m":13},"fieldingStats":{"c":3,"ro":1,"s":0,"inns":4,"m":13}}]
         */

        private PlayerBean player;
        private List<StatsBean> stats;

        public static PlayersStatsBean objectFromData(String str, String key) {
            // expecting 1_tournamentStats.json

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), PlayersStatsBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public PlayerBean getPlayer() {
            return player;
        }

        public void setPlayer(PlayerBean player) {
            this.player = player;
        }

        public List<StatsBean> getStats() {
            return stats;
        }

        public void setStats(List<StatsBean> stats) {
            this.stats = stats;
        }

        public static class PlayerBean {
            /**
             * dateOfBirth : 1981/10/14
             * nationality : Indian
             * id : 84
             * fullName : Gautam Gambhir
             */

            private String dateOfBirth;
            private String nationality;
            private int id;
            private String fullName;

            public static PlayerBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), PlayerBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public String getDateOfBirth() {
                return dateOfBirth;
            }

            public void setDateOfBirth(String dateOfBirth) {
                this.dateOfBirth = dateOfBirth;
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
        }

        public static class StatsBean {
            /**
             * matchType : ALL
             * battingStats : {"a":"25.15","sr":"117.62","no":0,"hs":"60","50s":3,"100s":0,"4s":41,"6s":4,"r":"327","b":278,"inns":13,"m":13}
             * bowlingStats : {"a":"-","sr":"-","d":0,"e":"-","wb":0,"bbiw":0,"bbir":0,"bbmw":0,"bbmr":0,"4w":0,"5w":0,"10w":0,"wmaid":0,"ht":0,"4s":0,"6s":0,"ov":"-","r":0,"w":0,"maid":0,"nb":0,"b":0,"inns":0,"m":13}
             * fieldingStats : {"c":3,"ro":1,"s":0,"inns":4,"m":13}
             */

            private String matchType;
            private BattingStatsBean battingStats;
            private BowlingStatsBean bowlingStats;
            private FieldingStatsBean fieldingStats;

            public static StatsBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), StatsBean.class);
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

            public BattingStatsBean getBattingStats() {
                return battingStats;
            }

            public void setBattingStats(BattingStatsBean battingStats) {
                this.battingStats = battingStats;
            }

            public BowlingStatsBean getBowlingStats() {
                return bowlingStats;
            }

            public void setBowlingStats(BowlingStatsBean bowlingStats) {
                this.bowlingStats = bowlingStats;
            }

            public FieldingStatsBean getFieldingStats() {
                return fieldingStats;
            }

            public void setFieldingStats(FieldingStatsBean fieldingStats) {
                this.fieldingStats = fieldingStats;
            }

            public static class BattingStatsBean {
                /**
                 * a : 25.15
                 * sr : 117.62
                 * no : 0
                 * hs : 60
                 * 50s : 3
                 * 100s : 0
                 * 4s : 41
                 * 6s : 4
                 * r : 327
                 * b : 278
                 * inns : 13
                 * m : 13
                 */

                private String a;
                private String sr;
                private int no;
                private String hs;
                @SerializedName("50s")
                private int _$50s;
                @SerializedName("100s")
                private int _$100s;
                @SerializedName("4s")
                private int _$4s;
                @SerializedName("6s")
                private int _$6s;
                private String r;
                private int b;
                private int inns;
                private int m;

                public static BattingStatsBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), BattingStatsBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public String getA() {
                    return a;
                }

                public void setA(String a) {
                    this.a = a;
                }

                public String getSr() {
                    return sr;
                }

                public void setSr(String sr) {
                    this.sr = sr;
                }

                public int getNo() {
                    return no;
                }

                public void setNo(int no) {
                    this.no = no;
                }

                public String getHs() {
                    return hs;
                }

                public void setHs(String hs) {
                    this.hs = hs;
                }

                public int get_$50s() {
                    return _$50s;
                }

                public void set_$50s(int _$50s) {
                    this._$50s = _$50s;
                }

                public int get_$100s() {
                    return _$100s;
                }

                public void set_$100s(int _$100s) {
                    this._$100s = _$100s;
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

                public String getR() {
                    return r;
                }

                public void setR(String r) {
                    this.r = r;
                }

                public int getB() {
                    return b;
                }

                public void setB(int b) {
                    this.b = b;
                }

                public int getInns() {
                    return inns;
                }

                public void setInns(int inns) {
                    this.inns = inns;
                }

                public int getM() {
                    return m;
                }

                public void setM(int m) {
                    this.m = m;
                }
            }

            public static class BowlingStatsBean {
                /**
                 * a : -
                 * sr : -
                 * d : 0
                 * e : -
                 * wb : 0
                 * bbiw : 0
                 * bbir : 0
                 * bbmw : 0
                 * bbmr : 0
                 * 4w : 0
                 * 5w : 0
                 * 10w : 0
                 * wmaid : 0
                 * ht : 0
                 * 4s : 0
                 * 6s : 0
                 * ov : -
                 * r : 0
                 * w : 0
                 * maid : 0
                 * nb : 0
                 * b : 0
                 * inns : 0
                 * m : 13
                 */

                private String a;
                private String sr;
                private int d;
                private String e;
                private int wb;
                private int bbiw;
                private int bbir;
                private int bbmw;
                private int bbmr;
                @SerializedName("4w")
                private int _$4w;
                @SerializedName("5w")
                private int _$5w;
                @SerializedName("10w")
                private int _$10w;
                private int wmaid;
                private int ht;
                @SerializedName("4s")
                private int _$4s;
                @SerializedName("6s")
                private int _$6s;
                private String ov;
                private int r;
                private int w;
                private int maid;
                private int nb;
                private int b;
                private int inns;
                private int m;

                public static BowlingStatsBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), BowlingStatsBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public String getA() {
                    return a;
                }

                public void setA(String a) {
                    this.a = a;
                }

                public String getSr() {
                    return sr;
                }

                public void setSr(String sr) {
                    this.sr = sr;
                }

                public int getD() {
                    return d;
                }

                public void setD(int d) {
                    this.d = d;
                }

                public String getE() {
                    return e;
                }

                public void setE(String e) {
                    this.e = e;
                }

                public int getWb() {
                    return wb;
                }

                public void setWb(int wb) {
                    this.wb = wb;
                }

                public int getBbiw() {
                    return bbiw;
                }

                public void setBbiw(int bbiw) {
                    this.bbiw = bbiw;
                }

                public int getBbir() {
                    return bbir;
                }

                public void setBbir(int bbir) {
                    this.bbir = bbir;
                }

                public int getBbmw() {
                    return bbmw;
                }

                public void setBbmw(int bbmw) {
                    this.bbmw = bbmw;
                }

                public int getBbmr() {
                    return bbmr;
                }

                public void setBbmr(int bbmr) {
                    this.bbmr = bbmr;
                }

                public int get_$4w() {
                    return _$4w;
                }

                public void set_$4w(int _$4w) {
                    this._$4w = _$4w;
                }

                public int get_$5w() {
                    return _$5w;
                }

                public void set_$5w(int _$5w) {
                    this._$5w = _$5w;
                }

                public int get_$10w() {
                    return _$10w;
                }

                public void set_$10w(int _$10w) {
                    this._$10w = _$10w;
                }

                public int getWmaid() {
                    return wmaid;
                }

                public void setWmaid(int wmaid) {
                    this.wmaid = wmaid;
                }

                public int getHt() {
                    return ht;
                }

                public void setHt(int ht) {
                    this.ht = ht;
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

                public String getOv() {
                    return ov;
                }

                public void setOv(String ov) {
                    this.ov = ov;
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

                public int getMaid() {
                    return maid;
                }

                public void setMaid(int maid) {
                    this.maid = maid;
                }

                public int getNb() {
                    return nb;
                }

                public void setNb(int nb) {
                    this.nb = nb;
                }

                public int getB() {
                    return b;
                }

                public void setB(int b) {
                    this.b = b;
                }

                public int getInns() {
                    return inns;
                }

                public void setInns(int inns) {
                    this.inns = inns;
                }

                public int getM() {
                    return m;
                }

                public void setM(int m) {
                    this.m = m;
                }
            }

            public static class FieldingStatsBean {
                /**
                 * c : 3
                 * ro : 1
                 * s : 0
                 * inns : 4
                 * m : 13
                 */

                private int c;
                private int ro;
                private int s;
                private int inns;
                private int m;

                public static FieldingStatsBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), FieldingStatsBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public int getC() {
                    return c;
                }

                public void setC(int c) {
                    this.c = c;
                }

                public int getRo() {
                    return ro;
                }

                public void setRo(int ro) {
                    this.ro = ro;
                }

                public int getS() {
                    return s;
                }

                public void setS(int s) {
                    this.s = s;
                }

                public int getInns() {
                    return inns;
                }

                public void setInns(int inns) {
                    this.inns = inns;
                }

                public int getM() {
                    return m;
                }

                public void setM(int m) {
                    this.m = m;
                }
            }
        }
    }
}
