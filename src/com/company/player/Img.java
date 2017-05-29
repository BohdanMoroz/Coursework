package com.company.player;

import javax.swing.*;

public class Img {
    private static ImageIcon empty = new ImageIcon("images/1.png");
    private static ImageIcon dot = new ImageIcon("images/2.png");
    private static ImageIcon dead = new ImageIcon("images/3.png");
    private static ImageIcon green = new ImageIcon("images/4.png");
    private static ImageIcon red = new ImageIcon("images/5.png");

    public static ImageIcon getEmptyIcon() {
        return empty;
    }

    public static ImageIcon getDotIcon() {
        return dot;
    }

    public static ImageIcon getDeadIcon() {
        return dead;
    }

    public static ImageIcon getGreenIcon() {
        return green;
    }

    public static ImageIcon getRedIcon() {
        return red;
    }
}
