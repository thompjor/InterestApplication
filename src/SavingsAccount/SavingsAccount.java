/*
 * This simple application calculates interest rates, 
 * adds it to the current balance, and prints the balance
 */
package SavingsAccount;

/**
 *
 * @author thompjor
 */
public class SavingsAccount {
    
   private static double annualInterestRate = 0.04;
   private double savingsBalance;

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
   
   public SavingsAccount(double balance){
       savingsBalance = balance;
   }
    public void calculateMonthlyInterest(){
        savingsBalance += (savingsBalance * annualInterestRate)/ 12.0;
    }
    
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
        System.out.println("The interest rate was changed to: " + annualInterestRate);
    }
    
}
