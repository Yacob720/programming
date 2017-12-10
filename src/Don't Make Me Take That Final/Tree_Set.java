import java.io.*; 
import java.util.*;
import java.text.*; 
public class Tree_Set
{
    public static void main(String args[]) throws IOException
    {
        Set t1 = new TreeSet( ); 

        NumberFormat fmt = NumberFormat.getNumberInstance( );
        fmt.setMinimumFractionDigits(3);
        fmt.setMaximumFractionDigits(3);
        Scanner sf = new Scanner(new File("C:\\Users\\jmcgowen\\Desktop\\School_Work.in"));   
        int maxIndx = -1;
        String text[] = new String[1000];
        while(sf.hasNext( ))
        {
            maxIndx++;
            text[maxIndx] = sf.nextLine( );
            //System.out.println(text[maxIndx]);
        }      
        sf.close( );

        Scanner ar = new Scanner(text[0]);

        int class_scores = ar.nextInt();
        int det_nums = ar.nextInt();

        for (int i = 1; i < class_scores; i++)
        {   ar = new Scanner (text[i]);
            String name = ar.next();
            String subject = ar.next();
            int score = ar.nextInt();
            if(score >= 89)
            {
                t1.add(name);
            }
            else
            {
                t1.remove(name);
            }
        }
        // loop Name	    : for loop
        // start		    : 1
        // stepping     	: text[]
        // Description		: takes the number of the class_scores. grabs the name skips the subject 
        // Decription...    : and grabs the int. Checks to see each score is 89 or higher and adds
        // Description...   : the name to the set. If the scores are below 89 it removes the name
        
        for(int j = class_scores + 1; j <= class_scores + det_nums; j++)
        {
            ar = new Scanner (text[j]);
            String name = ar.next();
            t1.remove(name);
        }

        Iterator iter1 = t1.iterator();
        while(iter1.hasNext())
        {
            System.out.println(iter1.next());
        }
    }
}