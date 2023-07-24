package jbr.design.command;

import jbr.design.command.model.Food;

public class Chef {
  public Food preparChineseFood(String food) {
    return new Food().setName(food.toUpperCase()).setPrice(200).setQuantity(2);
  }

  public Food prepareIndianFood(String food) {
    return new Food().setName(food.toUpperCase()).setPrice(100).setQuantity(2);
  }
}
