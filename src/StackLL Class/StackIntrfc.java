public interface StackIntrfc
{
    void push(double d); //place d on top of the stack
    double pop( ); //return top item in the stack and then remove from stack
    double peek( ); //return the top item in the stack and leave the stack intact
    int size( ); //returns the size (depth) of the stack
    void clear( ); //remove all items from the stack
}