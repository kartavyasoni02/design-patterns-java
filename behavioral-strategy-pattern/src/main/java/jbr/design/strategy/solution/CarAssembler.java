package jbr.design.strategy.solution;

import jbr.design.strategy.VehicleType;
import jbr.design.strategy.model.Vehicle;

public class CarAssembler implements Assembler {

  @Override
  public Vehicle assemble() {
    return new Vehicle(4, "honda", VehicleType.CAR, 100000);
  }

}
