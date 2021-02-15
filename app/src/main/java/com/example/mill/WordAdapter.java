package com.example.mill;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

       View listItemView = convertView;
       if (listItemView == null) {
           listItemView = LayoutInflater.from(getContext()).inflate(R.layout.number_list, parent, false);

       }
       Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMilwokTransition());

        TextView defaultTextView = (TextView)  listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTransition());

        return listItemView;

    }
}
