package intro.methods;
import java.util.Scanner;

/*
  Code Challenge - Feet to Inches Converter

    You need to make a method that converts a foot value to inches.
      1 foot has 12 inches. 
  
    Define a convert() method, that takes the foot value as its argument and outputs the inches value.
    The result must be a double.

    The given code takes the foot value as input and passes it to the convert method. Define the convert method, so that the given code works.
*/

public class MethodParameters {
  // your code goes here

  public static void ain(String[] args) {
    Scanner sc = new Scanner(System.in);
    double num = sc.nextDouble();

    convert(num);
  }

  static void convert(double feet) {
    double res = feet * 12;
    System.out.println(res);
  }
}
