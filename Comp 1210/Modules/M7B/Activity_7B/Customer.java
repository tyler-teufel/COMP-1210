/**
 ****Customer Class****
 * 
 * This class creates and stores 
 * Customer objects.
 *
 * @author Tyler Teufel
 * @version 10.19.21
 */
public class Customer implements Comparable<Customer> {
   
   //fields
   private String name;
   private String location;
   private double balance;
   
   //Constructor
   
   /**
    * Customer Constructor
    *
    * This method constructs Customer
    * objects with the inputed data.
    * 
    * @param nameIn takes in the customer's name.
    */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   
   //methods
   
   /**
    * setLocation method
    *
    * This method sets the Customer
    * locstion based on the parameter.
    *
    * @param locationIn takes in a String.
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /**
    * setLocation method
    *
    * This method sets the Customer
    * locstion based on the parameter.
    *
    * @param city takes in a String.
    * @param state takes in a String.
    */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }

   
   /**
    * changeBalance method
    *
    * This method alters the balance
    * for the respective customer.
    *
    * @param amount is a double.
    */
   public void changeBalance(double amount) {
      balance += amount;
   }
    
    /**
     * getLocation method
     *
     * This method returns the current location.
     *
     *@return location returns the location.
     */
   public String getLocation() {
      return location;
   }
   
   /**
    * getBalance method
    * 
    * This method returns the current balance.
    *
    * @return balance returns the balance.
    */
   public double getBalance() {
      return balance;
   }
   
   /**
    * toString method
    * 
    * This method formats the data.
    *
    * @return output returns the formatted String.
    */
   public String toString() {
      String output = name + "\n"
            + location + "\n"
            + "$" + balance;
      return output;
   }
   
   /**
    * compareTo method
    *
    * This method compared two objects
    * and returns an integer based upone
    * the evaluated comparison.
    *
    * @param obj takes in a Customer.
    * @return 0 returns an int.
    */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < .000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      else {
         return 1;
      }
   }
   
   
   

}