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

        ImageIcon imageIcon = new ImageIcon("1.png");

        JButton b = new JButton(imageIcon);
//        b.setSize(50,  50);


        for (int x = 0; x<10;x++)
            for(int y=0;y<10;y++)
                panel.add(new Field().makeBtn(imageIcon));




//        panel.remove(2);
//        panel.add(new JButton(new ImageIcon("2.png")),2);


        Board board = new Board();
        board.showBoard();

//        Ship ship = new Ship();
//        ship.chooseOrientation();
//
//        ship.findHorizontalPlace(4);
//
//        ship.findVerticalPlace(3);
//        ship.findHorizontalPlace(3);
//
//        ship.findHorizontalPlace(2);
//        ship.findHorizontalPlace(2);
//        ship.findVerticalPlace(2);
//
//        ship.findHorizontalPlace(1);
//        ship.findVerticalPlace(1);
//        ship.findHorizontalPlace(1);
//        ship.findVerticalPlace(1);

        Ship ship = new Ship();
        ship.build();

        board.showBoard();

        String str;
        int index;

        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                if (arr[i][j] != 0) {
                    str = "" + i + j;
                    index = Integer.parseInt(str);
                    panel.remove(index);
                    panel.add(new JButton(new ImageIcon("2.png")), index);
                }
            }
        }


    }
}
