package com.interfaceTestAndOthers.InnerClass;

import javax.swing.*;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-23 11:15
 **/
public class InnerClassTest {
    public static void main(String[] args) {
        var clock = new TalkingClock(1000, true);
        clock.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}
