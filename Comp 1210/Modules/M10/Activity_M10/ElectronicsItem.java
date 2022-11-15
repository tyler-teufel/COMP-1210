
/**
 * ElectronicsItem class
 *
 * This class creates items of the Electronic types.
 *
 * @author Tyler Teufel
 * @version 11.2.21
 */
public class ElectronicsItem extends InventoryItem {
   
   protected double weight;
   /** Static variable representing shipping. */
   public static final double SHIPPING_COST = 1.5;
   
   
   /**
    * ElectronicsItem Constructor
    *
    * This method constructs ElectronicsItem objects.
    *
    * @param nameIn takes in a String.
    * @param priceIn takes in a double.
    * @param weightIn takes in a double.
    */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
      
      
   }
   
   
   /**
    * CalculateCost override
    * 
    * This method overrides the original method
    * to take into account shipping.
    * @return returns a double.
    */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
   
   
   
   
   
   
   
   
}