import java.io.*;
import java.util.*;
public class FullName
{
    public static void main(String agrs[])
    {
       Scanner kbReader = new Scanner(System.in);
       System.out.print("What is your first name? ");
       String s = kbReader.nextLine();
       System.out.print("What is your last name? ");
       String j = kbReader.nextLine();
       System.out.println("Your full name is " + s + " " + j);
    }
}
//what's your name