import java.util.Scanner;
import java.io.*;
import java.util.*;
class GuessNo
{
  public static void main(string[] args)
  {
      Scanner sc=new Scanner(System.in);
      double user_no,guess_no,attempt=0;
      guess_no=(math.random()*99999);
      while(true)
      {
        attempt++;
        System.out.print("enter the number:");
        user_no=sc.nextDouble();
        if(user_no>guess_no)
             System.out.println("your number is high");
        else if(user_no==guess_no)
       {
          System.out.println("you win your guess a number:");
          System.out.println("you guess the number in " +attempt+"th attempt );
          break;
       }
       else
          System.out.println("your number is low");
     }
   }
}           
              