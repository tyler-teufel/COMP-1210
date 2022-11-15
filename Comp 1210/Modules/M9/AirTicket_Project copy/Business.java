import java.text.DecimalFormat;

/**
 * Business class
 *
 * This class contains a Business level extension
 * of the AirTicket abstract class.
 *
 * @author Tyler Teufel
 * @version 11.5.21
 */
public class Business extends AirTicket {
   
   //Fields
   protected double foodAndBev;
   protected double entertainment;
   
   /** Constant. */
   public static final double BUSINESS_AWARD_FACTOR = 2.0;
   
   //Constructor
   
   /**
    * Business Constructor
    *
    * This constructor extends AirTicket
    * to make Business level data.
    *
    * @param flightNumberIn takes in a String.
    * @param tripDataIn takes in an Itinerary.
    * @param baseFareIn takes in a double.
    * @param fareAdjustmentFactorIn takes in a double.
    * @param foodAndBevIn takes in a double.
    * @param entertainmentIn takes in a double.
    */
   public Business(String flightNumberIn, Itinerary tripDataIn,
                    double baseFareIn, double fareAdjustmentFactorIn,
                    double foodAndBevIn, double entertainmentIn) {
      super(flightNumberIn, tripDataIn, baseFareIn, fareAdjustmentFactorIn);
      foodAndBev = foodAndBevIn;
      entertainment = entertainmentIn;
   }
   
   /**
    * totalFare
    *
    * This method returns the total cost.
    *
    * @return returns a double.
    */
   public double totalFare() {
      
      return (baseFare * fareAdjustmentFactor)
               + foodAndBev + entertainment;
   }
   
   /**
    * totalAwardMiles method
    * 
    * This method calculates the total
    * award points.
    *
    * @return returns an int.
    */
   public int totalAwardMiles() {
      
      return (int) (tripData.getMiles() * BUSINESS_AWARD_FACTOR);
   }
   
   /**
    * toString method
    *
    * This method puts the data into a String.
    *
    * @return returns a string.
    */
   public String toString() {
      DecimalFormat doubleVals = new DecimalFormat("$#,##0.00");
      return super.toString() 
            + "\n   Includes Food/Beverage: " 
            + doubleVals.format(foodAndBev) + " Entertainment: "
            + doubleVals.format(entertainment)
            + "\n";
    
   }
   
}
