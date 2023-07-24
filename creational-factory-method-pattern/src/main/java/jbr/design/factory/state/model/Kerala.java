package jbr.design.factory.state.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Kerala implements State {
  private String language = "malayalam";
  private String population = "10 crores";
  private String capital = "Trivandram";

  @Override
  public String getAllDetails() {
    return this.toString();
  }
}
