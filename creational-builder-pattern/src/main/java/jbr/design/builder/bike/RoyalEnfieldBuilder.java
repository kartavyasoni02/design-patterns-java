package jbr.design.builder.bike;

import jbr.design.builder.model.Bike;

public class RoyalEnfieldBuilder implements BikeBuilder {
  private Bike bike;

  public RoyalEnfieldBuilder() {
    bike = new Bike();
  }

  public void assembleWheel() {
    bike.setWheelType("Spoke");
  }

  public void estimateCost() {
    bike.setCost(170000);
  }

  public void assembleEngine() {
    bike.setEngineType("Diesel");
  }

  public Bike getBike() {
    return bike;
  }

  public void setName() {
    bike.setName("RoyalEnfield");
  }

}
