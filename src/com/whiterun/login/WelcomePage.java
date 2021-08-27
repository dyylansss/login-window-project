package com.whiterun.login;

import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Welcome");

    WelcomePage(String userID){

        welcomeLabel.setBounds(0,0,500,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN, 25));
        welcomeLabel.setText("Welcome, "+ userID + "!");

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(520, 520);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
