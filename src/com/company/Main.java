package com.company;

//import com.company.computer.Board;

import javax.swing.*;

public class Main {
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


        com.company.computer.Board boardComputer = new com.company.computer.Board();
        frame.add(boardComputer.fillBoard());
        boardComputer.showBoard();

        com.company.player.Board boardPlayer = new com.company.player.Board();
        frame.add(boardPlayer.fillBoard());

        frame.setVisible(true);
    }

}
