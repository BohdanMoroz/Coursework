package com.company;

import com.company.computer.Board;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(286, 308);
        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lineUp = new JLabel(new ImageIcon("images/line_up.png"));
        JLabel lineLeft = new JLabel(new ImageIcon("images/line_left.png"));
        lineUp.setBounds(20,0,250,20);
        lineLeft.setBounds(0,20,20,250);
        frame.add(lineUp);
        frame.add(lineLeft);

        Board board = new Board();
        frame.add(board.fillBoard());
        board.showBoard();

        frame.setVisible(true);
    }

}
