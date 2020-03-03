package calculator.training.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
Преобразование листа в мап при помощи stream API
Map не поддерживает потоки.
 */
public class TestHostingListToMap {
  public static void main(String[] args) {
    List<Hosting> list = new ArrayList<>();
    list.add(new Hosting(1, "liquidweb.com", 80000));
    list.add(new Hosting(2, "linode.com", 90000));
    list.add(new Hosting(3, "digitalocean.com", 120000));
    Map<Integer, String> result1 = list.stream()
            .collect(
                    Collectors.toMap(Hosting::getId, Hosting::getName));
    System.out.println("Result1: " + result1);
  }
}
