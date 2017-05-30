package com.company;

public abstract class BattleFieldItem {
    boolean deck;
    boolean checked;

    public void init() {
    }

    public boolean isDeck() {
        return deck;
    }

    public void setDeck(boolean deck) {
        this.deck = deck;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public void shoot() {

    }

    public abstract void render();
}
