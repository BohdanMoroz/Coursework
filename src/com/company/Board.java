package com.company;

public class Board {
    public static int[][] arr;
    Board(){
        arr = new int[10][10];

        for (int i=0;i<10;i++)
            for (int j = 0; j < 10; j++){
                    arr[i][j] = 0;
            }

    }

    public void showBoard(){
        for (int i=0;i<10;i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
