// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    String personPlay;    //User's play -- "R", "P", or "S"
    String computerPlay;  //Computer's play -- "R", "P", or "S"
    String userInput;
    int computerInt;      //Randomly generated number used to determine
    Scanner scan = new Scanner(System.in);
    Random generator = new Random();
    public void calculate(){
        //Get player's play -- note that this is stored as a string
        userPlay();
        
        //Generate computer's play (0,1,2)
        botPlay();
        //Translate computer's randomly generated play to string
        
        //Print computer's play
        
        //See who won.
        winner();
    }
    public void userPlay() {
        System.out.println("Choose from 'R' for Rock, 'P' for Paper and 'S' for Stone");
        System.out.println("What is your choice?");
        userInput = scan.next();
        upperCase();
        System.out.println("You chose: " + personPlay);
    }
    public void upperCase() {
        personPlay = userInput.toUpperCase();
    }
    public void botPlay() {
        int computerInt  = generator.nextInt(3);
        if (computerInt == 0) {
               computerPlay = ("R");
            }
           else if(computerInt == 1) {
               computerPlay = ("P");
                }
           else{
               computerPlay = ("S");
            }
            System.out.println(computerPlay);
    }
    public void winner() {
        if (computerPlay.equals ("R") & personPlay.equals ("S")){
            System.out.println("The computer won");
        }
        else if (computerPlay.equals ("S") & personPlay.equals ("P")){
            System.out.println("The computer won");
        }
        else if (computerPlay.equals ("P") & personPlay.equals ("R")){
            System.out.println("The computer won");
        }
        else {
            System.out.println("You won");
        }
    }
}