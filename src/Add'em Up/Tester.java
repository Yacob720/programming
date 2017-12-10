import java.io.*;
import java.util.*;
public class Tester
{
  public static void main(String args[])
  {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter something like 8 + 33 + 1,345 -137 : ");
    String s = kb.nextLine( ); //Best to store in a String and then create a new Scanner
    //object; otherwise, it can get stuck waiting for input.
    if(s.charAt(0)!= '-')
    {
        s = '+' + s;
    } 

    Scanner sc = new Scanner(s);

    sc.useDelimiter("\\s*\\+\\s*|\\s*\\-\\s*");
    int sum = 0;
    while(sc.hasNextInt( ))
    { 
      if(sc.findInLine("\\s*\\+\\s*" != null))
      {
         sum = sum + sc.nextInt();
      }
      else
      {
         sum=sum - sc.nextInt();
      }
    }
    System.out.println("Sum is: " + sum);
  }
}
