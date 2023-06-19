package intro.controlflow;
import java.util.Scanner;

/*
  Code Challenge - Factorial

   The factorial of a number N is equal to 1 * 2 * 3 * ... * N
   For example, the factorial of 5 is 1* 2 * 3 * 4 * 5  = 120.
   Create a program that takes a number from input and output the factorial of that number. 

   Use a for loop to make the calculation, and start the loop from the number 1.
 */

public class ForLoop {
  public static void main(String[] args) {
    // your code here

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int result = 1;

    for(int x = 1; x <= num; x++){
      result *= x;
    }

    System.out.println(result);
  }
}
