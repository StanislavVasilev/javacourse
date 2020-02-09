
package task4.Arrays;

import java.util.Arrays;
/**
 * @author Stanislav Vasilev
 * Задание №4
 * 1. Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 * Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.
 */
public class ArraysOperation {
  public static void main(String[] args) {
    int[] arr = new int[20];
    //    потому что нужно получить -10 включительно, если указать -10, то мин значение будет -9
    int min = -11;
//    потому что нужно получить 10 включительно
    int max = 11;
    fillArr(arr, min, max);
    System.out.println("Array before change of elements" + Arrays.toString(arr));
    System.out.println("Mix value is: " + arr[findMinValueElement(arr)] + "\n Index of this value is: " + findMinValueElement(arr));
    System.out.println("Max value is: " + arr[findMaxValueElement(arr)] + "\n Index of this value is: " + findMaxValueElement(arr));
    choseMinAndMAxValuePositions(arr, findMinValueElement(arr), findMaxValueElement(arr));
    System.out.println("Array after change of elements" + Arrays.toString(arr));
  }

  private static int[] fillArr(int[] arr, int min, int max) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = getRandom(min, max);
    }
    return arr;
  }

  private static int getRandom(int min, int max) {
//    случайное число в диапазоне от 0 до 1(не вкл) умножить на сумму заданного нам диапазона к получившемуся результату прибавить значение мин границы
    return (int) (Math.random() * (max - min) + min);
  }
//Возвращает индекс минимального элемента массива
  private static int findMinValueElement(int[] arr) {
    int min = arr[0];
    int minValueIndex = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        minValueIndex = i;
        min = arr[i];
      }
    }
    return minValueIndex;
  }
//Возвращает значение максимального элемента
  private static int findMaxValueElement(int[] arr) {
    int maxValueIndex = 0;
    int maxValue = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > maxValue) {
        maxValue = arr[i];
        maxValueIndex = i;
      }
    }
    return maxValueIndex;
  }
// Меняет местами минимальный и максимальный элемент.
  private static int[] choseMinAndMAxValuePositions(int[] arr, int minValueIndex, int maxValueIndex) {
    int maxValue = arr[maxValueIndex];
    int minValue = arr[minValueIndex];
    arr[maxValueIndex] = minValue;
    arr[minValueIndex] = maxValue;
    return arr;
  }
}
