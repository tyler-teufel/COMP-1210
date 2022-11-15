import java.text.DecimalFormat;

  /**
   * TriangularPrismList class
   *
   * This class makes objects containing lists of prisms.
   * 
   * @author Tyler Teufel
   * @version 10.27.21
   */
public class TriangularPrismList {
   
   private String listName;
   private TriangularPrism[] prisms;
   private int numPrisms = 0;
   
   /**
    * TriangularPrismList constructor
    *
    * This method constructs TriangularPrismList objects.
    *
    * @param nameIn takes in a name of the list.
    * @param prismsIn takes in an array of TriangularPrisms.
    * @param numIn takes in an int representing the numPrisms.
    */
   public TriangularPrismList(String nameIn, TriangularPrism[] prismsIn,
                               int numIn) {
   
      listName = nameIn;
      prisms = prismsIn;
      numPrisms = numIn;
   }
   
   /**
    * getName method
    *
    * This method returns the list name.
    * 
    * @return listName returns a name.
    */
   public String getName() {
      return listName;
   }
   
   /**
    * numberOfTriangularPrisms
    *
    * This method returns the number of
    * TriangularPrism objects in the list.
    *
    * @return numPrisms.
    */
   public int numberOfTriangularPrisms() {
      return numPrisms;
   }
    
    /**
     * totalSurfaceArea
     *
     * returns a double representing the total
     * surface area for all objects in the list.
     *
     * @return totalSurfArea returns a double.
     */
   public double totalSurfaceArea() {
      double totalSurfArea = 0;
      for (TriangularPrism obj : prisms) {
         totalSurfArea += obj.surfaceArea();
      }
      return totalSurfArea; 
   }
   
   /**
    * totalVolume
    *
    * This method returns a double representing
    * the total volumes for all TriangularPrism
    * objects in the list.
    * @return totalSurfArea returns a double.
    */
   public double totalVolume() {
      double totVolume = 0;
      for (TriangularPrism obj : prisms) {
         totVolume += obj.volume();
      }
      return totVolume;
   }
   
   /**
    * averageSurfaceArea
    *
    * This method returns a double representing
    * the average surface area for all objects 
    * in the list.
    *
    * @return avgSurfArea returns a double.
    */
   public double averageSurfaceArea() {
      double len = prisms.length;
      if (len == 0)
      {
         return 0;
      }
      
      return this.totalSurfaceArea() / len;
      
   }
   
   /**
    * averageVolume
    *
    * This method returns a double representing
    * the average volume for all objs in the list.
    *
    * @return avgVolume returns a double.
    */
   public double averageVolume() {
      int len = prisms.length;
      
      if (len == 0) {
         return 0;
      }
      
      return this.totalVolume() / len;
   }
    
    /**
     * toString
     *
     * This method returns a String formatting
     * the output of the list data.
     *
     * @return output returns a String.
     */
   public String toString() {
      DecimalFormat doubleVals = new DecimalFormat("#,##0.0##");
      String output = "";
      
      output = "----- Summary for " + listName + " -----\n"
             + "Number of TriangularPrisms: " + this.numberOfTriangularPrisms()
             + "\nTotal Surface Area: " 
             + doubleVals.format(this.totalSurfaceArea())
             + " square units\nTotal Volume: "
             + doubleVals.format(this.totalVolume())
             + " cubic units\nAverage Surface Area: "
             + doubleVals.format(this.averageSurfaceArea())
             + " square units\nAverage Volume: "
             + doubleVals.format(this.averageVolume()) + "\n";
      return output; 
   }
   
   /**
    * getList
    *
    * This method returns the array of TriangularPrisms.
    *
    * @return prisms returns an array.
    */
   public TriangularPrism[] getList() {
      return prisms;
   }
    
    /**
     * addTriangularPrism
     * 
     * This method creates a new TriangularPrism obj
     * and adds it to the array.
     *
     * @param labelIn takes in a String.
     * @param edgeIn takes in a double.
     * @param heightIn takes in a double.
     */
   public void addTriangularPrism(String labelIn, 
                                  double edgeIn, double heightIn) {
      prisms[numPrisms - 1] = new TriangularPrism(labelIn, edgeIn, heightIn);
      /*
      TriangularPrism newPrism = new TriangularPrism(labelIn, edgeIn, heightIn);
      TriangularPrism[] newPrisms = new TriangularPrism[numPrisms];
      for (int i = 0; i < prisms.length; i++) {
         newPrisms[i] = prisms[i];
      }
      newPrisms[numPrisms] = newPrism;
      prisms = newPrisms;
      numPrisms++;
      
      TriangularPrism addElement[] = new TriangularPrism[numPrisms];
      
      for (int i = 0; i < prisms.length; i++) {
         addElement[i] = prisms[i];
      }
      
      addElement[numPrisms - 1] = newPrism;
      prisms = addElement;
      */
   }
   
   /**
    * findTriangularPrism method
    *
    * This method searches the array for an obj
    * with the corresponding label name.
    *
    * @param label is a String.
    * @return desiredPrism returns the prism.
    */
   public TriangularPrism findTriangularPrism(String label) {
      
      for (TriangularPrism obj : prisms) {
         if (obj.getLabel().equalsIgnoreCase(label)) {
            return obj;
         }
      }
      return null;
   }
    /**
     * deleteTriangularPrism method
     *
     * This method locates and removes a TriangularPrism obj.
     *
     * @param label takes in a string.
     * @return prisms[i].getLabel() returns a String.
     */
   public TriangularPrism deleteTriangularPrism(String label) {
      TriangularPrism findEl;
      
      for (int i = 0; i < numPrisms; i++) {
      
         if (prisms[i].getLabel().equalsIgnoreCase(label)) {
            findEl = prisms[i];
            for (int j = i; j < numPrisms - 1; j++) {
               prisms[j] = prisms[j + 1];
            }
            prisms[numPrisms - 1] = null;
            numPrisms--;
            return findEl;
         }
         
      }
      
      return null;
   }
   
   /**
    * editTriangularPrism method
    *
    * This method searches for a desired obj and edits it,
    * else returns false.
    * 
    * @param label takes in a String.
    * @param edge takes in a double.
    * @param height takes in a double.
    * @return true if true, else false.
    */
   public boolean editTriangularPrism(String label, 
                                      double edge, double height) {
      TriangularPrism obj = this.findTriangularPrism(label);
      
      if (obj == null) {
         return false;
      }
      else {
         obj.setEdge(edge);
         obj.setHeight(height);
         return true;
      }
   }
   
   /**
    * findTriangularPrismWithLargestVolume method
    * 
    * This method finds the obj with the largest volume.
    * @return maxPrism returns a TriangularPrism.
    */
   public TriangularPrism findTriangularPrismWithLargestVolume() {
      TriangularPrism maxPrism = null;
      double max = 0;
      
      if (numPrisms == 0) {
         return null;
      }
      
      for (TriangularPrism obj : prisms) {
         if (obj == null)
         {
            break;
         }
         if (obj.volume() > max) {
            max = obj.volume();
            maxPrism = obj;
         }
      }
      return maxPrism;
    
   }
    
    
   
}