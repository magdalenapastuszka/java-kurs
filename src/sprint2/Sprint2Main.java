package sprint2;

public class Sprint2Main {
  public static void main(String[] args){

    Zadanie1.zadanie1a();
    Zadanie1.zadanie1b();
    Zadanie1.zadanie1c();
    Zadanie1.zadanie1d();
    Zadanie1.zadanie1e();
    Zadanie1.zadanie1f();
    Zadanie1.zadanie1g();
    Zadanie1.zadanie1h();
    Zadanie2.main();
    Zadanie3.main();
    Zadanie4.main();
    Zadanie5.main();
    Zadanie6.main();
    new Zadanie7Rectangle(10,6).rectangle();
   Zadanie8Human Zadanie8 = new Zadanie8Human(30, 50, 160, "Maria", false);
   System.out.println(Zadanie8.getName()+"\n"+Zadanie8.getAge()+"\n"+Zadanie8.isMale()+"\n"+Zadanie8.getWeight()+"\n"+Zadanie8.getHeight());
  Zadanie9MyNumber Zadanie9 = new Zadanie9MyNumber(15).add(new Zadanie9MyNumber(5));
    System.out.println(Zadanie9.getValue());
  }

}
