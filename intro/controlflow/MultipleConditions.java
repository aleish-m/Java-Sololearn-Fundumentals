package intro.controlflow;
import java.util.Scanner;

/* 
Code Challenge - Age Group
  Given the age of a person as an input, output their age group.
  Here are the age groups you need to handle:
    Child: 0 to 11
    Teen: 12 to 17
    Adult: 18 to 64

  Sample Input
    42
  Sample Output
    Adult
*/

public class MultipleConditions {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    // your code goes here
    
    if (age >= 0 && age <= 11) {
      System.out.println("Child");
    } else if (age > 11 && age <= 17) {
      System.out.println("Teen");
    } else if (age > 17 && age <= 64) {
      System.out.println("Adult");
    }
  }
}
