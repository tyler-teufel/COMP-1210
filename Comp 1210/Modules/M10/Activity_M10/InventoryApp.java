/**
 * InventoryApp class
 *
 * This class contains the main method.
 *
 * @author Tyler Teufel
 * @version 11.2.21
 */
public class InventoryApp {
   
   /**
    * main method
    *
    * This method drives the Inventory classes.
    * 
    * @param args standard command line arguments.
    */
   public static void main(String[] args) {
      
      InventoryItem.setTaxRate(0.05);
      
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80.00, 1.8);
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      item3.setWordCount(700);
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L. G. Jones");
      
   
   }

}