import java.text.DecimalFormat;

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
   private double baseEdge;
   private double height;
   
   //constructor
   
   /**
    * This constructor populates all fields of an object.
    *
    *@param labelIn is constructing the label field.
    *@param baseEdgeIn is constructing the baseEdge field.
    *@param heightIn is constructing the height field.
    */
   
   public DecagonalPrism(String labelIn, double baseEdgeIn, double heightIn) {
      
      setLabel(labelIn);
      setEdge(baseEdgeIn);
      setHeight(heightIn);
   
   }
   
   /**
    * This method stores a value in label.
    *
    *
    *@param labelIn provides value to store in label.
    *@return true if valid number.
    */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      else {
         return false;
      }   
   }
   
   /**
    * This method stores a value in baseEdge.
    *
    *
    *@param edgeIn provides value to store in baseEdge.
    *@return false if invalid entry.
    8@return true if invalid entry.
    */

   public boolean setEdge(double edgeIn) {
      if (edgeIn >= 0) {
         baseEdge = edgeIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * This method stores a value in height.
    *
    *
    *@param heightIn provides value to store in height.
    *@return true if valid entry.
    *
    */

   public boolean setHeight(double heightIn) {
      if (heightIn >= 0) {
         height = heightIn; 
         return true;
         
      }
      else {
         return false;
      }
   }
   
   /**
    * This method recalls the value in label.
    *
    *
    * @return label returns the value stored.
    */

   public String getLabel() {
      return label;
   }
   
   /**
    * This method recalls the value in baseEdge.
    *
    *
    * @return baseEdge returns the value stored.
    */

   public double getEdge() {
      return baseEdge;
   }
   
   /**
    * This method recalls the value in height.
    *
    *
    * @return height returns the stored value.
    */

   public double getHeight() {
      return height;
   }
   
   /**
    * This method returns the double value
    * for the surface area calculated using
    * edge and height.
    *
    * @return surfaceArea returns the value calculated.
    */
   public double surfaceArea() {
      
      double p1 = 10 * baseEdge * height;
      double p2 = 5 * (Math.pow(baseEdge, 2));
      double p3 = 2 * Math.sqrt(5);
      double p4 = Math.sqrt(5 + p3);
      double surfaceArea = p1 + (p2 * p4);
      return surfaceArea;
   
   }
   
   /**
    * This method returns the double value
    * for the base area calculated using
    * the edge.
    *
    * @return baseArea returns the value calculated.
    */

   public double baseArea() {
      
      double p1 = (5.0 / 2.0);
      double p2 = Math.pow(baseEdge, 2);
      double p3 = 2 * Math.sqrt(5);
      double p4 = Math.sqrt(5 + p3);
      double baseArea = p1 * p2 * p4;
      return baseArea;
   
   }
   
   /**
    * This method returns the double value
    * for the lateral surface area calculated using
    * the edge and height.
    *
    * @return lateralSurfaceArea returns the value calculated.
    */

   public double lateralSurfaceArea() {
      
      double lateralSurfaceArea = 10 * baseEdge * height;
      
      return lateralSurfaceArea;
   
   }
   
   /**
    * This method returns the double value
    * for the volume calculated using
    * the edge and height.
    *
    * @return volume returns the value calculated.
    */

   public double volume() {
   
      double p1 = 5.0 / 2.0;
      double p2 = Math.pow(baseEdge, 2);
      double p3 = 2 * Math.sqrt(5);
      double p4 = Math.sqrt(5 + p3);
      double volume = p1 * p2 * p4 * height;
      return volume;
   
      
   }
   
   /**
    *
    * This method concatenates the values into a string.
    * @return returns the final output after concatenation.
    */
   public String toString() {
      
      DecimalFormat doubleVals = new DecimalFormat("#,##0.0##");
      
      String output = "A decagonal prism \"" + label
         + "\" with edge = " + baseEdge 
         + " units and height = " + height
         + " units, has:\n"
         + "\tsurface area = " 
         + doubleVals.format(surfaceArea()) 
         + " square units\n"
         + "\tbase area = " + doubleVals.format(baseArea()) 
         + " square units\n"
         + "\tlateral surface area = " 
         + doubleVals.format(lateralSurfaceArea())
         + " square units\n" 
         + "\tvolume = " + doubleVals.format(volume()) 
         + " cubic units";
         
      return output;
   }

}