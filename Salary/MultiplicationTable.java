
/**
 * Write a description of class MultiplicationTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultiplicationTable
{
   
    public static void main (String[] args)
   {
       int number = 1;
       int multiple = 1;
       while(multiple<=12){
         System.out.println(String.valueOf(number*multiple) + String.valueOf(number*multiple));
         multiple += 1;
        }

        
    }
}

