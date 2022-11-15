/**
 * OnlineBook Class
 * 
 * This class inherits from OnlineTextItem and will
 * need to include a variable for the authors name.
 *
 * @author Tyler Teufel
 * @version 11.2.21
 */
public class OnlineBook extends OnlineTextItem {
   protected String author;
   
   /**
    * OnlineBook Constructor
    *
    * This method constructs OnlineBook objects.
    *
    * @param nameIn takes in a String.
    * @param priceIn takes in a double.
    */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
    
    /**
     * toString method override
     *
     * This method alters the toString method.
     *
     * @return returns a String.
     */
   public String toString() {
      return name + " - " + author + ": $" + price;
   }
   
   /**
    * setAuthor method
    * 
    * This method sets the Author.
    *
    * @param authorIn takes in a String.
    */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
     
}
