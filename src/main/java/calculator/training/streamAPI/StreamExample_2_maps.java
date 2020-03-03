package calculator.training.streamAPI;

import java.util.HashMap;
import java.util.Map;

public class StreamExample_2_maps {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
/*
Операция выполняет добавление пары ключ/значение в мап одновременно с проверкой на наличие элемента с таким ключом.
 */
    for (int i=0;i<10;i++){
      map.putIfAbsent(i, "val" + i);
    }
    map.forEach((id, val) -> System.out.println(val));
/*
Выполнение действия с выбранным элементом коллекции мап.
В данном примере выполняется конкантенация значения и ключа в элементе val3, после операции значение элемента - val33
 */
    map.computeIfPresent(3, (integer, s) -> s + integer);
    System.out.println(map.get(3));
/*
Выполнение действия удаления элемента с указанным ключом
 */
    map.computeIfPresent(9, (integer, s) -> null);
    System.out.println(map.containsKey(9));
/*
Выполняет действие добавления пары, пара успешно добавлена, потому что ключа 23 ранее не было в мапе
 */
    map.computeIfAbsent(23, integer -> "val" + integer);
    System.out.println(map.containsKey(23));
/*
Выполняет добавление пары. Пара не добавлена, так как уже существует пара с ключом 3
 */
    map.computeIfAbsent(3,integer -> "bam");
    System.out.println(map.containsKey(3));

/*
Выполняет удаление пары при условии, что указанные ключ/значение полностью ассоциированы
 */
    map.remove(3, "val3");
    map.get(3);
    map.remove(3, "val33");
    map.get(3);

/*
Запросить значение ключа, если такого не существует,
то возвращается значение по умолчанию "not found", указанное в параметрах метода
*/
    map.getOrDefault(55, "not found");
    
  }
}
