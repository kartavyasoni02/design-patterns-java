package jbr.design.bridge.vehicle.solution;

import jbr.design.bridge.vehicle.VehicleType;

public class VehicleAbstractionImpl implements VehicleAbstraction {

  public VehicleImplementor vehicleImplementor;

  public VehicleAbstractionImpl(VehicleImplementor vehicleImplementor) {
    super();
    this.vehicleImplementor = vehicleImplementor;
  }

  @Override
  public double calcSpeed() {
    return vehicleImplementor.calcSpeed();
  }

  @Override
  public double calcOnRoadPrice() {
    return vehicleImplementor.calcOnRoadPrice();
  }

  @Override
  public double calcInsurance() {
    return 5000;
  }

  @Override
  public VehicleType type() {
    return vehicleImplementor.type();
  }

}
