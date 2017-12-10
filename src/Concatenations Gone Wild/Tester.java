public class Tester
{
    public static void main(String args[])//no 
    {
        String t1 = cat(68, 108);// reconizes the two ASCII codes that are needed for start and end, that goes through the loop the first time
        System.out.println(t1);// Prints out the first group of ASCII codes as a character string 
        String t2 = cat(35, 59);// reconizes the two ASCII codes that are needed for start and end, that goes throught the loop the second time 
        System.out.println(t2);//Prints out the second group of ASCII codes as a character string
    }
    private static String cat(int start, int end)//no
    {
    
        StringBuffer sb = new StringBuffer( );// creates a Stringbuffer object and does the concatenations  using the append() method
        for(int j = start; j <= end; j++)// converting the two ASCII codes to integers and having it increase entil the end ASCII code 
        {
            sb.append((char)j);// concatenates through the the first ASCII code entil the end ASCII code and converts them to the desired characters
        }
        
        return sb.toString();// converts the characters to a String do that it can be printed out since the original was a string to begin with 
    }
}