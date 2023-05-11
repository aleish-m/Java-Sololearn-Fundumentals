package arrays;
import java.util.Scanner;

/*
  Code Challenge - Vending Machine
  You are making a program for a vending machine that provides drinks.
  The menu of the drinks is stored in an array called menu:
      
      String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"}; 
  
  Take the choice of the customer as an integer from input and output the corresponding menu item.
  
  Also, check for errors: in case the input is out of the range of the array, output "Invalid".
 */

public class Arrays {
  public static void main(String[] args) {
    String[] menu = { "Tea", "Espresso", "Americano", "Water", "Hot Chocolate" };
    Scanner sc = new Scanner(System.in);

    // your code goes here

    int selection = sc.nextInt();

    if (selection < 0 || selection > 5) {
      System.out.println("Invalid");
    } else {
      String item = menu[selection];
      System.out.println(item);
    }
  }
}
