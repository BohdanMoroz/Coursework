package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static com.company.Board.arr;
import static com.company.Btn.arrayList;
import static com.company.Img.getDead;

public class Main {

    static int index;
    static Field field = new Field();

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(250, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new GridLayout(10,10));



        for (int x = 0; x<10;x++)
            for(int y=0;y<10;y++) {
                getIndex(x,y);
                panel.add(field.getButton(index));
            }



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

//        String str;


        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                if (arr[i][j] != 0) {
//                    str = "" + i + j;
//                    index = Integer.parseInt(str);
                    getIndex(i,j);
//                    panel.remove(index);
//                    panel.add(new JButton(new ImageIcon("images/2.png")), index);
//                    panel.
                }
            }
        }

//        System.out.println();
//        ship.showPosition();

//        frame.repaint();


    }

//    public static void rePaint(){
//        for (int p=1; p<=10; p++) {
//            if (!arrayList.contains(p)) {
//                for (int i=0; i<10; i++) {
//                    for (int j=0; j<10; j++){
//                        if (arr[i][j] == p) {
//                            field.getButton(getIndex(i,j)).setIcon(getDead());
//                        }
//                    }
//                }
//            }
//        }
//    }

    public static int getIndex(int i, int j) {
//        str = "" + i + j;
        index = Integer.parseInt("" + i + j);
        return index;
    }
}
