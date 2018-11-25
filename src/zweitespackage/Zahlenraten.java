package zweitespackage;

import jdk.nashorn.internal.scripts.JO;

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

        JOptionPane.showMessageDialog(null, "Kannst du meine Zahl erraten? Du hast 3 Versuche");

        for(int i=0; i<3; i++)
        {
            int zahl = Integer.parseInt(JOptionPane.showInputDialog("Gib eine Zahl zwischen 1 und 10 ein"));
            if (zufallszahl == zahl) {
                if(i==0){
                    JOptionPane.showMessageDialog(null, "Wahnsinn! Du hast es gleich beim ersten Versuch erraten!");}
                if(i==1){
                    JOptionPane.showMessageDialog(null, "Gratuliere! Du hast die Zahl beim zweiten Mal erraten");}
                if (i==2){
                    JOptionPane.showMessageDialog(null, "Puh das war knapp!\n aber du hast es beim letzten Versuch geschafft!");
                }
                break;
            } else if ((zufallszahl - zahl) <= 2 && (zufallszahl - zahl) >= -2) {
                JOptionPane.showMessageDialog(null, "Knapp daneben! \nDu bist deiner Zahl aber schon ziemlich nahe");
                if(i==2){
                    JOptionPane.showMessageDialog(null, "Loser! Du hast es nicht geschafft! \n Die richtige Zahl war: " +zufallszahl);
             }
    }
            else {
        JOptionPane.showMessageDialog(null, "Das war leider nichts");
        if(i==2){
            JOptionPane.showMessageDialog(null, "Loser! Du hast es leider nicht geschafft! \n Die richtige Zahl war: " +zufallszahl);
        }
    }


}






    }
}
