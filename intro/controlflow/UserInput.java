package intro.controlflow;
import java.util.Scanner;

/* Code Challenge - Tip Calculator 
    You always tip 15% of the bill amount. 
    To make the calculation easier, you decide to write a program that will do that for you.
      Task: Take the bill amount as input and output the corresponding tip amount, which should be 15% of the amount.
      To calculate 15% of a number, multiply it by 15, then divide by 100.
*/

public class UserInput {
  public static void main(String[] args) {
    //your code goes here
    Scanner sc = new Scanner(System.in);
    int tip = 15;
    double bill = sc.nextDouble();
    double total = bill * tip / 100;
    System.out.println(total);
  }
}

// Example of two types of input declaration
//  String name = sc.nextLine();
//  int age = sc.nextInt();