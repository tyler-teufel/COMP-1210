import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * This class tests TriangularPrismList.
 *
 * @author Tyler Teufel
 * @version 10.29.21
 */
public class TriangularPrismListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests getName method. **/
   @Test public void getNameTest() {
      TriangularPrism num1 = new TriangularPrism("num1", 7.0, 8.0);
      TriangularPrism num2 = new TriangularPrism("num2", 9.0, 6.0);
      TriangularPrism num3 = new TriangularPrism("num3", 5.0, 7.0);
      TriangularPrism[] testList = {num1, num2, num3};
      TriangularPrismList test1 = new TriangularPrismList("test1", testList, 3);
      Assert.assertEquals("test1", test1.getName());
   }
   
   /** Tests numberOfTriangularPrisms method. **/
   @Test public void numberOfTriangularPrismsTest() {
      TriangularPrism num1 = new TriangularPrism("num1", 7.0, 8.0);
      TriangularPrism num2 = new TriangularPrism("num2", 9.0, 6.0);
      TriangularPrism num3 = new TriangularPrism("num3", 5.0, 7.0);
      TriangularPrism[] testList = {num1, num2, num3};
      TriangularPrismList test1 = new TriangularPrismList("test1", testList, 3);
      Assert.assertEquals(3, test1.numberOfTriangularPrisms());
   }
   
   /** Tests totalSurfaceArea method. **/
   @Test public void totalSurfaceAreaTest() {
      TriangularPrism num1 = new TriangularPrism("num1", 7.0, 8.0);
      TriangularPrism num2 = new TriangularPrism("num2", 9.0, 6.0);
      TriangularPrism num3 = new TriangularPrism("num3", 5.0, 7.0);
      TriangularPrism[] testList = {num1, num2, num3};
      TriangularPrismList test1 = new TriangularPrismList("test1", testList, 3);
      Assert.assertEquals(569.234, test1.totalSurfaceArea(), .001);
   }
   
   /** Tests totalVolume method. **/
   @Test public void totalVolumeTest() {
      TriangularPrism num1 = new TriangularPrism("num1", 7.0, 8.0);
      TriangularPrism num2 = new TriangularPrism("num2", 9.0, 6.0);
      TriangularPrism num3 = new TriangularPrism("num3", 5.0, 7.0);
      TriangularPrism[] testList = {num1, num2, num3};
      TriangularPrismList test1 = new TriangularPrismList("test1", testList, 3);
      Assert.assertEquals(455.962, test1.totalVolume(), .001);
   }
   
   /** Tests averageSurfaceArea method. **/
   @Test public void averageSurfaceAreaTest() {
      TriangularPrism num1 = new TriangularPrism("num1", 7.0, 8.0);
      TriangularPrism num2 = new TriangularPrism("num2", 9.0, 6.0);
      TriangularPrism num3 = new TriangularPrism("num3", 5.0, 7.0);
      TriangularPrism[] testList = {num1, num2, num3};
      TriangularPrismList test1 = new TriangularPrismList("test1", testList, 3);
      Assert.assertEquals(189.745, test1.averageSurfaceArea(), .001);
   
   }
   
   /** Tests averageVolume method. **/
   @Test public void averageVolumeTest() {
      TriangularPrism num1 = new TriangularPrism("num1", 7.0, 8.0);
      TriangularPrism num2 = new TriangularPrism("num2", 9.0, 6.0);
      TriangularPrism num3 = new TriangularPrism("num3", 5.0, 7.0);
      TriangularPrism[] testList = {num1, num2, num3};
      TriangularPrismList test1 = new TriangularPrismList("test1", testList, 3);
      Assert.assertEquals(151.987, test1.averageVolume(), .001);
   }
   
   /** Tests toString method. **/
   @Test public void toStringTest() {
      TriangularPrism num1 = new TriangularPrism("num1", 7.0, 8.0);
      TriangularPrism num2 = new TriangularPrism("num2", 9.0, 6.0);
      TriangularPrism num3 = new TriangularPrism("num3", 5.0, 7.0);
      TriangularPrism[] testList = {num1, num2, num3};
      TriangularPrismList test1 = new TriangularPrismList("test1", testList, 3);
      Assert.assertTrue(test1.toString().contains("test1"));
   }
   
   /** Tests getList method. **/
   @Test public void getListTest() {
      TriangularPrism num1 = new TriangularPrism("num1", 7.0, 8.0);
      TriangularPrism num2 = new TriangularPrism("num2", 9.0, 6.0);
      TriangularPrism num3 = new TriangularPrism("num3", 5.0, 7.0);
      TriangularPrism[] testList = {num1, num2, num3};
      TriangularPrismList test1 = new TriangularPrismList("test1", testList, 3);
      Assert.assertEquals(testList, test1.getList());
   }
   
   /** Tests the addTriangularPrism method. **/
   @Test public void addTriangularPrismTest() {
      TriangularPrism num1 = new TriangularPrism("num1", 7.0, 8.0);
      TriangularPrism num2 = new TriangularPrism("num2", 9.0, 6.0);
      TriangularPrism num3 = new TriangularPrism("num3", 5.0, 7.0);
      TriangularPrism[] testList = new TriangularPrism[4];   
      testList[0] = num1;
      testList[1] = num2;
      testList[2] = num3;   
      TriangularPrismList test1 = new TriangularPrismList("test1", testList, 4);
      test1.addTriangularPrism("newTest", 17.0, 30.0);
      TriangularPrism newTest = new TriangularPrism("newTest", 17.0, 30.0);
      Assert.assertEquals(true, test1.findTriangularPrism(
                                                "newTest").equals(newTest));
      
   }
   
   /** Tests the findTriangularPrism method. **/
   @Test public void findTriangularPrismTest() {
      TriangularPrism num1 = new TriangularPrism("num1", 7.0, 8.0);
      TriangularPrism num2 = new TriangularPrism("num2", 9.0, 6.0);
      TriangularPrism num3 = new TriangularPrism("num3", 5.0, 7.0);
      TriangularPrism[] testList = new TriangularPrism[4];   
      testList[0] = num1;
      testList[1] = num2;
      testList[2] = num3;   
      TriangularPrismList test1 = new TriangularPrismList("test1", testList, 4);
      test1.addTriangularPrism("newTest", 17.0, 30.0);
      TriangularPrism newTest = new TriangularPrism("newTest", 17.0, 30.0);
      Assert.assertTrue(newTest.equals(
                                        test1.findTriangularPrism("newTest")));
      Assert.assertEquals(null, test1.findTriangularPrism("randtest"));
      
   } 
   
   /** tests the deleteTriangularPrism method. **/
   @Test public void deleteTriangularPrismTest() {
      TriangularPrism num1 = new TriangularPrism("num1", 7.0, 8.0);
      TriangularPrism num2 = new TriangularPrism("num2", 9.0, 6.0);
      TriangularPrism num3 = new TriangularPrism("num3", 5.0, 7.0);
      TriangularPrism[] testList = new TriangularPrism[4];   
      testList[0] = num1;
      testList[1] = num2;
      testList[2] = num3;   
      TriangularPrismList test1 = new TriangularPrismList("test1", testList, 4);
      test1.addTriangularPrism("newTest", 17.0, 30.0);
      TriangularPrism newTest = new TriangularPrism(
                                                      "newTest", 17.0, 30.0);
      Assert.assertTrue(newTest.equals(
                                 test1.deleteTriangularPrism("newTest")));
      Assert.assertEquals(null, test1.deleteTriangularPrism("randtest"));
      
      
   }
   
   /** tests the editTriangularPrism method. **/
   @Test public void editTriangularPrismTest() {
      TriangularPrism num1 = new TriangularPrism("num1", 7.0, 8.0);
      TriangularPrism num2 = new TriangularPrism("num2", 9.0, 6.0);
      TriangularPrism num3 = new TriangularPrism("num3", 5.0, 7.0);
      TriangularPrism[] testList = new TriangularPrism[4];   
      testList[0] = num1;
      testList[1] = num2;
      testList[2] = num3;   
      TriangularPrismList test1 = new TriangularPrismList("test1", testList, 4);
      test1.addTriangularPrism("newTest", 17.0, 30.0);
      TriangularPrism newTest = new TriangularPrism("newTest", 17.0, 30.0);
      Assert.assertEquals(true, test1.editTriangularPrism(
                                                    "newTest", 10.0, 11.0));
      Assert.assertEquals(false, test1.editTriangularPrism(
                                                    "randtest", 7.0, 8.0));
      
      
   }
   
   /** tests the findTriangularPrismWithLargestVolume
    method. **/
   @Test public void findTriangularPrismTestWithLargestVolume() {
      TriangularPrism num1 = new TriangularPrism("num1", 7.0, 8.0);
      TriangularPrism num2 = new TriangularPrism("num2", 9.0, 6.0);
      TriangularPrism num3 = new TriangularPrism("num3", 5.0, 7.0);
      TriangularPrism[] testList = new TriangularPrism[4];   
      testList[0] = num1;
      testList[1] = num2;
      testList[2] = num3;   
      TriangularPrismList test1 = new TriangularPrismList("test1", testList, 4);
      
      TriangularPrism[] badList = new TriangularPrism[5];
      TriangularPrismList badlist = new 
                                    TriangularPrismList("bad List", badList, 5);
      Assert.assertEquals(num2, test1.findTriangularPrismWithLargestVolume());
      Assert.assertEquals(null, badlist.findTriangularPrismWithLargestVolume());
      
      
   }
   
   
   
   
}
