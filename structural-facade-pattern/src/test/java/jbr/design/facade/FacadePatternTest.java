package jbr.design.facade;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import jbr.design.facade.model.Person;
import jbr.design.facade.passport.PassportProcess;

public class FacadePatternTest {
  private Person person1;

  @Before
  public void init() throws Exception {
    person1 = new Person();
  }

  @Test
  public void test() {
    person1.setName("Ranjith");
    person1.setAddress("#5, Gandhi Street, T.Nagar, Chennai");
    person1.setPhone("9898989898");

    Assert.assertTrue(PassportProcess.verify(person1));
  }

}
