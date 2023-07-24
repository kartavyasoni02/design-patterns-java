package jbr.design.singleton.person;

public class PersonSingletonMain {

  public static void main(String[] args) {

    Person p1 = new Person("John", 30);
    Person p2 = new Person("John", 30);
    System.out.println("Are p1 & p2 same? " + (p1 == p2));

    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    System.out.println("Are s1 & s2 same? " + (s1 == s2));
  }
}
