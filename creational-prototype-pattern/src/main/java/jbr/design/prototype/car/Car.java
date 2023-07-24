package jbr.design.prototype.car;

public abstract class Car implements Cloneable {

  private String manufacturer;
  private String color;

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public abstract Car assembleCar();
}
