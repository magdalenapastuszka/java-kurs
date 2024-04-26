package sprint2;

public class Zadanie8Human {
  private int age;
  private double weight;
  private double height;
  private String name;
  private boolean isMale;

  public Zadanie8Human(int age, double weight, double height, String name, boolean isMale) {
    this.age = age;
    this.weight = weight;
    this.height = height;
    this.name = name;
    this.isMale = isMale;
    isMale();
    getName();
    getWeight();
    getHeight();
    getAge();
  }

  public boolean isMale() {
    return isMale;
  }

  public String getName() {
    return name;
  }

  public double getWeight() {
    return weight;
  }

  public double getHeight() {
    return height;
  }

  public int getAge() {
    return age;
  }

}
