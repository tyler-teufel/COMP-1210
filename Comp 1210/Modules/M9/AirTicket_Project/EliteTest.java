import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Elite Test class
 *
 * This class tests Economy.
 *
 * @author Tyler Teufel
 * @version 11.5.21
 */
public class EliteTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test on totalFare. **/
   @Test public void totalFareTest() {
      Itinerary trip = new Itinerary("ATL", "JFK", "2021/11/19 2100",
                                             "2021/11/26 1100", 998);
      Elite test = new Elite("DL 1860", trip, 450, 2.0, 50.0, 50.00, 100.00);
      Assert.assertEquals(1100, test.totalFare(), 1);
   }
   
   /** A test on totalAwardMiles. **/
   @Test public void totalAwardMilesTest() {
      Itinerary trip = new Itinerary("ATL", "JFK", "2021/11/19 2100",
                                             "2021/11/26 1100", 998);
      Elite test = new Elite("DL 1860", trip, 450, 2.0, 50.0, 50.00, 100.00);
      Assert.assertEquals(1996, test.totalAwardMiles(), 1);
   }
   
   /** A test on toString. **/
   @Test public void toStringTest() {
      Itinerary trip = new Itinerary("ATL", "JFK", "2021/11/19 2100",
                                             "2021/11/26 1100", 998);
      Elite test = new Elite("DL 1860", trip, 450, 2.0, 50.0, 50.00, 100.00);
      Assert.assertTrue(test.toString().contains("ATL-JFK"));
   }
   
   /** A test on getFlightNumber. **/
   @Test public void getFlightNumberTest() {
      Itinerary trip = new Itinerary("ATL", "JFK", "2021/11/19 2100",
                                             "2021/11/26 1100", 998);
      Elite test = new Elite("DL 1860", trip, 450, 2.0, 50.0, 50.00, 100.00);
      Assert.assertEquals("DL 1860", test.getFlightNum());
   }
   
   /** A test on getBaseFare. **/
   @Test public void getBaseFareTest() {
      Itinerary trip = new Itinerary("ATL", "JFK", "2021/11/19 2100",
                                             "2021/11/26 1100", 998);
      Elite test = new Elite("DL 1860", trip, 450, 2.0, 50.0, 50.00, 100.00);
      Assert.assertEquals(450, test.getBaseFare(), 1);
   }
   
   /** A test on getFareAdjustmentFactor. **/
   @Test public void getFareAdjustmentFactorTest() {
      Itinerary trip = new Itinerary("ATL", "JFK", "2021/11/19 2100",
                                             "2021/11/26 1100", 998);
      Elite test = new Elite("DL 1860", trip, 450, 2.0, 50.0, 50.00, 100.00);
      Assert.assertEquals(2.0, test.getFareAdjustmentFactor(), .0001);
   }
   
}
