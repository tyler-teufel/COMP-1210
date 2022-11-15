import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;



/**
 * AirTicketProcessor Class
 *
 * This class provides methods for reading in the data 
 * file and generating reports.
 *
 * @author Tyler Teufel
 * @version 11.12.21
 */ 
public class AirTicketProcessor {
   
   //Fields
   
   /**Tickets Array. */
   private AirTicket[] tickets;
   /** InvalidRecords Array. */
   private String[] invalidRecords;

   /**
    * AirTicketProcessor Constructor
    *
    * This method populates the fields.
    *
    */
   public AirTicketProcessor() {
      
      tickets = new AirTicket[0];
      invalidRecords = new String[0];
   }
   
   /**
    * readAirTicketFile Method
    *
    * This method has no return value, and
    * accepts the data file name and throws
    * FileNotFoundException.
    *
    * @param fileNameIn takes in a String file name.
    * @throws FileNotFoundException if needed.
    */
   public void readAirTicketFile(String fileNameIn) 
         throws FileNotFoundException {
      
      Scanner fileScan = new Scanner(new File(fileNameIn));
      while (fileScan.hasNext()) { 
         String line = fileScan.nextLine();
         Scanner lineScan = new Scanner(line);
         lineScan.useDelimiter(",");
         
         while (lineScan.hasNext()) {
            
            String flightNum;
            Itinerary plan;
            AirTicket ticketRead;
            char caseIn = lineScan.next().charAt(0);
            try {
               switch (caseIn) {
               
                  case 'B':
                     flightNum = lineScan.next();
                     plan = new Itinerary(lineScan.next(), lineScan.next(),
                                       lineScan.next(), lineScan.next(),
                                       Integer.parseInt(lineScan.next())); 
                     
                     ticketRead = new Business(flightNum, plan, 
                                            Double.parseDouble(lineScan.next()),
                                        Double.parseDouble(lineScan.next()),
                                        Double.parseDouble(lineScan.next()),
                                        Double.parseDouble(lineScan.next()));
                     tickets = Arrays.copyOf(tickets, tickets.length + 1);
                     tickets[tickets.length - 1] = ticketRead;
                     break;
                  case 'E':
                     flightNum = lineScan.next();
                     plan = new Itinerary(lineScan.next(), lineScan.next(),
                                       lineScan.next(), lineScan.next(),
                                       Integer.parseInt(lineScan.next()));
                  
                     ticketRead = new Economy(flightNum, plan, 
                                       Double.parseDouble(lineScan.next()),
                                       Double.parseDouble(lineScan.next()));
                     tickets = Arrays.copyOf(tickets, tickets.length + 1);
                     tickets[tickets.length - 1] = ticketRead; 
                     break;
               
                  case 'F':
                     flightNum = lineScan.next();
                     plan = new Itinerary(lineScan.next(), lineScan.next(),
                                       lineScan.next(), lineScan.next(),
                                       Integer.parseInt(lineScan.next()));
                  
                     ticketRead = new Elite(flightNum, plan, 
                                         Double.parseDouble(lineScan.next()),
                                     Double.parseDouble(lineScan.next()),
                                     Double.parseDouble(lineScan.next()),
                                     Double.parseDouble(lineScan.next()),
                                     Double.parseDouble(lineScan.next()));
                  
                     tickets = Arrays.copyOf(tickets, tickets.length + 1);
                     tickets[tickets.length - 1] = ticketRead; 
                     break;
                  case 'N':
                     flightNum = lineScan.next();
                     plan = new Itinerary(lineScan.next(), lineScan.next(),
                                       lineScan.next(), lineScan.next(),
                                       Integer.parseInt(lineScan.next()));
                  
                     ticketRead = new NonRefundable(flightNum, plan, 
                                          Double.parseDouble(lineScan.next()),
                                          Double.parseDouble(lineScan.next()),
                                          Double.parseDouble(lineScan.next()));
                  
                     tickets = Arrays.copyOf(tickets, tickets.length + 1);
                     tickets[tickets.length - 1] = ticketRead; 
                     break;
                  default:
                     if (lineScan.hasNext())
                     {
                        lineScan.nextLine(); 
                     }
                     throw new InvalidCategoryException(Character.
                                          toString(caseIn));
                  
                     
               
               
                  
               
               
               }
            }
            catch (InvalidCategoryException e)
            {
               String  result = e + " in: " + line;
               addInvalidRecord(result);
            }
               
               
            catch (NumberFormatException nfe)
            {
               if (lineScan.hasNext())
               {
                  lineScan.nextLine(); 
               }
               String  result = nfe + " in: " + line;
               addInvalidRecord(result);
              
            
            }
         
         }
         
         
      }
      fileScan.close();
   }
   
   /**
    * addAirTicket method
    *
    * No return value, takes in AirTicket
    * and adds to the array.
    * 
    * @param ticketIn takes in an AirTicket.
    */
   public void addAirTicket(AirTicket ticketIn) {
      
      tickets = Arrays.copyOf(tickets, tickets.length + 1);
      tickets[tickets.length - 1] = ticketIn;
   }
   
   /**
    * addInvalidRecord Method
    *
    * Has no return value, accepts a String
    * and adds it to the String array field.
    *
    * @param recordIn takes in a String.
    */
   public void addInvalidRecord(String recordIn) {
      
      invalidRecords = Arrays.copyOf(invalidRecords, invalidRecords.length + 1);
      invalidRecords[invalidRecords.length - 1] = recordIn;
   }
    
    /**
     * generateReport method
     *
     * This method accepts no params and returns
     * a String representing the Air Ticket Report.
     *
     * @return returns a String.
     */
   public String generateReport() {
      String output = "----------------------------\n"
                    + "Air Ticket Report\n"
                    + "----------------------------\n\n";
      for (AirTicket ticket : tickets) {
         output += ticket.toString() + "\n";
      }
      
      return output;
   }
    
    
    /**
     * generateReportByFLightNum method
     * 
     * This meethod generates a string flight report
     * organized by flight number.
     *
     * @return returns a String.
     */
   public String generateReportByFlightNum() {
      
      Arrays.sort(tickets);
      String output = "--------------------------------------\n"
                    + "Air Ticket Report (by Flight Number)\n"
                    + "--------------------------------------\n\n";
      for (AirTicket ticket : tickets) {
         output += ticket.toString() + "\n";
      }
      
      return output;   
   }
   
   
    /**
     * generateReportByItinerary method
     *
     * This method returns a sorted report by Itinerary.
     *
     * @return String returns a String.
     */
   public String generateReportByItinerary() {
      
      Arrays.sort(tickets, new ItineraryComparator());
      
      String output = "--------------------------------------\n"
                    + "Air Ticket Report (by Itinerary)\n"
                    + "--------------------------------------\n\n";
      for (AirTicket ticket : tickets) {
         output += ticket.toString() + "\n";
      }
      
      return output;
   }
   
  /**
      * getTickets method
      *
      * This method accepts no params and
      * returns value of the AirTicket array.
      * 
      * @return returns an array.
      */
   public AirTicket[] getTickets() {
     
      return tickets;
      
      
   }
   
   /**
    * getInvalidInput method
    *
    * This method accepts no parameters
    * and returns the field for the array.
    *
    * @return returns a string array.
    */
   public String[] getInvalidInput() {
      
      return invalidRecords;
   }
    
    /**
     * generateReportForInvalidInput method
     *
     * This method accepts no params and returns
     * a String representing the Air Ticket report
     * for invalid Input.
     * 
     * @return returns a String.
     */
   public String generateReportForInvalidInput() {
      
      String output;
      
      output = "--------------------------------------\n"
                  + "Air Ticket Report for Invalid Input\n"
                  + "--------------------------------------\n";
      for (String record : invalidRecords) {
            
         output += record.toString() + "\n";
      }
      
      return output;
          
      
   } 
   
    


}
