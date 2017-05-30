package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonBFI extends BattleFieldItem{
    JButton btn = new JButton();

    @Override
    public void init() {
        super.init();
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shoot();
            }
        });
    }

    public void render() {

    }
}
