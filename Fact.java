import java.util.Scanner;
class Fact
{
  public static void main(String args[])
  {
    int n, c, f = 1;  //declaring variable
	System.out.println("Enter an integer to calculate its factorial");
    Scanner in = new Scanner(System.in);  // create scanner
    n = in.nextInt();
    if (n < 0)
      System.out.println("Number should be non-negative.");
    else
    {
      for (c = 1; c <= n; c++)   // for loop
        f = f*c;
      System.out.println("Factorial of "+n+" is = "+f);// to print statement
    }
  }
}
