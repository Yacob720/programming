import java.io.*;
import java.util.*;
public class StudentAverages
{
    public static void main(String args[]) throws IOException
    {
        Scanner x = new Scanner(new File("C:\\Users\\jmcgowen\\Desktop\\temp_Name\\StudentScores.in"));
        int maxIndx = -1;
        
        String text[] = new String[1000];
        
        while(x.hasNext())
        {
            maxIndx++;
            text[maxIndx] = x.nextLine();
        }
        x.close();
        
        String answer;
        double sum,i;
        for(int j =0; j <= maxIndx; j++)
        {
           //System.out.println(text[j]);
           Scanner s = new Scanner(text[j]);
           
           String name = s.next();
           sum = 0;
           i = 0;
           answer="";
           while(s.hasNext())
           {
                sum = sum + s.nextInt();
                i++;
            //System.out.println (sum);
           }
           sum = sum/i;   
           answer = name  + ", average = " + (Math.round(sum));
            
           System.out.println(answer);
        }
    }
}