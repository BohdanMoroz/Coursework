package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.company.Board.arr;
import static com.company.Btn.arrayList;
import static com.company.Img.*;

public class Field {
    public JButton[] btn = new JButton[100];
    public JButton buf;
    public static int index = 0;
//    public int i;
//    public int j;

//    Btn bt = new Btn();

    Field(){
        for ( ;index < 100; index++)
            btn[index] = new Btn().getBtn(index);
    }

    public JButton getButton(int index){
//        rePaint();
        this.index = index;
        return btn[index];
    }




//    String coordinate;
//    public void getCoordinate(){
//        coordinate = Integer.toString(index);
//        if (coordinate.length() == 0) {
//            i = 0;
//            j = Integer.parseInt(coordinate);
//        }
//        else {
//            i = Integer.parseInt(coordinate.substring(1,1));
//            j = Integer.parseInt(coordinate.substring(2,2));
//        }
//    }

//    public void makeBtn(){
//        buf = btn[bt.getBtnIndex()];
//        buf.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(index);
//                buf.setIcon(getGreen());
//            }
//        });
//    }

//    public void setImg(){
//        btn.setIcon(getDot());
//    }


}
