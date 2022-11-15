import java.util.Comparator;

/**
 * ItineraryComparator class
 *
 * compares Itinerary objects.
 *
 * @author Tyler Teufel
 * @version 11.12.21
 */
public class ItineraryComparator implements Comparator<AirTicket> {
  
  /**
   * compare method
   *
   * This method determines the comparison of the Itinerary,
   * based upon the toString() of the Itinerary.
   *
   * @param ticket1 ticket one.
   * @param ticket2 ticket two.
   * @return int if equal or less than or equal to.
   */
   public int compare(AirTicket ticket1, AirTicket ticket2) {
   
      return (ticket1.getItinerary()).toString().
            compareTo((ticket2.getItinerary()).toString());
   }
   
   
}