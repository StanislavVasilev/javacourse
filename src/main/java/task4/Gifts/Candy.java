package task4.Gifts;

public class Candy extends Gift {
  private String color;


  public Candy(String name, double weight, double price, String color) {
    super(name, weight, price);
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "\nCandy{" + super.toString() + " " +
            "color='" + color + '\'' +
            '}';
  }
}
