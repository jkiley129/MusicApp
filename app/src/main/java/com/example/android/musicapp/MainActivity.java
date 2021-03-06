package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // MARK: - Properties
    ArrayList<Song> songs = new ArrayList<Song>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        songs.add(new Song("In The End", "Linkin Park", "Hybrid Theory"));
        songs.add(new Song("The Hand That Feeds", "Nine Inch Nails", "With Teeth"));
        songs.add(new Song("Hysteria", "Muse", "Absolution"));
        songs.add(new Song("Bottle It In", "Kurt Vile", "Bottle It In"));
        songs.add(new Song("Paranoid Android", "Radiohead", "OK Computer"));
        songs.add(new Song("Epoch", "Tycho", "Epoch"));

        ArrayAdapter<Song> itemsAdapter = new SongAdapter(this, songs);

        final ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent nextActivity = new Intent(view.getContext(), NowPlayingActivity.class);
                nextActivity.putExtra("Position", position);
                startActivity(nextActivity);
            }
        });
    }
}
