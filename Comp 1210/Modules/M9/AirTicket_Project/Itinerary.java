/**
 * Itinerary Parent Class
 *
 * This class contains data about trips and
 * provides methods to get departure date/time, 
 * miles, and a toString method of data.
 *
 * @author Tyler Teufel
 * @version 11.4.21
 */
public class Itinerary {
   
   //Fields
   private String fromAirport;
   private String toAirport;
   private String departure;
   private String arrival;
   private int miles;
   
   //Constructor
   
   /**
    * Itinerary Constructor
    *
    * This method constructs Itinerary objects.
    *
    * @param fromAirportIn takes in a String.
    * @param toAirportIn takes in a String.
    * @param departureIn takes in a String.
    * @param arrivalIn takes in a String.
    * @param milesIn takes in an int.
    */
   public Itinerary(String fromAirportIn, String toAirportIn,
                    String departureIn, String arrivalIn, int milesIn) {
      
      fromAirport = fromAirportIn;
      toAirport = toAirportIn;
      departure = departureIn;
      arrival = arrivalIn;
      miles = milesIn;                
   }
   
   
   //Methods
   
   /**
    * getFromAirport method
    *
    * This method accepts no params and
    * returns a String.
    *
    * @return fromAirport returns a String.
    */
   public String getFromAirport() {
      return fromAirport;
   }
   
   
   /**
    * getToAirport method
    *
    * This method accepts no params and
    * returns a String.
    *
    * @return toAirport returns a String.
    */
   public String getToAirport() {
      return toAirport;
   }
   
   /**
    * getDepDateTime method
    *
    * This method accepts no params and
    * returns a String.
    *
    * @return departure returns a String.
    */
   public String getDepDateTime() {
      return departure;
   }
   
   /**
    * getMiles method
    *
    * This method accepts no params and
    * returns an int.
    *
    * @return miles returns a int.
    */
   public int getMiles() {
      return miles;
   }
   
   /**
    * toString method
    *
    * This method returns a formatted String
    * containing all of the data.
    *
    * @return returns a String.
    */
   public String toString() {
      
      return fromAirport + "-" + toAirport + " ("
           + departure + " - " + arrival + ") " + miles + " miles";
    
   }


}