import java.util.*; //we need java.util.Set, java.util.HashSet, and java.util.Iterator
public class Hash_Set
{
    public static void main(String args[])
    {
        Set s1 = new HashSet( ); //Create s1
        s1.add("Bill");
        s1.add("Larry");
        s1.add("Adolph");
        s1.add("Regina");
        s1.add("Susie");
        Set s2 = new HashSet( ); //Create s2
        s2.add("Larry");
        s2.add("Jack");
        s2.add("Alice");
        s2.add("June");
        s2.add("Benny");
        s2.add("Susie");

        s1.addAll(s2);

        Iterator iter1 = s1.iterator();
        while(iter1.hasNext())
        {
            System.out.println(iter1.next());
        }
    }
}
// Method Name	    : addAll
// Parameters		: String 
// Return value(s)	: s1 iter
// Description		: the addAll method adds together the different elements in a set with another set
// Decription...    : If they both have the same element it doesn't get added again it just shows up once