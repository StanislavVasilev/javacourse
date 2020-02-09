package task4.Gifts;

public class Jellybean extends Gift {
  private double calories;

  public Jellybean(String name, double weight, double price, double calories) {
    super(name, weight, price);
    this.calories = calories;
  }

  public double getCalories() {
    return calories;
  }


  public void setCalories(double calories) {
    this.calories = calories;
  }

  @Override
  public String toString() {
    return "\nJellybean{" + super.toString() + " " +
            "calories=" + calories +
            '}';
  }
}
