package sprint2;

import java.sql.SQLOutput;

public class Zadanie7Rectangle {

  private double sideA;
  private double sideB;

  public Zadanie7Rectangle(double sideA, double sideB){
    this.sideA = sideA;
    this.sideB = sideB;
  }

  public void rectangle() {
    getArea();
    getPerimeter();
    getDiagonal();
    System.out.println(getArea());
    System.out.println(getPerimeter());
    System.out.println(getDiagonal());
  }

  public double getSideA() {
    return sideA;
  }

  public double getSideB() {
    return sideB;
  }

  public double getArea() {
    return sideA * sideB;
  }

  public double getPerimeter() {
    return 2 * sideA + 2 * sideB;
  }

  public double getDiagonal() {
    return Math.sqrt(sideA * sideA + sideB * sideB);
  }
}

