package ComplexNumberCalculator.Controller;

import ComplexNumberCalculator.Model.Calculator;

/**
 * @params CalculateInterface интерфейс для реализации методов;
 * {@link }
 */
public interface CalculateInterface {
    Calculator additionNumbers(Calculator numberNew);

    Calculator subtractNumbers(Calculator numberNew);

    Calculator multiplyNumbers(Calculator numberNew);

    Calculator divideNumbers(Calculator numberNew);
    String toString();
}
