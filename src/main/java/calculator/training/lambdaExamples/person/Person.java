package calculator.training.lambdaExamples.person;

public class Person {
  String name;
  String lastName;

  public Person() {
  }

  public Person(String name, String lastName) {
    this.name = name;
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", lastName='" + lastName + '\'' +
            '}';
  }
}
