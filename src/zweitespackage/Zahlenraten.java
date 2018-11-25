package zweitespackage;

import javax.swing.*;
import java.util.Random;

public class Zahlenraten {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;

        Random rnd = new Random();
        int zufallszahl = rnd.nextInt(max-min+1)+min;

        /*if (zufallszahl%2==0)
        {
            JOptionPane.showMessageDialog(null,  zufallszahl +" = gerade");
        }
        else {
            JOptionPane.showMessageDialog(null, zufallszahl + " = ungerade");
        }*/

//      String zahl = JOptionPane.showInputDialog("Geben Sie eine Zahl ein");
        /*funktioniert nicht, da mit einem String keine Zahlen verglichen werden können
        muss mit dem "Integer.parseInt" in einen Integer Wert umgewandelt werden
        */

        int zahl = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein"));

        if(zufallszahl==zahl)
        {
            JOptionPane.showMessageDialog(null, "Das war die richtige Zahl");
        }
        else if ((zufallszahl-zahl)<=2 &&(zufallszahl-zahl)>=-2)
        {
            JOptionPane.showMessageDialog(null, "Knapp daneben!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Das war leider nichts");
        }




    }
}
