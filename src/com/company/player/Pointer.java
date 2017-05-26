package com.company.player;

//import com.company.computer.PlayerArea;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Pointer {

    public static int i;
    public static int j;
    public static String coordinate;
//    public static ArrayList<Integer> enBtn = new ArrayList<>();
//    public static void initEnableBtn() {
//        for (int j=0; j<100; j++)
//            enBtn.add(j); //think ??? outboxing
//    }

    Pointer() {

    }




    public void getCoordinate(int index){
        coordinate = Integer.toString(index);
        if (coordinate.length() == 1) {
            i = 0;
            j = Integer.parseInt(coordinate);
        }
        else {
            i = Integer.parseInt(coordinate.substring(0,1));
            j = Integer.parseInt(coordinate.substring(1,2));
        }
    }

    public void makeClickable(JButton currentSectorBtn, int indexOfCurrentSector, PlayerArea playerArea){ //think about param, if they are similar (duplicate)?
        currentSectorBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    getCoordinate(indexOfCurrentSector);
                    if (arr[i][j] == 0) {
                        if (build(3, i, j))

                        currentSectorBtn.setIcon(Img.getGreen());
//                        arr[i][j] = 1;

//                        Sailor.getPosition(i,j);

//                        showBoard();

//                        numberOfTarget.remove(Integer.valueOf(Board.arr[i][j]));
//                        enBtn.remove(Integer.valueOf(index));
//                        System.out.println(numberOfTarget);
                    }
//                    Test.rePaint(numberOfTarget);
            }
        });
    }

    public boolean build(int number, int k, int l){
        getPosition(k,l);
        if (!numberOfTarget.isEmpty())
            indexOfShip = numberOfTarget.get(0);
        if (isAvailable() && !numberOfTarget.isEmpty()) {
            wrie();
            indexOfShip = numberOfTarget.get(0);
            numberOfTarget.remove(0);
            System.out.println(numberOfTarget);
            return true;
        } else {
            System.out.println(numberOfTarget);
            return false;
        }

    }

    public static void getPosition(int i2, int j2){ //think generatePosition() or getPosition() *
        i = i2;
        j = j2;
    }

    private ArrayList<Integer> numberOfTarget = new ArrayList<Integer>(20);
    private void initTarget(){
        addTarget(4, 1);
        addTarget(3, 2);
        addTarget(3, 3);
        addTarget(2, 4);
        addTarget(2, 5);
        addTarget(2, 6);
        addTarget(1, 7);
        addTarget(1, 8);
        addTarget(1, 9);
        addTarget(1, 10);
    }

    private void addTarget(int numberOfDeck, int indexOfShip) {
        for (int z = 0; z<numberOfDeck; z++)
            numberOfTarget.add(indexOfShip);
    }

    public static boolean isAvailable(){
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
