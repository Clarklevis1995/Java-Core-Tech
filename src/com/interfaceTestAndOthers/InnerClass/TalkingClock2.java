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
 * @create: 2020-11-23 15:38
 **/
public class TalkingClock2 {
    public void start(int interval, boolean beep){
        var listener = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("At the tone, the time is: "+ Instant.ofEpochMilli(e.getWhen()));
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        var timer = new Timer(interval, listener);
        timer.start();
    }
}
