package com.clicks.yogi.audio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button MyButtonID;
    MediaPlayer mySong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Follow STEP Number 3 & 4 to create a raw directory.
    mySong = MediaPlayer.create(MainActivity.this,R.raw.sherlock);

        MyButtonID = findViewById(R.id.MyButtonID);

        MyButtonID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mySong.start();
            }
        });

    }
}
