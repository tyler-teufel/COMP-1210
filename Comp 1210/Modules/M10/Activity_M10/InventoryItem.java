/**
 * InventoryItems Class
 *
 * This program represents an inventory
 * item in a store. 
 *
 * @author Tyler Teufel
 * @version 11.2.21
 */
public class InventoryItem {

  //Fields
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
  
  /**
   * This constructor creates instances of 
   * the inventoryItems class.
   *
   * @param nameIn takes in a name.
   * @param priceIn takes in a price.
   */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
      
   }
   
   /**
    * getName method
    *
    * This method returns the name.
    * 
    * @return name returns the name.
    */
   public String getName() {
      return name;
   }
   
   /**
    * calculateCost method
    *
    * This method calculates the cost with tax
    * of the item.
    *
    * @return price returns the price.
    */
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   
   /**
    * setTaxRate method
    *
    * This method sets the tax rate.
    *
    * @param taxRateIn takes in a tax rate
    */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
   /**
    * toString method
    * 
    * This method returns a String representation
    * with the name and price with tax.
    *
    * @return name  returns the formatted info.
    */
   public String toString() {
      
      return name + ": $" + this.calculateCost();
   }
   
   


}