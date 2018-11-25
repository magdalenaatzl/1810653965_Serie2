package zweitespackage;

import javax.swing.*;
import java.util.Random;

public class Zahlenraten {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;

        Random rnd = new Random();
        int zufallszahl = rnd.nextInt(max-min+1)+min;

        if (zufallszahl%2==0)
        {
            JOptionPane.showMessageDialog(null,  zufallszahl +" = gerade");
        }
        else {
            JOptionPane.showMessageDialog(null, zufallszahl + " = ungerade");
        }
    }
}
