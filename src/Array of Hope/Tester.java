
public class Tester
{
    public static void main(String args[])
    {
        char ch[]= new char [26];
        for(int j = 65; j <= 90; j++)
        {
            ch[j-65] = (char)j;
        }
        for(int j = 0; j <= 25; j++)
        {
            if(j == 25)
            {
                System.out.print(ch[j]);
            }
           else
            {
              System.out.print(ch[j] + "," + " ");
            }
        }
    }
}