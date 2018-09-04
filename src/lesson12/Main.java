package lesson12;

public class Main {
    public static void main(String[] args) {


        User user = new User("vasya", Sex.MALE);
        Sex sex = Sex.MALE;
        System.out.println(sex.getDescription());

    }
}

class User {
    private String name;
    private Sex sex;

    public User(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}

enum Sex {
    MALE("man"), FEMALE("woman");

    private String description;

    Sex() {
    }

    Sex(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
