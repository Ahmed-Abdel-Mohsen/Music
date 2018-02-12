package com.example.android.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Library extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        final ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song(getResources().getString(R.string.song1), R.drawable.shakirasinglewc, "Shakira", 227, 2010));
        songs.add(new Song(getResources().getString(R.string.song2), R.drawable.shape_of_you, "Ed Sheeran", 233, 2016));
        songs.add(new Song(getResources().getString(R.string.song3), R.drawable.get_busy, "Sean Paul", 212, 2003));
        songs.add(new Song(getResources().getString(R.string.song4), R.drawable.see_you_again, "Wiz Khalifa", 229, 2015));
        songs.add(new Song(getResources().getString(R.string.song5), R.drawable.uptown_funk, "Mark Ronson", 238, 2014));
        songs.add(new Song(getResources().getString(R.string.song6), R.drawable.thinking_out_loud, "Ed Sheeran", 231, 2014));
        songs.add(new Song(getResources().getString(R.string.song7), R.drawable.i_gotta_feeling, "The Black Eyed Peas", 245, 2009));

        SongAdapter songAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getBaseContext(), SongInformation.class);
                intent.putExtra("song", songs.get(i));
                startActivity(intent);
            }
        });
    }
}
