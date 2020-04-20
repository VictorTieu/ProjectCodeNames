package com.example.projectcodenames;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Toast;

public class BoardAdapter extends BaseAdapter {

    private final Context context;
    private final Word[] words;

    BoardAdapter(Context context, Word[] words) {
        this.context = context;
        this.words = words;
    }

    @Override
    public int getCount() {
        return words.length;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Word word = words[position];

        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.linearlayout_word, null);
            final Button wordButton = convertView.findViewById(R.id.word);
            final ViewHolder viewHolder = new ViewHolder(wordButton);
            viewHolder.word.setOnClickListener(v -> {
                Toast.makeText(context, "Position " + position + " was clicked!" + word.getCurrentColor(), Toast.LENGTH_SHORT).show();
                word.incrementColorArray();
                v.setBackgroundColor(word.getCurrentColor());
            });
            convertView.setTag(viewHolder);
        }

        final ViewHolder viewHolder = (ViewHolder) convertView.getTag();
        viewHolder.word.setText(word.getRandomWord());
        return convertView;
    }

    private static class ViewHolder {
        private final Button word;

        ViewHolder(Button word) {
            this.word = word;
        }
    }
}
