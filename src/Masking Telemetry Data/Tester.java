import java.io.*; 
import java.util.*; 
import java.text.*; 
public class Tester
{ 
    public static void main( String args[] ) throws IOException
    {
        NumberFormat fmt = NumberFormat.getNumberInstance( );
        fmt.setMinimumFractionDigits(3); 
        fmt.setMaximumFractionDigits(3); 
        Scanner sf = new Scanner(new File("C:\\Users\\jmcgowen\\Desktop\\BitWise\\Switches.in"));   
        int maxIndx = -1; 
        String text[] = new String[1000]; 
        while(sf.hasNext( ))
        {
            maxIndx++;
            text[maxIndx] = sf.nextLine( );
        }      
        sf.close( ); 

        for (int j = 0; j <= maxIndx; j++)
        {
            int i = Integer.parseInt(text[j]);
            String x = Integer.toBinaryString(i);
            int y = 8 - x.length();
            for( y = y ; y > 0; y--)
            {
                x = "0" + x;
            }
            //System.out.println(x);
            int tel = 56;
            System.out.println("Switch status for data value " + text[j] + ":");
            for (int p = 7; p >= 0; p--)
            {    
                if(x.charAt(p)==('1'))
                {
                    System.out.println("  Switch sw" +(tel) + " is " + "\"on\"");
                } 

                else
                {
                    System.out.println("  Switch sw" + (tel) + " is " +  "\"off\"");
                }
                tel++;
            }
            System.out.println("  ");
        }
    }
}