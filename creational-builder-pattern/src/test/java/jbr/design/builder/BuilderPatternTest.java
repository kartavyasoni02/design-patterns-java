package jbr.design.builder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import jbr.design.builder.bike.BikeBuilder;
import jbr.design.builder.bike.BikeFactory;
import jbr.design.builder.bike.HeroHondaBuilder;
import jbr.design.builder.bike.RoyalEnfieldBuilder;

public class BuilderPatternTest {
  private BikeBuilder assembler;
  private BikeFactory bikeFactory;

  @Before
  public void setUp() throws Exception {
    bikeFactory = new BikeFactory();
  }

  @Test
  public void test() {
    assembler = new HeroHondaBuilder();
    bikeFactory.assemble(assembler);
    Assert.assertEquals("Alloy", assembler.getBike().getWheelType());

    assembler = new RoyalEnfieldBuilder();
    bikeFactory.assemble(assembler);
    Assert.assertEquals("Diesel", assembler.getBike().getEngineType());
  }

}
