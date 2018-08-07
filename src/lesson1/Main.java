package lesson1;

public class Main {
    public static void main(String[] args) {

        User user1 = new User();
        user1.id = 1L;
        user1.name = "Vasya";
        user1.email = "vasyaBest";
        user1.dog = '@';
        user1.domain = "gmail.com";
        user1.status = true;
        user1.age = 31;
        user1.wallet = 12500;
        user1.bank = 987987;
        user1.weight = 87.7;
        user1.height = 187.9f;
        System.out.println(user1.id);
        System.out.println(user1.name);
        System.out.println(user1.email);
        System.out.println(user1.dog);
        System.out.println(user1.domain);
        System.out.println("*****************");
        User user2 = new User();
        System.out.println(user2.id);
        System.out.println(user2.name);
        System.out.println(user2.email);
        System.out.println(user2.dog);
        System.out.println(user2.domain);


        User user3 = new User();
        Customer customer1 = new Customer();


        int result = user1.age + user2.age;
        System.out.println(result);

        int totalWeight = (int) user1.weight + (int) user2.weight;
        System.out.println(totalWeight);

        String res = user1.age + user2.age + user2.name;
        System.out.println(res);
        System.out.println(user2.age % user1.age);


    }
}
