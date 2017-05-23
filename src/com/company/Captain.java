package com.company;

import java.util.Random;

import static com.company.Board.arr;

public class Captain {
    public int counter = 0;
    public Random random = new Random();

    public int i;
    public int j;
    public int buf;

    public int indexOfShip = 1;
    public int orientationInt;

    public int start_arg;
    public int end_arg;





    String[] str = new String[10];
    int c = 0;
    public void savePosition() {
        str[c++] = "" + indexOfShip + "|    " + start_arg + "    " + end_arg + "    " + j + "              " + orientationInt;
    }
    public void showPosition() {
        for (c = 0; c < 10; c++)
            System.out.println(str[c]);
    }





    public void build(int number){
        for(;;) {
            generatePosition();
            generateOrientation();
            if (discoverSpace(number)) {
                savePosition();
                fillSpace();
                break; // return
            }
        }
    }

    public void fillSpace() {
        for (buf = start_arg; buf <= end_arg; buf++) {
            write();
        }
        indexOfShip++;
    }

    public void write(){
        getOrientation();
        arr[i][j] = indexOfShip;
    }

    public boolean discoverSpace(int number) {
        counter = 0;

        for (; buf < 10; buf++) {
            if (counter == 1)
                start_arg = buf-1;
            if (counter == number) {
                end_arg = buf-1;
                return true;
            }
            getOrientation();
            if(isAvailable()) {
                counter++;
                continue; // ???
            }
            else {
                counter = 0;
            }
        }
        return false;
    }


    public void generatePosition(){
        i = random.nextInt(10);
        j = random.nextInt(10);
    }

    //think to use enum
    //think about more diversity with counting of orientation
    public void generateOrientation() {
        orientationInt = random.nextInt(100);
        if(orientationInt < 50)
            buf = i;
        else
            buf = j;
    }

    public void getOrientation() {
        if(orientationInt < 50)
            i = buf;
        else
            j = buf;
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
}
