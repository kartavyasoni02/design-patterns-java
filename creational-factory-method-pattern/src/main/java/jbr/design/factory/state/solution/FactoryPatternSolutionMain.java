package jbr.design.factory.state.solution;

import jbr.design.factory.state.StateName;
import jbr.design.factory.state.model.State;

public class FactoryPatternSolutionMain {

  public static void main(String[] args) {
    StateFactory stateFactory = new StateFactory();

    State tamilnadu = stateFactory.getState(StateName.TAMILNADU);
    System.out.println(tamilnadu.getAllDetails());

    State kearla = stateFactory.getState(StateName.KERALA);
    System.out.println("\n" + kearla.getAllDetails());
  }
}
