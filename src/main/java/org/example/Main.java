package org.example;

import java.util.Scanner;
import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        Inventory tempInventory = new Inventory(10);
        
        
        SystemGUI frame = new SystemGUI(tempInventory);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        System.out.println("exiting....");
    }
}