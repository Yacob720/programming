public class Circle
{    
    public Circle(double r)
    {
        radius = r;
    }
    public double area()
    {
        double a = Math.PI * radius * radius;
        return a;
    }
    public double circumference()
    {
        double c = 2 * Math.PI * radius;
        return c;
    }
    public void setRadius(double nr)
    {
        radius = nr;
    }
    public double diameter()
    {
        double d = radius * 2;
        return d;
    }
    public double radius;
}