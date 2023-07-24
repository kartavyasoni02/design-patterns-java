package jbr.design.command;

import java.util.ArrayList;
import java.util.List;

import jbr.design.command.model.Food;

public class Waiter {

  private List<FoodOrder> foodOrders = new ArrayList<>();
  private List<Food> orderedFoods = new ArrayList<>();

  public void placeFoodOrder(FoodOrder food) {
    foodOrders.add(food);
  }

  public List<Food> serve() {
    for (FoodOrder foodOrder : foodOrders) {
      orderedFoods.add(foodOrder.prepareFood());
    }

    return orderedFoods;
  }
}