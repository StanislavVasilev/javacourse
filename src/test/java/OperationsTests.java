import calculator.Calc;
import calculator.operations.Addition;
import calculator.operations.Division;
import calculator.operations.Subtraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationsTests {

  @Test
  public void checkAdditionOperationResultTest() {
    Calc calc = new Calc(5, 3);
    Addition addition = new Addition();
    assertEquals(8, addition.getOperation(calc), 0);
  }

  @Test
  public void checkAdditionZeroOperationResultTest() {
    Calc calc = new Calc(0, 0);
    Addition addition = new Addition();
    assertEquals(0, addition.getOperation(calc), 0);
  }

  @Test
  public void checkDivisionOperationResultTest() {
    Calc calc = new Calc(6, 3);
    Division division = new Division();
    assertEquals(2, division.getOperation(calc), 0);
  }

  @Test(expected = ArithmeticException.class)
  public void checkDivisionByZeroOperationResultTest() throws ArithmeticException {
    Calc calc = new Calc(6, 0);
    Division division = new Division();
    division.getOperation(calc);

  }

  @Test()
  public void checkDivisionZeroToOtherNumberOperationResultTest() {
    Calc calc = new Calc(0, 6);
    Division division = new Division();
    assertEquals(0, division.getOperation(calc), 0);
  }

  @Test
  public void checkSubtractionOperationResultTest() {
    Calc calc = new Calc(-3, 6);
    Subtraction subtraction = new Subtraction();
    assertEquals(-9, subtraction.getOperation(calc), 0);
  }
}
