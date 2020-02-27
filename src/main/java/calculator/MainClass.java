package calculator;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * @author Stanislav
 * Добавить обработку исключений в задание с ООП калькуляторам
 * (например, исключение может возникнуть при делении на ноль)
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
