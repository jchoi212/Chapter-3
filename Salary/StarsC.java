
/**
 * Write a description of class Stars here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StarsC
{
    public static void main() {
         for (int i = 10; i > 0; i--){
             printItem(" ", 10-i);
             printItem("*", i);
             System.out.println();
        }
    }   
    public static void printItem(String st, int num) {
         for (int j = 0; j < num; j++) {
             System.out.print(st);
            }
    }
}
