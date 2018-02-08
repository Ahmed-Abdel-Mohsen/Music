package com.example.android.music;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SongInformation extends AppCompatActivity {

    boolean clicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_information);

        ImageView songImage = (ImageView) findViewById(R.id.song_image);
        TextView songNameTextView = (TextView) findViewById(R.id.song_name_text_view);
        TextView songBandTextView = (TextView) findViewById(R.id.song_band_text_view);
        TextView songDateTextView = (TextView) findViewById(R.id.song_date_text_view);
        TextView songLengthTextView = (TextView) findViewById(R.id.song_length_text_view);

        songImage.setImageResource(Integer.parseInt(getIntent().getStringExtra("SongImage")));
        songNameTextView.setText("Name: " + getIntent().getStringExtra("SongName"));
        songBandTextView.setText("Singer: " + getIntent().getStringExtra("SongBand"));
        songDateTextView.setText("Release Date: " + getIntent().getStringExtra("SongDate"));
        int length = Integer.parseInt(getIntent().getStringExtra("SongLength"));
        songLengthTextView.setText("Length: " + String.format("%02d:%02d", length / 60, length % 60));

        setTitle(getIntent().getStringExtra("SongName"));
        clicked = false;
        final Button playButton = (Button) findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!clicked) {
                    clicked = true;
                    playButton.setBackgroundColor(getResources().getColor(R.color.Stop));
                    playButton.setText("Stop");
                } else {
                    clicked = false;
                    playButton.setBackgroundColor(getResources().getColor(R.color.Play));
                    playButton.setText("Play");
                }
            }
        });
    }
}
