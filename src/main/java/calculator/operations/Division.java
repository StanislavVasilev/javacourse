package calculator.operations;

import calculator.Calc;

public class Division implements Operations {
private Calc calc;

  public Division() {
  }

  public double getOperation(Calc calc) {
    return calc.getFirstNum() / calc.getSecondNum();
  }
}
