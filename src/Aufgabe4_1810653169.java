public class Aufgabe4_1810653169
{
    public static void main (String[]args)
    {
        for(int i = 1; i < 11;i++)
        {
            System.out.println("Der Schleifenzähler ist: " + i);
        }

        int whilezähler = 1;

        while (whilezähler < 11)
        {
            System.out.println("Der Schleifenzähler ist: " + whilezähler);
            whilezähler++;
        }
        whilezähler = 1;

        do
        {
            System.out.println("Der Schleifenzähler ist: " + whilezähler);
            whilezähler++;
        }

        while(whilezähler < 11);
    }
}
