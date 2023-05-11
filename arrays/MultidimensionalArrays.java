package arrays;
import java.util.Scanner;

/*
  Code Challenge - Movie Theater
  You are creating a ticketing program for a small movie theater.
  The seats are represented using a 2-dimensional array.
  
  Each item can have the values 1 and 0 - 1 is occupied, and 0 if it's free.
  
  Your program needs to take as input the row and the column of the seat and output:
    - "Free" if it's free.
    - "Sold" if it's not.
 */

public class MultidimensionalArrays {
  public static void main(String[] args) {
    int[][] seats = {
        { 0, 0, 0, 1, 1, 1, 0, 0, 1, 1 },
        { 1, 1, 0, 1, 0, 1, 1, 0, 0, 0 },
        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
        { 0, 0, 0, 1, 1, 1, 1, 0, 0, 0 },
        { 0, 1, 1, 1, 0, 0, 0, 1, 1, 1 }
    };
    Scanner sc = new Scanner(System.in);
    
    // your code goes here

    int row = sc.nextInt();
    int column = sc.nextInt();

    switch (seats[row][column]) {
      case 0:
        System.out.println("Free");
        break;
      case 1:
        System.out.println("Sold");
        break;
    }
  }
}
