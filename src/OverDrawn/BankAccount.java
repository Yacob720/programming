
public class BankAccount
{
     public  BankAccount (double b , String n)
     {
         name = n;
         balance = b;
     }
     public void deposit(double d)
     {
         balance = balance + d;
     }
     public void withdraw(double w)
     {
         balance = balance - w;
     }
     public String name;
     public double balance;
}   
