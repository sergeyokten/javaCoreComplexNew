package lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] walletU1 = {100, 200, 300};
        User user1 = new User(1, walletU1);


        int[] walletU2 = {200, 200, 200};
        User user2 = new User(1, walletU2);

        Couter couter = new Couter();
//        couter.getAllCash(user1);
//
//        System.out.println(couter.doTax(user1));


        user1.setId(-10);
//        int[] wallet1 = user1.wallet;
//        int totallCash = 0;
//        for (int cash : wallet1) {
//            totallCash += cash;
//        }
//
//        System.out.println(totallCash);
//
//
//        int[] wallet2 = user2.wallet;
//        int total = 0;
//        for (int i : wallet2) {
//            total += i;
//        }
//
//        System.out.println(total);

        System.out.println(Arrays.toString(user1.getWallet()));


        int[] wallet = user1.getWallet();
        for (int banknota : wallet) {

        }

        for (int i = 0; i < wallet.length; i++) {
            int banknota = wallet[i];

        }


    }
}
