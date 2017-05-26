package com.company.player;

import javax.swing.*;

import static com.company.player.Img.getEmpty;

public class PlayerArea {
    public JButton[] sector = new JButton[100];
    public int indexOfCurrentSector;

    PlayerArea(){
        fillPlayerArea();
    }


    private void fillPlayerArea() {
        Pointer pointer = new Pointer();

        for (indexOfCurrentSector = 0 ;indexOfCurrentSector < 100; indexOfCurrentSector++) {
            sector[indexOfCurrentSector] = new JButton(getEmpty());
            pointer.makeClickable(sector[indexOfCurrentSector], indexOfCurrentSector, this);
        }
    }

    public JButton getSector(int indexOfCurrentSector){
        return sector[indexOfCurrentSector];
    }
}
