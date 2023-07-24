package jbr.design.bridge.vehicle.problem;

import jbr.design.bridge.vehicle.VehicleType;

public class BridgePatternProblemMain {

  public static void main(String[] args) {

    VehicleType vehicleType = VehicleType.TWO_WHEELER;
    Vehicle vehicle = null;

    switch (vehicleType) {
    case TWO_WHEELER:
      vehicle = new TwoWheeler();
      break;

    case FOUR_WHEELER:
      vehicle = new FourWheeler();
      break;

    default:
      break;
    }

    System.out.println("vehicle type: " + vehicle.type().getType());
    System.out.println("vehicle speed: " + vehicle.calcSpeed());
    System.out.println("vehicle on road price: " + vehicle.calcOnRoadPrice());
  }
}
