package com.company;

import java.util.ArrayList;

public class BattleField {
    ButtonBFI[] battleFieldItems = new ButtonBFI[100];
//    ArrayList<Integer>[][] battleFieldSchema = new ArrayList[10][10];

    public void initBattleFieldItems() {
        for (int i = 0; i < 100; i++)
            battleFieldItems[i] = new ButtonBFI();
    }

    public void handleShoot() {

    }

}
