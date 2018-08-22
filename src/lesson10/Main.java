package lesson10;

public class Main {
    public static void main(String[] args) {


        User vasya = new User(1, "vasya", "+3", "8063", "1234567");
//        PhoneNumber vasyaPhoneNumber = vasya.getPhoneNumber();
//        vasyaPhoneNumber.call();
//        vasya.getPhoneNumber().call();
        vasya.call();

    }
}

class User {
    private int id;
    private String name;
    private PhoneNumber phoneNumber;

    public User() {

    }

    public User(int id, String name, PhoneNumber phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public User(int id, String name, String countryCode, String operatorCode, String number) {
        this.id = id;
        this.name = name;
        this.phoneNumber = new PhoneNumber(countryCode, operatorCode, number);
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

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void call(){
        this.phoneNumber.call();
    }

}//class User end

class PhoneNumber {
    private String countryCode;
    private String operatorCode;
    private String number;

    public PhoneNumber() {
    }

    public PhoneNumber(String countryCode, String operatorCode, String number) {
        this.countryCode = countryCode;
        this.operatorCode = operatorCode;
        this.number = number;
    }

    public void call() {
        System.out.println("call to number " + countryCode + operatorCode + number);
    }
}
