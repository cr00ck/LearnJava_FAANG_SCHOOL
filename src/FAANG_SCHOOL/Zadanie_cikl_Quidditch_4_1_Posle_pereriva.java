package FAANG_SCHOOL;

import java.util.Random;

public class Zadanie_cikl_Quidditch_4_1_Posle_pereriva {
    public void Quiddich () {
        Random random = new Random();
        int random1 = random.nextInt(51);

        String Quaffle_10 = "Quaffle_10";
        String Bludger_20 = "Bludger_20";
        String Golden_Snitch_50 = "Golden_Snitch_50";
        System.out.println("Случайное число random1 : " + random1);



        for (int i = 1; i <= random1 ; i++) {
            int random2 = random.nextInt(51);
            System.out.println("\nСлучайное число random2 : " + random2+"\n");

            if (random2 == 10) {
                System.out.println("Игра №  = "+ i +"- Пойман мяч : " + Quaffle_10);
            } else if (random2 == 20) {
                System.out.println("Игра №  = "+ i +"- Пойман мяч : " + Bludger_20);
            } else if (random2 == 50) {
                System.out.println("Игра №  = "+i+ "- Пойман мяч : " + Golden_Snitch_50);
            }else {
                System.out.println("Ничего не поймали (((");
                System.out.println("Игра №  = "+i);
            }

        }

    }
}
