package jbr.design.builder.bike;

public class BikeFactory {

  public void assemble(BikeBuilder bikeAssembler) {
    bikeAssembler.assembleWheel();
    bikeAssembler.assembleEngine();
    bikeAssembler.estimateCost();
  }
}
