package com.company.computer;

import java.util.Random;

public class Ship_bcp {
    public String way;
    public int i;
    public int j;

    public void choseWay() {
        Random random = new Random();
//        System.out.println(random.nextInt(4)+1);
//        switch (random.nextInt(4)+1){ //enum
//            case 1: {
//                way = "left";
//                break;
//            }
//            case 2: {
//                way = "right";
//                break;
//            }
//            case 3: {
//                way = "up";
//                break;
//            }
//            case 4: {
//                way = "down";
//                break;
//            }
//        }
//        return way;
        switch (random.nextInt(4)+1){

        }
    }

    public void findLeft(){
        if (Board.arr[i][j] == 1) {
            for (int c1=i-2;c1<i;c1++) {
                for (int c2=j-1;c2<=j+1;c2++) {
                    if (Board.arr[c1][c2]==0)
                        continue;
                    else {
                        System.out.println("Err");
                        return;
                    }
                }
            }
            j--;
            Board.arr[i][j] = 1;
        }
    }


    public void findPlace() {
        Random random = new Random();
        i = random.nextInt(10);
        j = random.nextInt(10);

        if (Board.arr[i][j] == 0) {
            for (int c1=i-1;c1<=i+1;c1++) {
                for (int c2=j-1;c2<=j+1;c2++) {
                    if (Board.arr[c1][c2]==0)
                        continue;
                    else {
                        System.out.println("Err");
                        return;
                    }
                }
            }
            Board.arr[i][j] = 1;
        }

    }
}
