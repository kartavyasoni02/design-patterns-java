package jbr.design.iterator.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
  private String name;
  private String department;
  private int regNo;
  private String address;
  private long phone;
}
