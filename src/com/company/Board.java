package com.company;

import javax.swing.*;
import java.awt.*;

public class Board {
    public static int[][] arr;
    Board(){
        initBoard();
        setShips();
    }

    public void initBoard(){
        arr = new int[10][10];
        for (int i=0;i<10;i++)
            for (int j = 0; j < 10; j++){
                arr[i][j] = 0;
            }
    }

    Captain captain = new Captain();
    public void setShips() {
        captain.build(4);

        captain.build(3);
        captain.build(3);

        captain.build(2);
        captain.build(2);
        captain.build(2);

        captain.build(1);
        captain.build(1);
        captain.build(1);
        captain.build(1);
    }

    // fixme
    public static Dock dock = new Dock(); //???
    JPanel panel = new JPanel();
    public JPanel fillBoard() {
        panel.setLayout(new GridLayout(10,10));
        for (int i = 0; i < 10; i++)
            for(int j = 0; j < 10; j++) {
                panel.add(dock.getShip(getIndex(i,j)));
            }
        return panel;
    }

    public void showBoard(){
        for (int i=0;i<10;i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int getIndex(int i, int j) {
        return Integer.parseInt("" + i + j);
    }
}
