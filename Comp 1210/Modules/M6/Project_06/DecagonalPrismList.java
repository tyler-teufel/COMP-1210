import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;




/**
 * This class stores the name of the list
 * and an ArrayList of DecagonalPrism objects.
 *
 * Also includes methods that return the name
 * of the list, number of objects in the 
 * DecagonalPrismList, total surface area,
 * total base area, total lateral surface area,
 * total volume, average surface area, and 
 * average volume for the objects in the list.
 * toString method returns a string containing
 * the name of the list followed by each object 
 * in the list, and a summaryInfo method
 * that returns summary info about the list.
 *
 * @author Tyler Teufel
 * @version 9/23/21
 */
public class DecagonalPrismList {
   
   //Fields
   private String listName;
   private ArrayList<DecagonalPrism> prisms;
   
   /**
    * ***Constructor***
    * 
    * Assigns inputed values to fields.
    *
    * @param nameIn fills the listName field.
    * @param prismsIn fills the prisms field.
    */
   public DecagonalPrismList(String nameIn, 
      ArrayList<DecagonalPrism> prismsIn) {
      
      listName = nameIn;
      prisms = new ArrayList<DecagonalPrism>(prismsIn);
      
   }
   
   //methods
   
   /**
    * ***Accessor Method***
    *
    * This method returns the String that
    * represents the listName field.
    *
    * @return listName
    */
   public String getName() {
      return listName;
   
   }
   
   /**
    * This method returns the number
    * of objects present in the ArrayList.
    *
    * 
    * @return returns an int of the size.
    */
   public int numberOfDecagonalPrisms() {
      
      if (prisms.size() == 0) {
         return 0;
      }
      else {
         return prisms.size();
      
      }
      
      
   }
   
   /**
    * This method returns the total surface Area
    * for all objects present in the list.
    *
    * @return surfaceArea returns the value.
    */
   public double totalSurfaceArea() {
      
      int listSize = prisms.size();
      double surfaceArea = 0;
      if (listSize == 0) {
         return 0;
      }
      
      else {
         for (DecagonalPrism prism : prisms) {
            surfaceArea += prism.surfaceArea();
         }
         
         return surfaceArea;
      }
   }
   
   /**
    * This method calculates and returns the
    * total base Area of all objects.
    *
    * @return baseArea returns the calculated result.
    */
   public double totalBaseArea() {
      
      int listSize = prisms.size();
      double baseArea = 0;
      
      if (listSize == 0) {
         return 0;
      }
      else {
         for (DecagonalPrism prism : prisms) {
            baseArea += prism.baseArea();
         }
         
         return baseArea;
      }
      
   }
   
   /**
    * This method calculates and returns the
    * the total Lateral Surface Area for all 
    * objects in the list.
    *
    * @return lateralArea returns calculated value.
    */
   public double totalLateralSurfaceArea() {
      
      int listSize = prisms.size();
      double lateralArea = 0;
      
      if (listSize == 0) {
         return 0;
      }
      else {
         for (DecagonalPrism prism : prisms) {
            lateralArea += prism.lateralSurfaceArea();
         }
         return lateralArea;
      }
   }
   
   /**
    * This method calculates the totaly volume in the list.
    *
    * @return totalVolume returns the calculated value.
    */
   public double totalVolume() {
      
      int listSize = prisms.size();
      double totalVolume = 0;
      
      if (listSize == 0) {
         return 0;
      }
      else {
         for (DecagonalPrism prism : prisms) {
            totalVolume += prism.volume();
         }
         
      }
      return totalVolume;
   }
   
   /**
    * This method calculates and returns the average suface
    * area for all objects in this list.
    *
    * @return totalSurfaceArea / listSize 
    * returns the calculated value.
    */
   public double averageSurfaceArea() {
      
      int listSize = prisms.size();
      double totalSurfaceArea = 0;
      
      if (listSize == 0) {
         return 0;
      }
      else {
         for (DecagonalPrism prism : prisms) {
            totalSurfaceArea += prism.surfaceArea();
         
         }
                  
      }
      return totalSurfaceArea / listSize;
      
   }
   
    /**
     * This method calculates and returns the average
     * volume for the entire list.
     *
     * @return totalVolume / listSize returns the
     * calculated value.
     */
   public double averageVolume() {
      
      int listSize = prisms.size();
      double totalVolume = 0;
      
      if (listSize == 0) {
         return 0;
      }
      else {
         for (DecagonalPrism prism : prisms) {
            totalVolume += prism.volume();
         
         }
                  
      }
      return totalVolume / listSize;
      
   }
   
   /**
    * Returns the ArrayList of DecagonalPrism objects.
    *
    * @return prisms returns the ArrayList.
    */
   public ArrayList<DecagonalPrism> getList() {
      return prisms;
   }
    /**
     * Reads a file and creates a new object.
     *
     * @param fileNameIn gives the name of the file.
     * @return list returns the created object.
     * @throws FileNotFoundException throws an exception 
     * if the file isn't found.
     */
   public static DecagonalPrismList readFile(
      
                           String fileNameIn) throws FileNotFoundException {
     
      ArrayList<DecagonalPrism> inputList = new ArrayList<DecagonalPrism>();
      Scanner fileScan = new Scanner(new File(fileNameIn));
      String fileName = fileScan.nextLine();
      while (fileScan.hasNextLine()) {
      
         
         String name = fileScan.nextLine();
         double val1 = Double.parseDouble(fileScan.nextLine());
         double val2 = Double.parseDouble(fileScan.nextLine());
         
         DecagonalPrism obj = new DecagonalPrism(name, val1, val2);
         inputList.add(obj);
         
            
         
         
      }
      fileScan.close();  // close input file
      
      DecagonalPrismList list = new DecagonalPrismList(fileName, inputList);
      return list;
   }
   
   /**
    * This method creates new DecagonalPrism objs
    * and adds them to the list.
    *
    * @param labelIn takes in the obj label.
    * @param edgeIn takes in the obj edge.
    * @param heightIn takes in the obj height.
    */
   public void addDecagonalPrism(String labelIn, 
                                   double edgeIn, double heightIn) {
         
      DecagonalPrism obj = new DecagonalPrism(labelIn, edgeIn, heightIn);
      prisms.add(obj);
   }
   /**
    * This method locates a corresponding obj
    * in the list by inputed label, or null if
    * not found.
    *
    * @param labelIn takes in the name of an obj.
    * @return obj if found, else null.
    */
   public DecagonalPrism findDecagonalPrism(String labelIn) {
      for (DecagonalPrism obj : prisms) {
         if ((obj.getLabel()).equalsIgnoreCase(labelIn)) {
            return obj;
         }
      }
      return null;
   }
   /**
    * This method locates and deletes a DecagonalPrism obj
    * if the lable is found, else null.
    *
    * @param labelIn takes in the desired obj label.
    * @return obj returns the deleted object, else null.
    */
   public DecagonalPrism deleteDecagonalPrism(String labelIn) {
      DecagonalPrism findPrism = findDecagonalPrism(labelIn);
      if (findPrism != null) {
         prisms.remove(findPrism);
         return findPrism;
         
      }
      return null;
   
   }
   /**
    * This method edits the objects inside of the list.
    *
    * @param labelIn takes in the label name.
    * @param edgeIn takes in the edge.
    * @param heightIn takes in the height.
    * @return true if the value was changed.
    */
   public boolean editDecagonalPrism(String labelIn, 
                                     double edgeIn, double heightIn) {
      DecagonalPrism findPrism = findDecagonalPrism(labelIn);
      if (findPrism != null) {
         findPrism.setEdge(edgeIn);
         findPrism.setHeight(heightIn);
         return true;
      }
         
      
      return false;
   
   }
   /**
    * This method concatenates the calculations
    * to a readible string value.
    *
    * @return output returns the string.
    */
   public String toString() {
      String output = getName() + "\n";
      int listSize = prisms.size();
      
      for (DecagonalPrism prism : prisms) {
         output += "\n" + prism.toString();
      
      }
      
      return output;
   }
   
   /**
    * This method returns the list summary.
    *
    * @return output returns the summary.
    */
   public String summaryInfo() {
      String output = "";
      DecimalFormat doubleVals = new DecimalFormat("#,##0.0##");
      
      output = "----- Summary for "
         + getName() + " -----\n"
         + "Number of Decagonal Prisms: " 
         + numberOfDecagonalPrisms() + "\n"
         + "Total Surface Area: "
         + doubleVals.format(totalSurfaceArea()) + "\n"
         + "Total Base Area: "
         + doubleVals.format(totalBaseArea()) + "\n"
         + "Total Lateral Surface Area: "
         + doubleVals.format(totalLateralSurfaceArea())
         + "\n"
         + "Total Volume: "
         + doubleVals.format(totalVolume()) + "\n"
         + "Average Surface Area: "
         + doubleVals.format(averageSurfaceArea()) + "\n"
         + "Average Volume: "
         + doubleVals.format(averageVolume());
      return output;
         
   
      
      
   }
     

}