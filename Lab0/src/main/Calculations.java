/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Operations.Calculator;
import java.util.Scanner;

/**
 *
 * @author florence
 */
public class Calculations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Calculator calculator=new Calculator();
          calculator.setA(12);
          calculator.setB(11);
         System.out.println("Sum is"+calculator.sum()); 
          System.out.println("Difference is"+calculator.difference());
          System.out.println("Product is"+calculator.product());

    }
    
}
