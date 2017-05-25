package com.company;


import com.company.computer.EnemyBoard;
import com.company.player.Sailor;

import javax.swing.*;

public class Game {

    public static JPanel p1;
    public static JPanel p2;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(700, 308);
        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lineUp = new JLabel(new ImageIcon("images/line_up.png"));
        JLabel lineLeft = new JLabel(new ImageIcon("images/line_left.png"));
        lineUp.setBounds(20,0,250,20);
        lineLeft.setBounds(0,20,20,250);
        frame.add(lineUp);
        frame.add(lineLeft);

        EnemyBoard enemyBoard = new EnemyBoard();
        p1 = enemyBoard.getPanel();
        frame.add(p1);

//        enemyBoard.showBoard();

        com.company.player.Board boardPlayer = new com.company.player.Board();
        p2 = boardPlayer.fillBoard();
        frame.add(p2);


        frame.setVisible(true);


//        start();
    }

    public static void disable(JPanel panel) {
        for (int i=0; i<100; i++)
            panel.getComponent(i).setEnabled(false);
    }

    public static void enable(JPanel panel) {
        for (int i=0; i<100; i++)
            panel.getComponent(i).setEnabled(true);
    }

    public static void start(){
        while (!Sailor.target.isEmpty()){
            disable(p1);
        }
        enable(p1);
    }

}
