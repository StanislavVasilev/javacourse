package calculator.training.lambdaExamples.person;

import static calculator.training.lambdaExamples.person.PersonFactory.personFactory;

public class CreatePerson {
  public static void main(String[] args) {
    Person person = personFactory.create("Peter", "Parker");
    System.out.println(person.toString());
  }
}
