/**
 * Economy Class
 *
 * This class contains info and methods regarding
 * the economy level air ticket Itinerary.
 *
 * @author Tyler Teufel
 * @version 11.5.21
 */
public class Economy extends AirTicket {
  
   //fields
   /** 
    * economyAwardMilesFactor variable
    *
    * This variable holds a constant.
    */
   public static final double ECONOMY_AWARD_FACTOR = 1.5;
   
   //Constructor
   
   /**
    * Economy Constructor
    *
    * This constructor creates obejcts of the Economy
    * type that extend AirTicket.
    *
    * @param flightNumberIn takes in a String.
    * @param tripDataIn takes in an Itinerary.
    * @param baseFareIn takes in a double.
    * @param fareAdjustmentFactorIn takes in a double.
    */
   public Economy(String flightNumberIn, Itinerary tripDataIn,
                    double baseFareIn, double fareAdjustmentFactorIn) {
      super(flightNumberIn, tripDataIn, baseFareIn, fareAdjustmentFactorIn);
   }

    public Economy(String flightNum, Itinerary plan, double baseFareIn, double fareAdjustmentFactorIn) {
    }

    //methods
   
   /**
    * totalFare Method
    *
    * This method calculates and returns the
    * total fare cost.
    *
    * @return returns a double.
    */
   public double totalFare() {
      return baseFare * fareAdjustmentFactor;
   }
    
    /**
     * totalAwardMiles method
     *
     * This method returns the total award miles.
     *
     * @return returns an int.
     */
   public int totalAwardMiles() {
      return (int) (tripData.getMiles() * ECONOMY_AWARD_FACTOR);
   }
   
   /**
    * toString method
    *
    * This method puts the data into String
    * format.
    *
    * @return returns a string.
    */
   public String toString() {
      return super.toString() 
            + "\n   Includes Award Miles Factor: " + ECONOMY_AWARD_FACTOR
            + "\n";
   }
}