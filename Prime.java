import java.util.Scanner;
public class Prime
{    
 public static void main(String args[])
 {    
  int i,a=0,f=0;   // declaring variable
    Scanner sc=new Scanner(System.in);  // creating scanner
	System.out.print("enter the number :");
	int n=sc.nextInt();  
      
  a=n/2;      
  if(n==0||n==1)  // if statement
  {  
   System.out.println(n+" is not prime number");    //  to print statement  
  }
  else
  {  
   for(i=2;i<=a;i++)
   {      
    if(n%i==0)
	{      
     System.out.println(n+" is not prime number");     // to print statement  
     f=1;      
     break;      
    }      
   }      
   if(f==0) 
   {
   System.out.println(n+" is prime number"); }  //to print statement  
  }  
}    
}
