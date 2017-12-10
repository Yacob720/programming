public class MatrixMult
{
    public static int[][] multi (int a[][], int b[][])
    {  

        int c[][] = new int[a.length][b[0].length];
        //multiply a and b and return the result as c

        for(int row = 0; row < a.length; row++) //finds the length of a to be able to multiply 
        {
            for(int col = 0; col < b[0].length; col++)
            {
                int sum = 0;
                for(int x = 0; x <= a.length; x++)
                {
                    sum = sum + a[row][x] *b[x][col]; // multiply each element in one row in matrix a one column in matrix b
                }
                c[row][col]=sum;
            }
            // figure out how to put the sum into each colunm 
        }  
        return c; 
    }
}
