package com.example.projectcodenames;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Toast;

public class BoardAdapter extends BaseAdapter {

    private final Context context;
    private final Word[] words;

    public BoardAdapter(Context context, Word[] words) {
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

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Word word = words[position];

        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.linearlayout_word, null);
            WordColor wordColor = new WordColor(Color.GRAY);
            final Button wordButton = convertView.findViewById(R.id.word);
            final ViewHolder viewHolder = new ViewHolder(wordButton);
            viewHolder.word.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "Position " + position + " was clicked!", Toast.LENGTH_SHORT).show();
                    /*
                    int[][] states = new int[][] {new int[] {android.R.attr.state_enabled}};
                    int[] colors = new int[] {Color.RED, Color.BLUE, Color.GRAY, Color.BLACK};
                    ColorStateList colorStateList = new ColorStateList(states, colors);
                    RippleDrawable viewColor = (RippleDrawable) v.getBackground();
                    viewColor.setColor(colorStateList);*/
                    //v.setBackgroundColor(Color.RED);
                    //ColorDrawable viewColor = (ColorDrawable) v.getBackground();
                    /*
                    ColorDrawable viewColor = (ColorDrawable) v.getBackground();
                    int colorId = viewColor.getColor();
                    v.setBackgroundColor(Color.RED);
                    if(colorId == Color.RED) {
                        v.setBackgroundColor(Color.BLUE);
                    } else if (colorId == Color.BLUE) {
                        v.setBackgroundColor(Color.GREEN);
                    } else if (colorId == Color.GREEN) {
                        v.setBackgroundColor(Color.BLACK);
                    } else if (colorId == Color.BLACK) {
                        v.setBackgroundColor(Color.WHITE);
                    } else {
                        v.setBackgroundColor(Color.RED);
                    }*/
                }
            });
            convertView.setTag(viewHolder);
        }

        final ViewHolder viewHolder = (ViewHolder) convertView.getTag();
        //viewHolder.word.isEnabled();
        viewHolder.word.setText(word.getRandomWord());
        //viewHolder.word.setBackgroundColor(word.getIsClicked() ? Color.BLACK : Color.BLUE);

        return convertView;
    }

    private void changeColor(Word word) {
        //int color = word.g
    }

    private class ViewHolder {
        private final Button word;

        public ViewHolder(Button word) {
            this.word = word;
        }
    }
}
