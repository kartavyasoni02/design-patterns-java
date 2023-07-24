package jbr.design.strategy.solution;

import jbr.design.strategy.VehicleType;
import jbr.design.strategy.model.Vehicle;

public class BusAssembler implements Assembler {

  @Override
  public Vehicle assemble() {
    return new Vehicle(4, "ashok leyland", VehicleType.BUS, 1300000);
  }

}
