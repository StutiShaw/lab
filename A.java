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
    	A g = new A();
        B g1 = new B();
        C g2= new C();
        g.show();
        g1.show();
        g2.show();
    }
}