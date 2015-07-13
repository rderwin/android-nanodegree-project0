package com.under_rated.udacityproject0;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button media_streamer_button = (Button) findViewById(R.id.media_streamer_button);
        media_streamer_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my Spotify Streamer app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button super_duo1_button = (Button) findViewById(R.id.super_duo1_button);
        super_duo1_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my Scores app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button super_duo2_button = (Button) findViewById(R.id.super_duo2_button);
        super_duo2_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my Library app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button ant_terminator_button = (Button) findViewById(R.id.ant_terminator_button);
        ant_terminator_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my Build It Bigger app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button materialize_button = (Button) findViewById(R.id.materialize_button);
        materialize_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my Bacon Reader app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button capstone_button = (Button) findViewById(R.id.capstone_button);
        capstone_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my Capstone app!", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
