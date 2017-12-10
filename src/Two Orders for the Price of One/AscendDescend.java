import java.util.*;
import java.io.*;
public class AscendDescend
{
    public static void main(String agrs[])
    {
        String ss[] = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
        Arrays.sort(ss);
        System.out.println("Ascend          Descend");
        for(int x = 0; x < ss.length; x++)
        {
            System.out.println(ss[x] + "\t\t" + ss[ss.length -1 -x]);
        }
    }
}
