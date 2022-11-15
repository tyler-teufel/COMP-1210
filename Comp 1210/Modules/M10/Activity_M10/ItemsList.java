/**
 * ItemsList Class
 *
 * This class creates ItemsList objects
 * which hold an array of Items.
 *
 * @author Tyler Teufel
 * @version 11.9.21
 */
public class ItemsList {
   
   //Fields
   private InventoryItem[] inventory;
   private int count;
   
   /**
    * ItemsList Constructor
    *
    * This constructor constructs ItemsList objects.
    */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   /**
    * addItem Method
    *
    * This method adds an item to the array.
    *
    * @param itemIn takes in an object to add to the list
    */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   
   
   /**
    * calculateTotal Method
    *
    * This method calculates the total price of all of
    * the items.
    *
    * @return returns the cost after it has been calculated.
    * @param electronicsSurcharge takes in a double.
    */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         } else {
            total += inventory[i].calculateCost();
         }
      }
      
      return total;
   }
   
   
   /**
    * toString method
    *
    * This method formats the data into String form.
    *
    * @return returns the formatted toString.
    */
   public String toString() {
      String result = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         result += inventory[i] + "\n";
      }
      
      return result;
   }
}