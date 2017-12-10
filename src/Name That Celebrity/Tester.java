
public class Tester
{
    public static void main(String args[])
    {
        String s1 = "Allan Alda";
        String s2 = "John Wayne";
        String s3 = "Gregory Peck";
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();
        String smallPart1 = s1.substring(2, len1 -3);
        String smallPart2 = s2.substring(2, len2 -3);
        String smallPart3 = s3.substring(2, len3 -3);
        System.out.println(s1 + ">>>" + smallPart1);
        System.out.println(s2 + ">>>" + smallPart2);
        System.out.println(s3 + ">>>" + smallPart3);
    }
}