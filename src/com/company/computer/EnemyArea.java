package com.company.computer;

import javax.swing.*;

import static com.company.computer.Img.getEmptyIcon;

public class EnemyArea {
    private JButton[] sector = new JButton[100]; // [VM:Low] Name "sectors" is better. [VM:Middle] 100 should be constant
    private int indexOfCurrentSector;

    EnemyArea(){
        fillEnemyArea();
    }

    private void fillEnemyArea() {
        Gun gun = new Gun();

        // [VM:High] Iterator should be used only for iteration.
        for (indexOfCurrentSector = 0; indexOfCurrentSector < 100; indexOfCurrentSector++) {            
            sector[indexOfCurrentSector] = new JButton(getEmptyIcon());
            gun.makeClickable(sector[indexOfCurrentSector], indexOfCurrentSector, this);
        }
    }

    public JButton getSector(int indexOfCurrentSector){
        return sector[indexOfCurrentSector];
    }
}
