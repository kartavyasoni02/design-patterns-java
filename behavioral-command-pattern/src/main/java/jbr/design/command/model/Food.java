package jbr.design.command.model;

public class Food {

  private String name;
  private int quantity;
  private int price;

  public int getPrice() {
    return price;
  }

  public Food setPrice(int price) {
    this.price = price;
    return this;
  }

  public String getName() {
    return name;
  }

  public Food setName(String name) {
    this.name = name;
    return this;
  }

  public int getQuantity() {
    return quantity;
  }

  public Food setQuantity(int quantity) {
    this.quantity = quantity;
    return this;
  }

}
