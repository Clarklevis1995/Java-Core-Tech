package com.interfaceTestAndOthers.InnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-23 17:05
 **/
public class TalkingClock3 {
    public void start(int interval, boolean beep){
        class TimePrinter implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("At this tone, the time is "+ Instant.ofEpochMilli(e.getWhen()));
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        }
        var listener = new TimePrinter();
        var timer = new Timer(1000,listener);
        timer.start();
        JOptionPane.showMessageDialog(null,"Quit this program?");
        System.exit(0);
    }

    public static void main(String[] args) {
        TalkingClock3 talkingClock3 = new TalkingClock3();
        talkingClock3.start(1000,true);
    }
}
