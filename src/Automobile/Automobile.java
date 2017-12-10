public class Automobile
{
    public Automobile(double millage)
    {
        mpg = millage;
        gallons = 0;
    }
    public void fillUp(double gal)
    {
        gallons = gallons + gal;
    }
    public void takeTrip(double miles)
    {
        gallons = gallons - miles/mpg;
    }
    public double reportFuel()
    {
        return gallons;
    }
    private double mpg;
    private double gallons;
}
