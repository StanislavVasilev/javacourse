package calculator;

import calculator.application.ApplicationClass;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * @author Stanislav
 * Задание №5
 * Реализовать калькулятор в стиле ООП. Архитектуру приложения продумать самостоятельно.
 */
public class MainClass {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ApplicationClass appClass = new ApplicationClass();
    Calc calc = new Calc();
    calc.setNum(in);
    calc.setNum2(in);
    out.printf("Result is: %.2f\n", appClass.getOperationAndPrintResult(in, calc));
    in.close();
  }
}
