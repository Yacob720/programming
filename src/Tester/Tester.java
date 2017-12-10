/*Author: Jacob McGowen
Date: August 17, 2015
School: Grand Island Senior High*/

public class Tester//Program by Jacob McGowen
{
    public static void main(String args[])
    {
        int [][] matrix = new int [4][8];
        for(int row=0; row<matrix.length; row++)
        {
            for (int column=0; column<matrix[row].length; column++)
            {
                matrix[row][column]=row*column+column/2+row*(column+1);
            }
        }
        
       System.out.println(matrix[0][0]);
       System.out.println(matrix[0][1]);
       System.out.println(matrix[0][2]);
       System.out.println(matrix[0][3]);
       System.out.println(matrix[0][4]);
       System.out.println(matrix[0][5]);
       System.out.println(matrix[0][6]);
       System.out.println(matrix[0][7]);
    }
}