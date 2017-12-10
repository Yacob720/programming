import java.io.*;
import java.util.*;
public class Tester
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String inp, sp[];
        do
        {
          System.out.print("Type in a sentence and press ENTER.");
          inp = sc.nextLine();
          inp = inp + "X";
          inp = inp.toUpperCase();
          
          sp = inp.split("S\\s*A");
          if(inp.equals("EXITX"))
            break;
          
          System.out.println("There are" + " " + (sp.length -1) + " " + "occurrences.");
          System.out.println(" ");
        }while(1==1);
        System.out.println("Finished");
    }
}    