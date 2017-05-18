package com.company;

import java.util.Random;

import static com.company.Board.arr;

public class Ship_bcp_2 {
    String orientation;
    int i;
    int j;
    int j_begin;
    int i_begin;
    int counter;
    boolean isFound = false;
    Random random;


    public void chooseOrientation(){
        random = new Random();
        if (random.nextInt(2)==0)
            orientation = "HORIZONTAL";
        else orientation = "VERTICAL";
    }

    public void writeHorizontalShip(int fp, int sp, int number) {
        for (int j=fp;j<sp;j++)
            arr[i][j] = number;
    }

    public void writeVerticalShip(int fp, int sp, int number) {
        for (int i=fp;i<sp;i++)
            arr[i][j] = number;
    }

    public boolean isBorder(int arg){
        if ((arg-1 <= -1) || (arg+1 >= 10))
            return true;
        else return false;
    }

    public void resetCounter(){
        counter = 0;
    }

    public boolean isFreeRow(int arg1, int arg2){
        for (int p = -1; p <= 1; p++) {
            if (isBorder(arg2+p)) {
                continue;
            }
            if (arr[arg1][arg2+p] != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean ifFreeTop() {
        if (i-1 <= -1)
            return true;
        else return isFreeRow(i-1,j);
    }

    public boolean isFreeBottom() {
        if (i+1 >= 10)
            return true;
        else return isFreeRow(i+1,j);
    }

    public boolean isFreeCol(int arg1, int arg2){
        for (int p = -1; p <= 1; p++) {
            if (isBorder(arg1+p)) {
                continue;
            }
            if (arr[arg1+p][arg2] != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean ifFreeLeft() {
        if (j-1 <= -1)
            return true;
        else return isFreeCol(i,j-1);
    }

    public boolean isFreeRight() {
        if (j+1 >= 10)
            return true;
        else return isFreeCol(i,j+1);
    }


    public void findHorizontalPlace(int number) {
        counter = 0;
        random = new Random();
        i = random.nextInt(10);
        for (j = 0; j<10; j++) {
            if (counter == number) {
                System.out.println("yes!");
                writeHorizontalShip(j_begin, j, number);
                return;
            }

            if (isFreeRow(i, j) && ifFreeTop() && isFreeBottom()) {
                counter++;
                if (counter == 1)
                    j_begin = j;
            }
            else counter = 0;
        }
    }

    public void findVerticalPlace(int number) {
        counter = 0;
        random = new Random();
        j = random.nextInt(10);
        for (i = 0; i<10; i++) {
            if (counter == number) {
                System.out.println("yes!");
                writeVerticalShip(i_begin, i, number);
                return;
            }

            if (isFreeCol(i, j) && ifFreeLeft() && isFreeRight()) {
                counter++;
                if (counter == 1)
                    i_begin = i;
            }
            else counter = 0;

        }
    }

}
