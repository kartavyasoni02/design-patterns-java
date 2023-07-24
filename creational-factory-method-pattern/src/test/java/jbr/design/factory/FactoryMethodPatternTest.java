package jbr.design.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import jbr.design.factory.state.StateName;
import jbr.design.factory.state.solution.StateFactory;

public class FactoryMethodPatternTest {
  private StateFactory stateFactory;

  @Before
  public void setUp() throws Exception {
    stateFactory = new StateFactory();
  }

  @Test
  public void test() {
    Assert.assertEquals("tamil", stateFactory.getState(StateName.TAMILNADU).getLanguage());
    Assert.assertEquals("malayalam", stateFactory.getState(StateName.KERALA).getLanguage());
  }

}
