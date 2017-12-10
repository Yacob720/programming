import java.io.*;
import java.util.*;
import java.text.*;
public class Tester
{
    public static void main(String args[])
    {
        StackLL stck = new StackLL( );
        String enter;
        double d = 0, op1 = 0, op2 = 0;   
        do
        {
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Enter number, math operation(+,-,*, or /), or Q to quit:");
            enter = kbReader.nextLine( );
            if(enter.equals("Q"))
            {
                break;
            }
            else if(enter.equals("+"))
            {
                op1 = stck.pop();
                op2 = stck.pop();
                stck.push(op1 + op2);
            }
            else if(enter.equals("-"))
            {
                op1 = stck.pop();
                op2 = stck.pop();
                stck.push(op1 - op2);
            }
            else if(enter.equals("*"))
            {
                op1 = stck.pop();
                op2 = stck.pop();
                stck.push(op1 * op2);
            }
            else if(enter.equals("/"))
            {
                op1 = stck.pop();
                op2 = stck.pop();
                stck.push(op1 / op2);
            }
            else
            { 
                d= (double)Double.parseDouble(enter);
                stck.push(d);
            }
        }while(1== 1);
        
        System.out.println("The answer is " + stck.pop());
       
    }
}