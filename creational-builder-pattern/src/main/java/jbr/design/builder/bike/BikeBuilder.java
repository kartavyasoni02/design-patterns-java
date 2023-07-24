package jbr.design.builder.bike;

import jbr.design.builder.model.Bike;

public interface BikeBuilder {

  void setName();

  void assembleEngine();

  void assembleWheel();

  void estimateCost();

  Bike getBike();

}
