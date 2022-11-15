//********************************************************************
//  AddInts.java       
//********************************************************************
import java.util.Scanner;
/**
 * Demonstrates the use of a for statement.
 */
public class AddMultiplyIntsToDouble 
{
 /**
 * 1. Adds int from 1 to n using a for loop.
 * 2. Multiplies from 1 to n using a for loop
 *    (a.k.a. "n factorial" or "n!").
 */
   public static void main (String[] args)
   {
      int n = 21;
      // Scanner scan = new Scanner(System.in);
      // System.out.print("Add and multiply integers from 1 to ");
      // int n = scan.nextInt();
      
      // int sum = 0;
      // for (int i = 1; i <= n; i++) {
         // sum += i;
      // }
      // System.out.println("Sum: " + sum);
      
      long product = 1;
      for (int i = 1; i <= n; i++) {
         product *= i;
      }
      System.out.println("Product: " + product);
   
      // double dSum = 0;
      // for (int i = 1; i <= n; i++) {
         // dSum += i;
      // }
      // System.out.println("\nSum: " + dSum);
      
      double dProduct = 1;
      for (int i = 1; i <= n; i++) {
         dProduct *= i;
      }
      System.out.println("Product: " + dProduct);
   
   } 
}
