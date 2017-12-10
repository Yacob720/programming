import java.io.*; 
import java.util.*;
import java.text.*; 
public class Tester
{
    public static void main(String args[]) throws IOException
    {
        Map dict = new HashMap();

        NumberFormat fmt = NumberFormat.getNumberInstance( );
        fmt.setMinimumFractionDigits(3);
        fmt.setMaximumFractionDigits(3);
        Scanner sf = new Scanner(new File("C:\\Users\\Jacob\\Desktop\\Data.in"));   
        int maxIndx = -1;
        String text[] = new String[1000];
        while(sf.hasNext( ))
        {
            maxIndx++;
            text[maxIndx] = sf.nextLine( );
            System.out.println(text[maxIndx]);
        }      
        sf.close( );

        int numkeypairs = Integer.parseInt(text[0]);
        for(int j = 1; j <= numkeypairs; j++)
        {
            Scanner ir = new Scanner(text[j]);
            ir.useDelimiter("=");

            dict.put(ir.next(), ir.next());
        }

        Scanner cc = new Scanner(text[maxIndx]);
        String finish = "";
        do
        {
            String check = cc.next();
            if(dict.containsKey(check))
            {
                finish = finish + " " + dict.get(check);
            }
        }while(cc.hasNext());
        System.out.println(finish);
    }
}