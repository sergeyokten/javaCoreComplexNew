package lesson6;

public class Another {

    int asd;

    public void increment(int i) {
        ++i;
        System.out.println(i);
    }

    public void increment(TestX i) {
        i.a++;
        System.out.println(i.a);
    }


    public void divide(int a, int b) {
        int res1;
        if (b != 0) {
            res1 = a / b;
        } else {
            res1 = 0;
        }
        System.out.println(res1);
//        return res1;

    }
}
