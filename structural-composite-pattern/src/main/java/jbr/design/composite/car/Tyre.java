package jbr.design.composite.car;

public class Tyre implements CarComponent {

  @Override
  public String getName() {
    return "Tyre";
  }

  @Override
  public long getPrice() {
    return 20000;
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
