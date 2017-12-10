
import java.io.*;
import java.util.*;
public class tester
{ 
    public static void main (String args [])
    {
     Scanner kbReader = new Scanner(System.in);
     System.out.print("What is the area? ");
     double s = kbReader.nextDouble();
     double j = (Math.sqrt(s / Math.PI));
     System.out.println("Radius of your circle is" + " " + j + ".");
    }
}
