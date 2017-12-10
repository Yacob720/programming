
import java.io.*; 
import java.util.*; 
public class AlphNames
{
    public static void main(String args[]) throws IOException
    {
        Scanner sf = new Scanner(new File("C:\\Users\\jmcgowen\\Desktop\\temp_Alphnames\\NumData.in"));
        int maxIndx = -1; 
        String text[] = new String[1000];
        while(sf.hasNext( ))
        {
            maxIndx++;
            text[maxIndx] = sf.nextLine( );
        }
        sf.close( );
        String answer = ""; 
        int sum; 
        for(int j =0; j <= maxIndx; j++)
        {
            Scanner sc = new Scanner(text[j]);
            sum = 0; 
            answer = ""; 
            while( sc.hasNext( ) ) 
            {
                int i = sc.nextInt( );
                answer = answer + " " + "+" + " " + i;
                sum = sum + i;
            }
            answer = answer + " = " + sum;
            System.out.println(answer.substring(3));
        }
    }
}