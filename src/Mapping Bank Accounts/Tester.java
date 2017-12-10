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
        String name;
        int j;
        BankAccount ba;
        Map accounts = new HashMap();

        Scanner kbReader = new Scanner(System.in);
        Scanner kbr = new Scanner(System.in);
        for(j =0; j < 4; j++) 
        {
            System.out.print("Please enter the name to whom the account belongs. ");
            name = kbReader.nextLine( );
            
            System.out.print("Please enter the amount of the deposit. ");
            double amount = kbr.nextDouble( );
            System.out.println(" ");
            ba = new BankAccount(name, amount);

            Object obj = accounts.put(ba.accountID, ba);
            //Use the put method to place a key-value pair in accounts. The key should be an object
            //version of ba.accountID. The value should be ba.
        }
        //Print all the accounts in the map
        Set accountsSet = accounts.keySet();
        Iterator iter = accountsSet.iterator();
        while(iter.hasNext())
        {
            Object key = iter.next();
            ba = (BankAccount)accounts.get(key);
            System.out.println(ba.accountID + " >>> " + ba.name + " >>> " + ba.balance);
        }
        System.out.println(" ");

        System.out.print("Please enter the ID for the account that you wish to view. ");
        int id = kbReader.nextInt( );
        //Print info on that account
        Integer idw = id;
        ba = (BankAccount)accounts.get(idw);
        System.out.println(ba.accountID + " >>> " + ba.name + " >>> " + ba.balance);
        /*Convert the primitive int type id into a wrapper class version called idw.
        Use idw with the get method of accounts to retrieve the desired account…store in ba.
        Print accountID, name, and balance in this format 3 >>> Bob Jones >>> 138.72*/
    }
}