import javax.swing.*;

public class Aufgabe3_1810653169
{
    public static void main (String []args)
    {
        String eingabe = JOptionPane.showInputDialog("Geben Sie das Alter ein!");
        double alter = Double.parseDouble(eingabe);
        JOptionPane.showMessageDialog(null, alter);

        int intalter = Integer.parseInt(eingabe);
        JOptionPane.showMessageDialog(null, intalter);

        boolean boolalter = Boolean.parseBoolean(eingabe);
        JOptionPane.showMessageDialog(null, boolalter);

        long longalter = Long.parseLong(eingabe);
        JOptionPane.showMessageDialog(null, longalter);

        char charalter = eingabe.charAt(0);
        JOptionPane.showMessageDialog(null, charalter);

        byte alteer = Byte.parseByte(eingabe);
        JOptionPane.showMessageDialog(null, alteer);

        short shortalter = Short.parseShort(eingabe);
        JOptionPane.showMessageDialog(null, shortalter);

        float floatalter = Float.parseFloat(eingabe);
        JOptionPane.showMessageDialog(null, floatalter);

        String newvar = String.valueOf(alter);
        JOptionPane.showMessageDialog(null, newvar);
    }
}
