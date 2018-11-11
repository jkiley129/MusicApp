package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity {

    // MARK: - Properties
    ArrayList<Song> songs = new ArrayList<Song>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        songs.add(new Song("In The End", "Linkin Park", "Hybrid Theory"));
        songs.add(new Song("The Hand That Feeds", "Nine Inch Nails", "With Teeth"));
        songs.add(new Song("Hysteria", "Muse", "Absolution"));
        songs.add(new Song("Bottle It In", "Kurt Vile", "Bottle It In"));
        songs.add(new Song("Paranoid Android", "Radiohead", "OK Computer"));
        songs.add(new Song("Epoch", "Tycho", "Epoch"));

        Button backButton = findViewById(R.id.back_button);
        backButton.setBackgroundResource(R.drawable.ic_back);
        Button playButton = findViewById(R.id.play_button);
        playButton.setBackgroundResource(R.drawable.ic_play);
        Button forwardButton = findViewById(R.id.forward_button);
        forwardButton.setBackgroundResource(R.drawable.ic_forward);

        ImageView softImageView = findViewById(R.id.volume_down_image);
        softImageView.setImageResource(R.drawable.ic_soft);
        ImageView loudImageView = findViewById(R.id.volume_up_image);
        loudImageView.setImageResource(R.drawable.ic_loud);

        Intent intent = getIntent();
        int message = intent.getIntExtra("Position", 0);
        populateSong(message);
    }

    private void populateSong(int position) {
        Song item = songs.get(position);
        TextView songTextView = findViewById(R.id.now_playing_song_text_view);
        songTextView.setText(item.getName());
        TextView artistTextView = findViewById(R.id.now_playing_artist_text_view);
        artistTextView.setText(item.getArtist());
        ImageView albumArtImageView = findViewById(R.id.now_playing_cover_image);
        if (position == 0) {
            albumArtImageView.setImageResource(R.drawable.ic_hybrid_theory);
        } else if (position == 1) {
            albumArtImageView.setImageResource(R.drawable.ic_with_teeth);
        } else if (position == 2) {
            albumArtImageView.setImageResource(R.drawable.ic_absolution);
        } else if (position == 3) {
            albumArtImageView.setImageResource(R.drawable.ic_bottle_it_in);
        } else if (position == 4) {
            albumArtImageView.setImageResource(R.drawable.ic_ok_computer);
        } else if (position == 5) {
            albumArtImageView.setImageResource(R.drawable.ic_epoch);
        }
    }
}
