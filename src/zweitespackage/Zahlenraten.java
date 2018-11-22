package zweitespackage;

import javax.swing.*;
import java.util.Random;

public class Zahlenraten {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;

        Random rnd = new Random();
        int zufallszahl = rnd.nextInt(max - min + 1) + min;
        //einen Zufallswert im Zahlenbereich min-max



    /*if(zufallszahl%2==0) //Wenn die Zahl keinen Rest hat ist sie gerade
    {
        JOptionPane.showMessageDialog(null, "Dies ist eine gerade Zahl");
        JOptionPane.showMessageDialog(null, zufallszahl);
    }
    else{
        JOptionPane.showMessageDialog(null, "Dies ist eine ungerade Zahl");
        JOptionPane.showMessageDialog(null, zufallszahl);
    }*/


        //String zahl = JOptionPane.showInputDialog("Geben Sie eine Zahl zwischen 1 und 10 ein");
        //funktioniert so nicht weil ich Stringdatentypen nicht mit dem Integerdatentyp vergleichen kann

        int zahl = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl zwischen 1 und 10 ein"));
        //String Datentyp wird in Intgeger umgewandelt

        int ergebnis = zahl - zufallszahl;


        for (int i = 0; i < 3; i++) {
            if (zahl == zufallszahl) {
                JOptionPane.showMessageDialog(null, "Das ist die richtige Zahl");
                break;
            } else if (ergebnis <= 2 && ergebnis >= -2) {
                JOptionPane.showMessageDialog(null, "Du bist schon sehr nah dran");
                zahl = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl zwischen 1 und 10 ein"));
            } else {
                JOptionPane.showMessageDialog(null, "Das ist die falsche Zahl");
                zahl = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl zwischen 1 und 10 ein"));
            }

            if (i==2)
            {
                JOptionPane.showMessageDialog(null, "Du hast alle drei Versuche verkackt!");
            }

        }
    }
}
