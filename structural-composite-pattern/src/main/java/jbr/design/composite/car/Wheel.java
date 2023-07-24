package jbr.design.composite.car;

import java.util.ArrayList;
import java.util.List;

public class Wheel implements CarComponent {

  private List<CarComponent> wheelComponents = new ArrayList<>();

  public Wheel() {
    this.addComponent(new Tyre());
    this.addComponent(new Chassis());
  }

  @Override
  public String getName() {
    return "Wheel";
  }

  @Override
  public long getPrice() {
    long price = 0;

    for (CarComponent component : wheelComponents) {
      System.out.println(component.getName() + " Price " + component.getPrice());
      price = price + component.getPrice();
    }

    return price;
  }

  @Override
  public void assembly() {
    for (CarComponent component : wheelComponents) {
      component.assembly();
      System.out.println(component.getName() + " - Assembly DONE");
    }

    System.out.println("Wheel - Assembly DONE");
  }

  @Override
  public void addComponent(CarComponent component) {
    this.wheelComponents.add(component);
  }

  @Override
  public void removeComponent(CarComponent component) {
    // no components to remove
  }

}
