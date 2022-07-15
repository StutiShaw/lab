package com;

public class RectangleTest {
	public static void main(String[] args)
	{ 
	   Rectangle rect = new Rectangle(40,20); 
	  int l = rect.getLength(); 
	  int b = rect.getBreadth(); 

	  int Area = l * b; 
	  System.out.println("Area: " +Area); 

	  rect.setLength(30); 
	  rect.setBreadth(30); 
 
	  int ln = rect.getLength(); 
	  int br = rect.getBreadth(); 
	  int newArea = ln * br; 
	 System.out.println("New area: " +newArea); 
	 } 
}
