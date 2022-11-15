import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
//import java.text.DecimalFormat;


/**
 * TriangularPrismTest Class
 *
 * This class contains test method for all
 * methods of TriangularPrism.
 *
 * @author Tyler Teufel
 * @version 10.14.21
 */
public class TriangularPrismTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** Test for label getter and setter methods. **/
   @Test public void labelTest() {
      TriangularPrism p1 = new TriangularPrism("p1", 17.0, 35.0);
      Assert.assertEquals(true, p1.setLabel("Tyler"));
      Assert.assertEquals(false, p1.setLabel(null));
      p1.setLabel("Toof");
      Assert.assertEquals("Toof", p1.getLabel());
     
      
   }
   
   /** Test for edge getter and setter methods. **/
   @Test public void edgeTest() {
      TriangularPrism p2 = new TriangularPrism("p2", 18.0, 30.0);
      Assert.assertEquals(18.0, p2.getEdge(), .001);
      Assert.assertEquals(true, p2.setEdge(7.0));
      Assert.assertEquals(false, p2.setEdge(-2.0));
   
   }
   
   /** Test for height getter and setter methods. **/
   @Test public void heightTest() {
      TriangularPrism p3 = new TriangularPrism("p3", 17.0, 31.0);
      Assert.assertEquals(31.0, p3.getHeight(), .001);
      Assert.assertEquals(true, p3.setHeight(7.0));
      Assert.assertEquals(false, p3.setHeight(-2.0));
   
   }
   
   /** Test triangleArea method. **/
   @Test public void triangleAreaTest() {
      TriangularPrism p4 = new TriangularPrism("p4", 4.0, 4.0);
      Assert.assertEquals(6.928, p4.triangleArea(), .001);
   }
   
   /** Test rectangleArea method. **/
   @Test public void rectangleAreaTest() {
      TriangularPrism p5 = new TriangularPrism("p5", 2.0, 4.0);
      Assert.assertEquals(8.0, p5.rectangleArea(), .001);
      p5.setEdge(47.25);
      p5.setHeight(17.32);
      Assert.assertEquals(818.370, p5.rectangleArea(), .001);
   }
   
   /** Test surfaceArea method. **/
   @Test public void surfaceAreaTest() {
      TriangularPrism p6 = new TriangularPrism("p6", 17.0, 30.0);
      Assert.assertEquals(1780.281, p6.surfaceArea(), .001);
   }
   
   /** Test volume method. **/
   @Test public void volumeTest() {
      TriangularPrism p7 = new TriangularPrism("p7", 17.0, 30.0);
      Assert.assertEquals(3754.220, p7.volume(), .001);
   }
   
   /** Test toString method. **/
   @Test public void toStringTest() {
      TriangularPrism p8 = new TriangularPrism("p8", 17.0, 30.0);
      Assert.assertTrue(p8.toString().contains("\"p8\""));
   }
   
   /** Test getCount method. **/
   @Test public void getCountTest() {
      TriangularPrism.resetCount();
      TriangularPrism p9 = new TriangularPrism("Tyler", 1.0, 2.0);
      Assert.assertEquals(1, TriangularPrism.getCount());
   
   }
   
   /** Test resetCount method. **/
   @Test public void resetCountTest() {
      TriangularPrism p10 = new TriangularPrism("p10", 20.0, 22.0);
      TriangularPrism.resetCount();
      Assert.assertEquals(0, TriangularPrism.getCount());
   }
   
   /** Test equals methods. **/
   @Test public void compareToTest() {
      TriangularPrism p11 = new TriangularPrism("P11", 27.0, 40.0);
      TriangularPrism p12 = new TriangularPrism("P11", 27.0, 40.0);
      TriangularPrism p13 = new TriangularPrism("P13", 28.0, 41.0); 
      Assert.assertEquals(true, p11.compareTo(p12)); 
      Assert.assertEquals(false, p11.compareTo(p13));
   
   }
   
   /** Test hashCode method. **/
   @Test public void hashCodeTest() {
      TriangularPrism p14 = new TriangularPrism("P14", 29.0, 50.0);
      Assert.assertEquals(0, p14.hashCode());
   }
   


}
