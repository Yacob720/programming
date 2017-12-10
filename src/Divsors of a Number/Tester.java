import java.io.*; 
import java.util.*; 
import java.text.*;
public class Tester
{
    public static void main(String args[])throws IOException
    {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What is the number? ");
        int n = kbReader.nextInt();
        int d = 1;
      
        long startTime = System.currentTimeMillis( );
        do
        {
            if( n % d == 0 ) //test for divisibility by d
            {
                System.out.println(d + " ");
            }
            d = d + 1;
        }
        while( d < n / 2); // n / 2
        long endTime = System.currentTimeMillis( );
        long elapsedTime = endTime - startTime;
        System.out.println("Your algorithm took " + (elapsedTime)/1000.0 + " to run.");
    }
}