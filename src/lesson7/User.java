package lesson7;

public class User {
    private int id;
    private int[] wallet;

    public User() {
    }

    public User(int id, int[] wallet) {
        this.id = id;
        this.wallet = wallet;
    }


//    public void setId(int id) {
//        if (id > 0) {
//            this.id = id;
//        } else {
//            System.out.println("your id is lower than 0");
//        }
//
//    }
//
//    public int[] getWallet(String password) {
//        if (password.equals("1111")) {
//            return this.wallet;
//        } else {
//            return null;
//        }
//
//    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getWallet() {
        return wallet;
    }

    public void setWallet(int[] wallet) {
        this.wallet = wallet;
    }
}
