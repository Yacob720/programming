public class Tester
{
    public static void main(String args[])
    {
        MonteCarlo mcObj = new MonteCarlo(5,3,2);
        double x, y;
        int cirCount = 0, sqrCount = 0;
        for(int i = 0; i <= 1000000; i++)
        {
            sqrCount++;
            x = mcObj.nextRainDrop_x( );
            y = mcObj.nextRainDrop_y( );
            if(mcObj.insideCircle(x,y))
            {
                cirCount++;
            }
        }
        System.out.println((cirCount *(mcObj.rM*2)*(mcObj.rM*2))/(sqrCount * mcObj.rM*mcObj.rM));
    }
}

