import java.io.*;
import java.util.*;
import java.util.Random.*;
public class MonteCarlo 
{  
    public MonteCarlo(double h, double k, double r)
    {
        hM = h;
        kM = k;
        rM = r;
    }
    public double nextRainDrop_x( )
    {   double rndm_x = (hM - rM) + (2*rM)*rndm.nextDouble();
        return rndm_x;
    }
    public double nextRainDrop_y( )
    {   double rndm_y = (kM - rM) + (2*rM)*rndm.nextDouble();
        return rndm_y ;
    }
    public boolean insideCircle(double x, double y)
    {   boolean onorincir = false;
        if (((x - hM)*(x - hM) + (y - kM)*(y - kM)) <= (rM * rM))
        {
            onorincir = true;
        }
        return onorincir;
    }
    public double hM;
    public double kM;
    public double rM;
    private Random rndm = new Random( );
}