//this import statement allows for the use of the scanner function.

import java.util.Scanner;
import java.text.DecimalFormat;


 /** 
  * This program utilizes the math methods included in 
  * the math class.
  *
  * @author Tyler Teufel
  * @version 9/10/21
  */

public class UsingMathMethods {
   
 /**
  * A complex equation is solved using user input
  * and math methods.
  * 
  *
  * @param args Command line arguments (not used).
  */
   public static void main(String[] args) {
      
      //declares the partitioned variables.
      double resultP1, resultP2, resultP3, resultFinal, x;
      
      //declaration for string concatonation of the result.
      String result;
      
      //Scanner declaration.
      Scanner userInput = new Scanner(System.in);
      
      //Entering the value for x.
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      //part 1 of the calculation.
      resultP1 = 8 * Math.pow(x, 4);
      
      //part 2. 
      resultP2 = Math.sqrt(Math.abs((4 * Math.pow(x, 3)) 
                           + (4 * Math.pow(x, 2.0)) + (4 * x) + 4));
      //part 3.
      resultP3 = 4 + Math.abs(x);
      
      //final.
      resultFinal = (resultP1 + resultP2) / resultP3;
      
      System.out.println("Result: " + resultFinal);
      
      //String concatenation.
      result = Double.toString(resultFinal);
      
      //locating the decimal index.
      int index1 = result.indexOf(".");
      
      //seperating the two side of gteh decimal.
      String beforeDec = result.substring(0, index1);
      int len1 = beforeDec.length();
      
      String afterDec = result.substring(index1, (result.length() - 1));
      int len2 = afterDec.length();
      
      //creating the format object.
      DecimalFormat resultFormat = new DecimalFormat("#,##0.0##");
      
      //printing values.
      System.out.println("# of characters to left of decimal"
                         + " point: " + len1);
      System.out.println("# of characters to right of decimal" 
                         + " point: " + len2);
      
      System.out.println("Formatted Result: " 
                         + resultFormat.format(resultFinal));
      
      
      
   
   }
   
   
}