package com.unt.hci.fantasycricket;

import android.content.Intent;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MyTeamActivity extends AppCompatActivity {

    AssetManager am;
    private DataLoader loader;
    Button butMyTeam, butPlayers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        am = this.getAssets();
        loader = DataLoader.getInstance(am);




        butMyTeam = (Button) findViewById(R.id.butMyTeam);
        butPlayers = (Button) findViewById(R.id.butPlayers);
        butPlayers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MyTeamActivity.this, PlayerListActivity.class));
            }
        });
        butMyTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MyTeamActivity.this, MyTeamActivity.class));
            }
        });



    }
}
