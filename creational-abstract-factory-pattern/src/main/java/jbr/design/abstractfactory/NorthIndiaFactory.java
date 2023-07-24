package jbr.design.abstractfactory;

import jbr.design.abstractfactory.state.Delhi;
import jbr.design.abstractfactory.state.Gujarath;
import jbr.design.abstractfactory.state.State;

public class NorthIndiaFactory extends IndiaFactory {

  @Override
  public State getState(String stateName) {
    if (stateName.equalsIgnoreCase("gujarath")) {
      return new Gujarath();
    } else if (stateName.equalsIgnoreCase("delhi")) {
      return new Delhi();
    }
    return null;
  }

}
