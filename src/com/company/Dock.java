package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.company.Board.arr;
import static com.company.Ship.arrayList;
import static com.company.Img.*;

public class Dock {
    public JButton[] ship = new JButton[100];
    public JButton buf;
    public static int number = 0;

    Dock(){
        for ( ;number < 100; number++)
            ship[number] = new Ship().buildShip(number);
    }

    public JButton getShip(int number){
        this.number = number;
        return ship[number];
    }




}
