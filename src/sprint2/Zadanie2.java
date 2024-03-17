package sprint2;

import java.util.Scanner;

public class Zadanie2 {
  public static void main() {

  double minimal = 18.5;
  double maximum = 24.9;

  System.out.println("Enter your weight in kilograms.");
  Scanner scanner = new Scanner(System.in);
  double weight = scanner.nextDouble();

  System.out.println("Enter your height in meters.");
  double heigh = scanner.nextDouble();
  scanner.close();

  double result = weight / Math.pow(heigh, 2);

  if (result < minimal) {
    System.out.println("You are underweight.");
  } else if (result > maximum) {
    System.out.println("You are overweight.");
  } else {
    System.out.println("Your weight is correct.");
  }
}

}
