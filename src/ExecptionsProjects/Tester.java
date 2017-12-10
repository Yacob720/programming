import java.io.*;
import java.util.*;
public class Tester
{
    public static void main(String args[]) 
    {
        Scanner kbReader = new Scanner(System.in);
        int x=1;
        while(x==1)
        {
            System.out.println("What is the name of the file you're looking for:");
            String name = kbReader.nextLine( );

            if(name.equals("exit"))
            {
                x=2;
                System.out.println("Program ended");
                break;
            }

            try
            {
                FileInput.readTheFile(name);

            }
            catch (IOException e)
            {
                System.out.println("File not found");
            }
        }
    }
}