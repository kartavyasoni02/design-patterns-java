package jbr.design.strategy.solution;

import jbr.design.strategy.VehicleType;

public class AssemblerFactory {

  public static Assembler assemble(VehicleType vehicleType) {
    switch (vehicleType) {
    case CAR:
      return new CarAssembler();
    case BIKE:
      return new BikeAssembler();
    case BUS:
      return new BusAssembler();
    default:
      break;
    }

    return null;
  }
}
