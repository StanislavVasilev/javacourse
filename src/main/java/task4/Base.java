package task4;

import task4.Gifts.Candy;
import task4.Gifts.Gift;
import task4.Gifts.Jellybean;

import java.util.Arrays;
/**
 * @author Stanislav Vasilev
 * Задание №4
 *
 * 2. Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * У каждой сладости есть название, вес, цена и свой уникальный параметр.
 * Необходимо собрать подарок из сладостей.
 * Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 */

public class Base {
  public static void main(String[] args) {
    Candy candy = new Candy("candy1", 9.99, 1.5, "green");
    Jellybean jellybean = new Jellybean("jellybean1", 8.5, 2.0, 1000);
    Gift[] gifts = {candy, jellybean};
    System.out.printf("Total weight: %.2f \n", (candy.getWeight() + jellybean.getWeight()));
    System.out.printf("Total price: %.2f \n", (candy.getPrice() + jellybean.getPrice()));
    System.out.println("General information about gift: " + Arrays.toString(gifts));
  }
}
