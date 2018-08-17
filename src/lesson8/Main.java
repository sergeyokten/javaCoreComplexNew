package lesson8;

import lesson8.calculators.Calculator;
import lesson8.calculators.CalculatorAdd;
import lesson8.calculators.CalculatorMultiply;

public class Main {
    public static void main(String[] args) {


        Calculator[] calculators = {new CalculatorAdd(), new CalculatorMultiply()};

        Calculator calculator = new Calculator() {
            @Override
            public void calculate(int a, int b) {
                System.out.println(a * a * a);
            }
        };


        calculator.calculate(10, 20);
        calculator.bye();
        Calculator.greeting();


        Calculator calculator1 = new CalculatorMultiply();


    }
}
