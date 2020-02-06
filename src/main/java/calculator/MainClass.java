package calculator;

import sun.usagetracker.UsageTrackerClient;

import java.util.Scanner;

/**
 * @author Stanislav
 * Задание 1 и 2.
 * 1. Начинаем писать калькулятор:
 * Реализовать сложение дробных чисел, которые пользователь вводит в консоль. Использовать комментарии и JavaDoc при описании метода. Использовать форматирование при выводе результата в консоль. Полученный результат округлять до 4-х знаков после запятой.
 * 2. Запушить проект в свой репозиторий на GitHub
 * *Добавить возможность выбора другой операции (сложение, вычитание, деление, умножение)
 *
 * Задание 3
 * 1. Реализовать базовые операции калькулятора (+,-,/,*) для предыдущего задания
 *2. Поиск максимального элемента в массиве. Для начала задать массив слов.Размерность массива произвольна, задается в консоли. После чего в консоли вводятся слова в количестве равном заданной длине массива. В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль
 *3. Программа должна выполнять одно из заданий на выбор. Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве.
 */
public class MainClass {
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
