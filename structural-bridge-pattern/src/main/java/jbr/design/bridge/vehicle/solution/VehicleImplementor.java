package jbr.design.bridge.vehicle.solution;

import jbr.design.bridge.vehicle.VehicleType;

public interface VehicleImplementor {
  VehicleType type();

  double calcSpeed();

  double calcOnRoadPrice();

  double calcMaintanenceCost();
}
