package com.interfaceTestAndOthers.InnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.time.Instant;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-23 11:10
 **/
public class TalkingClock {
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }


    /**
     * start the clock
     */
    public void start(){
        var listener = new TimePrinter();
        var timer = new Timer(interval, listener);
        timer.start();
    }

    public class TimePrinter implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone, the time is: "+ Instant.ofEpochMilli(e.getWhen()));
            if (beep){
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}
