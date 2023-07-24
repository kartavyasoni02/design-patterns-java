package jbr.design.prototype.car;

public class MarutiCarAssembler extends Car {

  public MarutiCarAssembler() {
    System.out.println("Maruti Car Assembler Constructor!!");
  }

  public Car assembleCar() {
    Car newCar = null;

    try {
      newCar = (Car) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

    return newCar;
  }

  @Override
  public String toString() {
    return "I like MARUTI cars!!";
  }

}
