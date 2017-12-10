import java.util.LinkedList;
public class StackLL implements StackIntrfc
{
    public StackLL()
    {
        
    }
    public void push(double d)
    {
        stck.addFirst(d);
    }//place d on top of the stack
    public double pop( ) 
    {
        double x = (Double)stck.getFirst();
        stck.remove(x);
        return x;
    }//return top item in the stack and then remove from stack
    public double peek( )
    {
        return (Double)stck.getFirst();
    }//return the top item in the stack and leave the stack intact
    public int size( )
    {
        return (Integer)stck.size();
    }//returns the size (depth) of the stack
    public void clear( )
    {
        stck.clear();
    }//remove all items from the stack
    public LinkedList stck = new LinkedList();
}