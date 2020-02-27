package calculator.operations;

import calculator.Calc;

public class Division implements Operations {
  private Calc calc;

  public Division() {
  }

  public double getOperation(Calc calc) throws ArithmeticException {
    if (calc.getSecondNum() == 0) {
      System.out.println("Делить на 0 нельзя");
      throw new ArithmeticException();
    }
    return calc.getFirstNum() / calc.getSecondNum();
  }
}
