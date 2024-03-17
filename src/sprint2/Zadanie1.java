package sprint2;

import java.util.Scanner;

public class Zadanie1 {

  public static void zadanie1a(){
    //1. Get the current year
    System.out.println("Enter the current year.");
    Scanner scanner = new Scanner(System.in);
    int current = scanner.nextInt();

    //2. Get the birth year
    System.out.println("Enter the year of your birth.");
    int birth = scanner.nextInt();
    //scanner.close();

    //3. Subtraction
    int age = current - birth;

    //4. Display result
    System.out.println("Your age is " + age);
  }

  public static void zadanie1b(){
    System.out.println("Enter your name please.");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    //scanner.close();

    System.out.println("Your name is " + name);
  }

  public static void zadanie1c() {
    System.out.println("Enter the first integer.");
    Scanner scanner = new Scanner(System.in);
    int first = scanner.nextInt();

    System.out.println("Enter the second integer.");
    int second = scanner.nextInt();
    //scanner.close();

    int total = first + second;
    int difference = first - second;
    int product = first * second;

    System.out.println("The total is " + total);
    System.out.println("The difference is " + difference);
    System.out.println("The product is " + product);
  }

  public static void zadanie1d() {
    System.out.println("Enter the integer please.");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    //scanner.close();

    if ((x % 2) == 0) {
      System.out.println("true");
    }
  }

  public static void zadanie1e(){
    System.out.println("Enter the integer please.");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    //scanner.close();

    boolean condition1 = ((x % 3) == 0);
    boolean condition2 = ((x % 5) == 0);

    if (condition1 && condition2) {
      System.out.println("TRUE");
    }
    else{
      System.out.println("The number given is not divisible by 3 and 5.");
    }
  }

  public static void zadanie1f(){
    System.out.println("Enter the integer please.");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    //scanner.close();

    int result = (int)Math.pow(x, 3);
    System.out.println("The integer " +x +" raised to the power of 3 is " +result);
  }
  public static void zadanie1g() {
    System.out.println("Enter the number please.");
    Scanner scanner = new Scanner(System.in);
    double x = scanner.nextDouble();
    //scanner.close();
    double pierwiastek = Math.sqrt(x);
    System.out.println("The square root of a number " + x + " is " + pierwiastek);
  }

  public static void zadanie1h(){
    //1. Get the input data
    System.out.println("Enter a number for value a:");
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();

    System.out.println("Enter a number for value b:");
    double b = scanner.nextDouble();

    System.out.println("Enter a number for value c:");
    double c = scanner.nextDouble();
    //scanner.close();

    //2. Calculate the triangle schema
    double a2 = Math.pow(a, 2);
    double b2 = Math.pow(b, 2);
    double c2 = Math.pow(c, 2);

    //3. Assertion
    if (a2 + b2 == c2){
      System.out.println("TRUE");
    }
    else{
      System.out.println("From these lengths it is not possible to form a right triangle.");
    }
  }

}
