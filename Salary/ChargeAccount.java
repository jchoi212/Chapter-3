// ***************************************************************
//   Salary.java
//
//   Computes the amount of a raise and the new
//   salary for an employee.  The current salary
//   and a performance rating (a String: "Excellent",
//   "Good" or "Poor") are input.
// ***************************************************************
 
import java.util.Scanner;
import java.text.NumberFormat;
 
public class ChargeAccount
{
    
   public static void main (String[] args)
   {
           double currentSalary;  // employee's current  salary
           double raise = 0;              // amount of the raise
           double newSalary;          // new salary for the employee
           String rating;             // performance rating
           double prevBalance;
           double charge = 0;
           double intrest = 0;
           double newBalance;
           Scanner scan = new Scanner(System.in);
 
           System.out.print ("Enter the current salary: ");
           currentSalary = scan.nextDouble();
           System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
           rating = scan.next();
 
           // Compute the raise using if ...
           if (rating.equals("Excellent") ) {
               raise = 0.06*currentSalary;
            }
           else if(rating.equals("good")) {
               raise = 0.04*currentSalary;
                }
           else{
               raise = 0.0015*currentSalary;
            }
           newSalary = currentSalary + raise;
           
           // Calculate Intrest of the Account
           if (newSalary == 0 ) {
               intrest = 0.00;
            }
           else if(newSalary >= 0) {
               intrest = 0.02;
                }
                
           // Calculate Aditional Charges
           newBalance = newSalary*intrest;
           if (newBalance < 50 ) {
               charge = 0.0;
            }
           else if(newBalance >= 50 & newBalance <= 300) {
               charge = 50.0;
                }
           else {
               charge = newSalary*0.2;
            }
 
           // Print the results
           NumberFormat money = NumberFormat.getCurrencyInstance();
           System.out.println();
           System.out.println("Current Salary:           " + money.format(currentSalary));
           System.out.println("Amount of your raise:" + money.format(raise));
           System.out.println("Your new salary:          " + money.format(newSalary));
           System.out.println();
           System.out.print ("Enter the Monthly Charge: ");
           charge = scan.nextDouble();
           System.out.println("CS CARD International Statement");
           System.out.println("===============================");
           System.out.println();
           System.out.println("Previous Balance: $" + newSalary);
           System.out.println("Additional Charges: $" + charge);
           System.out.println("Intrest: $" + (newSalary*intrest));
           System.out.println();
           System.out.println("New Balance: $" + (newSalary-((newSalary*intrest)+(charge))));
           System.out.println();
           System.out.println("Minimum Payment: $" + ((newSalary*intrest)+(charge)));
           
           
        }
   
}