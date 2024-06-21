package sprint2;

import java.util.Scanner;

public class Zadanie6 {
  public static void main() {
    //Get the number of rows
    System.out.println("Enter the number.");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    while (n <= 0) {
      System.out.println(
          "The number of rows cannot be 0. Please enter another number.");
      n = scanner.nextInt();
    }
    //scanner.close();

    for (int i = 0; i < n; i++) {
      for (int j = n - 1; j > i; j--) {
        System.out.print(' ');
      }
      for (int j = i * 2; j >= 0; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
