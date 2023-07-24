package jbr.design.facade.passport;

import jbr.design.facade.model.Person;

public class PassportProcess {
  public static boolean verify(Person person) {
    Verification phoneNumber = new PhoneNumberVerification();
    Verification address = new AddressVerification();
    Verification dob = new DateOfBirthVerification();
    Verification policeCase = new PoliceCaseVerification();

    return phoneNumber.verify(person.getPhone()) && address.verify(person.getAddress()) && dob.verify(person.getDob())
        && policeCase.verify(person.getName());
  }
}
