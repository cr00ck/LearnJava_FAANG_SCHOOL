package FAANG_SCHOOL;

import java.util.Random;

public class Zadanie_3_1_posle_pepreriva {
    int a = new Random().nextInt(500);
    int b = new Random().nextInt(500);


    public void foo() {
        System.out.println("сгенерированные числа : " + a + " и " + b);
        boolean isOne = a % 2 == 0;
        boolean isTwo = b % 2 == 0;
        boolean containsTwo1 = String.valueOf(a).contains("2");
        boolean containsTwo2 = String.valueOf(b).contains("2");
        double c = a / 2.0;
        double d = b / 2.0;
        double summ = a+b;
        double summ2 = c+d;

        if (isOne && isTwo){
            System.out.println("оба четные ! \nДелим на два оба числа и их сумма : " + summ2);
        } else if (isOne && !isTwo) {
            System.out.println("только первое делится на 2, поэтому делим второе "+ b +" на 2 "+" будет: " + d );
        }else if (!isOne && isTwo) {
            System.out.println("только второе делится на 2, поэтому делим первое "+ a +" на 2 "+" будет: " + c );
        }else {
            System.out.println("Ни одно не делится на 2, поэтому их Сумма - " + summ);
        }
    }
}



