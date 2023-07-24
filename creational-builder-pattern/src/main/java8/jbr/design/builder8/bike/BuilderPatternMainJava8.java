package jbr.design.builder8.bike;

public class BuilderPatternMainJava8 {

  public static void main(String[] args) {
    HeroBike heroBike = new HeroBike();
    System.out.println("Builder Pattern - Java 8\n");
    System.out.println(heroBike.getBike(bike -> bike.assembleEngine()
        .assembleWheel()
        .estimateCost()
        .setName())
        .toString());

    RoyalEnfield royalEnfield = new RoyalEnfield();
    System.out.println("\n" + royalEnfield.getBike(bike -> bike.assembleEngine()
        .assembleWheel()
        .estimateCost()
        .setName())
        .toString());

  }
}
