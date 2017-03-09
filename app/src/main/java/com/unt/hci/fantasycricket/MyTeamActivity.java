package com.unt.hci.fantasycricket;

import android.content.Intent;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MyTeamActivity extends MenuActivity {

    protected void onCreate(Bundle savedInstanceState) {
        Log.e("INFO", "MyTeamActivity Create");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
