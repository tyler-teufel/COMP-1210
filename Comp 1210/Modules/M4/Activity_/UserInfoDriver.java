/** 
 * 
 * This class contains the main method
 * to execute the desired methods of the
 * UserInfo class.
 *
 * @author Tyler Teufel
 * @version 9/14/21
 */
 
public class UserInfoDriver {
/** 
  * 
  * This main method creates instances
  * of the UserInfo class and stores
  * inputed data.
  *
  * 
  * @param args Command line arguments (not used).
  */
   public static void main(String[] args) {
      
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
      
      


   }

}