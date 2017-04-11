package com.unt.hci.fantasycricket;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by dpk on 4/1/17.
 */

public class ScoreFragment extends Fragment {
    private UpdateScore updateScore;
    private Button closebtn;
    private TextView ings1_batscr;
    private TextView ings1_bowlscr;
    private TextView ings1_score;
    private TextView ings2_batscr;
    private TextView ings2_bowlscr;
    private TextView ings2_score;
    private TextView match_score;
    private TextView total_score;
    private ProgressBar prgressbar;
    private TextView prg_text;
    private void setus(UpdateScore us){
        updateScore = us;
    }
    public static ScoreFragment getInstance(UpdateScore up){
        ScoreFragment sF = new ScoreFragment();
        sF.setus(up);
        return sF;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /**
         * Inflate the layout for this fragment
         */
        View view = inflater.inflate(R.layout.score_fragment, container, false);
        closebtn = (Button) view.findViewById(R.id.close_button);
        ings1_batscr = (TextView) view.findViewById(R.id.ing1_batscr);
        ings1_bowlscr = (TextView) view.findViewById(R.id.ing1_bowlscr);
        ings1_score = (TextView) view.findViewById(R.id.ing1_scr);
        ings2_batscr = (TextView) view.findViewById(R.id.ing2_batscr);
        ings2_bowlscr = (TextView) view.findViewById(R.id.ing2_bowlscr);
        ings2_score = (TextView) view.findViewById(R.id.ing2_scr);
        match_score = (TextView) view.findViewById(R.id.tot_scr);

        prgressbar = (ProgressBar) view.findViewById(R.id.prgbar);
        prgressbar.setMax(60);
        prg_text = (TextView) view.findViewById(R.id.prg_text);


        ings1_batscr.setText("Innings 1 batting score :  "+updateScore.getInnings1_batting_score());
        ings1_bowlscr.setText("Innings 1 bowling score :  "+updateScore.getInnings1_bowling_score());
        ings1_score.setText("Innings 1 total score :  "+updateScore.getInnings1_points());
        ings2_batscr.setText("Innings 2 batting score :  "+updateScore.getInnings2_batting_score());
        ings2_bowlscr.setText("Innings 2 bowling score :  "+updateScore.getInnings2_bowling_score());
        ings2_score.setText("Innings 2 total score :  "+updateScore.getInnings2_points());
        match_score.setText("Match Score :  "+updateScore.getScore());

        prgressbar.setProgress(updateScore.getMatch_number()+1);
        prg_text.setText(updateScore.getMatch_number()+"/60");


        closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().remove(ScoreFragment.this).commit();
                Intent intent = new Intent(getActivity(), PlayerListActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                getActivity().startActivity(intent);
            }
        });
        return view;
    }
}
