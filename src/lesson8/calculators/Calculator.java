package lesson8.calculators;

public interface Calculator {

    /*public static final*/ String company = "oktenweb";

    /*public*/ void calculate(int a, int b);

    /*public*/ static void greeting() {
        System.out.println("hello oktenweb");
    }

    default void bye(){
        System.out.println("goodby everyone");
    }


}
