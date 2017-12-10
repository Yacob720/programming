import java.io.*;
import java.util.*;
public class Tester 
{
    public static void main( String args[] )
    {
        StackLL stck = new StackLL( );
        System.out.println(stck.size( ) ); //0
        stck.push(157.3);
        stck.push(22);
        stck.push(-18);
        double j = stck.pop( );
        System.out.println(j); // -18.0
        System.out.println( stck.peek( ) ); //22.0
        System.out.println( stck.pop( ) ); //22.0
        System.out.println( stck.size( ) ); //1
        stck.clear( );
        System.out.println( stck.size( ) ); //0
    }
}