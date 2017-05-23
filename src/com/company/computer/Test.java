package com.company.computer;

import java.util.ArrayList;

public class Test {
    public static void rePaint(ArrayList arrayList){
        for (int p=1; p<=10; p++) {
            if (!arrayList.contains(p)) {
                for (int i=0; i<10; i++) {
                    for (int j=0; j<10; j++){
                        if (Board.arr[i][j] == p) {
                            Board.dock.getShip(getIndex(i,j)).setIcon(Img.getDead());
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
