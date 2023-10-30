package ComplexNumberCalculator.View;

import ComplexNumberCalculator.Controller.CalculatorController;

/**
 * @brief Main - Точка входа в Калькулятор комплексных чисел;
 * Запуск осуществляется путем создания обьектов  CalculatorInput(отвечает за ввод данных в консоль),
 * а также  CalculatorController(Отвечающий за логирование операций);
 * @params realizeCalculate() запускает работу калькулятора;
 */

public class Main {
    public static void main(String[] args) {
        CalculatorInput calculatorInput = new CalculatorInput();
        CalculatorController calculatorController = new CalculatorController(calculatorInput);
        calculatorController.realizeCalculate();
    }
}
