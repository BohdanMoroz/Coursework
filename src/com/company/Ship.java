package com.company;

import java.util.Random;

import static com.company.Board.arr;

public class Ship {
    public int counter = 0;
    public Random random = new Random();
    public int i = 0;
    public int j = 0;
    public int indexOfShip = 1;

    public void build(){
        generatePosition();
        if(isAvailable())
            write();
    }

    public void write(){
        arr[i][j] = indexOfShip;
    }

    public void generatePosition(){
        i = random.nextInt(10);
        j = random.nextInt(10);
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




        if (arr[i-1][j-1] != 0) // left_top
            return false;

        if (arr[i-1][j+1] != 0) // right_top
            return false;

        if (arr[i+1][j-1] != 0) // left_bottom
            return false;

        if (arr[i+1][j+1] != 0) // right_bottom
            return false;


        return true;
    }
}
