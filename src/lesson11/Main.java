package lesson11;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        User<String> stringUser = new User<>("asdqwe", "vasya");
        User<Integer> integerUser = new User<>(123, "kokos");
        User<UUID> uuidUser = new User<>(new UUID(123, 345), "petya");

        uuidUser.test(123);
        User<?> user = new User<>("123", "asdasdasd");

    }
}

class User<T/*, V, F, E*/> {
    private T id;
    private String name;

    public User(T id, String name) {
        this.id = id;
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public <M> void test(M m) {

    }
}



