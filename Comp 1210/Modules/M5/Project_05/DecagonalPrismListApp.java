import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;


/**
 * This class contains the main method that
 * can read files and inputed by the user
 * and creates objects that can be edited.
 */
public class DecagonalPrismListApp {
   /**
    * This main method takes user input and enters
    * the data into the DecagonalPrismList object.
    * @param args Standard command line arguments.
    * @throws FileNotFoundException if file not found.
    */
   public static void main(String[] args) throws FileNotFoundException {
      
      String fileName;
      
      Scanner scan = new Scanner(System.in);
      String input;
      ArrayList<DecagonalPrism> inputList = new ArrayList<DecagonalPrism>();
      
      System.out.print("Enter file name: ");
      input = scan.nextLine();
   
      Scanner fileScan = new Scanner(new File(input));
      
        
      fileName = fileScan.nextLine();
      
      
      
   // Read each line from file and store in ArrayList
      
      while (fileScan.hasNextLine()) {
      
         
         String name = fileScan.nextLine();
         double val1 = Double.parseDouble(fileScan.nextLine());
         double val2 = Double.parseDouble(fileScan.nextLine());
         
         DecagonalPrism obj = new DecagonalPrism(name, val1, val2);
         inputList.add(obj);
         
            
         
         
      }
      fileScan.close();  // close input file
      
      DecagonalPrismList list = new DecagonalPrismList(fileName, inputList);
      int i = 0;
      
      System.out.println("\n" + list.toString());
      System.out.print("\n" + list.summaryInfo());
      
     
      
   
      
      
   }

}