import java.util.ArrayList;
/**
 * This class creates and stores and Integer
 * ArrayList of temperatures.
 *
 * @author Tyler Teufel
 * @version September 28th, 2021
 */
public class Temperatures {
   
   private ArrayList<Integer> temperatures;
   
   /**
     ***constructor***.
     *
     * @param temperaturesIn helps to construct the temperatures
     * variables.
    */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      
      temperatures = new ArrayList<Integer>(temperaturesIn);
   
   }
   //Methods
   
   /**
    * Returns the lowest temp.
    *
    * @return low temp.
    *
    */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
     
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      
      }
      
     
     
      return low;
       
   }
   
   /**
    * Returns the highest temp.
    *
    * @return high for high temp.
    */
   public int getHighTemp() {
   
      if (temperatures.isEmpty()) {
         return 0;
      }
      
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
         
      }
      return high;
      
   }
   
   /**
    * Returns the lowest of the value inputed and
    * the lowest val in the list.
    * 
    * @param lowIn is an integer.
    * @return lowIn if it is lower than getLow
    * else return getLowTemp() value.
    */
   public int lowerMinimum(int lowIn) {
   
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   
   }
   
   /**
    * Returns the highest of the value inputed and the
    * highest val in the list.
    *
    * @param highIn is an integer representing a temp.
    * @return the higher of the values.
    */
   public int higherMaximum
   (int highIn) {
      
      return highIn > getHighTemp() ? highIn : getHighTemp();
   
   }
   
   /**
    * This toString method returns a formatted set of values.
    * @return string concatonation.
    */
   public String toString() {
      return "\tTemperatures: " + temperatures
           + "\n\tLow: " + getLowTemp()
           + "\n\tHigh: " + getHighTemp();
   }


}