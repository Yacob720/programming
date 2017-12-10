
import java.io.*;
import java.util.*;
public class Tester
{
    public static void main(String args[])
    {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Enter the A value for the line:");
        DistToLine.A = kbReader.nextDouble();
        
        System.out.print("Enter the B value for the line:");
        DistToLine.B = kbReader.nextDouble();
        
        System.out.print("Enter the C value for the line:");
        DistToLine.C = kbReader.nextDouble();
        
        System.out.print("Enter the x coordinate of the point:");
        double a = kbReader.nextDouble();
        
        System.out.print("Enter the y coordinate of the point:");
        double b  = kbReader.nextDouble();
        
        System.out.println("\nDistance from the point to the line is: " + DistToLine.getDist(a,b));
    }
}
