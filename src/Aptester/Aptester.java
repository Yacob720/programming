import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.Random.*;
public class Aptester
{
    public static void main (String args[])
    {
        String[] wordArray = {"wh", "on", "the", "bus"};
        RandomStringChooser sChooser = new RandomStringChooser(wordArray);
        for(int k = 0; k < 6; k++)
        {
            System.out.println(sChooser.getNext() + " ");
        }
    }
}