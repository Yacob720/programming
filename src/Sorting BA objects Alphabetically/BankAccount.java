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
        return name.compareTo(otherAccount.name);
    }
    public String name;
    public double balance;
}