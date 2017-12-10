import java.io.*;
import java.util.*;
public class Tester
{
       public static void main(String args[])
       {
           Scanner kbReader = new Scanner(System.in);
           System.out.print("Please enter your name?");
           String s = kbReader.nextLine();
           s= s.toLowerCase();
           for(int x = s.length() ; x >= 1 ; x--)
           {
               System.out.print(s.substring(x -1, x));
           }
        }
}