package com.company;

import java.util.ArrayList;

import static com.company.Board.arr;
import static com.company.Board.dock;
import static com.company.Img.getDead;

public class Test {
    public static void rePaint(ArrayList arrayList){
        for (int p=1; p<=10; p++) {
            if (!arrayList.contains(p)) {
                for (int i=0; i<10; i++) {
                    for (int j=0; j<10; j++){
                        if (arr[i][j] == p) {
                            dock.getShip(getIndex(i,j)).setIcon(getDead());
                        }
                    }
                }
            }
        }
    }

    public static int getIndex(int i, int j) {
        return Integer.parseInt("" + i + j);
    }
}
