/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Arrays;
import jdk.internal.util.xml.impl.Input;

/**
 *
 * @author florence
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] intages={20,45,47,38,35,67,18,34};
        System.out.println(Arrays.toString(intages));
       int b=intages[0]-18;
       intages=Input.nextInt();
       System.out.println(b);
    }
    
}
