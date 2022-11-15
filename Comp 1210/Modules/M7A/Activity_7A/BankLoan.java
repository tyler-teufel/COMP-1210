/**
 * BankLoan
 * 
 * This class creates BankLoan objects and contains
 * relevant methods to interacting with the objects,
 * or local data created in the main method.
 *
 * @author Tyler Teufel
 * @version 10.12.2021
 */
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;
   
   //static variables
   private static int loansCreated = 0;
   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   
   /**
    * BankLoan 
    *
    * This method is the constructor for the class.
    * @param customerNameIn populates customerName.
    * @param interestRateIn populates interestRate.
    */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   
   /**
    * borrowfromBank
    *
    * This methodreturns a boolean that determines
    * if the amount imputed can be taken from the bank.
    *
    * @param amount is the requested amount.
    * @return true if valid, else false.
    */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   
   /**
    * payBank
    * 
    * This method takes in an amount paid towards
    * the loan, and returns either the overcharge if
    * more than is owed is paid, or alters the balance
    * of the loan and returns 0.
    *
    * @param amountPaid is the inputed payment.
    * @return newBalance as a positive value if overcharge.
    */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   /**
    * getBalance
    * 
    * This method returns the value of balance.
    * 
    * @return balance returns the balance.
    */
   public double getBalance() {
      return balance;
   }
   /**
    * setInterestRate
    *
    * This method takes in a value for interestRate and,
    * if the input is valid, sets interestRate to the value
    * and returns true; else returns false.
    * 
    * @param interestRateIn enters an interest rate.
    * @return true if true, false if false.
    */
   public boolean setInterestRate(double interestRateIn) {
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   /**
    * getInterestRate
    * 
    * This method returns the current interest rate.
    * @return interestRate returns the current interest rate.
    */
   public double getInterestRate() {
      return interestRate;
   }
   /**
    * chargeInterest
    *
    * This method alters balance by computing 
    * the interest charged.
    */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
    * isAmountValid
    *
    * This static method checks if any double value
    * is considered a valid loan.
    *
    * @param amount is a double value.
    * @return true if valid, else false.
    */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }
    
    /**
     * isInDebt
     *
     * Boolean method that determines if user is in debt.
     *
     * @param loan is entered to determine debt.
     * @return true if in debt, else false.
     */
     
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   
   /**
    * getLoansCreated
    * 
    * This method returns the value of loans created.
    * @return loansCreated returns an int.
    */
   public static int getLoansCreated() {
      return loansCreated;
   }
   
   /**
    * resetLoansCreated
    *
    * This method resets the loansCreated var to 0.
    *
    */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
   /**
    * toString
    *
    * The toString method formats a string return
    * value for the desired return of a BankLoan object.
    * 
    * @return output returns the formatted string.
    */

   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
