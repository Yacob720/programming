import java.io.*;
import java.util.*;
public class Tester
{
    public static void main(String args[])
    {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What is the name of the account?");
        String n = kbReader.nextLine();
        System.out.print("How much money do you have in your account?");
        double x = kbReader.nextDouble();
   
        BankAccount myAccount = new BankAccount(1000, n);
        myAccount.deposit(505.22);
        
        System.out.println("1505.22");
        myAccount.withdraw(100);
        System.out.println("The " +   myAccount.name + " balance is, $" + myAccount.balance );
    }
}