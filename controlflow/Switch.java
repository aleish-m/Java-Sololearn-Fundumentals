package controlflow;

import java.util.Scanner;

/*
  Code Challenge - Boxes
    You are making a robot that should categorize items by their color.
    Each color corresponds to a box with a specific number.
    For simplicity, our program will handle 3 colors:
      red goes to box #1
      green goes to box #2
      black goes to box #3
    Your program needs to take a color as input and output the corresponding box number.
  Sample Input
    green
  Sample Output
    2
*/

public class Switch {
  public static void main(String[] args) {
    // your code goes here
    Scanner sc = new Scanner(System.in);
    String color = sc.nextLine();
    switch (color) {
      case "red":
        System.out.println(1);
        break;
      case "green":
        System.out.println(2);
        break;
      case "black":
        System.out.println(3);
    }
  }
}
