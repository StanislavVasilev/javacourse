package calculator.training.datetime;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTimeExaple {
  public static void main(String[] args) {

    /*
Тип Clock предоставляет доступ к текущей дате и времени. Этот
тип знает о часовых поясах и может использоваться вместо
вызова System.currentTimeMillis() для возвращения
миллисекунд.
     */
    Clock clock = Clock.systemDefaultZone();
    long mills = clock.millis();
/*
Такая точная дата также может быть представлена
классом Instant. Объекты этого класса могут быть использованы
для создания объектов устаревшего типа java.util.Date.
 */
    Instant instant = clock.instant();
    Date legacyDate = Date.from(instant);

    System.out.println(mills);
    System.out.println(legacyDate);

    System.out.println(ZoneId.getAvailableZoneIds());
/*
Часовые пояса представлены типом ZoneId. Доступ к ним
можно получить при помощи статических фабричных методов.
Часовые пояса содержат смещения, которые важны для
конвертации дат и времени в местные.
 */
    ZoneId zone1 = ZoneId.of("Europe/Berlin");
    ZoneId zone2 = ZoneId.of("Brazil/East");
    System.out.println(zone1.getRules());
    System.out.println(zone2.getRules());

    LocalTime now1 = LocalTime.now(zone1);
    LocalTime now2 = LocalTime.now(zone2);

    System.out.println(now1.isBefore(now2));
/*
Создадим два местных времени для часовых поясов,
определенных выше. Затем оба времени сравниваются, и
вычисляется разница между ними в часах и минутах.
 */
    long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
    long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);

/*
Пример демонстрирует вычисление новой даты путем сложения
или вычитания дней, месяцев или годов. Каждая операция
возвращает новый экземпляр.
 */
    LocalDate today = LocalDate.now();
    LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
    LocalDate yesterday = tomorrow.minusDays(2);
    LocalDate independenceDay = LocalDate.of(2014, Month.JULY, 4);
    DayOfWeek dayOfWeek = independenceDay.getDayOfWeek();
    System.out.println(dayOfWeek);

    /*
Можно использовать различные методы LocalDateTime
для извлечения конкретных значений из даты-времени:
     */
    LocalDateTime sylvester = LocalDateTime.of(2014, Month.DECEMBER, 31, 23, 59, 59);
    DayOfWeek dayOfWeek1 = sylvester.getDayOfWeek();
    System.out.println(dayOfWeek1);

    Month month = sylvester.getMonth();
    System.out.println(month);

    long minuteOfDay = sylvester.getLong(ChronoField.MINUTE_OF_DAY);
    System.out.println(minuteOfDay);
  }




}
