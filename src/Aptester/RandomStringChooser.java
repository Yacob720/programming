import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.Random.*;
public class RandomStringChooser
{

    public RandomStringChooser(String [ ] wordBank)
    {
       wordLocal = new ArrayList<String>();
       Collections.addAll(wordLocal, wordBank);
    }

    public String getNext()//must return a value from a String array and then shrink the String array
    {

        if(wordLocal.isEmpty())      
        {   return ("none");            
        }
        else
        {   
            int pos = rndm.nextInt(wordLocal.size()); 
            x= wordLocal.remove(pos);
            return (x); //x is random word from array
        }     
    }
    Random rndm = new Random();
    ArrayList<String> wordLocal;  //local array to search
    private String x; //value returned for random search
}
