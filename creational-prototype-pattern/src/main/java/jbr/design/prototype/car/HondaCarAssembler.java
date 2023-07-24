package jbr.design.prototype.car;

public class HondaCarAssembler extends Car {

  public HondaCarAssembler() {
    System.out.println("Honda Car Assembler Constructor!!");
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
    return "I like HONDA cars!!";
  }

}
