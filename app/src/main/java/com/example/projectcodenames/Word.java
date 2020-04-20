package com.example.projectcodenames;

import android.graphics.drawable.ColorDrawable;
import android.widget.Button;

public class Word {

    private String randomWord;
    private int color;

    public Word(String randomWord, int color) {
        this.randomWord = randomWord;
        this.color = color;
    }

    public int returnBackgroundColor(Button button) {
        ColorDrawable backgroundColor = (ColorDrawable) button.getBackground();
        int colorId = backgroundColor.getColor();
        return colorId;
    }

    public String getRandomWord() {
        return randomWord;
    }
}
