import java.io.*;
import java.util.*;
import java.text.*; 
public class Tester
{
    public static void main(String args[])
    {
        NumberFormat formatter = NumberFormat.getNumberInstance( );
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);

        BankAccount ba[] = new BankAccount[5];
        for(int j =0; j < ba.length; j++)
        {
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Please enter the name to whom the account belongs. ");
            String username = kbReader.nextLine( );
            
            System.out.print("Please enter the amount of the deposit. ");
            double amount = kbReader.nextDouble( );
           
            
            System.out.println(" ");

            
            ba[j] = new BankAccount(username, amount);

        }
        Comparator comp = new BA_Comparator( );
        Arrays.sort(ba, comp);
        for(int x = 0; x < ba.length; x++)
        {
            System.out.println(ba[x].name + " >>> " + ba[x].balance);
        }
    }
}