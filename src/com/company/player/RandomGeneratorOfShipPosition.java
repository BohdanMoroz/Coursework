package com.company.player;

import java.util.Random;

public class RandomGeneratorOfShipPosition {
    private int counterOfFreeDeckSpace;
    private Random random = new Random();

    private int i;
    private int j;
    private int buf;

    private int indexOfShip = 1;
    private int orientationInt;

    private int firstDeckPosition;
    private int lastDeckPosition;
    String[][] arr;

    RandomGeneratorOfShipPosition(String[][] arr) {
        this.arr = arr;
    }

    public void makePlan() { //name
        insertShipInPlan(4);

        insertShipInPlan(3);
        insertShipInPlan(3);

        insertShipInPlan(2);
        insertShipInPlan(2);
        insertShipInPlan(2);

        insertShipInPlan(1);
        insertShipInPlan(1);
        insertShipInPlan(1);
        insertShipInPlan(1);
    }

    public void insertShipInPlan(int amountOfDeck){
        for(;;) {
            generatePositionOfFirstDeck();
            generateOrientationOfShip();
            if (isFreeSpace(amountOfDeck)) {
                setShip();
                return;
            }
        }
    }

    private void setShip() {
        for (buf = firstDeckPosition; buf <= lastDeckPosition; buf++) {
            setDeck();
        }
        indexOfShip++;
    }

    private void setDeck(){
        getOrientationOfShip();
        arr[i][j] = Integer.toString(indexOfShip);
    }

    private boolean isFreeSpace(int amountOfDeck) {
        resetCounterOfFreeDeckSpace();

        for (; buf < 10; buf++) {
            if (counterOfFreeDeckSpace == 1)
                firstDeckPosition = buf-1;
            if (counterOfFreeDeckSpace == amountOfDeck) {
                lastDeckPosition = buf-1;
                return true;
            }
            getOrientationOfShip();
            if(isAvailable()) {
                counterOfFreeDeckSpace++;
                continue; // ???
            }
            else {
                resetCounterOfFreeDeckSpace();
            }
        }
        return false;
    }

    private void resetCounterOfFreeDeckSpace() {
        counterOfFreeDeckSpace = 0;
    }


    private void generatePositionOfFirstDeck(){
        i = random.nextInt(10);
        j = random.nextInt(10);
    }

    //think to use enum
    //think about more diversity with counting of orientation
    private void generateOrientationOfShip() {
        orientationInt = random.nextInt(100);
        if(orientationInt < 50)
            buf = i;
        else
            buf = j;
    }

    private void getOrientationOfShip() {
        if(orientationInt < 50)
            i = buf;
        else
            j = buf;
    }

    private boolean isAvailable(){
        if (!arr[i][j].equals("0")) // dot
            return false;

        if ((j-1 >= 0) && (!arr[i][j-1].equals("0")) && (!arr[i][j-1].equals(Integer.toString(indexOfShip)))) // left
            return false;

        if ((j+1 <= 9) && (!arr[i][j+1].equals("0")) && (!arr[i][j+1].equals(Integer.toString(indexOfShip)))) // right
            return false;

        if ((i-1 >= 0) && (!arr[i-1][j].equals("0")) && (!arr[i-1][j].equals(Integer.toString(indexOfShip)))) // top
            return false;

        if ((i+1 <= 9) && (!arr[i+1][j].equals("0")) && (!arr[i+1][j].equals(Integer.toString(indexOfShip)))) // bottom
            return false;

        if ((i-1 >= 0) && (j-1 >= 0) && (!arr[i-1][j-1].equals("0"))) // left_top
            return false;

        if ((i-1 >= 0) && (j+1 <= 9) && (!arr[i-1][j+1].equals("0"))) // right_top
            return false;

        if ((i+1 <= 9) && (j-1 >= 0) && (!arr[i+1][j-1].equals("0"))) // left_bottom
            return false;

        if ((i+1 <= 9) && (j+1 <= 9) && (!arr[i+1][j+1].equals("0"))) // right_bottom
            return false;

        return true;
    }
}
