import java.text.DecimalFormat;
/**
 * Elite Class
 *
 * This class extends Business.
 *
 * @author Tyler Teufel
 * @version 11.5.21
 */
public class Elite extends Business {
   
   //Fields
   
   private double communicationServices;
   
   /**
    * Elite Constructor
    *
    * This constructor extends Business
    * to make Elite level data.
    *
    * @param flightNumberIn takes in a String.
    * @param tripDataIn takes in an Itinerary.
    * @param baseFareIn takes in a double.
    * @param fareAdjustmentFactorIn takes in a double.
    * @param foodAndBevIn takes in a double.
    * @param entertainmentIn takes in a double.
    * @param commServIn takes in a double.
    */
   public Elite(String flightNumberIn, Itinerary tripDataIn,
                    double baseFareIn, double fareAdjustmentFactorIn,
                    double foodAndBevIn, double entertainmentIn,
                    double commServIn) {
      super(flightNumberIn, tripDataIn, baseFareIn, fareAdjustmentFactorIn,
            foodAndBevIn, entertainmentIn);
      communicationServices = commServIn;
   }
   
   
   /**
    * totalFare method
    *
    * This method calculates the total fare.
    *
    * @return returns a double.
    */
   public double totalFare() {
      return super.totalFare() + communicationServices;
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
      return super.toString() + "   Includes: Comm Services: "
                       + doubleVals.format(communicationServices) + "\n";
   }
}

