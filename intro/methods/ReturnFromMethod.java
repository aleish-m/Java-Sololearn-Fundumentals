package intro.methods;
import java.util.Scanner;

/*
  Code Challenge - Celsius to Fahrenheit
    You are making a Celsius to Fahrenheit converter. 
    Write a method to take the Celsius value as an argument and return the corresponding Fahrenheit value.
      Sample Input
        36
      Sample Output
        96.8
    The given code takes the celsius value as input and passes it to a fahr() method, which you need to create.

  HINT: The following equation is used to calculate the Fahrenheit value: 1.8 * celsius + 32.
 */

public class ReturnFromMethod {
  // your code goes here
  public static double fahr(double celsius){
    double res = 1.8 * celsius + 32;
    return res;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double c = sc.nextDouble();

    System.out.println(fahr(c));
  }
}
