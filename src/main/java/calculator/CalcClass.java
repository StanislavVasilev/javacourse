package calculator;

import java.util.Scanner;

public class CalcClass {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double num1 = getNum(in, "Type the first num");
    char operation = getOperationType(in);
    double num2 = getNum(in, "Type the second num");
    double result = whichOperation(operation, num1, num2);
    System.out.printf("Result: " + "%.4f", result);
    in.close();
  }

  private static char getOperationType(Scanner in) {
    System.out.println("Type the operation type");
    String text = in.nextLine();
    char[] arr = text.toCharArray();
    return arr[0];
  }

  /**
   * @param in
   * @return return a double type with correct symbol '.'
   */
  static double getNum(Scanner in, String message) {
    System.out.println(message);
    String text = in.nextLine();
    if (text.contains(",")) {
      text = text.replace(",", ".");
    }
    return Double.parseDouble(text);
  }

  static double sum(double num1, double num2) {
    return num1 + num2;
  }

  static double subtraction(double num1, double num2) {
    return num1 - num2;
  }

  static double multiplication(double num1, double num2) {
    return num1 * num2;
  }

  static double division(double num1, double num2) {
    return num1 / num2;
  }

  static double whichOperation(char whichOperation, double num1, double num2) {
    double result = 0;
    switch (whichOperation) {
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
    } return result;
  }
}