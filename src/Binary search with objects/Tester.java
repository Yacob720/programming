public class Tester
{
    public static void main(String args[])
    {
        int i[] = {-7, 15, 21, 22, 43, 49, 51, 67, 78, 81, 84, 89, 95, 97};
        Integer iw[] = new Integer[14];
        for(int k = 0; k < 14; k++)
        {
            iw[k] = i[k]; //pre Java 5.0 iw[k] = new Integer(i[k]);
        }
        System.out.println(binarySearch(iw, 22)); //3
        //pre Java 5.0, System.out.println(binarySearch(iw, new Integer(22)));
        System.out.println(binarySearch(iw, 89)); //11
        System.out.println(binarySearch(iw, -100)); //-1
        System.out.println(binarySearch(iw, 72)); //-1
        System.out.println(binarySearch(iw, 102)); //-1
    }

    private static int binarySearch(Object a[], Object srchVal)
    {
        //… students supply this code …
        return ; 
    }
}