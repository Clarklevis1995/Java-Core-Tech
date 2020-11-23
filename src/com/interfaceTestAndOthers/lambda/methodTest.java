package com.interfaceTestAndOthers.lambda;

import javax.swing.*;
import java.util.Date;

public class methodTest {
    public static void main(String[] args) {
        var timer = new Timer(1000, System.out::println);
        timer.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}
