package calculator;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * @author Stanislav
 * Задание №5
 * Реализовать калькулятор в стиле ООП. Архитектуру приложения продумать самостоятельно.
 */
public class MainClass {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Calc calc = new Calc();
    try {
      calc.setNum(in);
      calc.setNum2(in);
      out.printf("Result is: %.2f\n", calc.getOperationAndPrintResult(in, calc));
    } catch (NumberFormatException | IllegalStateException | ArithmeticException e) {
      out.println("Операция не может быть выполнена");
      e.printStackTrace();
      in.close();
    }
    in.close();
  }
}
