package com.example.android.music;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ahmed on 2/8/2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {


    public SongAdapter(Activity context, ArrayList<Song> word) {
        super(context, 0, word);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Song currentSong = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_item);
        imageView.setImageResource(currentSong.getImage());

        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_name);
        songTextView.setText(currentSong.getName());

        TextView durationTextView = (TextView) listItemView.findViewById(R.id.duration_text_view);
        durationTextView.setText(String.format("%02d:%02d", currentSong.getLength() / 60, currentSong.getLength() % 60));


        return listItemView;
    }
}
