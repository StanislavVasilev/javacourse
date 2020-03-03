package calculator.training.lambdaExamples.converter;

import static calculator.training.lambdaExamples.converter.Converter.*;

public class ConvertStringToInteger {
  public static void main(String[] args) {
    System.out.println(converter.convert("594"));
    System.out.println(stringConverter.convert("999"));
    System.out.println(stringIntegerConverter.convert(999));
  }
}
