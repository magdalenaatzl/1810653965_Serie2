package zweitespackage;

import java.util.Random;

public class Zahlenraten {
    public static void main(String[] args)
    {
    int min = 1;
    int max = 10;

    Random rnd = new Random();
    int zufallszahl = rnd.nextInt(max-min+1)+min;
    //einen Zufallswert im Zahlenbereich min-max

    System.out.println(zufallszahl); //Ausgabe der Zufallszahl

    if(zufallszahl%2==0) //Wenn die Zahl keinen Rest hat ist sie gerade
    {
        System.out.println("Dies ist eine gerade Zahl");
    }
    else{
        System.out.println("Dies ist eine ungerade Zahl");
    }

    }
}
