package collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author Stanislav
 * Есть входной файл с набором слов, написанных через пробел
 * Необходимо:
 * Прочитать слова из файла.
 * Отсортировать в алфавитном порядке.
 * Посчитать сколько раз каждое слово встречается в файле.
 * Вывести статистику на консоль
 * Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
 * Файл расположен по адресу src\main\resources\Example.txt
 */
public class CollectionsTask {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner scanner = new Scanner(new File("src\\main\\resources\\Example.txt"));
    Map<String, Integer> stats = getCountsOfWords(scanner);
    System.out.println(stats);
    System.out.println("Сортировка по алфавиту: ");
    getSortedWords(stats);
    System.out.println("Больше всего повторений слова " + "\"" + getMaxRepeatWord(stats) + "\"");
    System.out.println("Это слово повторяется " + stats.get(getMaxRepeatWord(stats)) + " раз");
  }

  private static Map<String, Integer> getCountsOfWords(Scanner scanner) {
    Map<String, Integer> statistics = new TreeMap<>();
    while (scanner.hasNext()) {
      String word = scanner.useDelimiter("\\s+").next().toLowerCase();
      Integer count = statistics.get(word);
      if (count == null) {
        count = 0;
      }
      statistics.put(word, ++count);
    }
    return statistics;
  }
  
  private static void getSortedWords(Map<String, Integer> map){
    for (Entry entry : map.entrySet()){
      System.out.print(entry.getKey() + "\n");
    }
  }

  private static String getMaxRepeatWord(Map <String, Integer> map){
    String word = null;
    Integer max = 0;
    for (Entry entry : map.entrySet()){
      Integer num = (Integer) entry.getValue();
      if (num > max){
        max = num;
        word = (String) entry.getKey();
      }
    }
    return word;
  }
}
