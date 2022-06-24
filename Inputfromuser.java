import java.util.Scanner;
class Inputfromuser{
  //Main method
  public static void main(String []args){
  Scanner myObj=new Scanner(System.in);//System.in is a statndard input stream
  String userName;
    //Asking for input from user
  System.out.println("Enter username");
  userName=myObj.nextLine();
//for printing username
   System.out.println("Username is:" +userName);
   }
  }
