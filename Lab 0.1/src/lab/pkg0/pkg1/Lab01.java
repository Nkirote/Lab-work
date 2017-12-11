/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg0.pkg1;

/**
 *
 * @author florence
 */
interface Bank
  {
      void deposit(int amount);
      void withdraw(int amount);
      void getBalance();
  }
public class Lab01 implements Bank {

    /**
     * @param args the command line arguments
     */
       @Override
    public void deposit(int amount) {
           int deposit = 0;
   amount= amount+deposit;

    }

    @Override
    public void withdraw(int amount) {
           int drawings = 0;
           int withdraw = amount- drawings;
    }
    @Override
    public void getBalance() {
        
        }
    public static void main(String[] args) {
        // TODO code application logic here
    int balance;
    String ownwer;
    
    }

 
    
}
