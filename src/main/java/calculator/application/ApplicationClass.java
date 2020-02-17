package calculator.application;

import calculator.Calc;
import calculator.operations.Addition;
import calculator.operations.Division;
import calculator.operations.Multiplication;
import calculator.operations.Subtraction;

import java.util.Scanner;

public class ApplicationClass {
  private Calc calc;

  private Addition add(){
    return new Addition();
  }
  private Subtraction sub(){
    return new Subtraction();
  }
  private Division div(){
    return new Division();
  }
  private Multiplication mult(){
    return new Multiplication();
  }

  private char getOperationType(Scanner in) {
    System.out.println("Type the operation type");
    String text = in.next();
    char[] arr = text.toCharArray();
    return arr[0];
  }

  public double getOperationAndPrintResult(Scanner in, Calc calc) {
    double result = 0;
    switch (getOperationType(in)) {
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
        System.out.println("You chosen incorrect operation, try again");
    }
    return result;
  }

}
