  /** 
    * This class contains a series of variables
    * and methods that hold inputed info.
    *
    * @author Tyler Teufel
    * @version 9/14/21
    */
    
public class UserInfo {
   
   //instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
   
   //constructor
   
   /**
    * This constructor creates new UserInfo objects.
    *
    * @param firstNameIn user input of their first name.
    * @param lastNameIn user input of their last name.
   */
   public UserInfo(String firstNameIn, String lastNameIn) {
   
      firstName = firstNameIn;
      lastName = lastNameIn;
      
      location = "Not specified";
      age = 0;
      status = OFFLINE; 
      
   }
   
   //methods
   /**
    *
    *This method concatenates the values into a string.
    *@return returns the final output after concatenation.
    */
   public String toString() {
      
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      
      return output;
   }
   
    /**
     *
     * This method sets the location to an input.
     *
     * @param locationIn takes a user inputed location.
     */ 
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
    /**
     *
     * This method returns true or false depending
     * on if age is > 0.
     *
     * @param ageIn is a userinputed value of age.
     * @return returns a boolean weather age entered is valid.
     */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
         
      }
      return isSet;
   }
   
    /**
     *
     * This method allows a user to input age.
     * @return returns age.
     */
   public int getAge() {
      return age;
   }
    /**
     * returns location.
     * @return returns location.
     */
   public String getLocation() {
      return location;
   }
    /**
     * sets status to offline.
     * 
     */
   public void logOff() {
      status = OFFLINE;
   }
    /**
     * sets status to online.
     *
     */
   public void logOn() {
      status = ONLINE;
   }
   
   
   



}