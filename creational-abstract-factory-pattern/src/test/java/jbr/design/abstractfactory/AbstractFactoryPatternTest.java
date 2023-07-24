package jbr.design.abstractfactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AbstractFactoryPatternTest {
  private IndiaFactory southIndiaFactory;
  private IndiaFactory northIndiaFactory;

  @Before
  public void init() throws Exception {
    southIndiaFactory = IndiaFactoryProducer.getDivision("south");
    northIndiaFactory = IndiaFactoryProducer.getDivision("north");
  }

  @Test
  public void test() {
    Assert.assertEquals("Tamil", southIndiaFactory.getState("tamilnadu").getLanguage());
    Assert.assertEquals("Hindi", northIndiaFactory.getState("delhi").getLanguage());
  }

}
