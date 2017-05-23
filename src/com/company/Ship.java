package com.company;

import javax.swing.*;

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
