package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // MARK: - Properties
    ArrayList<Song> songs = new ArrayList<Song>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        songs.add(new Song("Faint", "Linkin Park", ""));

        ArrayAdapter<Song> itemsAdapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.);

        listView.setAdapter(itemsAdapter);
    }
}
