package com.company.player;

public class PlanOfShipPosition {
//    private static int i; //think static*
//    private static int j;
//    private static int indexOfShip = 1;

    PlanOfShipPosition () {
        initBoard();
    }

    public static int[][] arr; //think delete static*
    public void initBoard(){
        arr = new int[10][10];
        fillZero();
    }

    private void fillZero() {
        for (int i=0;i<10;i++)
            for (int j = 0; j < 10; j++){
                arr[i][j] = 0;
            }
    }

//    public static void showBoard(){
//        for (int i=0;i<10;i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print(arr[i][j] + "  ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }

//    public void setDeck(){
//        arr[i][j] = indexOfShip;
//    }

//    public boolean build(int number, int k, int l){
////        getPosition(k,l);
//        if (!target.isEmpty())
//            indexOfShip = target.get(0);
//        if (isAvailable() && !target.isEmpty()) {
//            setDeck();
//            indexOfShip = target.get(0);
//            target.remove(0);
//            System.out.println(target);
//            return true;
//        } else {
//            System.out.println(target);
//            return false;
//        }
//
//    }

//    public static boolean isAvailable(){
//        if (arr[i][j] != 0) // dot
//            return false;
//
//        if ((j-1 >= 0) && (arr[i][j-1] != 0) && (arr[i][j-1] != indexOfShip)) // left
//            return false;
//
//        if ((j+1 <= 9) && (arr[i][j+1] != 0) && (arr[i][j+1] != indexOfShip)) // right
//            return false;
//
//        if ((i-1 >= 0) && (arr[i-1][j] != 0) && (arr[i-1][j] != indexOfShip)) // top
//            return false;
//
//        if ((i+1 <= 9) && (arr[i+1][j] != 0) && (arr[i+1][j] != indexOfShip)) // bottom
//            return false;
//
//        if ((i-1 >= 0) && (j-1 >= 0) && (arr[i-1][j-1] != 0)) // left_top
//            return false;
//
//        if ((i-1 >= 0) && (j+1 <= 9) && (arr[i-1][j+1] != 0)) // right_top
//            return false;
//
//        if ((i+1 <= 9) && (j-1 >= 0) && (arr[i+1][j-1] != 0)) // left_bottom
//            return false;
//
//        if ((i+1 <= 9) && (j+1 <= 9) && (arr[i+1][j+1] != 0)) // right_bottom
//            return false;
//
//        return true;
//    }

}
