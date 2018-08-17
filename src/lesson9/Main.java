package lesson9;

public class Main {
    public static void main(String[] args) {


        SuperUser superUser = new SuperUser(1, "vasya", false);
        System.out.println(superUser.getId());


        User user = new User() {
            @Override
            public void xxx() {

            }
        };
        User user1 = new SuperUser();
//        user1.isAdminStatus();


        superUser.asdqwe();


        SuperPuperUser x = new SuperPuperUser();
        x.greeting();
    }


}


abstract class User {
    private int id;
    private String name;


    public abstract void xxx();

    public User() {
        System.out.println("User constructor 1");
    }

    public User(int id, String name) {
        System.out.println("User constructor 2");
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public void asdqwe() {
        System.out.println("father");
    }
}


class SuperUser extends User {

    @Override
    public void xxx() {

    }

    private boolean adminStatus = true;

    public SuperUser() {
        super();
    }

    public SuperUser(int id, String name, boolean adminStatus) {
        super(id, name);
        this.adminStatus = adminStatus;
    }


    public boolean isAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(boolean adminStatus) {
        this.adminStatus = adminStatus;
    }


    @Override
    public void asdqwe() {
        System.out.println("child");
    }
}


class SuperPuperUser extends SuperUser {

    public void greeting() {
        System.out.println("hello");
    }


    @Override
    public void xxx() {
        System.out.println("asdhfagsdf");
        super.xxx();
        System.out.println("qeqweqwe");
    }
}

