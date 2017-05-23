package com.company.player;

import javax.swing.*;

public class Img {
    public static ImageIcon empty = new ImageIcon("images/1.png");
    public static ImageIcon dot = new ImageIcon("images/2.png");
    public static ImageIcon dead = new ImageIcon("images/3.png");
    public static ImageIcon green = new ImageIcon("images/4.png");
    public static ImageIcon red = new ImageIcon("images/5.png");

    public static ImageIcon getEmpty() {
        return empty;
    }

    public static ImageIcon getDot() {
        return dot;
    }

    public static ImageIcon getDead() {
        return dead;
    }

    public static ImageIcon getGreen() {
        return green;
    }

    public static ImageIcon getRed() {
        return red;
    }
}