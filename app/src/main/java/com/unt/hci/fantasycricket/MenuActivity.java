package com.unt.hci.fantasycricket;

import android.content.Intent;
import android.content.res.AssetManager;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    AssetManager am;
    private DataLoader loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                loader.getMyTeam().setMatch(loader.getMyTeam().getMatch()+1);
                Intent intent2 = new Intent(MenuActivity.this, PlayerListActivity.class);
                intent2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent2);
                break;
            default:
                break;

        }

    }
}
