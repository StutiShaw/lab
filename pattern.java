public class pattern 
{    
public static void main(String args[])   
{     
int i, j, n=5;         // declaring variable
for (i=0; i<n; i++)   
{        
for (j=n-i; j>1; j--)   
{    
System.out.print(" ");   // to print space
}     
for (j=0; j<=i; j++ )   
{         
System.out.print("* ");   // to print star
}     
System.out.println();   
}   
}   
}
