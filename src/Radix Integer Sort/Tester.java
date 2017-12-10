public class Tester
{
    public static void main(String args[])
    {
        int theArray[] = {4,2,5,1,3,18,0,9,6};
        sort(theArray);
        for(int j = 0; j < theArray.length; j++)
        {
            System.out.print(theArray[j] + " ");
        }
        System.out.println(" ");
    }

    public static void sort(int ary[]) //ascending order Radix Sort
    {
        int zeros[] = new int[ary.length];
        int ones[] = new int[ary.length];
        int mask = 1; //Initially looks at the LSB.
        for(int i = 0; i < 31; i ++)
        //Cycle through all 31 bits of the integers (but not the sign bit) starting with
        //the LSB.
        {
            int zerosArrayCount = 0, onesArrayCount = 0;
            for(int j = 0; j < ary.length; j++)
            //Cycle through each item in the array to be sorted
            {
                int testBit = ary[j] & mask; //Apply mask to test a particular bit.
                if(testBit == 0)
                    zeros[zerosArrayCount++] = ary[j];
                else
                    ones[onesArrayCount++] = ary[j];
            }
            //Copy latest progress back to the array. For descending sort, switch the
            //two loops below.
            int indx = 0;
            for(int j = 0; j < zerosArrayCount; j++)
                ary[indx++] = zeros[j];
            for(int j = 0; j < onesArrayCount; j++)
                ary[indx++] = ones[j];
            mask *= 2; //Advance the mask to the next bit
        }
    }
}