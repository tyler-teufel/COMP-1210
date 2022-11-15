//this import statement allows for the use of the scanner class.

import java.util.Scanner;


/** 
  * Takes in a raw time in seconds (int), 
  * returns the time in days, hours, minutes and seconds.
  *
  * @author Tyler Teufel
  * @version 9/3/21
  */

public class TimeInSeconds {
   
   /**
    * 
    * Takes in a value of seconds as an int,
    * returns int values of time in 
    * days, hours, minutes, seconds.
    *
    * @param args Command line arguments (not used).
    */
    
   public static void main(String[] args) {
      
      //Scanner is created.
      Scanner userInput = new Scanner(System.in);
      int seconds, minutes, hours, days, secondsRemaining;
      
      System.out.print("Enter the raw time in seconds: ");
      seconds = userInput.nextInt();
      
      //If a valid value of seconds is entered, than calculations begin.
      if (seconds > 0 || seconds == 0)
      {
         
         //calculates days while collecting leftover seconds in new var.
         days = seconds / 86400;
         secondsRemaining = seconds % 86400;
         
         //calculates hours while collecting leftover seconds in new var.
         hours = secondsRemaining / 3600;
         secondsRemaining = secondsRemaining % 3600;
         
         //calculates minutes while collecting leftover seconds in new var.
         minutes = secondsRemaining / 60;
         secondsRemaining = secondsRemaining % 60;
         
         //Each calculated value is printed in requested format.
         System.out.println("\nTime by combined days, hours, minutes," 
                              + " seconds: ");
         System.out.println("\tdays: " + days);    
         System.out.println("\thours: " + hours); 
         System.out.println("\tminutes: " + minutes);
         System.out.println("\tseconds: " + secondsRemaining);
         System.out.println("\n" + seconds + " seconds = " + days 
                              + " days, " + hours 
                              +  " hours, " + minutes + " minutes, " 
                              + secondsRemaining + " seconds");
      
      } else {
         
         /* If a negative value in seconds is inputed, 
          * than an error message is sent.
          *
          */
         System.out.println("*** Time must be non-negative. ***");
      
      }
      
   
   }

}