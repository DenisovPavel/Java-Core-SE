package ComplexNumberCalculator.Model;

/**
 * Ко́мпле́ксные чи́сла  — числа вида,{ a+bi,} где
 * a,b — вещественные числа,
 * i — мнимая единица, то есть число, для которого выполняется равенство:
 * 2 = − 1;{i^{2}=-1.}
 */
public class Calculator {
    /**
     * @params numberReal - вещественной часть;
     * @params numberImaginaryPart -  мнимая часть;
     */
    public double numberReal;
    public double numberImaginaryPart;

    public Calculator(double numberReal, double numberImaginaryPart) {
        this.numberReal = numberReal;
        this.numberImaginaryPart = numberImaginaryPart;
    }

    /**
     * @return результат сложения комплексных чисел в виде обьекта класса Calculator;
     * @params addNumbers метод сложения комплексных чисел;
     */
    public Calculator additionNumbers(Calculator numberNew) {
        return new Calculator(this.numberReal + numberNew.numberReal,
                this.numberImaginaryPart + numberNew.numberImaginaryPart);
    }

    /**
     * @return результат вычетания комплексных чисел в виде обьекта класса Calculator;
     * @params subtractNumbers метод вычетания комплексных чисел;
     */
    public Calculator subtractNumbers(Calculator numberNew) {
        return new Calculator(this.numberReal - numberNew.numberReal,
                this.numberImaginaryPart - numberNew.numberImaginaryPart);
    }

    /**
     * @return результат умножения комплексных чисел в виде обьекта класса Calculator;
     * @params multiplyNumbers метод умножение комплексных чисел;
     */

    public Calculator multiplyNumbers(Calculator numberNew) {
        double realContainer = (this.numberReal * numberNew.numberReal) -
                (this.numberImaginaryPart * numberNew.numberImaginaryPart);
        double imaginaryContainer = (this.numberReal * numberNew.numberImaginaryPart) +
                (this.numberImaginaryPart * numberNew.numberReal);
        return new Calculator(realContainer, imaginaryContainer);
    }

    /**
     * @return результат деления комплексных чисел в виде обьекта класса Calculator;
     * @params divideNumbers метод деления комплексных чисел;
     */
    public Calculator divideNumbers(Calculator numberNew) {
        double realPart = ((this.numberReal * numberNew.numberReal) +
                (this.numberImaginaryPart * numberNew.numberImaginaryPart)) /
                ((numberNew.numberReal * numberNew.numberReal) +
                        (numberNew.numberImaginaryPart * numberNew.numberImaginaryPart));
        double imaginaryPart = ((this.numberImaginaryPart * numberNew.numberReal) -
                (this.numberReal * numberNew.numberImaginaryPart)) /
                ((numberNew.numberReal * numberNew.numberReal) +
                        (numberNew.numberImaginaryPart * numberNew.numberImaginaryPart));
        return new Calculator(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        if (numberImaginaryPart >= 0) {
            return numberReal + " + " + numberImaginaryPart + "i";
        } else {
            return numberReal + " - " + Math.abs(numberImaginaryPart) + "i";
        }
    }

}




