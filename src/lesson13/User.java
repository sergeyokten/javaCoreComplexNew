package lesson13;

public class User {

    private int id;
    private String name;
    private boolean status;

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public User() {
    }


    static class UserBuilder {
        User user = new User();


        public UserBuilder id(int id) {
            user.id = id;
            return this;
        }

        public UserBuilder name(String name) {
            user.name = name;
            return this;
        }

        public UserBuilder status(boolean status) {
            user.status = status;
            return this;
        }

        public User build() {
            return user;
        }


    }
}
