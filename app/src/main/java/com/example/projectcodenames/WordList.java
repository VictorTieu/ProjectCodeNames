package com.example.projectcodenames;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordList {

    List<String> listOfWords = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");

    void shuffleList() {
        Collections.shuffle(listOfWords);
    }

    public List<String> getListOfWords() {
        return listOfWords;
    }
}
