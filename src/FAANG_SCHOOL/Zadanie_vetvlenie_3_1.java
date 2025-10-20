package FAANG_SCHOOL;

//В методе main c помощью new Random().nextInt() сгенерируйте 2 случайных целых числа.
//        Если оба числа чётные, разделите каждое число на 2 и выведите в консоль сумму.
//        Иначе если только первое число делится на 2, разделите только первое число на 2 и выведите в консоль сумму полученного числа и второго числа.
//        Иначе, если только второе число делится на 2, разделите только второе число на 2 и выведите результат вычисления в консоль.
//        Иначе (если никакое число не делится на 2) просто выведите в консоль сумму этих чисел.

import java.util.Random;

public class Zadanie_vetvlenie_3_1 {
    Random random= new Random();
    int random1 = new Random().nextInt(0,500);
    int random2 = new Random().nextInt(0,500);

        public void uslovie(){
            if (random1 % 2 ==0 && random2 % 2==0) {
                int sum = random1 / 2 + random2 / 2;
                System.out.println("Первое ("+random1+") делится на два, второе ("+random2 +") тоже =)");
                System.out.println("Их сумма : "+sum);
            } else if (random1 % 2 ==0) {
                int sum = random1 / 2 + random2;
                System.out.println("Только первое ("+random1+") делится на два, а второе НЕТ =((");
                System.out.println("Первое деленое на 2 : ("+sum+ ") второе просто ("+random2 +")");
            } else if (random2 % 2 ==0) {
                int sum = random2 / 2 + random1;
                System.out.println("Только второе (" + random2 + ") делится на два, а первое НЕТ =((");
                System.out.println("Второе деленое на 2 : (" + sum + ") первое просто (" + random1 + "=))");
            } else {
                int sum = random1+random2;
                System.out.println("Ни первое ("+random1+") ни второе ("+random2 +") НE делятся на 2 :((");
                System.out.println("А их сумма : "+sum);
            }
        }



}
