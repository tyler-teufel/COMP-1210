/**
 * InvalidCategoryException Class
 *
 * This class is a user defined exception created
 * by extending the Exception class.
 *
 * @author Tyler Teufel
 * @version 11.29.21
 */
public class InvalidCategoryException extends Exception {
   
    /**
     * Constructor
     *
     * This constructor creates a new exception.
     *
     * @param category takes in a String.
     */
   public InvalidCategoryException(String category) {
      
      super("For category: " + "\"" + category + "\"");
   }
   
   
}


