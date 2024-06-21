package sprint2;

import java.util.Scanner;

public class Zadanie4 {
  public static void main() {
    System.out.println("Enter the integer.");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int i = 1;
    //scanner.close();

    while (i <= number) {
      System.out.print(i + "\t");
      i = i + 2;
    }
  }

}
