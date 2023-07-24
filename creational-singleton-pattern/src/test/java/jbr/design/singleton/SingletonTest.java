package jbr.design.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import jbr.design.singleton.person.Person;
import jbr.design.singleton.person.Singleton;

public class SingletonTest {

  private Singleton singleton1;
  private Singleton singleton2;

  private Person person1;
  private Person person2;

  @Before
  public void setUp() throws Exception {
    // Create a instance for the Singleton class
    singleton1 = Singleton.getInstance();
    person1 = new Person("John", 30);

    // Create another instance
    singleton2 = Singleton.getInstance();
    person2 = new Person("John", 30);
  }

  @Test
  public void testSingleton() {
    Assert.assertEquals(singleton1, singleton2);
    // Testcase passed.
  }

  @Test
  public void testNonSingleton() {
    Assert.assertEquals(person1, person2);
    // Testcase failed.
  }

}
