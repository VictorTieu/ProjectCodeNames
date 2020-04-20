package com.example.projectcodenames;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private WordList wordList = new WordList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.gridView);
        final BoardAdapter boardAdapter = new BoardAdapter(this, createWordArray());
        gridView.setAdapter(boardAdapter);
    }

    private Word[] createWordArray() {
        Word[] words = new Word[25];
        wordList.shuffleList();
        List<String> shuffledWords = wordList.getListOfWords();
        for (int i = 0; i < 25; i++) {
            words[i] = new Word(shuffledWords.get(i));
        }
        return words;
    }
}
