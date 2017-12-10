import java.util.*;
import java.io.*;
public class Tester
{
    public static void main(String args[])
    {
        String xx[] = {"DELL", "HELP", "ALSO", "BEAR", "BACK", "IPAD", "IPOD", "AGRO"};
        Arrays.sort(xx);
        for(int j = 0; j < xx.length; j++)
        {
            System.out.print(xx[xx.length -1 -j] + " ");
        }
        
    }
}