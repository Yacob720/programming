//import java.io.*;
import java.util.*;
//import java.util.Random.*;
public class Tester
{
    public static void main(String args[])
    {
        Random rndm = new Random( );
        double r; 
        int count = 0;
        for(int j = 0; j < 10027; j++) 
        {
            r = 99.78 + 47.44 * rndm.nextDouble();
            // Generates continuous floating point numbers in the range
            // 34.7838 < r < 187.056
            if (r <99.8)
            {System.out.println(r);}
        }
    }
}