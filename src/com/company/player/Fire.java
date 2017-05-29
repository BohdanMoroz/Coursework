package com.company.player;

import java.util.Random;

import static com.company.player.PlanOfShipPosition.arr;
import static com.company.player.PlayerArea.getSector;

public class Fire {
    int index;
    Random random = new Random();
    int[] mas = {0,0,0,1,2,3,4,5,6,7,8,9,10};
    int prevarg;
    int i;
    int j;
    String coordinate;

    public Fire() {
        index = random.nextInt(100);
        prevarg = 3;
    }

    public void zzz() {
        getSector(index).doClick();
        index = random.nextInt(100);
    }

    private void shoot() {
        getSector(getIndex(i,j)).doClick();
//        prevarg = Integer.parseInt(arr[i][j]);
        arr[i][j] = arr[i][j] + "d";
//        System.out.println(i + "   " +j);

    }


    private boolean isDeck() {
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if(arr[i][j].equals(prevarg) && !arr[i][j].equals("0")) {
                    return true;
                }
            }
        }
        return false;
    }

    private int getIndex(int i, int j) {
        return Integer.parseInt("" + i + j);
    }
}
