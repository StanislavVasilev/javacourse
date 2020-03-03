package calculator.training.lambdaExamples.converter;

import static java.lang.String.valueOf;

@FunctionalInterface
public interface Converter<F, T> {
  T convert(F from);
//Выполняет конвертирование строкового числа в числовой тип данных. Объект Integer
  Converter<String, Integer> converter = Integer::valueOf;

//  Выполняет конкантенацию чисел в строковом виде.
  int num = 1;
  Converter<String, String> stringConverter = (from) -> {
    return valueOf(from + num);
  };
//  Выполняет сложение чисел
  Converter<Integer, String> stringIntegerConverter = (from) -> {
    return valueOf(from + num);
  };
}
