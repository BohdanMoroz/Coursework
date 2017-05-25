package com.company.computer;

import javax.swing.*;
import java.awt.*;

//think about interface
public class EnemyBoard {

    private JPanel panel;

    private PlanOfShipPosition planOfShipPosition;

    public EnemyBoard(){
        planOfShipPosition = new PlanOfShipPosition();
        initPanel();
        fillPanel();
    }

    private void initPanel(){
        panel = new JPanel();
        panel.setLayout(new GridLayout(10,10));
        panel.setBounds(20, 20, 250, 250);
    }

    private EnemyArea enemyArea = new EnemyArea();

    private void fillPanel() {
        for (int i = 0; i < 10; i++)
            for(int j = 0; j < 10; j++) {
                panel.add(enemyArea.getSector(getIndex(i,j)));
            }
    }

    public JPanel getPanel() {
        return panel;
    }

    private int getIndex(int i, int j) {
        return Integer.parseInt("" + i + j);
    }
}
