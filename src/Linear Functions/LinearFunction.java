public class LinearFunction implements LinearFunctionMethods
{
    double slope;
    double yIntc;
    
    public LinearFunction(double m, double b)
    { slope = m;
      yIntc = b;
        
    }
    
    public double getSlope()
    {
        return slope;
    }
    public double getYintercept()
    {
        return yIntc;
    }
    public double getRoot()
    {  
        return ( -yIntc/slope );
    }
    
    public double getYvalue(double x)
    {
        return (x * slope + yIntc);
    }
    public double getXvalue(double y)  // y = slope *x + yIntc  (y - yIntc)/slope
    {
        return ((y - yIntc)/slope);
    }
}