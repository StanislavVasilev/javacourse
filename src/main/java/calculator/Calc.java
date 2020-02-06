package calculator;

import java.util.Scanner;

public class Calc {


  private char getOperationType(Scanner in) {
    System.out.println("Type the operation type");
    String text = in.next();
    char[] arr = text.toCharArray();
    return arr[0];
  }

  /**
   *
   * @param in принимает на вход объект типа Scanner
   * @return возвращает значение первого числа
   */
  public double getFirstNum(Scanner in) {
    System.out.println("Type the first num");
    String text = in.next();
    if (text.contains(",")) {
      text = text.replace(",", ".");
    }
    return Double.parseDouble(text);
  }

  /**
   *
   * @param in принимает на вход объект типа Scanner
   * @return возвращает значение второго числа
   */
  public double getSecondNum(Scanner in) {
    System.out.println("Type the second num");
    String text = in.next();
    if (text.contains(",")) {
      text = text.replace(",", ".");
    }
    return Double.parseDouble(text);
  }

  private double sum(double num1, double num2) {
    return num1 + num2;
  }

  private double subtraction(double num1, double num2) {
    return num1 - num2;
  }

  private double multiplication(double num1, double num2) {
    return num1 * num2;
  }

  private double division(double num1, double num2) {
    return num1 / num2;
  }

  /**
   *
   * @param in принимает на вход объект типа Scanner
   * @param num1 на вход принимает значение первого числа double
   * @param num2 на вход принимает значение второго числа double
   * @return возвращает результат вычисления в зависимости от выбранной операции
   */
  public double getOperationResult(Scanner in, double num1, double num2) {
    double result = 0;
    switch (getOperationType(in)) {
      case '+':
        result = sum(num1, num2);
        return result;
      case '-':
        result = subtraction(num1, num2);
        return result;
      case '*':
        result = multiplication(num1, num2);
        return result;
      case '/':
        result = division(num1, num2);
        return result;
      default:
        System.out.println("You chosen incorrect operation, try again");
    }
    return result;
  }

}
