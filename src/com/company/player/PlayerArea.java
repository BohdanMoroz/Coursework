package com.company.player;

import javax.swing.*;

import static com.company.player.Img.*;
import static com.company.player.PlanOfShipPosition.arr;

public class PlayerArea {
    public static JButton[] sector = new JButton[100];
    public int indexOfCurrentSector;

    PlayerArea(){
        fillPlayerArea();
        repaint();
    }


    private void fillPlayerArea() {
        Fun fun = new Fun();

        for (indexOfCurrentSector = 0 ;indexOfCurrentSector < 100; indexOfCurrentSector++) {
            sector[indexOfCurrentSector] = new JButton(getEmptyIcon());
            fun.makeClickable(sector[indexOfCurrentSector], indexOfCurrentSector, this);
        }
    }

    private void repaint(){ //name
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++){
                if (!arr[i][j].equals("0")) {
                    getSector(getIndex(i,j)).setIcon(getGreenIcon());
                }
            }
        }
    }

    private int getIndex(int i, int j) {
        return Integer.parseInt("" + i + j);
    }

    public static JButton getSector(int indexOfCurrentSector){
        return sector[indexOfCurrentSector];
    }
}
