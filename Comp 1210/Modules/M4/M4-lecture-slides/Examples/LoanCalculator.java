import java.util.Scanner;
/** Driver class for Loan. */
public class LoanCalculator {

   /**  
    * @param args - not used
    */   
   public static void main(String[] args) {
      double loanAmount;
      String loanType;
      Loan loan;
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter c for customer loan or e "
         + "for employee loan: ");
      loanType = input.nextLine().toLowerCase();
      
      if (loanType.charAt(0) == 'e') {
         loan = new Loan(Loan.EMPLOYEE_ACCOUNT);
      } 
      else {
         loan = new Loan(Loan.CUSTOMER_ACCOUNT);
      } 
      
      System.out.print("Enter the amount that you would like to borrow: ");
      loanAmount = Double.parseDouble(input.nextLine());
      
   	/* use the return from the borrow method to determine 
   		whether the loan is valid */
      if (loan.borrow(loanAmount)) {
         System.out.println("\n" + loan);
      }
      else {
         System.out.println("*** Amount exceeds limit ***");
      }
   }
}
