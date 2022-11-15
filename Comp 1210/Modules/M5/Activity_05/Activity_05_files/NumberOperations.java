/**
 * This class stores the label, edge, and height.
 * This class will include methods to set and get
 * each of these fields, as well as calculation
 * methods for the nececcary values.
 *
 *@author Tyler Teufel
 *@version 9/21/21
 */
public class NumberOperations {
   private int number;
   
   /**
    * Constructs an object from parameter.
    * @param numberIn is put into the variable
    * number in the new object.
    */
   public NumberOperations(int numberIn) {
      
      number = numberIn;
   }
   
   /**
    * Get method returns the number variable
    * of the object.
    * @return number returns the variable.
    */
   public int getValue() {
      
      return number;
   }
   
   /**
    * Takes no parameters.
    * @return output returns a string.
    */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
      
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   
   /**
    * Takes no parameters.
    * @return output returns a string.
    */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      
      while (powers < number) {
         output += powers + "\t"; //concatenate to output.
         powers = powers * 2; //get next power of 2.
      
      }
      
      return output;
   }
   
   /**
    * Takes an int parameter, returns int.
    * @param compareNumber int.
    * @return 0 placeholder.
    */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0; 
      }
   }
   
   /**
    * formats the object return into a string.
    * @return output string.
    */
   public String toString() {
      return number + "";
   
   }
   

}