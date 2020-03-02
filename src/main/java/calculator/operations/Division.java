package calculator.operations;

import calculator.Calc;

public class Division implements Operations {
  private Calc calc;

  public Division() {
  }

  public double getOperation(Calc calc) throws ArithmeticException {
    if (calc.getSecondNum() == 0) {
      throw new ArithmeticException("Делить на 0 нельзя");
    }
    return calc.getFirstNum() / calc.getSecondNum();
  }
}
