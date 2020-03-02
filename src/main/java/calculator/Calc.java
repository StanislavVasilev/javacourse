package calculator;

import calculator.operations.*;

import java.util.Scanner;

public class Calc {
  private double num;
  private double num2;

  public Calc() {
  }

  public Calc(double num, double num2) {
    this.num = num;
    this.num2 = num2;
  }

  public void setNum(Scanner in) {
    System.out.println("Type the first num");
    String text = in.next();
    if (text.contains(",")) {
      text = text.replace(",", ".");
    }
    this.num = Double.parseDouble(text);
  }

  public void setNum2(Scanner in) {
    System.out.println("Type the second num");
    String text = in.next();
    if (text.contains(",")) {
      text = text.replace(",", ".");
    }
    this.num2 = Double.parseDouble(text);
  }

  /**
   * @return возвращает значение первого числа
   */
  public double getFirstNum() {
    return num;
  }

  public double getSecondNum() {
    return num2;
  }

  private Addition add() {
    return new Addition();
  }

  private Subtraction sub() {
    return new Subtraction();
  }

  private Division div() {
    return new Division();
  }

  private Multiplication mult() {
    return new Multiplication();
  }

  public char getOperationType(String text) {
    char[] arr = text.toCharArray();
    return arr[0];
  }

  public double getOperationAndPrintResult(String text, Calc calc) {
    double result = 0;
    switch (getOperationType(text)) {
      case '+':
        result = add().getOperation(calc);
        return result;
      case '-':
        result = sub().getOperation(calc);
        return result;
      case '*':
        result = mult().getOperation(calc);
        return result;
      case '/':
        result = div().getOperation(calc);
        return result;
      default:
        throw new IllegalArgumentException("You chosen incorrect operation, try again");
    }
  }
}
