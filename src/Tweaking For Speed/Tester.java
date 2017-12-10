import java.io.*; 
import java.util.*; 
import java.text.*;
public class Tester
{ 
    public static void main( String args[] ) throws IOException
    {
        int p = 386, q = 581, n = 0;
        System.out.println("Hello"); 
        for(int j=0; j<2000000000; j++)
        {
            //for(int k = 0; k < 1000; k++) //Use this extra loop for faster computers
            n = ((p * 2) + q)/2;
        }
        System.out.println(n); //When this line prints, stop timing the first loop and
        
        for(int j=0; j<2000000000; j++)
        {
            n = ((p * 2) + q) >>1; ; //..appropriate code for speed.. ;
        }
        System.out.println(n);
    }
}
