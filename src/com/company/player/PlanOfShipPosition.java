package com.company.player;


public class PlanOfShipPosition {
    PlanOfShipPosition () {
        initBoard();
        com.company.player.RandomGeneratorOfShipPosition randomGeneratorOfShipPosition = new com.company.player.RandomGeneratorOfShipPosition(arr); //think about using object
        randomGeneratorOfShipPosition.makePlan();
    }

    public static String[][] arr; //think delete static*
    public void initBoard(){
        arr = new String[10][10];
        fillZero();
    }

    private void fillZero() {
        for (int i=0;i<10;i++)
            for (int j = 0; j < 10; j++){
                arr[i][j] = "0";
            }
    }
}
