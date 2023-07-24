package jbr.design.builder.bike;

public class BuilderPatternMain {

  public static void main(String[] args) {

    BikeBuilder heroBikeBuilder = new HeroHondaBuilder();
    heroBikeBuilder.assembleWheel();
    heroBikeBuilder.assembleEngine();
    heroBikeBuilder.estimateCost();
    heroBikeBuilder.setName();

    // Get Hero Bike
    System.out.println(heroBikeBuilder.getBike().toString());

    BikeBuilder enfieldBike = new RoyalEnfieldBuilder();
    enfieldBike.assembleWheel();
    enfieldBike.assembleEngine();
    enfieldBike.estimateCost();
    enfieldBike.setName();

    // Get Royal Enfield Bike
    System.out.println("\n" + enfieldBike.getBike().toString());

  }
}
