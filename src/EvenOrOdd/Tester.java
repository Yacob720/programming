import java.io.*;
import java.util.*;
public class Tester
{
    public static void main(String args[])
    {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int i = kbReader.nextInt();
        int x = (i%2);
        if (x ==0 )
        {
            System.out.println("The integer " + " " + i + " " + " is even.");
        }
        else
        {
            System.out.println("The integer " + " " + i + " " + " is odd.");
        }
    }    
}