package jbr.design.bridge.vehicle.problem;

import jbr.design.bridge.vehicle.VehicleType;

public class FourWheeler implements Vehicle {

  public double calcSpeed() {
    return 150;
  }

  public double calcOnRoadPrice() {
    return 1500000;
  }

  @Override
  public VehicleType type() {
    return VehicleType.FOUR_WHEELER;
  }

}
