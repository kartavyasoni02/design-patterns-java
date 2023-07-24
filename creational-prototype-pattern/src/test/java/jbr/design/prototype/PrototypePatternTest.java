package jbr.design.prototype;

import org.junit.Before;
import org.junit.Test;

import jbr.design.prototype.car.Car;
import jbr.design.prototype.car.CarFactory;
import jbr.design.prototype.car.HondaCarAssembler;
import jbr.design.prototype.car.MarutiCarAssembler;

public class PrototypePatternTest {
  private CarFactory carFactory;

  @Before
  public void setUp() throws Exception {
    carFactory = new CarFactory();
  }

  @Test
  public void test() {

    Car zen = new MarutiCarAssembler();
    zen.setColor("White");
    zen.setManufacturer("Maruti");
    Car zenCarAssembled = carFactory.getCar(zen);
    System.out.println(zenCarAssembled);
    System.out.println("Maruti ZEN Car Color: " + zenCarAssembled.getColor());
    System.out.println("Maruti ZEN Car Manufacturer: " + zenCarAssembled.getManufacturer());
    System.out.println("Maruti ZEN Car Engine No: " + zenCarAssembled.hashCode() + "\n");

    Car alto = new MarutiCarAssembler();
    alto.setColor("Black");
    alto.setManufacturer("Maruti");
    Car altoCarAssembled = carFactory.getCar(alto);
    System.out.println(altoCarAssembled);
    System.out.println("Maruti ALTO Car Color: " + altoCarAssembled.getColor());
    System.out.println("Maruti ALTO Car Manufacturer: " + altoCarAssembled.getManufacturer());
    System.out.println("Maruti ALTO Car Engine No: " + altoCarAssembled.hashCode() + "\n");

    Car amaze = new HondaCarAssembler();
    amaze.setColor("Blue");
    amaze.setManufacturer("Honda");
    Car amazeCarAssembled = carFactory.getCar(amaze);
    System.out.println(amazeCarAssembled);
    System.out.println("Honda AMAZE Car Color: " + amazeCarAssembled.getColor());
    System.out.println("Honda AMAZE Car Manufacturer: " + amazeCarAssembled.getManufacturer());
    System.out.println("Honda AMAZE Car Engine No: " + amazeCarAssembled.hashCode() + "\n");

    Car civic = new HondaCarAssembler();
    civic.setColor("Red");
    civic.setManufacturer("Honda");
    Car civicCarAssembled = carFactory.getCar(civic);
    System.out.println(civicCarAssembled);
    System.out.println("Honda CIVIC Car Color: " + civicCarAssembled.getColor());
    System.out.println("Honda CIVIC Car Manufacturer: " + civicCarAssembled.getManufacturer());
    System.out.println("Honda CIVIC Car Engine No: " + civicCarAssembled.hashCode());
  }

}
