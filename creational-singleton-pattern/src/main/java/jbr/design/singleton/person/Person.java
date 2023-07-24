package jbr.design.singleton.person;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
  private String name;
  private int age;
}
