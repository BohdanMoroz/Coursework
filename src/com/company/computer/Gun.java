package com.company.computer;

import com.company.computer.EnemyArea;
import com.company.player.Fire;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static com.company.computer.Img.*;
import static com.company.computer.PlanOfShipPosition.arr;

public class Gun {

    private int i;
    private int j;
    private String coordinate;

    private ArrayList<Integer> numberOfEmptySector = new ArrayList<>();

    private void initEnableBtn() {
        for (int j=0; j<100; j++)
            numberOfEmptySector.add(j); //think ??? outboxing
    }

    Gun() {
        initTarget();
        initEnableBtn();
    }

    Fire fire = new Fire();
    public void makeClickable(JButton currentSectorBtn, int indexOfCurrentSector, EnemyArea enemyArea
    ){
        currentSectorBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOfEmptySector.contains(indexOfCurrentSector)) {
                    setCoordinate(indexOfCurrentSector);
                    if (isDeck()) { //think ternar*
                        destroyDeck(currentSectorBtn, indexOfCurrentSector);
                    } else {
                        past(currentSectorBtn);
                    }
                    repaint(enemyArea);
                }
                if (numberOfTarget.isEmpty()) {
                    System.out.println("Win!"); //think make better end of the game
                }
                fire.zzz();
            }
        });
    }

    private void past(JButton currentSectorBtn) {
        currentSectorBtn.setIcon(getDotIcon());
    }

    private void destroyDeck(JButton currentSectorBtn, int indexOfCurrentSector){
        currentSectorBtn.setIcon(getRedIcon());
        numberOfTarget.remove(Integer.valueOf(arr[i][j]));
        arr[i][j] = arr[i][j] + "d";
        numberOfEmptySector.remove(Integer.valueOf(indexOfCurrentSector)); //indexOfCurrentSector
//        System.out.println(numberOfTarget);
    }

    private boolean isDeck(){
        if (!arr[i][j].equals("0") && !arr[i][j].equals(arr[i][j]+"d")) {
            return true;
        }
        else return false;
    }

    private void markDestroyedShip(EnemyArea enemyArea, int potentialTarget) {
        for (i=0; i<10; i++) {
            for (j=0; j<10; j++){
                if (arr[i][j].equals(Integer.toString(potentialTarget) + "d")) {
                    enemyArea.getSector(getIndex(i,j)).setIcon(getDeadIcon());
                }
            }
        }
    }

    private void repaint(EnemyArea enemyArea){
        for (int potentialTarget = 1; potentialTarget <= 10; potentialTarget++) {
            if (!numberOfTarget.contains(potentialTarget)) {
                markDestroyedShip(enemyArea, potentialTarget);
            }
        }
    }

    private int getIndex(int i, int j) {
        return Integer.parseInt("" + i + j);
    }

    private void setCoordinate(int indexOfCurrentSector){
        coordinate = Integer.toString(indexOfCurrentSector);
        if (coordinate.length() == 1) {
            i = 0;
            j = Integer.parseInt(coordinate);
        }
        else {
            i = Integer.parseInt(coordinate.substring(0,1));
            j = Integer.parseInt(coordinate.substring(1,2));
        }
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
}
