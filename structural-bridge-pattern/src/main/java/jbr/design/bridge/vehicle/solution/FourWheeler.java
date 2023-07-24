package jbr.design.bridge.vehicle.solution;

import jbr.design.bridge.vehicle.VehicleType;

public class FourWheeler implements VehicleImplementor {

  @Override
  public double calcSpeed() {
    return 150;
  }

  @Override
  public double calcOnRoadPrice() {
    return 1500000;
  }

  @Override
  public double calcMaintanenceCost() {
    return 0;
  }

  @Override
  public VehicleType type() {
    return VehicleType.FOUR_WHEELER;
  }

}
