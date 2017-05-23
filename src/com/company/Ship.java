package com.company;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static com.company.Board.arr;
import static com.company.Img.*;

public class Ship {
    public int index;
    public JButton btn;

    Ship(){

    }

    public JButton buildShip(int index) {
        btn = new JButton(getEmpty()); // ???
        this.index = index;
        Gun.shoot(btn, index);
        return btn;
    }


}
