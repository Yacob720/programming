public class BankAccount
{
    public BankAccount(String nm, double amt)
    {
        name = nm;
        balance = amt;
        accountCounter++;
        accountID = accountCounter;
    }

    public void deposit(double dp)
    {
        balance = balance + dp;
    }

    public void withdraw(double wd)
    {
        balance = balance - wd;
    }
    public String name;
    public double balance;
    private static int accountCounter = 0;
    public int accountID;
}