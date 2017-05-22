package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static com.company.Board.arr;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(250, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new GridLayout(10,10));

        ImageIcon imageIcon = new ImageIcon("images/1.png");

        JButton b = new JButton(imageIcon);
//        b.setSize(50,  50);


        for (int x = 0; x<10;x++)
            for(int y=0;y<10;y++)
                panel.add(new Field().makeBtn(imageIcon));



        Board board = new Board();
        board.showBoard();


        Ship ship = new Ship();

        ship.build(4);

        ship.build(3);
        ship.build(3);

        ship.build(2);
        ship.build(2);
        ship.build(2);

        ship.build(1);
        ship.build(1);
        ship.build(1);
        ship.build(1);

        board.showBoard();

        String str;
        int index;

        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                if (arr[i][j] != 0) {
                    str = "" + i + j;
                    index = Integer.parseInt(str);
                    panel.remove(index);
                    panel.add(new JButton(new ImageIcon("images/2.png")), index);
                }
            }
        }

//        System.out.println();
//        ship.showPosition();

//        frame.repaint();


    }
}
