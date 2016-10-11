package com.company;
import javax.swing.JOptionPane;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Skriv en mening med minst 2 ord och lämna ett mellanslag efter sista ordet:");
        Scanner in = new Scanner(System.in);

        String mening = JOptionPane.showInputDialog("");
        mening.trim();
        int sistaMellanslag = mening.lastIndexOf(" ");
        int förstaMellanslag = mening.indexOf(" ");
        String förstaOrd = mening.substring(0, förstaMellanslag);
        String sistaOrd = mening.substring(sistaMellanslag);
        int antaltecken = mening.length();

        int test;
        int test2;


        JOptionPane.showMessageDialog(null, "Du skrev en mening med " + antaltecken + " tecken.\nDet försts ordet var: " + förstaOrd + ".\nDet sista ordet var: " + sistaOrd);

    }
}
