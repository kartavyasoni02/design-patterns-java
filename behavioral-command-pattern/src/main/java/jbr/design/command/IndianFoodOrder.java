package jbr.design.command;

import jbr.design.command.model.Food;

public class IndianFoodOrder implements FoodOrder {

  private Chef chef;
  private String food;

  public IndianFoodOrder(String food, Chef chef) {
    this.chef = chef;
    this.food = food;
  }

  public Food prepareFood() {
    return chef.prepareIndianFood(food);
  }

}
