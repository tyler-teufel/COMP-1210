import java.text.DecimalFormat;

/** 
 * AirTicket Class
 * 
 * This class is abstract and cannot be instantiated.
 *
 * @author Tyler Teufel
 * @version 11.4.21
 */
public abstract class AirTicket implements Comparable<AirTicket> {
   
   //Fields
   
   protected String flightNumber;
   protected Itinerary tripData;
   protected double baseFare;
   protected double fareAdjustmentFactor;
   
   //Constructor
   
   /**
    * AirTicket Constructor
    *
    * This constructor creates Itinerary objects.
    *
    * @param flightNumberIn takes in a String.
    * @param tripDataIn takes in an Itinerary.
    * @param baseFareIn takes in a double.
    * @param fareAdjustmentFactorIn takes in a double.
    */
   public AirTicket(String flightNumberIn, Itinerary tripDataIn,
                    double baseFareIn, double fareAdjustmentFactorIn) {
      flightNumber = flightNumberIn;
      tripData = tripDataIn;
      baseFare = baseFareIn;
      fareAdjustmentFactor = fareAdjustmentFactorIn;
   }
   
   /**
    * getFlightNum method
    *
    * this method returns the flightNum.
    *
    * @return flightNumber returns a String.
    */
   public String getFlightNum() {
      return flightNumber;
   }
    
    /**
     * getBaseFare method
     *
     * Accepts no params and returns a double.
     *
     * @return baseFare returns a double. 
     */
   public double getBaseFare() {
      return baseFare;
   }
   
   /**
    * getFareAdjustmentFactor method
    * 
    * This method returns the fare adjustment
    * factor represented by a double.
    *
    * @return getFareAdjustmentFactor returns a double.
    */
   public double getFareAdjustmentFactor() {
      return fareAdjustmentFactor; 
   }
   
   /**
    * toString method
    * 
    * This method puts the data into a String.
    *
    * @return returns a String.
    */
   public String toString() {
      DecimalFormat doubleVals = new DecimalFormat("$#,##0.00");
      return "Flight: " + flightNumber + "\n" + tripData.toString()
         + " (" + totalAwardMiles() 
         + " award miles)\nBase Fare: " + doubleVals.format(getBaseFare()) 
         + " Fare Adjustment Factor: " + getFareAdjustmentFactor()
         + "\nTotal Fare: " + doubleVals.format(totalFare()) 
         + " (" + getClass() + ")";
      
   }
   
   /**
    * totalFare method
    * 
    * Abstract method to be implemented in
    * subclasses.
    * 
    * @return returns a double.
    */
   public abstract double totalFare();
   
   /**
    * totalAwardMiles method
    *
    * Abstract method to be implemented in
    * subclasses.
    *
    * @return returns an int.
    */
   public abstract int totalAwardMiles();
   
   
   /**
    * getItinerary Method
    *
    * This method returns the itinerary.
    *
    * @return returns the value for the tripData.
    */
   public Itinerary getItinerary() {
    
      return tripData;
   }
    
    
    /**
     * compareTo method
     *
     * This method compares two objects based upon
     * their flight number.
     *
     * @param ticket takes in a ticket.
     * @return an int based upon the comparison.
     */
   public int compareTo(AirTicket ticket)
   {
      return (flightNumber).compareTo(ticket.getFlightNum());
   }
    

}