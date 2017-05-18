package com.company;

import java.util.Random;

import static com.company.Board.arr;

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
        if (arr[i][j] == 1) {
            for (int c1=i-2;c1<i;c1++) {
                for (int c2=j-1;c2<=j+1;c2++) {
                    if (arr[c1][c2]==0)
                        continue;
                    else {
                        System.out.println("Err");
                        return;
                    }
                }
            }
            j--;
            arr[i][j] = 1;
        }
    }


    public void findPlace() {
        Random random = new Random();
        i = random.nextInt(10);
        j = random.nextInt(10);

        if (arr[i][j] == 0) {
            for (int c1=i-1;c1<=i+1;c1++) {
                for (int c2=j-1;c2<=j+1;c2++) {
                    if (arr[c1][c2]==0)
                        continue;
                    else {
                        System.out.println("Err");
                        return;
                    }
                }
            }
            arr[i][j] = 1;
        }

    }
}
