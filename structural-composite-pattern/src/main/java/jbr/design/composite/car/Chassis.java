package jbr.design.composite.car;

public class Chassis implements CarComponent {

  @Override
  public String getName() {
    return "Chassis";
  }

  @Override
  public long getPrice() {
    return 30000;
  }

  @Override
  public void assembly() {
    // no assembly operation here
  }

  @Override
  public void addComponent(CarComponent component) {
    // no components to add

  }

  @Override
  public void removeComponent(CarComponent component) {
    // no components to remove
  }

}
