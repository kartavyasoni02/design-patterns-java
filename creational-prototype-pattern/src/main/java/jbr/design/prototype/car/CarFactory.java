package jbr.design.prototype.car;

public class CarFactory {

  public Car getCar(Car car) {
    return car.assembleCar();
  }

}
