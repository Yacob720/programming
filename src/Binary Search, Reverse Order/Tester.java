//int index = Collections.binarySearch<Integer>(intList, Integer.valueOf(1), Collections.reverseOrder());

/*import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import org.apache.commons.lang3.ArrayUtils;
@SuppressWarnings("unused")
public class Tester {
    public static void main(String args[]){
        int i[] = {-7, 15, 21, 22, 43, 49, 51, 67, 81, 84, 89, 95, 97};
        ArrayUtils.reverse(i);
        System.out.println(binarySearch(i, 22));
        System.out.println(binarySearch(i, 89));
        System.out.println(binarySearch(i, -100));
        System.out.println(binarySearch(i, 72));
        System.out.println(binarySearch(i, 102));
    }
    private static<T> int binarySearch(T[] a, Comparator<T> c, T srchVal){
    int lb = 0;
    int ub = a.length - 1;

    while(lb <= ub){
        int mid = (lb + ub)/2;
        int ci = c.compare(a[mid],srchVal);
        if(ci == 0){
            return mid;
        }
        else if(ci < 0){
            lb = mid + 1;
        }
        else{
            ub = mid - 1;
        }
     }
    return -1;
}	
}*/


public class Tester
{
    public static void main(String args[])
    {
        int i[] ={-7, 15, 21, 22, 43, 49, 51, 67, 78, 81, 84, 89, 95, 97};
        System.out.println(binarySearch(i, 22)); //prints 3
        System.out.println(binarySearch(i, 89)); //prints 11
        System.out.println(binarySearch(i, -100)); //prints -1
        System.out.println(binarySearch(i, 72)); //prints -1
        System.out.println(binarySearch(i, 102)); //prints -1
    }
    //Look for srchVal in the a[] array and return the index of where it’s found
    //Return –1 if not found
    private static int binarySearch(int a[], int srchVal)
    {
        int lb = 0;
        int ub = a[a.length - 1 -ub];
        while(lb <= ub)
        {
            int mid = (lb + ub)/2;
            if(a[mid] == srchVal)
            {
                return mid;
            }
            else if (srchVal > a[mid])
            {
                lb = mid + 1; //set a new lowerbound
            }
            else
            {
                ub = mid -1; //set a new upper bound
            }
        }
        return -1; //srchVal not found
    }
}