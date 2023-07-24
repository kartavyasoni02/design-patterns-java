package jbr.design.prototype.car;

public class CarAssembler extends Car {

  public CarAssembler() {
    System.out.println("Car Assembler Constructor!!");
  }

  public Car assembleCar() {
    System.out.println("assembling your car!!");
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
    return "I like cars!!";
  }

}
