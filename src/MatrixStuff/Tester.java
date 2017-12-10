import java.io.*; 
import java.util.*; 
import java.text.*;
public class Tester
{
    public static void main(String args[])throws IOException
    {
        Scanner sf = new Scanner(new File("c:\\Users\\Jacob\\Desktop\\bluej\\MatrixData.in"));
        int maxIndx = -1;
        String text[] = new String[1000];
        while(sf.hasNext())
        {
            maxIndx++;
            text[maxIndx] = sf.nextLine( );
            //System.out.println(text[maxIndx]); //Remove rem for testing
        }
        sf.close( );

        int matr = 0;
        int nubRow = 0;
        int nubCol = 0;
        int aRow = 0; 
        int aCol =0; 
        for (int j = 0; j <= maxIndx; j++)
        {
            if(text[j].equals("matrix"))
            {  //matr =1, row = 3, col =4
                matr++; 
                if (matr==2)
                {
                    aRow = nubRow;
                    aCol = nubCol;
                }
                nubRow = 0;
            }
            else if(text[j].equals("row"))
            {
                nubRow++;
                nubCol = 0;
            }
            else
            {
                nubCol++;
            }
        }

        int a [][] = new int [aRow][aCol];
        int b [][] = new int [nubRow][nubCol];
        
        matr = 0;
        nubRow = -1;
        nubCol = -1;
        
        for (int j = 0; j <= maxIndx; j++)
        {
            if(text[j].equals("matrix"))
            {  //matr =1, row = 3, col =4
                matr++; 
                
                nubRow = -1;
            }
            else if(text[j].equals("row"))
            {
                nubRow++;
                nubCol = -1;

            }
            else
            {
                nubCol++;
                if(matr == 1)
                {
                    a[nubRow][nubCol] = Integer.parseInt(text[j]);
                }
               else if (matr == 2)
                {
                     b[nubRow][nubCol] = Integer.parseInt(text[j]);
                }
            }
        }
        int c[][];
        //new int [a.length][b[0].length];
         c = MatrixMult.multi(a,b);

        for (int row = 0; row < c.length; row++)
        {
            for(int col = 0; col < c[row].length; col++)

            {
                System.out.print(c[row][col] + "\t");
            }
            System.out.println(" ");
        }
    }
}
