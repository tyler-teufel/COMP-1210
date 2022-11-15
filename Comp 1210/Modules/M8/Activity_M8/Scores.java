/**
 * This class holds an array of numerical
 * values and provides methods that allow
 * users to interact with the Scores class.
 * 
 * @author Tyler Teufel
 * @version 10.26.21
 */
public class Scores 
{

   private int[] numbers;
   
   /**
    * This method constructs Score objects.
    * @param numbersIn takes in an array.
    * 
    */
   public Scores(int[] numbersIn) {
   
      numbers = numbersIn;
   
   }
   
   /**
    * This method takes no params, and 
    * returns an array of even ints.
    * @return evens returns an even int array.
    */
   public int[] findEvens() {
      int numberEvens = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      
      int[] evens = new int[numberEvens];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   
   /**
    * This method takes no parameters, and
    * returns an array of odd ints.
    * @return odds returns and odd int array
    */
   public int[] findOdds() {
      int numberOdds = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numberOdds++;
         }
      }
      
      int[] odds = new int[numberOdds];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   
   }
   
   /**
    * This method takes no params and returns
    * the average score as a double.
    * @return average returns a double.
    */
   public double calculateAverage() {
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      
      return (double) sum / (double) numbers.length;
      
   }
   
   /**
    * This method returns a string containing
    * all of the scores.
    * @return result returns all scores.
    */
   public String toString() {
      
      String result = "";
      
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
         
         
      }
      return result;
   }
   
   
   /**
    * This method returns a string containing
    * all scores in reverse order.
    * @return result returns the scores reversed.
    */
   public String toStringInReverse() {
      String result = "";
      
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      
      return result;
   }
   
   

}