public class Tester
{
    public static void main(String args[])
    {
      double d1 = 37.9;
      double d2 = 1004.128;
      int i1 = 12;
      int i2 = 18; 
      System.out.println("Problem 1:" + " " + (57.2 * (i1 / i2) +1));
      System.out.println("Problem 2:" + " " + (57.2 * ( (double)i1 / i2) + 1));
      System.out.println("Problem 3:" + " " + (15 - i1 * (d1 * 3) + 4));
      System.out.println("Problem 4:" + " " + (15 - i1 * (int) (d1 * 3) +4));
      System.out.println("Problem 5:" + " " + (15 - i1 * ( (int)d1 * 3) + 4));
    }
}



