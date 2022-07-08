package com;
public class A {// super class
    public void show()
    {
        System.out.println("Stuti");
    }
}
  
class B extends A { // sub class of A
    public void show() { System.out.println("Jaita"); }
}
  
class C extends B {// sub class of B
    public void show()
    {
        System.out.println("Hrithik");
    }
    public static void main(String[] args)
    {
    	A g = new A();  // create object of A
        B g1 = new B();  // create object of B
        C g2= new C();  // create object of c
        g.show();  //  Method call
        g1.show();
        g2.show();
    }
}
