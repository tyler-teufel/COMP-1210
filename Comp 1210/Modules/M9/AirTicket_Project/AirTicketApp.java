//import java.util.Scanner;
//import java.io.File;
import java.io.FileNotFoundException;
//import java.util.Scanner;
/**
 * AirTicketApp Class
 *
 * This class contains the main method for
 * the AirTicket classes.
 *
 * @author Tyler Teufel
 * @version 11.12.21
 */
public class AirTicketApp {
   
   /**
    * main method
    *
    * Driver method for the class.
    *
    * @param args normal command line args.
    * @throws FileNotFoundException if needed.
    */
   public static void main(String[] args) 
                           throws FileNotFoundException {
      
      if (args.length == 0 || args[0] == null || args[0] == "") {
         System.out.println("File name expected as command line argument.\n"
                           + "Program ending.");
      }
      else {
         String file = args[0];
         AirTicketProcessor processor = new AirTicketProcessor();
         processor.readAirTicketFile(file);
         
         System.out.print(processor.generateReport()); 
         System.out.print(processor.generateReportByFlightNum());
         System.out.print(processor.generateReportByItinerary());
      }
      
   }
}