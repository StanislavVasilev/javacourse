package calculator.arrays;

import java.util.Scanner;

public class ArrClassOperations {

  private int getNewArrLength(Scanner in) {
    System.out.println("Введите размер массива");
    return in.nextInt();
  }

  private String[] getFilledArr(Scanner in) {
    String[] arr = new String[getNewArrLength(in)];
    for (int i = 0; i < arr.length; i++) {
      System.out.printf("Заполните %d значение элемента массива\n", i + 1);
      arr[i] = in.next();
    }
    return arr;
  }

  public String getMaxLongWord(Scanner in) {
    String[] arr = getFilledArr(in);
    String maxLengthWord = arr[0];
    int maxLength = maxLengthWord.length();
    for (String word : arr) {
      if (word.length() <= maxLength) {
        continue;
      }
      maxLengthWord = word;
      maxLength = maxLengthWord.length();
    }
    return maxLengthWord;
  }

}
