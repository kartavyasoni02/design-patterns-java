package jbr.design.factory.state.solution;

import jbr.design.factory.state.StateName;
import jbr.design.factory.state.model.Kerala;
import jbr.design.factory.state.model.State;
import jbr.design.factory.state.model.Tamilnadu;

public class StateFactory {

  public State getState(StateName state) {
    State result = null;
    switch (state) {
    case TAMILNADU:
      result = new Tamilnadu();
      break;

    case KERALA:
      result = new Kerala();
      break;

    default:
      break;
    }
    return result;
  }
}
