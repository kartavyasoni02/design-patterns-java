package jbr.design.strategy.model;

import jbr.design.strategy.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vehicle {
  private int noOfWheels;
  private String manufacturer;
  private VehicleType vehicleType;
  private int price;
}
