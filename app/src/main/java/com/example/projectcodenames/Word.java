package com.example.projectcodenames;

import android.graphics.Color;

class Word {

    private String randomWord;
    private int currentColor;
    private int colorPosition = 0;
    private int[] color = {Color.LTGRAY, Color.RED, Color.BLUE, Color.GRAY, Color.BLACK};

    Word(String randomWord) {
        this.randomWord = randomWord;
        this.currentColor = color[colorPosition];
    }

    private void incrementColorPosition() {
        colorPosition++;
        if (colorPosition == color.length) {
            colorPosition = 0;
        }
    }

    private int getColorPosition() {
        return colorPosition;
    }

    void incrementColorArray() {
        incrementColorPosition();
        setCurrentColor(getColorPosition());
    }

    int getCurrentColor() {
        return currentColor;
    }

    private void setCurrentColor(int position) {
        this.currentColor = color[position];
    }

    String getRandomWord() {
        return randomWord;
    }
}
