package calculator;

import java.util.Scanner;

/**
 * @author Stanislav
 * Задание 3
 * 1. Реализовать базовые операции калькулятора (+,-,/,*) для предыдущего задания
 * 2. Поиск максимального элемента в массиве. Для начала задать массив слов.Размерность массива произвольна, задается в консоли. После чего в консоли вводятся слова в количестве равном заданной длине массива. В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль
 * 3. Программа должна выполнять одно из заданий на выбор. Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве.
 */
public class MainClass {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    whichTask(in);
    in.close();
  }

  static void whichTask(Scanner in) {
    System.out.println("Chose type of task: \n 1 - Calculator; \n 2 - ArraysTask ");
    int taskNumber = in.nextInt();
    if (taskNumber == 1) {
      getCalculator(in);
    } else getStringArray(in);
  }

  /**
   *
   * @param in принимает на вход объект типа Scanner
   * @see Calc
   */
  private static void getStringArray(Scanner in) {
    ArrClassOperations arrObject = new ArrClassOperations();
    System.out.println("Самое длинное слово: " + arrObject.getMaxLongWord(in));
  }

  /**
   * @param in принимает на вход объект типа Scanner
   * @see Calc
   */
  private static void getCalculator(Scanner in) {
    Calc calc = new Calc();
    double result = calc.getOperationResult(in, calc.getFirstNum(in), calc.getSecondNum(in));
    System.out.printf("Result is: %.4f", result);
  }
}
