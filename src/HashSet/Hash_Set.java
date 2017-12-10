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

        //Build the intersection set
        
        s1.addAll(s2);//first set is the modified, parameter set is what your compairing to
        
        //Modify s1 to be the intersection using the retainAll method

        Iterator iter1 = s1.iterator();
        while(iter1.hasNext())
        {
            System.out.println(iter1.next());
        }
    }
}