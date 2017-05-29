package com.company.player;

import javax.swing.*;
import java.awt.*;

public class PlayerBoard {
    private JPanel panel;
    private PlanOfShipPosition planOfShipPosition;

    public PlayerBoard(){
        planOfShipPosition = new PlanOfShipPosition();
        playerArea = new PlayerArea(); //???
        initPanel();
        fillPanel();
    }

    private void initPanel() {
        panel = new JPanel();
        panel.setLayout(new GridLayout(10,10));
        panel.setBounds(420, 20, 250, 250);
    }

    private PlayerArea playerArea; //???


    private void fillPanel() {
        for (int i = 0; i < 10; i++)
            for(int j = 0; j < 10; j++) {
                panel.add(playerArea.getSector(getIndex(i,j)));
            }
    }

    public JPanel getPanel() {
        return panel;
    }

    private int getIndex(int i, int j) {
        return Integer.parseInt("" + i + j);
    }

}
