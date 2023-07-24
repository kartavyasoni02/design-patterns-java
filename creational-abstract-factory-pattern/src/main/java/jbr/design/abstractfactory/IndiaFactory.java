package jbr.design.abstractfactory;

import jbr.design.abstractfactory.state.State;

public abstract class IndiaFactory {
  abstract State getState(String stateName);
}
