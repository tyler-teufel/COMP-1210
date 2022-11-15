/**
 * Division Class
 *
 * This class computes diivsion two ways, statically.
 * 
 * @author Tyler Teufel
 * @version 16 Nov 2021
 */
public class Division {
   /**
    * intDivide method
    *
    * Int values of numerastor and denomenator division.
    *
    * @param num is an int.
    * @param denom is an int.
    * @return returns 0.
    */
   public static int intDivide(int num, int denom) {
      try {
         return num / denom;
      } catch (ArithmeticException e) {
         return 0;
      }
   }
    
    /**
     * decimalDivide class
     *
     * Decimal float values of num and denom.
     *
     * @param num takes an int.
     * @param denom takes an int.
     * @return returns float divide.
     * @throws IllegalArgumentException cannot equal 0.
     */
   public static float decimalDivide(int num, int denom) {
      if (denom == 0) {
         throw new IllegalArgumentException("The denom "
            + "cannot be zero");
      }
      return (float) num / denom;
   }
}