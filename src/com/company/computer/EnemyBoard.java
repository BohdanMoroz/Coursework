package com.company.computer;

import javax.swing.*;
import java.awt.*;

//think about interface or super class
public class EnemyBoard {
    private JPanel panel; // [VM:Middle] Should have meaningfull name
    private PlanOfShipPosition planOfShipPosition;

    public EnemyBoard(){
        planOfShipPosition = new PlanOfShipPosition(); // [VM:Middle] Better to init in field declaration
        initPanel();
        fillPanel();
    }

    private void initPanel(){
        panel = new JPanel();
        panel.setLayout(new GridLayout(10,10));//[VM:High] "10" and "10" should be constant
        panel.setBounds(20, 20, 250, 250);
    }

    private EnemyArea enemyArea = new EnemyArea();// [VM:Middle] All fields should beplaced together

    private void fillPanel() {
        for (int i = 0; i < 10; i++)
            for(int j = 0; j < 10; j++) {
                panel.add(enemyArea.getSector(getIndex(i,j)));
            }
    }

    public JPanel getPanel() {
        return panel;
    }

    // [VM:Middle] Better to change name to "generateIndex" and move to separate class for utils methods.
    private int getIndex(int i, int j) {
        return Integer.parseInt("" + i + j);
    }
}
