package jbr.design.builder.bike;

import jbr.design.builder.model.Bike;

public class HeroHondaBuilder implements BikeBuilder {

  private Bike bike;

  public HeroHondaBuilder() {
    bike = new Bike();
  }

  public void assembleEngine() {
    bike.setEngineType("Petrol");
  }

  public void assembleWheel() {
    bike.setWheelType("Alloy");

  }

  public void estimateCost() {
    bike.setCost(50000);

  }

  public Bike getBike() {
    return bike;
  }

  public void setName() {
    bike.setName("Hero");
  }

}
