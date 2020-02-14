package calculator.operations;

import calculator.Calc;

public class Multiplication implements Operations {
  private  Calc calc;

  public Multiplication() {
  }

  public double getOperation(Calc calc) {
    return calc.getFirstNum()*calc.getSecondNum();
  }
}
