package jbr.design.abstractfactory;

import jbr.design.abstractfactory.state.Andra;
import jbr.design.abstractfactory.state.State;
import jbr.design.abstractfactory.state.Tamilnadu;

public class SouthIndiaFactory extends IndiaFactory {

  @Override
  State getState(String stateName) {
    if (stateName.equalsIgnoreCase("tamilnadu")) {
      return new Tamilnadu();
    } else if (stateName.equalsIgnoreCase("andra")) {
      return new Andra();
    }
    return null;
  }

}
