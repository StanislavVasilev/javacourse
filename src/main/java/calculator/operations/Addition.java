package calculator.operations;

import calculator.Calc;

public class Addition implements Operations {
  private Calc calc;

  public Addition() {
  }

  public double getOperation(Calc calc) {
    return calc.getFirstNum() + calc.getSecondNum();
  }
}
