/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interestapplication;
import SavingsAccount.SavingsAccount;
/**
 * @author thompjor
 * @version 0.1
 */
public class InterestApplication {

  
    public static void main(String[] args) {
       
        //Instantiate two objects of class SavingsAccount
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);
        
        //Calculate monthly interest and add it to the balance
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        
        //Print current balances
        System.out.println("The balance for Saver1 is now: " + saver1.getSavingsBalance());
        System.out.println("The balance for Saver2 is now: " + saver2.getSavingsBalance());
        
        //Change the interest rate to the argument
        SavingsAccount.modifyInterestRate(0.05);
        
        //Calculate monthly interest again and add it to the balance
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        
        //Print current balances again
        System.out.println("The new balance for Saver1 is: " + saver1.getSavingsBalance());
        System.out.println("The new balance for Saver2 is: " + saver2.getSavingsBalance());
    }
}
