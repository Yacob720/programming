import java.io.*; 
import java.util.*; 
public class FileTester
{
   public static void main(String args[]) throws IOException
   {
    Scanner sf = new Scanner(new File("C:\\Users\\jmcgowen\\Desktop\\temp_Jacob\\NerdData.IN"));
    int maxIndx = -1;
    String text[] = new String[1000]; 
    while(sf.hasNext( ))
    {
        maxIndx++;
        text[maxIndx] = sf.nextLine( ) ;
    }
    
    sf.close( ); 
    
     for(int j = 0; j <= maxIndx; j++)
    {
        String a = text[j];
        if(a.substring(0,3).equals("The"))
        {
            System.out.println(a);
        }
    }
  }
}