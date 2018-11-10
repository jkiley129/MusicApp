package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity {

    // MARK: - Properties
    Song selectedSong = new Song();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);
    }
}
