package com.company.player;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static com.company.player.Board.arr;

public class Pointer {

    public static int i;
    public static int j;
    public static String coordinate;
//    public static ArrayList<Integer> enBtn = new ArrayList<>();
//    public static void initEnableBtn() {
//        for (int j=0; j<100; j++)
//            enBtn.add(j); //think ??? outboxing
//    }



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

    public static void click(JButton btn, int index){ //think about param, if they are similar (duplicate)?

//        if(index==0){
//            initTarget();
//            initEnableBtn();
//        }

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    getCoordinate(index);
                    if (arr[i][j] == 0) {
                        if (Sailor.build(3, i, j))

                        btn.setIcon(Img.getGreen());
//                        arr[i][j] = 1;

//                        Sailor.getPosition(i,j);

                        Board.showBoard();

//                        target.remove(Integer.valueOf(Board.arr[i][j]));
//                        enBtn.remove(Integer.valueOf(index));
//                        System.out.println(target);
                    }
//                    Test.rePaint(target);
            }
        });
    }

//    public static ArrayList<Integer> target = new ArrayList<Integer>(20);
//    public static void initTarget(){
//        target.add(1);
//        target.add(1);
//        target.add(1);
//        target.add(1);
//
//        target.add(2);
//        target.add(2);
//        target.add(2);
//
//        target.add(3);
//        target.add(3);
//        target.add(3);
//
//        target.add(4);
//        target.add(4);
//
//        target.add(5);
//        target.add(5);
//
//        target.add(6);
//        target.add(6);
//
//        target.add(7);
//
//        target.add(8);
//
//        target.add(9);
//
//        target.add(10);
//    }
}
