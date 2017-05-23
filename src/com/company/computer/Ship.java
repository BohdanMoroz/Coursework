package com.company.computer;

import javax.swing.*;

public class Ship {
    public int index;
    public JButton btn;

    Ship(){

    }

    public JButton buildShip(int index) {
        btn = new JButton(Img.getEmpty()); // ???
        this.index = index;
        Gun.shoot(btn, index);
        return btn;
    }


}
