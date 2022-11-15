//this import statement allows for the use of the scanner function.
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

 /** 
  * Given user input, a ticket to the moon 
  * is produced if a proper code is entered.  
  *
  * @author Tyler Teufel
  * @version 9/10/21
  */

public class MoonTrip {
   
 /**
  * A complex equation is solved using user input
  * and math methods.
  * 
  *
  * @param args Command line arguments (not used).
  */
   public static void main(String[] args) {
      
      //string inputed by user.
      String ticketCode;
      
      //scanner created.
      Scanner userInput = new Scanner(System.in);
      
      System.out.print("Enter ticket code: ");
      ticketCode = userInput.nextLine();
      ticketCode = ticketCode.trim();
      
      //checking to be sure that the code is proper length.
      if (ticketCode.length() < 27) {
         System.out.println("\n*** Invalid Ticket Code ***\n"
                             + "Ticket code must have at least 27 characters.");
      }
      else {
         //seperating the date.
         String date = ticketCode.substring(0, 9);
         //seperating the time.   
         String time = ticketCode.substring(8, 13);
            
            
         //seperating the price, and formatting it as a double.  
         String priceCode = ticketCode.substring(12, 19);
         double price = Double.parseDouble(priceCode);
         DecimalFormat priceFormat = new DecimalFormat("$#,##0.00");
         
         //seperating the discount, and formatting it.  
         String discountCode = ticketCode.substring(21, 23);
         double discount = Double.parseDouble(discountCode) / 100;
         DecimalFormat discountFormat = new DecimalFormat("0%");
         
         //seperating the cost, calculating it.  
         double cost = price - (price * (discount));
         String seatCode = ticketCode.substring(23, 26);
         
         //creating the prize num.
         Random random = new Random(100000);
         int prizeNum = random.nextInt(100000);
         int len = ticketCode.length();
         DecimalFormat prizeFormat = new DecimalFormat("00000");
         
         //seperating the description.
         String description = ticketCode.substring(26, (len));
         //printing all info.   
         System.out.println("\nTicket: " + description  
                            + "   Date: " + date.substring(0, 2)
                            + "/" + date.substring(2, 4)
                            + "/" + date.substring(4, date.length() - 1)
                            + "   Time: " + time.substring(0, 2)
                            + ":" + time.substring(2, time.length() - 1)
                            + "\nSeat: " + seatCode
                            + "   Price: " + priceFormat.format(price)
                            + "   Discount: " + discountFormat.format(discount)
                            + "   Cost: " + priceFormat.format(cost)
                            + "\nPrize Number: " 
                            + prizeFormat.format(prizeNum));
          
          
      }
   }

}
