package com.company.player;

import java.util.ArrayList;
import java.util.Random;

import static com.company.player.Board.arr;

public class Sailor {

    public static int i;
    public static int j;

    // --------------------------------------------------------
    public static ArrayList<Integer> target = new ArrayList<Integer>(20);
    // --------------------------------------------------------

    public static int indexOfShip = 0;


    // ---------------------------- test -------------------------------------
//    String[] str = new String[10];
//    int c = 0;
//    public void savePosition() {
//        str[c++] = "" + indexOfShip + "|    " + start_arg + "    " + end_arg + "    " + j + "              " + orientationInt;
//    }
//    public void showPosition() {
//        for (c = 0; c < 10; c++)
//            System.out.println(str[c]);
//    }
    // ---------------------------- test -------------------------------------




    public static boolean build(int number, int k, int l){
        getPosition(k,l);
        if (!target.isEmpty())
            indexOfShip = target.get(0);
        if (isAvailable() && !target.isEmpty()) {
            write();
            indexOfShip = target.get(0);
            target.remove(0);
            System.out.println(target);
            return true;
        } else {
            System.out.println(target);
            return false;
        }

    }

    public static void write(){
        arr[i][j] = indexOfShip;
    }


    public static void getPosition(int i2, int j2){ //think generatePosition() or getPosition() *
        i = i2;
        j = j2;
    }


    public static boolean isAvailable(){
        if (arr[i][j] != 0) // dot
            return false;

        if ((j-1 >= 0) && (arr[i][j-1] != 0) && (arr[i][j-1] != indexOfShip)) // left
            return false;

        if ((j+1 <= 9) && (arr[i][j+1] != 0) && (arr[i][j+1] != indexOfShip)) // right
            return false;

        if ((i-1 >= 0) && (arr[i-1][j] != 0) && (arr[i-1][j] != indexOfShip)) // top
            return false;

        if ((i+1 <= 9) && (arr[i+1][j] != 0) && (arr[i+1][j] != indexOfShip)) // bottom
            return false;

        if ((i-1 >= 0) && (j-1 >= 0) && (arr[i-1][j-1] != 0)) // left_top
            return false;

        if ((i-1 >= 0) && (j+1 <= 9) && (arr[i-1][j+1] != 0)) // right_top
            return false;

        if ((i+1 <= 9) && (j-1 >= 0) && (arr[i+1][j-1] != 0)) // left_bottom
            return false;

        if ((i+1 <= 9) && (j+1 <= 9) && (arr[i+1][j+1] != 0)) // right_bottom
            return false;

        return true;
    }

    public static void initTarget(){
        target.add(1);
        target.add(1);
        target.add(1);
        target.add(1);

        target.add(2);
        target.add(2);
        target.add(2);

        target.add(3);
        target.add(3);
        target.add(3);

        target.add(4);
        target.add(4);

        target.add(5);
        target.add(5);

        target.add(6);
        target.add(6);

        target.add(7);

        target.add(8);

        target.add(9);

        target.add(10);
    }
}
