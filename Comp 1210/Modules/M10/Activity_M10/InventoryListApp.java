/**
 * InventoryListApp Class
 *
 * This class is the driver class for InventoryList.
 *
 * @author Tyler Teufel
 * @version 11.9.21
 */
public class InventoryListApp {
   
   /**
    * This method utilizes the other class methods
    * in order ot create new objects and edit them.
    *
    * @param args command line arguments
    */
   public static void main(String[] args) {
      ItemsList myItems = new ItemsList();
      
      InventoryItem.setTaxRate(0.05);
      
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      
      System.out.println(myItems.toString());
      
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }
}