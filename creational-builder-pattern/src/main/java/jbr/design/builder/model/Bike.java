package jbr.design.builder.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bike {
  private String name;
  private String wheelType;
  private String engineType;
  private int cost;
}
