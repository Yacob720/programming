import java.io.*;
import java.util.*;
public class Tester
{
    public static void main(String args[])
    { 
      System.out.println("Make your arithmetic selection from the choices below:\n");
      System.out.println(" A. Addition");
      System.out.println(" S. Subtraction");
      System.out.println(" M. Multiplication");
      System.out.println(" D. Division\n");
      System.out.print(" Your choice? ");
      Scanner kbReader = new Scanner(System.in);
      String choice = kbReader.nextLine( );
      //char ch = choice; //You would think this would work…but it doesn’t.
      char ch = choice.charAt(0); //you just learned another String method.
      System.out.print("\nEnter first operand. " );
      double op1 = kbReader.nextDouble( );
      System.out.print("\nEnter second operand. " );
      double op2 = kbReader.nextDouble( );
      System.out.println(" ");
      switch (choice)
        {
        case "Add": //addition
        case "add": 
        System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2) );
        break;
        case "Subtract": //subtraction
        case "subtract":
        System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2) );
        break;
        case "Multiply": //multiplication
        case "multipy":
        System.out.println(op1 + " times " + op2 + " = " + (op1 * op2) );
        break;
        case "Divide": 
        case "divide":
        System.out.println(op1 + " divided by " + op2 + " = " + (op1 / op2) );
        break;
        default:
        System.out.println("Hey dummy, enter only a Add, Subtract, Multiply, or Divide!");
        }
    }
}