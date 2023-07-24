package jbr.design.factory.state.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Tamilnadu implements State {
  private String language = "tamil";
  private String population = "7 crores";
  private String capital = "Chennai";

  @Override
  public String getAllDetails() {
    return this.toString();
  }
}
