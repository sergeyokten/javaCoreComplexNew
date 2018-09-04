package lesson13;

public class Main {
    public static void main(String[] args) {
        class XXX {
            private int i;
            private String name;

            public XXX(int i, String name) {
                this.i = i;
                this.name = name;
            }
        }
        XXX xxx = new XXX(1, "jhdfahsgdf");


//        Outer.Inner inner = new Outer().new Inner();
//        Outer.Inner inner = new Outer.Inner();


        User user = User
                .builder()
                .id(10)
                .status(true)
                .name("ajshafs")
                .build();


        User build = SuperUser.builder().id(100).build();
    }


}


class Outer {
    private static String out;

    public Outer() {
//        System.out.println(in);
    }

    static class Inner {
        private int in;

        public Inner() {
            System.out.println(out);
        }
    }

}