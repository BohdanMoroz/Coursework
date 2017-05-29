package com.company.computer;

public class PlanOfShipPosition {
    PlanOfShipPosition(){
        initBoard();
        com.company.computer.RandomGeneratorOfShipPosition randomGeneratorOfShipPosition = new com.company.computer.RandomGeneratorOfShipPosition(arr); //think about using object
        randomGeneratorOfShipPosition.makePlan();
    }

    public static String[][] arr; //think delete static*
    private void initBoard(){ //name
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
