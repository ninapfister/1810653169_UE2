import javax.swing.*;

public class Aufgabe2_1810653169
{
    public static void main (String []args)
    {
        int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein"));
        int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine zweite Zahl ein"));
        int durchlauf = 0;

        if (zahl1==zahl2)
       {
           System.out.println(zahl1);
       }

        while (zahl1 != zahl2)
        {
            durchlauf++;

            if (zahl1 > zahl2)
            {
                zahl2++;
            }
            if (zahl2 > zahl1)
            {
                zahl1++;
            }
            if (zahl1 == zahl2)
            {
                System.out.println(zahl1);
                System.out.println("Es wurden " + durchlauf + " zusätzliche Schritte für das Ergebnis benötigt");
            }
        }
    }
}