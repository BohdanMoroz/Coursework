package com.company;

public abstract class BattleFieldItem {
    boolean isDeck;
    boolean isChecked;

    public void init() {
        setDeck(false);
        setChecked(false);
    }

    public boolean isDeck() {
        return isDeck;
    }

    public void setDeck(boolean deck) {
        isDeck = deck;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public void shoot() {

    }

    public abstract void render();
}
