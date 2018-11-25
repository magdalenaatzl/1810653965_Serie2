package fhkufstein;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Aufgabe1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Namen eingeben");
        //einlesen eines Textes --> immer String

        int alter = Integer.parseInt(JOptionPane.showInputDialog("Alter eingeben"));
        //Integer.parseInt wandelt einen String in einen Integer-Wert um

        if (alter >=18) // Bedingung
        {
            JOptionPane.showMessageDialog(null, "Du bist Volljähring");
            //Ausgabe eines Dialogfensters
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Du bist noch nicht volljährig");
            //Ausgabe eines Dialogfensters
        }
    }
}
