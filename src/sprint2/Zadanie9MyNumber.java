package sprint2;

public class Zadanie9MyNumber {
  private double value;

  public Zadanie9MyNumber(double value) {
    this.value = value;
    System.out.println(isOdd());
    isEven();
    sqrt();

  }

  public boolean isOdd() {
    return ! isEven();
  }

  public boolean isEven() {
    return value % 2 == 0;
  }

  public double sqrt() {
    return Math.sqrt(value);
  }

  public double getValue(){
    return value;
  }

  public Zadanie9MyNumber pow(Zadanie9MyNumber pow) {
    return new Zadanie9MyNumber(Math.pow(value, pow.value));
  }

  public Zadanie9MyNumber add(Zadanie9MyNumber otherValue) {
    return new Zadanie9MyNumber(value + otherValue.value);
  }

  public Zadanie9MyNumber subract(Zadanie9MyNumber otherValue) {
    return new Zadanie9MyNumber(value - otherValue.value);
  }

//  @Override
//  public String toString() {
//    return String.valueOf(value);
//  }

}
