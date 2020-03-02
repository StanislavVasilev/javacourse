import calculator.Calc;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTests {

  @Test
  public void checkCalcFirstNumGetterTest() {
    Calc calc = new Calc(5, 3);
    assertEquals(5, calc.getFirstNum(), 0);
  }

  @Test
  public void checkCalcSecondNumGetterTest() {
    Calc calc = new Calc(5, 3);
    assertEquals(3, calc.getSecondNum(), 0);
  }

  @Test
  public void checkCalcMultTest() {
    Calc calc = new Calc(2, 5.6);
    assertEquals(11.2, calc.getOperationAndPrintResult("*", calc), 0.0);
  }

  @Test
  public void checkCalcDivTest() {
    Calc calc = new Calc(5.6, 5.6);
    assertEquals(1, calc.getOperationAndPrintResult("/", calc), 0.0);
  }

  @Test()
  public void checkCalcDivToZeroTest() {
    Calc calc = new Calc(5.6, 0);
    try {
      calc.getOperationAndPrintResult("/", calc);
    } catch (ArithmeticException e) {
      assertEquals(e.getMessage(), "Делить на 0 нельзя");
    }
  }

  @Test
  public void checkCalcSubTest() {
    Calc calc = new Calc(5.6, 10.6);
    assertEquals(calc.getOperationAndPrintResult("-", calc), -5.0, 0.0);
  }

  @Test
  public void checkCalcSubTotalZeroTest() {
    Calc calc = new Calc(5.6, 5.6);
    assertEquals(calc.getOperationAndPrintResult("-", calc), 0.0, 0.0);
  }

  @Test
  public void checkIllegalOperationSymbolTest() {
    final Calc calc = new Calc(5.6, 0);
    try {
      calc.getOperationAndPrintResult("v", calc);
    } catch (IllegalArgumentException e) {
      assertEquals(e.getMessage(), "You chosen incorrect operation, try again");
    }
  }

}
