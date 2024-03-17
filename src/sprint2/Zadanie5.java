package sprint2;

import java.util.Scanner;

public class Zadanie5 {
  public static void main() {
    //Get the number A
    System.out.println("Enter the first number.");
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();

    //Get the number B
    System.out.println("Enter the second number.");
    int B = scanner.nextInt();

    while (A > B) {
      System.out.println(
          "The fist number cannot be higher than the second. Please enter another number.");
      A = scanner.nextInt();
    }

    //scanner.close();
    int sum = 0;

    //The sum of the sequence of numbers from A to B
    //for
    for (int i = A; i <= B; i++) {
      sum = sum + i;
    }
    System.out.println("The sum for is " + sum);

    // while
    sum = 0;
    int i = A;

    while (i <= B) {
      sum = sum + i;
      i++;
    }
    System.out.println("The sum while is " + sum);

    //do-while
    sum =0;
    i = A;
    do {
      sum = sum + i;
      i++;
    } while (i <= B);
    System.out.println("The sum do-while is " + sum);
  }
}
