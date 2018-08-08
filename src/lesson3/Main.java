package lesson3;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Vasya", 21);
        Human human2 = new Human("Petya", 23);
        Human human3 = new Human("Kolya", 18);

//        human1.age ..... human2.age....

        boolean bool = 100 != 200; // false
        System.out.println(bool);
        System.out.println("hello".equals("hello"));

        String s1 = new String("oktenweb");
        String s2 = new String("oktenweb");
        System.out.println(s1.equals(s2));


        if (human1.age > human2.age) {
            System.out.println("human 1 older than human 2");
        } else {
            System.out.println("human 2 older than human 1");

        }


        if (human1.age > human2.age && human1.age > human3.age) {
            System.out.println("human1 ");

        } else if (human2.age > human1.age && human2.age > human3.age) {

            System.out.println("human2");
        } else if (human3.age > human1.age && human3.age > human2.age) {
            System.out.println("human 3");
        } else {

        }


        switch ("sagsjdgasjdh") {

            case "asd":
                System.out.println("case 1");
                break;
            case "qwe":
                System.out.println("case 2");
                break;
            case "oktenweb":
                System.out.println("case 3");
                break;
                default:
                    System.out.println("default case");


        }


    }

}
