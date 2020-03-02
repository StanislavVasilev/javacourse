package calculator;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * @author Stanislav
 * Задание №8
 * Покрыть Unit тестами последний проект с калькулятором
 */
public class MainClass {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(in);
    Calc calc = new Calc();
    try {
      calc.setNum(scanner);
      calc.setNum2(scanner);
      out.println("Type the operation type");
      out.printf("Result is: %.2f\n", calc.getOperationAndPrintResult(scanner.next(), calc));
    } catch (IllegalStateException | ArithmeticException | IllegalArgumentException e) {
      out.println(e.getMessage());
      scanner.close();
    }
    scanner.close();
  }
}
