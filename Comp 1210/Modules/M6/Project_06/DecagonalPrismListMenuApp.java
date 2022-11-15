import java.util.Scanner;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * This class drives the menu for the DecagonalPrism and
 * DecagonalPrismList class elements.
 */
public class DecagonalPrismListMenuApp { 
   
   /**
    * This method runs the user menu.
    *
    * @param args normal command line arguments.
    * @throws FileNotFoundException with missing file.
    */
   public static void main(String[] args) throws FileNotFoundException {
      Scanner userInput = new Scanner(System.in);
      //String input = "";
      System.out.print("DecagonalPrism List System Menu"
                       + "\nR - Read File and Create DecagonalPrism List"
                       + "\nP - Print DecagonalPrism List"
                       + "\nS - Print Summary"
                       + "\nA - Add DecagonalPrism"
                       + "\nD - Delete DecagonalPrism"
                       + "\nF - Find DecagonalPrism"
                       + "\nE - Edit DecagonalPrism"
                       + "\nQ - Quit");
      //input = userInput.nextLine();
      
      char choice = 'Q';
      String name = "";
      ArrayList<DecagonalPrism> list = new ArrayList<DecagonalPrism>();
      
      DecagonalPrismList fileIn = new DecagonalPrismList(name, list);
      
      do {
         System.out.print("\nEnter Code [R, P, S, A, D, F, E, or Q]: ");
         
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'R':
               System.out.print("\tFile name: ");
               String fileName = userInput.nextLine();
               fileIn = DecagonalPrismList.readFile(fileName);
               System.out.println("\tFile read in and"
                                + " DecagonalPrism List created");
               break;
               
            case 'P':
               System.out.print("\n" + fileIn);
               break;
            
            case 'S': 
               System.out.println("\n" + fileIn.summaryInfo());
               break;
               
            case 'A':
               System.out.print("\tLabel: ");
               String label = userInput.nextLine();
               System.out.print("\tEdge: ");
               double edge = Double.parseDouble(userInput.nextLine());
               System.out.print("\tHeight: ");
               double height = Double.parseDouble(userInput.nextLine());
               fileIn.addDecagonalPrism(label, edge, height);
               System.out.println("\t*** DecagonalPrism added ***");
               break;
               
            case 'D':
               System.out.print("\tLabel: ");
               String labelIn = userInput.nextLine();
               if (fileIn.findDecagonalPrism(labelIn) == null) {
                  System.out.println("\t\"" + labelIn + "\" not found");
                  break;
               }
               DecagonalPrism prism = fileIn.deleteDecagonalPrism(labelIn);
               System.out.print("\t\"" + prism.getLabel() + "\" deleted\n");
               break;
            
            case 'F':
               System.out.print("\tLabel: ");
               String findLabelIn = userInput.nextLine();
               if (fileIn.findDecagonalPrism(findLabelIn) == null) {
                  System.out.print("\t\"" + findLabelIn + "\" not found\n");
                  break;
               }
               System.out.print(
                                 fileIn.findDecagonalPrism(findLabelIn));
               break;
               
            case 'E':
               System.out.print("\tLabel: ");
               labelIn = userInput.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(userInput.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(userInput.nextLine());
               
               if (fileIn.findDecagonalPrism(labelIn) == null) {
                  System.out.print("\t\"" + labelIn + "\" not found\n");
                  break;
               }
               fileIn.editDecagonalPrism(labelIn, edge, height);
               System.out.print("\t\"" + labelIn 
                                + "\" successfully edited\n");
               break;
              
            case 'Q':
               break;
            
            default:
               System.out.println("\t*** invalid code ***");
         }
      
      } while (choice != 'Q');
   }

}