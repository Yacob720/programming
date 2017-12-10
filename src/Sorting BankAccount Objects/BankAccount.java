public class BankAccount implements Comparable
{
    public BankAccount(String nm, double amt)
    {
        name = nm;
        balance = amt;
    }

    public void deposit(double dp)
    {
        balance = balance + dp;
    }

    public void withdraw(double wd)
    {
        balance = balance - wd;
    }

    public int compareTo(Object otherObject)
    {
        //otherObject is passed in as an Object type so let’s convert it into
        //a BankAccount type object.
        BankAccount otherAccount = (BankAccount) otherObject;
        int retValue;
        if (balance < otherAccount.balance)
        {
            retValue = -1;
        }
        else
        {
            if (balance > otherAccount.balance)
            {
                retValue = 1;
            }
            else
            {
                retValue = 0;
            }
        }
        
        return retValue;
    }
    public String name;
    public double balance;

}