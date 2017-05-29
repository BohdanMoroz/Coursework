package com.company;


import com.company.computer.EnemyBoard;
import com.company.player.Fire;
import com.company.player.PlayerBoard;
import com.company.player.Sailor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    public static JPanel p1; // [VM:High] Should be meaningfull name
    public static JPanel p2; // [VM:High] Should be meaningfull name

    public static void main(String[] args) {
        // [VM:High] One big complicated method should be splitted to multiple smaller methods with meaningfull names
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

        PlayerBoard playerBoard = new PlayerBoard();
        p2 = playerBoard.getPanel();
        frame.add(p2);




//        Fire fire = new Fire();
//        Timer timer = new Timer(2000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                fire.shoot();
//            }
//        });
//        timer.start();

        frame.setVisible(true);

//        fire.shoot();
//        fire.shoot();
//        fire.shoot();
//        fire.shoot();
//        fire.shoot();
//        fire.shoot();
//        fire.shoot();
//        fire.shoot();
//        fire.shoot();
//        fire.shoot();
//        fire.shoot();
//        fire.shoot();
//        fire.shoot();
//        fire.shoot();
//        fire.shoot();



//        start();
    }

    // [VM:Middle] Methods "disable" and "enable" are duplicated. You can create single method like "changeEnable" with parameters JPanel panel and boolean enabled
    public static void disable(JPanel panel) {
        for (int i=0; i<100; i++)
            panel.getComponent(i).setEnabled(false);
    }

    public static void enable(JPanel panel) {
        for (int i=0; i<100; i++)
            panel.getComponent(i).setEnabled(true);
    }

    // [VM:Middle] Code should be formatted
    public static void start(){
//        while (!Sailor.target.isEmpty()){
            disable(p1);
//        }
        enable(p1);
    }

}
