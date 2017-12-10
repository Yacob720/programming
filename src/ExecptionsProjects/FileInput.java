import java.io.*;
import java.util.*;
import java.text.*;
public class FileInput
{
    public static void readTheFile(String fileName) throws IOException
    {
        Scanner sf = new Scanner(new File("c:\\users\\jmcgowen\\Desktop\\" + fileName));
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
            System.out.println(text[j]);
        }
    }
}