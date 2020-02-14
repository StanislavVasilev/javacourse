package calculator.operations;

import calculator.Calc;

public class Subtraction implements Operations{
  private Calc calc;

  public Subtraction() {
  }

  public double getOperation(Calc calc) {
    return calc.getFirstNum() - calc.getSecondNum();
  }
}
