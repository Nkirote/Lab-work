/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operations;

/**
 *
 * @author florence
 */
public class Arithmetic {
      private int a;
// public Arithmetic(int a, int b) {
//        this.a = 5;
//        this.b = 10;
//    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    private int b;

   
        public int sum()
    {
       int sum=a+b; 
       return sum;
    }
    public int difference()
    {
        int difference=a-b;
        return difference;
    }
    public int product()
    {
        int product=a*b;
        return product;
    }
}
