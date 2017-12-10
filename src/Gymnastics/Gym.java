import java.io.*; 
import java.util.*; 
import java.text.*;
public class Gym
{
    public static void main( String args[] ) throws IOException
    {
    NumberFormat fmt = NumberFormat.getNumberInstance( );
    fmt.setMinimumFractionDigits(4); 
    fmt.setMaximumFractionDigits(4); 
  
    Scanner sf = new Scanner(new File("c:\\Users\\jmcgowen\\Desktop\\temp_Jacob\\DataGym.in"));
    int maxIndx = -1; 
    String text[] = new String[1000]; 
    while(sf.hasNext())
    {
        maxIndx++;
        text[maxIndx] = sf.nextLine( );
        //System.out.println(text[maxIndx]); //Remove rem for testing
    }
    sf.close( ); 
    //System.exit(0);
    for (int j = 0; j <= maxIndx; j++)
    {      
      Scanner sc = new Scanner(text[j]);
      
      double x[] = new double[10];
      double sum = 0;
      
      for(int i = 0; i < 10; i++)
      {
          x[i] = sc.nextDouble();
          sum = sum + x[i];
      }
      Arrays.sort(x);
      sum = sum - x[0] - x[9];
      String ave = fmt.format(sum/8);
      System.out.println("For Competitor #" +(j+1) + ", the average is " + ave);
      
    }
  }
}