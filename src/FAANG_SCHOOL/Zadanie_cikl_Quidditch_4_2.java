package FAANG_SCHOOL;

import java.util.Random;

public class Zadanie_cikl_Quidditch_4_2 {
    Random random = new Random();
    int control = random.nextInt(0,100);
    int i = 1;
    int b = 1;
public void playGame(){
    while (i<=control) {
        if (i==control)
        System.out.println("Мяч пойман тут: "+ control);
        else {
            System.out.println("Попытка № "+ b++ + " - в этот раз тебе увы  не повезло, пробуем еще раз =>");
        }
        i++;
    }
}
}

