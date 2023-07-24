package jbr.design.abstractfactory;

public class IndiaFactoryProducer {
  public static IndiaFactory getDivision(String division) {
    if (division.equalsIgnoreCase("south")) {
      return new SouthIndiaFactory();
    } else if (division.equalsIgnoreCase("north")) {
      return new NorthIndiaFactory();
    }
    return null;
  }
}
