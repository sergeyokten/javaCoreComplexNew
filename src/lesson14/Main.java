package lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> strings1 = new ArrayList<>();
////        List<String> strings2 = new LinkedList<>();
////        Collection<String> strings = strings2;
//
//        strings1.add("java");
//        strings1.add("js");
//        strings1.add("html");
//        strings1.add("db");
//
//        System.out.println(strings1);
//        strings1.add(0, "css");
//        System.out.println(strings1);
//
//
////        String s = strings1.get(1);
////        System.out.println(s);
////        strings1.remove(0);
////        System.out.println(strings1);
////        strings1.clear();
//        System.out.println(strings1);
//        System.out.println(strings1.size());
//        ((ArrayList<String>) strings1).trimToSize();

        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "vasya"));

        List<User> users = Arrays.asList(new User(2, "petya"), new User(3, "anya"), new User(4, "kokos"));
        userList.addAll(users);
        System.out.println(userList);
//        userList.remove(new User(1, "vasya"));
//        System.out.println(userList);
//        userList.removeAll(users);
//        System.out.println(userList);
//        System.out.println(userList.contains(new User(1, "vasya")));

//        for (int i = 0; i < userList.size(); i++) {
//            User user = userList.get(i);
//        }

//        for (User user : userList) {
//            System.out.println(user);
//            if (user.getId() % 2 == 0) {
//                userList.remove(user);
//            }
//        }


//        int petya = userList.indexOf(new User(2, "petya"));
//        System.out.println(petya);
//        List<User> subList = userList.subList(0, 4);
//        System.out.println(subList);


        Iterator<User> iterator = userList.iterator();
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());

        while (iterator.hasNext()) {
            User currentUser = iterator.next();
            System.out.println(currentUser);
            if (currentUser.getId() % 2 == 0) {
                iterator.remove();
            }

        }

        System.out.println(userList);

    }
}
