package jbr.design.singleton.animal;

public class AnimalSingleton {
  private static AnimalSingleton animal;

  /**
   * Make constructor private to avoid this class sub-classed. If you want to
   * this class to be sub-classed make it as protected.
   **/
  private AnimalSingleton() {

  }

  // Make it thread safe by adding synchronized keyword
  public static synchronized AnimalSingleton getInstance() {
    if (animal == null) {
      animal = new AnimalSingleton();
    }
    return animal;
  }

  public String callMe() {
    return "AnimalSingleton Class";
  }
}
