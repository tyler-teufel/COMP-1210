
import java.util.Scanner;

/**
 * This class utilizes its parent class
 * in order to produce a DecagonalPrism.
 *     
 *@author Tyler Teufel
 *@version 9/16/21
 */

public class DecagonalPrismApp {
   
   /**
    * This method will allow the parent class
    * to be utilized.
    *
    *@param args command line argument not used.
    */
   public static void main(String[] args) {
      
      //scanner created.
      Scanner userInput = new Scanner(System.in);
      
      //prompt header.
      System.out.println("Enter label, edge, and height"
         + " for a decagonal prism.");
      
      //label prompt.   
      System.out.print("\tlabel: ");
      String label = userInput.nextLine();
      
      //edge prompt.
      System.out.print("\tedge: ");
      double edge = Double.parseDouble(userInput.nextLine());
      
      //checking if edge is valid.
      if (edge < 0) {
         
         System.out.println("Error: edge must be non-negative.");
         return;
      
      }
      
      //height prompt.
      System.out.print("\theight: ");
      double height = Double.parseDouble(userInput.nextLine());
      
      //checking if height is valid.
      if (height < 0) {
         
         System.out.println("Error: height must be non-negative.");
         return;
      }
      
      //new object created, printed.
      DecagonalPrism decPrism = new DecagonalPrism(label, edge, height);
      System.out.println(decPrism);
      
      
      
      
      
   
   }


}