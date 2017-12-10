
public class Crypto
{
    public String encrypt(String sntnc)
    {
       String finalSntnc = "";
       for(int j = 0; j < sntnc.length(); j++)
       {
           char nextChar = sntnc.charAt(j);
           switch(nextChar)
           {
               case'v':
               case'V':
               
                   finalSntnc = finalSntnc + "ag',r";
                   break;
               
               case'm':
               case'M':
               
                   finalSntnc = finalSntnc + "ssad";
                   break;
               
               case'g':
               case'G':
               
                   finalSntnc = finalSntnc + "jeb..w";
                   break;
                  
               case'b':
               case'B':
               
                   finalSntnc = finalSntnc + "dug>?/";
                   break;
               
               default:
               
                finalSntnc = finalSntnc + nextChar;
                break;
               
           }
       }
       return finalSntnc;
    } 
    public String decrypt(String sntnc)
    {
        sntnc = sntnc.replace("ag',r", "v");
        sntnc = sntnc.replace("ssad", "m");
        sntnc = sntnc.replace("jeb..w", "g");
        sntnc = sntnc.replace("dug>?/", "b");
        return sntnc;
    }
}