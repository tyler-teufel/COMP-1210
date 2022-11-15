public class ContinueWhileExample {

   public static void main(String[] args) {
   
      String searchStr = "how much wood could a woodchuck chuck " 
            + "if a woodchuck could chuck wood";
      int max = searchStr.length();
      int numCs = 0;
      int i = 0; 
   
      while (i < max) {
         // interested only in p's
         if (searchStr.charAt(i) != 'c') {
            i++;
            continue;
         }
      
         // process u's
         numCs++;
         i++;
      }
      System.out.println("Found " + numCs + " c's in the string.");
   }
}