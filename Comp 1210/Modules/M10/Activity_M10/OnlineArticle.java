/**
 * OnlineArticle Class creates a subclass that inherits
 * objects from OnlineTextItem.
 *
 * @author Tyler Teufel
 * @version 11.2.21
 */
public class OnlineArticle extends OnlineTextItem {
   private int wordCount;
   
   /**
    * OnlineArticle Construct
    * 
    * This method creates new OnlineArticle objects.
    *
    * @param nameIn takes in a String.
    * @param priceIn takes in a double.
    */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
      
   }
   
   /**
    * setWordCount method
    * 
    * This method takes an int and sets the wordCount var.
    * @param countIn takes in an int.
    */
   public void setWordCount(int countIn) {
      wordCount = countIn;
   }
   
}