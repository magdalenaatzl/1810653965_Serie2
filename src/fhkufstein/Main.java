package fhkufstein;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //einen String einlesen lassen
        String name = JOptionPane.showInputDialog("Namen eingeben");

        //einen Integer einlesen lassen
        int zahl = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein"));

        //Prüfung ob Volljährig
        int alter = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie Ihr Alter ein"));

        if (alter>=18)
        {
        JOptionPane.showMessageDialog(null, "Du bist Volljährig");

        }
        else {
        JOptionPane.showMessageDialog(null,"Du bist noch nicht Volljährig");
        }
    }
}
