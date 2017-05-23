package com.company;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static com.company.Board.arr;
import static com.company.Img.*;

public class Btn {
    public int index;
    public JButton btn;

    Btn(){
        initAL();
    }

    public JButton getBtn(int index) {
        btn = new JButton(getEmpty()); // ???
        this.index = index;
        makeBtn();
        return btn;
    }

    public int i;
    public int j;
    String coordinate;
    public void getCoordinate(){
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

    public static ArrayList<Integer> arrayList = new ArrayList<Integer>();
    public void initAL(){
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);

        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(2);

        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(3);

        arrayList.add(4);
        arrayList.add(4);

        arrayList.add(5);
        arrayList.add(5);

        arrayList.add(6);
        arrayList.add(6);

        arrayList.add(7);

        arrayList.add(8);

        arrayList.add(9);

        arrayList.add(10);
    }

Test test = new Test();
    public void makeBtn(){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getCoordinate();
                if (arr[i][j] != 0) {
                    btn.setIcon(getRed());
                    arrayList.remove(arr[i][j]);
                }
                else {
                    btn.setIcon(getDot());
                }
                test.rePaint();
            }
        });
    }
}
