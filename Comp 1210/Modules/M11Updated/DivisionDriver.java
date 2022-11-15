import javax.swing.JOptionPane;
 /**
  * DivisionDriver class
  * 
  * Creates class Division, sets ints and decimals for
  * numerator and denominator.
  *  
  * @author Tyler Teufel
  * @version 16 Nov 2021
  */
public class DivisionDriver {
    
   /**
    * main method
    *
    * String numInput and denomInput.
    *
    * @param args not used
    */
   public static void main(String[] args) {
      String numInput = 
         JOptionPane.showInputDialog("Enter the numerator:");
      String denomInput = 
         JOptionPane.showInputDialog("Enter the denominator:");
      try {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
         String result = "Integer division: \n"
            + Division.intDivide(num, denom)
            + "\n\nFloating point division: \n"
            + Division.decimalDivide(num, denom);
         
         JOptionPane.showMessageDialog(null, result, "Result",
            JOptionPane.PLAIN_MESSAGE);
      } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null, "Invalid input: enter numerical "
            + "integer value only.", "Error", JOptionPane.PLAIN_MESSAGE);
      } catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null, e, "Error", 
            JOptionPane.PLAIN_MESSAGE);
      }
   }

}