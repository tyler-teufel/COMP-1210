

//this import statement allows for the use of the scanner function.

import java.util.Scanner;

 /** 
  * This program will find the result of a specified
  * expression after reading input values for x and y.
  *
  * @author Tyler Teufel
  * @version 9/3/21
  */
public class TwoVariableExpression {
 
 /**
   * variables x, y are taken from user,
   * plugged into provided formula returning
   * value as result.
   *
   * @param args Command line arguments (not used).
   */
    
   public static void main(String[] args) {
      
      //Scanner is created.
      Scanner userInput = new Scanner(System.in);
      //Variables x, y, result all created.
      double x, y;
      double result;
      
      //Formula used is printed for user to see.
      System.out.println("result = (4.5x + 12.5) (3y - 9.0) / xy");
     
      //User is promped for value of x, stored in variable x.
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      
      //User is prompted for value of y, stored in variable y.
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      
      //'If, Else' statement determines if result is defined before calculations
      
      if ((x * y) == 0) //When dividing by 0, function is undefined.
      { 
      
         System.out.println("result is \"undefined\"");
         
      } else {
      
         //Calculations completed and returned to the user.
         result = (((4.5 * x) + 12.5) * ((3 * y) - 9.0)) / (x * y);
         System.out.println("result = " + result);
         
      }
   }
   

}