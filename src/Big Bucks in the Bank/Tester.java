import java.io.*;
import java.util.*;
import java.text.*;
public class Tester
{
    public static void main(String args[])
    {
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(3);
        String name;
        ArrayList <BankAccount> aryLst = new ArrayList<BankAccount>();
        //Create a ListIterator object called iter
        do
        {
            Scanner kbReader = new Scanner(System.in); 
            System.out.print("Please enter the name whom the account belongs. (\"Exit\" to abort)"); 
            name = kbReader.nextLine();
            if(!name.equalsIgnoreCase("EXIT"))
            {
                System.out.print("Please enter the amount of the deposit.");
                double amount = kbReader.nextDouble();
                System.out.println(" ");
                BankAccount myAccount = new BankAccount(name,amount);
                //Use iter to add theAccount to the list
                aryLst.add(myAccount);
            }
        }while(!name.equalsIgnoreCase("EXIT"));
        BankAccount xx = aryLst.get(0); //use iter to get the last bank account in the list
        double maxBalance = xx.balance;
        String maxName = xx.name;
        for(int j = 1; j < aryLst.size( ); j++)
        {
            BankAccount x = aryLst.get(j);
            double zBalance = x.balance; 
            String yName = x.name;
            if(zBalance > maxBalance)
            {
                maxBalance = zBalance;
                maxName = yName;
            }
        }

        /*while( …use iter to see if we should continue looping…)
        {
            …Step through all objects and decide which has the largest balance…
        }*/
        
        System.out.println(" ");
        System.out.println("The accouint with the largest balance belongs to "+ maxName + ".");
        System.out.println(String.format("%.2f",  maxBalance ));
    }
}