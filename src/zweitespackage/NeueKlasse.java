package zweitespackage;

import javax.swing.*;
import java.util.Random;

public class NeueKlasse {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;

        Random rnd = new Random();
        int zz1 = rnd.nextInt(max - min + 1) + min;

        int i=0;


        /*while (i<3) {

            int z2 = Integer.parseInt(JOptionPane.showInputDialog("Gib eine Zahl zwischen 1 und 10 ein"));
            if (zz1 == z2) {
                 JOptionPane.showMessageDialog(null, "Du hast die Zahl erraten!");
                break;
            } else if ((zz1 - z2) <= 2 && (zz1 - z2) >= -2) {
                i++;
                JOptionPane.showMessageDialog(null, "Knapp daneben! \nDu bist deiner Zahl aber schon ziemlich nahe" +
                        "\ndu hast noch "+ (3-i) + " Versuche übrig");
                if (i>2) {
                    i++;
                    JOptionPane.showMessageDialog(null, "Loser! Du hast es nicht geschafft! \n Die richtige Zahl war: " + zz1);

                }
            } else {
                JOptionPane.showMessageDialog(null, "Das war leider nichts! \nDu hast noch "+ (3-i) + " Versuche übrig");
                i++;
                if (i>2)
                {
                    JOptionPane.showMessageDialog(null, "Loser! Du hast es leider nicht geschafft! \n Die richtige Zahl war: " + zz1);
                    break;
                }
            }
        }*/

        do
        {
            int z2 = Integer.parseInt(JOptionPane.showInputDialog("Gib eine Zahl zwischen 1 und 10 ein"));

            if (zz1 == z2) {
                JOptionPane.showMessageDialog(null, "Du hast die Zahl erraten!");
                break;
            } else if ((zz1 - z2) <= 2 && (zz1 - z2) >= -2) {
                i++;
                JOptionPane.showMessageDialog(null, "Knapp daneben! \nDu bist deiner Zahl aber schon ziemlich nahe" +
                        "\ndu hast noch "+ (3-i) + " Versuche übrig");
                if (i>2) {
                    i++;
                    JOptionPane.showMessageDialog(null, "Loser! Du hast es nicht geschafft! \n Die richtige Zahl war: " + zz1);

                }
            } else {
                JOptionPane.showMessageDialog(null, "Das war leider nichts! \nDu hast noch " + (3 - i) + " Versuche übrig");
                i++;
                if (i > 2) {
                    JOptionPane.showMessageDialog(null, "Loser! Du hast es leider nicht geschafft! \n Die richtige Zahl war: " + zz1);
                    break;
                }
            }
        }
        while (i<3);

    }
}
