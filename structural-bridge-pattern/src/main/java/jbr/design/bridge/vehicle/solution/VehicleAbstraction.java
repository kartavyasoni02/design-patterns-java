package jbr.design.bridge.vehicle.solution;

import jbr.design.bridge.vehicle.VehicleType;

public interface VehicleAbstraction {
  VehicleType type();

  double calcSpeed();

  double calcOnRoadPrice();

  double calcInsurance();
}
