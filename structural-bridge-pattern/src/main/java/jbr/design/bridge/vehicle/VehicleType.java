package jbr.design.bridge.vehicle;

public enum VehicleType {

  TWO_WHEELER("Two Wheeler"), FOUR_WHEELER("Four Wheeler");

  public String type;

  VehicleType(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

}
