package jbr.design.composite.car;

public class CompositePatternMain {

  public static void main(String[] args) {
    Engine engine = new Engine();
    Wheel wheel = new Wheel();

    System.out.println("...Car Assembly...");
    engine.assembly();
    wheel.assembly();

    System.out.println("\n...Car Price...");
    long enginePrice = engine.getPrice();
    long wheelPrice = wheel.getPrice();
    System.out.println("Wheel Price(Tyre + Chassis): " + wheelPrice);
    System.out.println("Engine Price: " + enginePrice);
    System.out.println("Total Price: " + (enginePrice + wheelPrice));
  }
}
