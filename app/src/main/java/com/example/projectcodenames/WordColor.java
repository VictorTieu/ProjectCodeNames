package com.example.projectcodenames;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.widget.Button;
import android.widget.TextView;

public class WordColor {

    private int colorArray[] = {Color.GRAY, Color.BLUE, Color.RED, Color.DKGRAY, Color.BLACK};
    private int backgroundColor;

    public WordColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public int returnBackgroundColor(Button button) {
        ColorDrawable backgroundColor = (ColorDrawable) button.getBackground();
        int colorId = backgroundColor.getColor();
        return colorId;
    }

    public void setBackgroundColor(int[] color, int position) {
        if(position == 4) {
            position = 0;
        } else {
            position += 1;
        }
        this.backgroundColor = color[position];
    }
}
