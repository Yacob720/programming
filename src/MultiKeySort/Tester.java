import java.io.*; //necessary for File and IOException
import java.util.*; //necessary for StringTokenizer and Scanner
import java.text.*; //necessary for NumberFormat
public class Tester
{ 
    public static void main( String args[] ) throws IOException
    {
        NumberFormat fmt = NumberFormat.getNumberInstance( );
        fmt.setMinimumFractionDigits(3); 
        fmt.setMaximumFractionDigits(3); 
        Scanner sf = new Scanner(new File("c:\\Users\\jmcgowen\\Desktop\\Name_ages.in"));   
        int maxIndx = -1; 
        String text[] = new String[1000]; 
        while(sf.hasNext( ))
        {
            maxIndx++;
            text[maxIndx] = sf.nextLine( );
            System.out.println(text[maxIndx]); //Remove rem for testing
        }      
         sf.close( );
         
        //sort(text);
        for (int j = 0; j < text.length; j++)
        {
            System.out.print(text[j] + " ");
        }
        System.out.println(" ");
    }
    
    public static void sort(int a[ ])
    {
        int min, minIndex;
        for(int i = 0;i < a.length; ++i)
        {
            min = a[i];
            minIndex = i;
            for (int j = i + 1; j < a.length; ++j) // Find minimum
            {
                if (a[j] < min) //salient feature
                {
                    min = a[j];
                    minIndex = j;
                }
            }
            a[minIndex] = a[i]; // swap
            a[i] = min;
        }
    }
}