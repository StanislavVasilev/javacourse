package calculator.training.streamAPI;

public class Hosting {
  int id;
  String name;
  int consumers;

  public Hosting(int id, String name, int consumers) {
    this.id = id;
    this.name = name;
    this.consumers = consumers;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getConsumers() {
    return consumers;
  }

  public void setConsumers(int consumers) {
    this.consumers = consumers;
  }

  @Override
  public String toString() {
    return "Hosting{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", consumers=" + consumers +
            '}';
  }
}
