package com;
class Bank{  // super class
int interest(){
	return 0;
}  
}    
class SBI extends Bank{  // sub class of Bank
int interest(){
	return 8;
	}  
}  
  
class ICICI extends Bank{  // sub class of SBI
int interest(){
	return 7;
	}  
}  
class AXIS extends Bank{  // sub class of ICICI
int interest(){
	return 9;
	}  
}  
class Rate{  //Rate class to create objects and call the methods  
public static void main(String args[]){  
SBI a=new SBI();  
ICICI b=new ICICI();  
AXIS c=new AXIS();  
System.out.println("Rate of Interest of SBI: "+a.interest());  
System.out.println("Rate of Interest of ICICI: "+b.interest());  
System.out.println("Rate of Interest of AXIS: "+c.interest());  
}  
}  
