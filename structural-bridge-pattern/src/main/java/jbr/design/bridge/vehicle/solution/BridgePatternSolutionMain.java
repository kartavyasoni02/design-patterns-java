package jbr.design.bridge.vehicle.solution;

import jbr.design.bridge.vehicle.VehicleType;

public class BridgePatternSolutionMain {

  public static void main(String[] args) {

    VehicleType vehicleType = VehicleType.TWO_WHEELER;
    VehicleAbstraction vehicle = null;

    switch (vehicleType) {
    case TWO_WHEELER:
      vehicle = new VehicleAbstractionImpl(new TwoWheeler());
      break;

    case FOUR_WHEELER:
      vehicle = new VehicleAbstractionImpl(new FourWheeler());
      break;

    default:
      break;
    }

    System.out.println("vehicle type: " + vehicle.type().getType());
    System.out.println("vehicle speed: " + vehicle.calcSpeed());
    System.out.println("vehicle on road price: " + vehicle.calcOnRoadPrice());
  }
}
