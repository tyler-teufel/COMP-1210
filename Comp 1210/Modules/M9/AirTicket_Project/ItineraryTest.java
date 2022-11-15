import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** 
 * ItineraryTest Class
 *
 * This class tests Itinerary.
 *
 * @author Tyler Teufel
 * @version 11.4.21
 */
public class ItineraryTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests if the correct var is outputed. **/
   @Test public void getFromAirportTest() {
      Itinerary goHomeTyler = new Itinerary("ATL", "JFK", "2021/11/19 2100",
                                             "2021/11/26 1100", 998);
      Assert.assertEquals("ATL", goHomeTyler.getFromAirport());
   }
   
   /** Tests if the correct var is outputed. **/
   @Test public void getToAirportTest() {
      Itinerary goHomeTyler = new Itinerary("ATL", "JFK", "2021/11/19 2100",
                                             "2021/11/26 1100", 998);
      Assert.assertEquals("JFK", goHomeTyler.getToAirport());
   }
   
   /** Tests if the correct var is outputed. **/
   @Test public void getDepDateTime() {
      Itinerary goHomeTyler = new Itinerary("ATL", "JFK", "2021/11/19 2100",
                                             "2021/11/26 1100", 998);
      Assert.assertEquals("2021/11/19 2100", goHomeTyler.getDepDateTime());
   }
   
   /** Tests if the correct var is outputed. **/
   @Test public void getMilesTest() {
      Itinerary goHomeTyler = new Itinerary("ATL", "JFK", "2021/11/19 2100",
                                             "2021/11/26 1100", 998);
      Assert.assertEquals(998, goHomeTyler.getMiles());
   }
   
   /** Tests if the correct var is outputed. **/
   @Test public void toStringTest() {
      Itinerary goHomeTyler = new Itinerary("ATL", "JFK", "2021/11/19 2100",
                                             "2021/11/26 1100", 998);
      Assert.assertEquals("ATL-JFK (2021/11/19 2100 - 2021/11/26 1100)"
                          + " 998 miles", goHomeTyler.toString());
   }
}
