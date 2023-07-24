package jbr.design.builder8.bike;

import java.util.function.Consumer;

import jbr.design.builder8.bike.model.Bike;

public class RoyalEnfield {

  private static Bike bike;

  public RoyalEnfield assembleEngine() {
    bike.setEngineType("Diesel");
    return this;
  }

  public RoyalEnfield assembleWheel() {
    bike.setWheelType("Spokes");
    return this;
  }

  public RoyalEnfield estimateCost() {
    bike.setCost(170000);
    return this;
  }

  public RoyalEnfield setName() {
    bike.setName("Royal Enfield");
    return this;
  }

  public Bike getBike(Consumer<RoyalEnfield> royalBike) {
    bike = new Bike();

    RoyalEnfield newRoyalBike = new RoyalEnfield();
    royalBike.accept(newRoyalBike);

    return bike;
  }

}
