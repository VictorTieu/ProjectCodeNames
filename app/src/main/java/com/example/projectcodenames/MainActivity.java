package com.example.projectcodenames;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView[][] textView = new TextView[5][5];
    private String[][] id;
    public int row, col;
    private WordList wordList = new WordList();
    //private Word[] words;

    private Word[] words = {new Word("A", Color.BLACK), new Word("B", Color.WHITE), new Word("C", Color.WHITE), new Word("D", Color.WHITE), new Word("E", Color.WHITE), new Word("F", Color.WHITE),
            new Word("G", Color.WHITE), new Word("H", Color.WHITE), new Word("I", Color.WHITE), new Word("J", Color.WHITE), new Word("K", Color.WHITE), new Word("L", Color.WHITE),
            new Word("M", Color.WHITE), new Word("N", Color.WHITE), new Word("O", Color.WHITE), new Word("P", Color.WHITE), new Word("Q", Color.WHITE), new Word("R", Color.WHITE),
            new Word("S", Color.WHITE), new Word("T", Color.WHITE), new Word("U", Color.WHITE), new Word("V", Color.WHITE), new Word("W", Color.WHITE), new Word("X", Color.WHITE),
            new Word("Y", Color.WHITE), new Word("Z", Color.WHITE)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.gridView);
        //words = createWordArray();
        final BoardAdapter boardAdapter = new BoardAdapter(this, words);
        gridView.setAdapter(boardAdapter);
/*
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                Word word = words[position];
                //word.toggleClicked();
                boardAdapter.notifyDataSetChanged();
            }
        });*/
    }
/*
    private Word[] createWordArray() {
        Word[] words = new Word[25];
        wordList.shuffleList();
        List<String> shuffledWords = wordList.getListOfWords();
        for (int i =0; i< 25; i++) {
            //words[i] = new Word(shuffledWords.get(i));
        }
        return words;
    }

    private void createGameBoard() {
        wordList.shuffleList();
        List<String> shuffledWords = wordList.getListOfWords();
        
        id = new String[][]{{"textView1", "textView2", "textView3", "textView4", "textView5"},
                {"textView6", "textView7", "textView8", "textView9", "textView10"},
                {"textView11", "textView12", "textView13", "textView14", "textView15"},
                {"textView16", "textView17", "textView18", "textView19", "textView20"},
                {"textView21", "textView22", "textView23", "textView24", "textView25"}};
        
        int temp;

        for (row = 0; row < 5; row++) {
            for (col = 0; col < 5; col++) {
                temp = getResources().getIdentifier(id[row][col], "id", getPackageName());
                textView[row][col] = findViewById(temp);
                textView[row][col].setText(shuffledWords.get((row*5) + col));
                textView[row][col].setTextColor(Color.GREEN);
                textView[row][col].setBackgroundColor(Color.WHITE);
                setOnClick(textView[row][col], row, col);
                changeColor(textView[row][col]);
            }
        }
    }

    private void setOnClick(TextView textView, int position1, int position2) {
        textView.setOnClickListener((view -> Toast.makeText(MainActivity.this, "X is " + position1 + " and y is " + position2, Toast.LENGTH_LONG).show()));
    }

    private void changeColor(TextView textView) {
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color = getTextBackgroundColor(textView);
                switch (color) {
                    case Color.RED:
                        textView.setBackgroundColor(Color.BLUE);
                        break;
                    case Color.BLUE:
                        textView.setBackgroundColor(Color.GRAY);
                        break;
                    case Color.GRAY:
                        textView.setBackgroundColor(Color.BLACK);
                        break;
                    case Color.BLACK:
                        textView.setBackgroundColor(Color.WHITE);
                        break;
                    default:
                    case Color.WHITE:
                        textView.setBackgroundColor(Color.RED);
                }
            }
        });
    }

    private int getTextBackgroundColor(TextView textView) {
        ColorDrawable backgroundColor = (ColorDrawable) textView.getBackground();
        int colorId = backgroundColor.getColor();
        return colorId;
    }*/
}
