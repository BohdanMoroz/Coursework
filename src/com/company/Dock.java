package com.company;

import javax.swing.*;

public class Dock {
    public JButton[] ship = new JButton[100];
    public int number = 0;

    Dock(){
        for ( ;number < 100; number++)
            ship[number] = new Ship().buildShip(number);
    }

    public JButton getShip(int number){
        this.number = number;
        return ship[number];
    }
}
