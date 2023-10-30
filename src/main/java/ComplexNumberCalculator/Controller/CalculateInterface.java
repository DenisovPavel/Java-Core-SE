package ComplexNumberCalculator.Controller;

import ComplexNumberCalculator.Model.Calculator;

/**
 * @params CalculateInterface интерфейс для реализации методов;
 * {@link <a href="https://github.com/DenisovPavel/Java-Core-SE/blob/main/src/main/java
 * /ComplexNumberCalculator/Controller/CalculatorDecorator.java">...</a>}
 */
public interface CalculateInterface {
    Calculator additionNumbers(Calculator numberNew);

    Calculator subtractNumbers(Calculator numberNew);

    Calculator multiplyNumbers(Calculator numberNew);

    Calculator divideNumbers(Calculator numberNew);
    String toString();
}
