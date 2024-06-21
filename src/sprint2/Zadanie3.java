package sprint2;

import java.util.Scanner;

public class Zadanie3 {
  public static void main() {
    System.out.println("Enter the first integer.");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();

    System.out.println("Enter the arithmetic operation symbol.");
    String symbol = scanner.next();

    System.out.println("Enter the second integer.");
    int y = scanner.nextInt();
    //scanner.close();

    if (y == 0 && symbol.equals("/")) {
      System.out.println("You cannot divide by 0. Please enter another number.");
      System.exit(0);
    }

    switch (symbol) {
      case "+":
        System.out.println(x + y);
        break;
      case "-":
        System.out.println(x - y);
        break;
      case "*":
        System.out.println(x * y);
        break;
      case "/":
        System.out.println(x / y);
        break;
      default:
        System.out.println("Error, invalid symbol.");
        break;
    }

  }

}
