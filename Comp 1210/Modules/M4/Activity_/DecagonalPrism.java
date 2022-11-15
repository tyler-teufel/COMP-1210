/**
 * This class stores the label, edge, and height.
 * This class will include methods to set and get
 * each of these fields, as well as calculation
 * methods for the nececcary values.
 *
 *@author Tyler Teufel
 *@version 9/16/21
 */
 
public class DecagonalPrism {
   
   private String label;
   private double base_edge;
   private double height;
   
   //constructor
   
   /**
    *
    *
    *
    *
    *
    */
   
   public DecagonalPrism(String labelIn, double baseEdgeIn, double heightIn) {
      
      setLabel(labelIn);
   
   }
   
   public void setLabel(String labelIn) {
   
      label = labelIn;
   }

}