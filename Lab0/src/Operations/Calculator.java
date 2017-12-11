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
public class Calculator extends Arithmetic{

    public int sub;

    public float getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }

//    public Calculator(int a, int b) {
//        super(a, b);
//    }
@Override
public int difference()
{ 
  if(this.getA()>this.getB())
  {
       int sub=this.getA()-this.getB();
  return sub;
      
    }
else
  {
    System.out.println("The second number is larger");
  }

  System.out.println("Difference is"+sub);
    return (int) sub;
}
}


