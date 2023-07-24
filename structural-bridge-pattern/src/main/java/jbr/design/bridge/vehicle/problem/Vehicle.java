package jbr.design.bridge.vehicle.problem;

import jbr.design.bridge.vehicle.VehicleType;

public interface Vehicle {

  VehicleType type();

  double calcSpeed();

  double calcOnRoadPrice();

  // double calcInsurance(); // change affects all its implementation

}
