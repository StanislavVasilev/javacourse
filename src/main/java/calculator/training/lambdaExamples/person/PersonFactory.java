package calculator.training.lambdaExamples.person;

public interface PersonFactory<P extends Person> {
  P create(String firstName, String lastName);

  PersonFactory<Person> personFactory = Person::new;
}
