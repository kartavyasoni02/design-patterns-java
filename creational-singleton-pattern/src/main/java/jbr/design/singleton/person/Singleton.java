package jbr.design.singleton.person;

public class Singleton {

  // Declare a instance of this class private static
  private static Singleton instance;

  /**
   * Make the constructor as private, so that it can't be sub-classed
   */
  private Singleton() {

  }

  /**
   * Has the logic to create a new Instance for Singleton class.
   * 
   * 1) static - access this method directly. 2) synchronized - helps to avoid
   * multiple instance created by the multiple threads in case.
   *
   * @return
   */
  public static synchronized Singleton getInstance() {
    if (null == instance) {
      instance = new Singleton();
    }

    return instance;
  }
}
