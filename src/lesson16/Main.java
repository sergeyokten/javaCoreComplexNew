package lesson16;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        TreeSet<User> users = new TreeSet<>();
////        LinkedHashSet<User> users = new LinkedHashSet<>();
////        HashSet<User> users = new HashSet<>();
//        users.add(new User(2, "kokos", true));
//        users.add(new User(1, "ananas", true));
//        users.add(new User(3, "banan", false));
//        users.add(new User(5, "tomat", false));
//        users.add(new User(4, "potatos", true));
//        users.add(new User(6, "mango", false));
//        users.add(new User(6, "mango", false));
//        System.out.println(users);
//
//        for (User user : users) {
//            System.out.println(user.hashCode());
//        }


        Map<String, User> users = new TreeMap<>();
        users.put("kokos", new User(2, "anton", true));
        users.put("ananans", new User(1, "petya", true));
        users.put("banan", new User(3, "olya", false));
        users.put("tomat", new User(5, "roma", false));

        Set<String> keySet = users.keySet();
        for (String key : keySet) {
            System.out.print(key + " ");
            User user = users.get(key);
            System.out.println(user);
        }


        users.replace("kokos", new User());
//        Comparator<? super String> comparator = ((TreeMap<String, User>) users).comparator();
        Collection<User> values = users.values();
        for (User value : values) {
            System.out.println(value);
        }
        System.out.println();
        Set<Map.Entry<String, User>> entries = users.entrySet();
//        for (Map.Entry<String, User> entry : entries) {
//            System.out.print(entry.getKey()+ " ");
//            System.out.println(entry.getValue());
//        }
        Iterator<Map.Entry<String, User>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, User> userEntry = iterator.next();
            if (userEntry.getValue().getId() == 0) {
                iterator.remove();
            }
        }

        System.out.println(users);


    }
}
