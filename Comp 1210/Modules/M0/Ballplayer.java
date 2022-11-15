/* * 
 * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * Ballplayer * * * * * * * * * * * 
 *
  * Produces a Ballplayer object, that can contain
  * a name, a uniform number, and a batting average.  
  *
  * @author Tyler Teufel
  * @version 10/3/22
  */
public class Ballplayer {
   
   //Instance variables; aspects of a Ballplayer.
   private String name;
   private int number;
   private double battingAverage;
   
   
   /**
    * Constructor 1
    *
    * This constructor accounts for all instance variables.
    *
    * @param nameIn takes in the Ballplayer's name.
    * @param numberIn takes in the Ballplayer's number.
    * @param battingAvgIn takes in the Ballplayer's batting average.
    */
   public Ballplayer(String nameIn, int numberIn, double battingAvgIn) {
      
      name = nameIn;
      number = numberIn;
      battingAverage = battingAvgIn;
    
   }
   
   /**
    * Constructor 2
    *
    * This constructor overloads the original constructor,
    * accounting for when no information is known.
    *
    */
   public Ballplayer() {
   
   }
   
   /**
    * Constructor 3
    *
    * This constructor overloads the original constructor,
    * accounting for when the BA is unknown.
    *
    * @param nameIn takes in the Ballplayer's name.
    * @param numberIn takes in the Ballplayer's number.
    */
   public Ballplayer(String nameIn, int numberIn) {
      name = nameIn;
      number = numberIn;
   
   }
   
   
   /**
    * toString method
    *
    * The toString method takes all of the object's
    * corresponding information, and puts it in a readable form.
    *
    * @return output returns the concatenated information.
    */
   public String toString() {
      String output = "Ballplayer: \n\tName: " + name + "\n\tNumber: " + number 
                    + "\n\tBatting Average: " + battingAverage + "\n";
      return output;
                  
   }
   
   
   /**
    * Main Method
    * 
    * The main method is the central environment for executing your code,
    * creating new objects, and calling your different methods.
    *
    */
   public static void main(String[] args) {
   
     //Creating data for the first Ballplayer object.
      String myName = "Tyler Toof";
      int myNum = 17;
      double battingAvg = .567;
         
         //Creating data for the second Ballplayer object.
      String zacsName = "Zac Toof";
      int zacsNum = 13;
      
      
      //Creates a basic Ballplayer object as per Constructor 1.
      Ballplayer toof = new Ballplayer(myName, myNum, battingAvg);
      
      //Creates an empty Ballplayer to test constructor 2.
      Ballplayer empty = new Ballplayer();
      
      //Creates a partial ballplayer to test constructor 3.
      Ballplayer zacToof = new Ballplayer(zacsName, zacsNum);
      
      
      
      //Prints out each object.
      System.out.println(toof); 
      System.out.println(zacToof);
      System.out.println(empty);
   
   
   }
   
   

   



}