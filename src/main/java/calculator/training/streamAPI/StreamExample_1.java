package calculator.training.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample_1 {
  public static void main(String[] args) {
    List<String> stringCollection = new ArrayList<>();
    stringCollection.add("ddd2");
    stringCollection.add("aaa2");
    stringCollection.add("bbb1");
    stringCollection.add("aaa1");
    stringCollection.add("bbb3");
    stringCollection.add("ccc");
    stringCollection.add("bbb2");
    stringCollection.add("ddd1");
/*
Сначала вызывается поток
Затем выполняется фильтрация объекта по указанному условию, это промежуточная операция
В конце выполняется операция вызывает каждый из полученных элементов в ходе фильтрации. Это конечная операция.
 */
    stringCollection.stream().filter((s) -> s.contains("1")).forEach(System.out::println);
/*
Операция сортировки выполняется применительно к данному потоку. В коллекции сортировка не меняется.
Это так же промежуточная операция. Сортировка выполняется в обычном порядке, если не предоставлен свой компаратор.
*/
    stringCollection.stream().sorted().filter(s -> s.startsWith("a")).forEach(System.out::println);
/*
Операция map преобразует каждый элемент в другой объект при помощи переданной функции.
Тип результирующего потока зависит от типа функции, которая передается при вызове map.
*/
    stringCollection.stream().map(String::toUpperCase).sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);

    /*
Операция anyMatch выполняет проверку, удовлетворяет ли поток заданному предикату(условию).
Применяется к каждому объекту коллекции. Принимает булево значение
     */
    boolean startsWithA = stringCollection.stream().anyMatch(s -> s.startsWith("a"));
    System.out.println(startsWithA);
    boolean startsWithZ = stringCollection.stream().allMatch(s -> s.startsWith("z"));
    System.out.println(startsWithZ);
    boolean noneStartsWIthZ = stringCollection.stream().noneMatch(s -> s.startsWith("Z"));
    System.out.println(noneStartsWIthZ);

/*
    Операция count является конечно операцией и возвращает количество элементов коллекции,
    полученное в ходе использования промежуточных операций с потоком. например с фильтрацие по условию.
    Принимает значение типа long
*/

    long countStartsWithB = stringCollection.stream().filter(s -> s.startsWith("b")).count();
    System.out.println(countStartsWithB);
/*
Использование stream для фильтрации и преобразования его в List.
Создается экземпляр потока
Поток фильтруется, убирается значение, которое не равно 3 и конечная операция превращает обработанный поток в список типа List
 */
    Stream<Integer> number = Stream.of(1, 2, 3, 4, 5);
    List<Integer> result = number.filter(integer -> integer != 3).collect(Collectors.toList());
    result.forEach(System.out::println);
  }

}
