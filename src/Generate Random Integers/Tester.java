import java.io.*;
import java.util.*;
import java.util.Random.*;
public class Tester
{
    public static void main(String args[])
    {
        int r = 0, count = 0;
        Random rndm = new Random( );
        for(int j = 0; j < 133; j++) 
        {
            r = 71 + rndm.nextInt(29);
            System.out.println(r);

            count++;
            if(count >15) 
            {
                System.out.println(" ");
                count = 0;
            }
        }
    } 
}
