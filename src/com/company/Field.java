package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.company.Img.*;

public class Field {
    public int index;
    public JButton[] btn = new JButton[100];
    public static int bi = 0;
//    public ImageIcon ii = new ImageIcon();

    Field(int index){
        this.index = index;
        btn[bi] = new JButton(getEmpty());

//        makeBtn();
    }

    public JButton makeBtn(){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(index);
//                ii.;
                btn.setIcon(getGreen());
            }
        });
        return btn;
    }

    public void setImg(){
        btn.setIcon(getDot());
    }


}
