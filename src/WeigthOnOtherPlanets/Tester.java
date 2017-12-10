import java.io.*;
import java.util.*;
public class Tester
{
    public static void main(String args[])
    {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What is your weight on Earth?");
        int d = kbReader.nextInt();
        System.out.println("1. Voltar");
        System.out.println("2. Krypton");
        System.out.println("3. Fertos");
        System.out.println("4. Servontos");
        System.out.print("Selection?");
        int s = kbReader.nextInt();
        switch(s)
        {
            case 1://voltar
                System.out.println("Your weight on Voltar would be" + " " + (d * 0.091));
                break;
            case 2://Krypton
                System.out.println("Your weight on Krypton would be" + " " + (d * 0.720));
                break;
            case 3://Fertos
                System.out.println("Your weight on Fertos would be" + " " + (d * 0.865));
                break;
            case 4://Servontos
                System.out.println("Your weight on Servontos would be" + " " + (d *4.612));
                break;
            default:
                System.out.println("Hey dummy, only enter a 1,2,3, or 4!");
        }
    }
}
