/**
 * NonRefundable Class
 *
 * This class extends AirTicket.
 *
 * @author Tyler Teufel
 * @version 11.5.21
 */
public class NonRefundable extends AirTicket {
   
   //Fields
   private double discountFactor;
   
   //Cosntructor
   
   /**
    * NonRefundable Constructor
    *
    * This Constructor creates NonRefundable
    * Objects.
    *
    * @param flightNumberIn takes in a String.
    * @param tripDataIn takes in an Itinerary.
    * @param baseFareIn takes in a double.
    * @param fareAdjustmentFactorIn takes in a double.
    * @param discountFactorIn takes in a double.
    */
   public NonRefundable(String flightNumberIn, Itinerary tripDataIn,
                    double baseFareIn, double fareAdjustmentFactorIn,
                    double discountFactorIn) {
                    
      super(flightNumberIn, tripDataIn, baseFareIn, fareAdjustmentFactorIn);
      discountFactor = discountFactorIn;            
   }
   
   /**
    * getDiscountFactor method
    *
    * Getter method for DiscountFactor.
    *
    * @return discountFactor returns a double.
    */
   public double getDiscountFactor() {
      return discountFactor;
   }
   
   /**
    * totalFare method
    * 
    * This method returns the totalFare.
    *
    * @return returns a double.
    */
   public double totalFare() {
      return baseFare * fareAdjustmentFactor * discountFactor;
   }
    
    /**
     * totalAwardMiles Method
     *
     * This method returns the totalAwardMiles.
     *
     * @return returns an int.
     */
   public int totalAwardMiles() {
      return tripData.getMiles();
   }
   
   /**
    * toString method
    *
    * This method puts the data into a String.
    *
    * @return returns a String.
    */
   public String toString() {
      return super.toString()
             + "\n   Includes DiscountFactor: " + discountFactor + "\n";
   }
     
}

