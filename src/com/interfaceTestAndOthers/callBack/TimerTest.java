package com.interfaceTestAndOthers.callBack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class TimerTest {
    public static void main(String[] args) {
        var listener = new TimerPrinter();

        //构建一个计时器对象，传入监听器对象（实现了监听器的类）
        var timer = new Timer(1000,listener);
        timer.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);

    }
}

class TimerPrinter implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone, the time is "+ Instant.ofEpochMilli(e.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}
