package lesson5;

public class Main {
    public static void main(String[] args) {


        Fighter fighter1 = new Fighter("Sub-zero", 20);
        Fighter fighter2 = new Fighter("Scorpion", 22);
        Fighter fighter3 = new Fighter("Sao-Khan", 30);
        Fighter fighter4 = new Fighter("Lu Kang", 20);


        Fighter[] fightersRoundOne = {
                fighter1, // 0
                fighter2, // 1
                fighter3, // 2
                fighter4 // 3
        };

        Fighter[] fightersRoundTwo = {
                new Fighter("Sub-zero", 20),
                new Fighter("Scorpion", 22),
                new Fighter("Sao-Khan", 30),
                new Fighter("Lu Kang", 20)
        };


        Fighter asd = fightersRoundOne[3];

        System.out.println(asd);
        System.out.println(fighter4);
        String fighterName = asd.fighterName;
        int power = asd.power;

        System.out.println(fightersRoundOne[0].fighterName + " " + fightersRoundOne[0].power);
        System.out.println(fightersRoundOne[1].fighterName + " " + fightersRoundOne[1].power);
        System.out.println(fightersRoundOne[2].fighterName + " " + fightersRoundOne[2].power);
        System.out.println(fightersRoundOne[3].fighterName + " " + fightersRoundOne[3].power);

        System.out.println("------------------");
        for (int i = 0; i < fightersRoundOne.length; i++) {
            if (fightersRoundOne[i].power > 21) {
                System.out.println(fightersRoundOne[i].fighterName + " " + fightersRoundOne[i].power);

            } else {
                System.out.println(fightersRoundOne[i].fighterName + ", you must train harder");
            }
        }




    }
}
