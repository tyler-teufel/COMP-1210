import java.text.DecimalFormat;

/**
 * TriangularPrism Class
 * 
 * This class will create and store
 * triangular prism objects.
 *
 * @author Tyler Teufel
 * @version 10.14.21
 */
public class TriangularPrism {
   
   //fields
   private String label = "";
   private double edge = 0;
   private double height = 0;
   
   //class variable
   private static int count = 0;
   
   //Constructor
   
   /**
    * TriangularPrism Constructor
    *
    * This method constructs TP objects.
    *
    * @param labelIn intakes a String.
    * @param edgeIn intakes a double.
    * @param heightIn intakes a double.
    */
   public TriangularPrism(String labelIn, double edgeIn, double heightIn) {
      count++;
      setLabel(labelIn);
      setEdge(edgeIn);
      setHeight(heightIn);
      
   }
   
   //Methods
   
   /**
    * getLabel Method
    *
    * This method returns the field value of label
    * for the respective object.
    *
    * @return label returns a String.
    */
   public String getLabel() {
      return label;
   }
    
    /**
     * setLabel Method
     *
     * This method checks to see if the value
     * being inputed is valid, and if true, sets
     * label equal to labelIn. Else, returns false.
     * 
     * @param labelIn takes in a String.
     * @return true returns a boolean.
     */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      return false;
     
   }
   
   /**
    * getEdge Method
    *
    * This method returns the current value of
    * the edge field for the respecgive object.
    *
    * @return edge returns a double.
    */
   public double getEdge() {
      return edge;
   }
   
   /**
    * setEdge Method
    *
    * This method takes in a double param and,
    * if a valid input, populates the edge field
    * and returns true; else, returns false.
    *
    * @param edgeIn takes in a double.
    * @return true returns a boolean.
    */
   public boolean setEdge(double edgeIn) {
      if (edgeIn >= 0) {
         edge = edgeIn;
         return true;
      }
      return false;
   
   }
   
   /**
    * getHeight Method
    * 
    * This method returns the current value
    * of height for the respective object.
    * 
    * @return height returns a double
    */
   public double getHeight() {
      return height;
   }
   
   /**
    * setHeight Method
    *
    * This method takes in a double param and,
    * if a valid input, populates the heigt field
    * and returns true; else, returns false.
    *
    * @param heightIn intakes a double.
    * @return true returns a boolean.
    */
   public boolean setHeight(double heightIn) {
      if (heightIn >= 0) {
         height = heightIn;
         return true;
      }
      return false;
   }
   
   /**
    * triangleArea Method
    *
    * This method accepts no params,
    * calculating and returning the
    * double value for the area of one
    * of the triangles faces of the prism.
    *
    * @return triArea returns a double.
    */
   public double triangleArea() {
      double triArea;
      triArea = 0.25 * Math.sqrt(3 * Math.pow(edge, 4));
      return triArea;
    
   }
   
   /**
    * rectangleArea Method
    *
    * This method accepts no params and
    * returns a double value for area of
    * one of the rectangle sides of the prism.
    *
    * @return recArea returns a double
    */
   public double rectangleArea() {
      double recArea;
      recArea = edge * height;
      return recArea;
   }
   
   /**
    * surfaceArea Method
    *
    * Accepts no parameters and returns the double
    * value for the total surface area of the
    * TriangularPrism object.
    *
    * @return surfArea returns a double
    */
   public double surfaceArea() {
      double surfArea;
      surfArea = 2 * this.triangleArea() + 3 * this.rectangleArea();
      
      return surfArea;
   }
   
   /**
    * volume Method
    *
    * This method accepts no params and returns 
    * the double value for the volume of the 
    * TriangularPrism.
    *
    * @return totVolume returns a double.
    */
   public double volume() {
      double totVolume;
      totVolume = this.triangleArea() * height;
      return totVolume;
   }
   
   /**
    * toString Method
    *
    * This method returns a formatted String of the
    * calculated info of TriangularPrism object.
    *
    * @return output returns a String.
    */
   public String toString() {
      DecimalFormat doubleVals = new DecimalFormat("#,##0.0##");
      String output = "TriangularPrism \"" + label + "\" "
                    + "with triangle edge of " + doubleVals.format(edge)
                    + " units\n and prism height of " 
                    + doubleVals.format(height)
                    + " units has:\n"
                    + "\ttriangle area = " + doubleVals.format(triangleArea())
                    + " square units\n"
                    + "\trectangle area = " + doubleVals.format(rectangleArea())
                    + " square units\n"
                    + "\tsurface area = " + doubleVals.format(surfaceArea())
                    + " square units\n"
                    + "\tvolume = " + doubleVals.format(volume())
                    + " cubic units\n";
      return output;
   }
   
   /**
    * getCount Method
    * 
    * This method returns the total
    * count of objects created.
    *
    * @return count returns an int.
    */
   public static int getCount() {
      return count;
   }
   
   /**
    * resetCount Method
    *
    * This method resets the count of objects to 0.
    *
    */
   public static void resetCount() {
      count = 0;
   }
   
   /**
    * equals Method
    *
    * This method is an instance method that accepts
    * a param of type Object and returns false if the
    * Object is not a TriangularPrism; otherwise, when
    * cast to a TriangularPrism, if it has the same field
    * value as the TriangluarPrism upon which the method
    * was called, it returns true. Otherwise, it returns
    * false.
    *
    * @param obj takes in an Object.
    * @return false returns boolean.
    */
   public boolean equals(Object obj) {
      if (!(obj instanceof TriangularPrism)) { 
         return false;
      } else {
         TriangularPrism d = (TriangularPrism) obj; 
         return (label.equalsIgnoreCase(d.getLabel())
                  && (Math.abs(edge - d.getEdge()) < .000001)
                  && (Math.abs(height - d.getHeight()) < .000001));
      } 
   }
   
   /**
    * hashCode Method
    *
    * accepts no params and returns 0.
    * 
    * @return 0 returns an int.
    */
   public int hashCode() {
      return 0;
   }
   


}