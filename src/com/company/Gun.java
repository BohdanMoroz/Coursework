package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.company.Board.arr;
import static com.company.Img.getDot;
import static com.company.Img.getRed;

public class Gun {

//    static int index;

    Gun(int index){
//        this.index = index;
    }


    public static int i;
    public static int j;
    public static String coordinate;
    public static void getCoordinate(int index){
        coordinate = Integer.toString(index);
        if (coordinate.length() == 1) {
            i = 0;
            j = Integer.parseInt(coordinate);
        }
        else {
            i = Integer.parseInt(coordinate.substring(0,1));
            j = Integer.parseInt(coordinate.substring(1,2));
        }
    }

    public static void shoot(JButton btn, int index){ //think about param, if they are similar (duplicate)?
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getCoordinate(index);
                if (arr[i][j] != 0) {
                    btn.setIcon(getRed());
//                    arrayList.remove(arr[i][j]);
                }
                else {
                    btn.setIcon(getDot());
                }
//                test.rePaint();
            }
        });
    }
}
