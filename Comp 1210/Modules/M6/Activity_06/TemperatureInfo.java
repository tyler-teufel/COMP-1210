import java.util.Scanner;
//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * This class contains the main method for the
 * Temperatures class.
 *
 * @author Tyler Teufel
 * @version September 28th, 2021
 */
public class TemperatureInfo {
   
   /**
    * This method scans files and runs them through the temp
    * class.
    * 
    * @param args standard command line arguments.
    *     
    */
   public static void main(String[] args) {
      
      Scanner userInput = new Scanner(System.in);
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      
      String tempInput = "";
      do {
         System.out.print("Enter a temperature "
                          + "(or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
      
      Temperatures temps = new Temperatures(tempsList);
      
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, " 
                          + "[H]igh temp, "
                          + "[P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
               
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
            
            case 'P': 
               System.out.println(temps);
               break;
               
            case 'E':
               System.out.println("\tDone");
               break;
            
            default:
               System.out.println("\tInvalid choice!");
         }
      
      } while (choice != 'E');
      
      
      
     
      
      
      
   
   }
}