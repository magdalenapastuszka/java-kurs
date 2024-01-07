package sprint1;

import java.util.Scanner;

public class MadLibs {
  public static void main(String[] args){

    System.out.println("Enter an adjective:");
    Scanner scanner = new Scanner(System.in);
    String adjective = scanner.next();

    System.out.println("Enter a season of the year:");
    String season = scanner.next();

    System.out.println("Enter a whole number:");
    int number = scanner.nextInt();

    scanner.close();

    System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
  }

}
