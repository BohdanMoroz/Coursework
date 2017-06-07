package com.company;

import java.util.ArrayList;

public class BattleField {
    ButtonBFI[] battleFieldItems = new ButtonBFI[100];
    ArrayList<Integer>[][] battleFieldSchema = new ArrayList[10][10];

    public void initBattleFieldSchema() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                battleFieldSchema[i][j].add(0);
            }

        }
    }

    public void handleShoot() {

    }

}
