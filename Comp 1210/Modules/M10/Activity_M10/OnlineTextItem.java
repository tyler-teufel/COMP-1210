/**
 * OnlineTextItem Class
 * 
 * This class represents the number of online items.
 *
 * @author Tyler Teufel
 * @version 11.2.21
 */
public abstract class OnlineTextItem extends InventoryItem {
   
   /**
    * OnlineTextItem Constructor
    *
    * This method constructs new objects.
    *
    * @param nameIn takes in a String.
    * @param priceIn takes in a double.
    */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   
   /**
    * calculateCost method override
    * 
    * This method calculates the cost without tax.
    *
    * @return price returns a double.
    */
   public double calculateCost() {
      return price;
   }
   
   
}