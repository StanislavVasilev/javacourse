package calculator;

import java.util.Scanner;

public class Calc {
  private double num;
  private double num2;

  public Calc(){};
  public Calc(double num, double num2) {
    this.num = num;
    this.num = num2;
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
  public double getFirstNum(){
  return num;
  }

  public double getSecondNum(){
    return num2;
  }


  /**
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

}
