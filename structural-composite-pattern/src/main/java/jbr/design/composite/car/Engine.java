package jbr.design.composite.car;

public class Engine implements CarComponent {

  @Override
  public String getName() {
    return "Engine";
  }

  @Override
  public long getPrice() {
    return 50000;
  }

  @Override
  public void assembly() {
    System.out.println("Engine - Assembly DONE");
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
