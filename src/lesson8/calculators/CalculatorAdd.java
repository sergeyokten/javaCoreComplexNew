package lesson8.calculators;

public class CalculatorAdd implements Calculator {

    int z = 100;
    String x = "oktenweb";

    public void calculate(int a, int b) {
        System.out.println(a + b);
    }


    public int test1() {
        return z * 100;
    }
}
