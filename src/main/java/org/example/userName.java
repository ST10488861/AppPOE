package org.example;

import javax.swing.*;
import java.util.Scanner;

public class userName {
    public static void userName() {
        Scanner myScanner = new Scanner(System.in);
        String userName;
        userName = JOptionPane.showInputDialog("Enter your username: ");
        userName = myScanner.nextLine();

        boolean isUserName;
        isUserName = userName.contains("_");

        boolean isUsername;
        isUsername = userName.length() <= 5;
        if (userName.length() > 5 && userName.contains("_")) {
            isUserName = true;
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is incorrect.");
        }
        myScanner.close();
    }
}
