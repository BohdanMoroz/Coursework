package com.company;

import java.util.Random;

import static com.company.Board.arr;

public class Ship {
    public int counter = 0;
    public Random random = new Random();
    public int i = 0;
    public int j = 0;
    public int indexOfShip = 1;
    public int orientationInt;

    public int origin_arg;
    public int start_arg;
    public int end_arg;





    String[] str = new String[10];
    int c = 0;
    public void savePosition() {
        str[c++] = "" + start_arg + "    " + end_arg + "    " + j;
    }
    public void showPosition() {
        for (c = 0; c < 10; c++)
            System.out.println(str[c]);
    }





    public void build(int number){
        for(;;) {
            generatePosition();
//            generateOrientation();
            if (discoverSpace(number)) {
                savePosition();
                fillSpace();
                break; // return
            }
        }
    }

    public void fillSpace() {
        for (i = start_arg; i <= end_arg; i++) {
            write();
        }
        indexOfShip++;
    }

    public boolean discoverSpace(int number) {
        counter = 0;
        origin_arg = i; // ??? *
        for (; i < 10; i++) {
            if (counter == 1)
                start_arg = i-1;
            if (counter == number) {
                end_arg = i-1;
                return true;
            }
            if(isAvailable()) {
                counter++;
                continue;
            }
            else {
                counter = 0;
            }
        }
        return false;
    }

    public void write(){
        arr[i][j] = indexOfShip;
    }

    public void generatePosition(){
        i = random.nextInt(10);
        j = random.nextInt(10);
    }

    public void generateOrientation() { // enum
        orientationInt = random.nextInt(2);
    }

    public boolean isAvailable(){
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


        // ???
        // -----------------------------------------------------------------------------------------------------------
        if ((i-1 >= 0) && (j-1 >= 0) && (arr[i-1][j-1] != 0)) // left_top
            return false;

        if ((i-1 >= 0) && (j+1 <= 9) && (arr[i-1][j+1] != 0)) // right_top
            return false;

        if ((i+1 <= 9) && (j-1 >= 0) && (arr[i+1][j-1] != 0)) // left_bottom
            return false;

        if ((i+1 <= 9) && (j+1 <= 9) && (arr[i+1][j+1] != 0)) // right_bottom
            return false;

        // -----------------------------------------------------------------------------------------------------------
        return true;
    }
}
