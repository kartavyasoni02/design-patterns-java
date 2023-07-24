package jbr.design.factory.state.problem;

import jbr.design.factory.state.StateName;
import jbr.design.factory.state.model.Kerala;
import jbr.design.factory.state.model.Tamilnadu;

public class FactoryPatternProblemMain {

  public static void main(String[] args) {
    StateName state = StateName.TAMILNADU;

    switch (state) {
    case TAMILNADU:
      System.out.println(new Tamilnadu().toString());
      break;

    case KERALA:
      System.out.println(new Kerala().toString());
      break;

    default:
      break;
    }
  }
}
