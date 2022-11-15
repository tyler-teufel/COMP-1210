   
//this import statement allows for the use of the scanner function.

import java.util.Scanner;

 /** 
  * This program prompts and receives user input for
  * name, age, and gender, and calculates age in minutes
  * as well as max heart rate based upon these parameters. 
  *
  * @author Tyler Teufel
  * @version 8/31/21
  */
public class AgeStatistics {
 /**
   * Prompts for name, age, gender; returns calculated data.
   *
   *
   * @param args Command line arguments (not used).
   */
    
   public static void main(String[] args) {
      
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      //Prompts the user for their name:
      
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      //Prompts the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      //Prompts the user for their gender:
      System.out.print("Enter your gender (1 for female and "
                          + "0 for male): ");
      gender = userInput.nextInt();
      
      //convert age in minutes:
      System.out.println("\tYour age in minutes is "
                          + ageInYears * 525600 + " minutes.");
      
      
      //convert age in centuries:
      System.out.println("\tYour age in centuries is "
                          + (double) ageInYears / 100 + " centuries.");
      
      //display max heart rate
      System.out.print("Your max heart rate is ");
      
      if (gender == 1) //calculates female MHR
      {
      
         maxHeartRate = 209 - (0.7 * ageInYears);
         
      } else { //calculates male MHR
         
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
      
      System.out.println(maxHeartRate + " beats per minute.");
   }
}