/**
 * InvalidCategoryException class
 *
 * This class is a user defined exception created by
 * extending the Exception class
 *
 * @author Tyler Teufel
 * @version 11.19.21
 */
 
 public class InvalidCategoryException extends Exception {
   
   /**
    * InvalidCategoryException Constructor
    *
    * This constructor takes in a category String,
    * and creates a new Exception object.
    *
    * @param categoryIn takes in a String.
    */
   public InvalidCategoryException(String categoryIn) {
      
      super("For category: " + "\"" + category + "\"");
      
   }
   
   
 }