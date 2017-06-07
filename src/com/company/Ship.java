package com.company;

import java.util.ArrayList;

public class Ship {
    ArrayList<Integer> decks = new ArrayList<>();

    public void addDeck(int i, int j) {
        //...
        decks.add(getIndex(i, j));
    }

    public boolean verifyDeck(int i, int j) {
        //...
        if (decks.contains(getIndex(i, j))) {
            //...
            return true;
        } else {
            //...
            return false;
        }
    }

    private int getIndex(int i, int j) {
        return Integer.parseInt("" + i + j);
    }
}
