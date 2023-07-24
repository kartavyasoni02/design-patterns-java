package jbr.design.strategy.solution;

import jbr.design.strategy.VehicleType;
import jbr.design.strategy.model.Vehicle;

public class BikeAssembler implements Assembler {

  @Override
  public Vehicle assemble() {
    return new Vehicle(2, "hero", VehicleType.BIKE, 300000);
  }

}
