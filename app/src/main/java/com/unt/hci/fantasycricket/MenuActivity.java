package com.unt.hci.fantasycricket;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    AssetManager am;
    private DataLoader loader;
    public static String ApplicationPath = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApplicationPath = getFilesDir().getPath() + File.separator + "MyTeam.json";
        am = this.getAssets();
        loader = DataLoader.getInstance(am);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.mteam:
                startActivity(new Intent(MenuActivity.this, MyTeamActivity.class));
                return true;
            case R.id.mplayers:
                startActivity(new Intent(MenuActivity.this, PlayerListActivity.class));
                return true;
        }
        return true;
    }


    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnTeam:
                Intent intent = new Intent(MenuActivity.this, MyTeamActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;
            case R.id.btnPlayers:
                Intent intent1 = new Intent(MenuActivity.this, PlayerListActivity.class);
                intent1.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent1);
                break;
            case R.id.btnNextMatch:
                MyTeamData myTeamData = loader.getMyTeam();
                UpdateScore updateScore = new UpdateScore(myTeamData);
                myTeamData.setScore(myTeamData.getScore()+updateScore.getScore());
                List<MyTeamData.PlayersBean> playersBeanList =  myTeamData.getPlayers();
                playersBeanList.clear();
                myTeamData.setPlayers(playersBeanList);
                if(myTeamData.getMatch()<60)
                    myTeamData.setMatch(loader.getMyTeam().getMatch()+1);
                loader.WriteMyTeamData(myTeamData);
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ScoreFragment fragment = ScoreFragment.getInstance(updateScore);
                fragmentTransaction.add(R.id.fragment, fragment);
                fragmentTransaction.commit();

//                Intent intent2 = new Intent(MenuActivity.this, PlayerListActivity.class);
//                intent2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(intent2);
                break;
            default:
                break;

        }

    }
}
