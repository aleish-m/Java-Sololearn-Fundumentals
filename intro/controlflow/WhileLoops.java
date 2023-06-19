package intro.controlflow;
import java.util.Scanner;

/*
Code Challenge - Sum
  Your math teacher asked you to calculate the sum of the numbers 1 to N, where N is a given number.
  Task: Take an integer N from input and output the sum of the numbers 1 to N, inclusive.

  Sample Input:
   10

  Sample Output:
   55
 */

public class WhileLoops {
  public static void main(String[] args) {
    
    // your code goes here
    
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    int x = 0;
    int sum = 0;

    while (x <= num) {
      sum += x++;
    };
    System.out.println(sum);
  }
}
