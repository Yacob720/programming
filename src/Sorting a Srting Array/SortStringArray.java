import java.util.*;
import java.io.*;
public class SortStringArray
{
    public static void main(String agrs[])
    {
        String ss[] = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
        Arrays.sort(ss);
        for(int x = 0; x < ss.length; x++)
        {
            System.out.println(ss[x]);
        }
        
    }
}