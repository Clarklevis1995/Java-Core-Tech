package com.interfaceTestAndOthers.InnerClass;

import javax.swing.*;

/**
 * @program: java-core-tech
 * @description
 * @author: ClarkLevis
 * @create: 2020-11-23 15:43
 **/
public class InnerClassTest2 {
    public static void main(String[] args) {
        var clock = new TalkingClock2();
        clock.start(1000, true);

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}
