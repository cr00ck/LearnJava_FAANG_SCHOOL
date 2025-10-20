package FAANG_SCHOOL; //https://faang-school.com/courses

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.Arrays;

public class MainMagicKlass {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now(); //вызывает время сейчас
        String.format("Дата: %tF %tT", now, now);
        try {
        int width = 100; // Ширина прогресс-бара в символах
        for (int i = 0; i <= 100; i++) {
            int progress = (i * width) / 100;
            String bar = "[" + "=".repeat(progress) +
                    " ".repeat(width - progress) + "]";
            System.out.print("\r" + bar + " " + i + "%");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("\nProgress interrupted!");
                Thread.currentThread().interrupt();
                return;
            }
        }
            System.out.println("\nDone!\n" + now + "\n" + "результат твоей работы =>\n");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

//       Zadanie_exception_8_1_Spell check = new Zadanie_exception_8_1_Spell();
//       check.checkValueRamdom();
//       String [] superAbility = {"pooop", "hoh-ho","gigle","gor-gor","mernomeno"};
//       String [] superAbility2 = {"pooop2", "hoh-ho2","gigle2","gor-gor2","mernomeno2"};
//       Zadanie_OOP_6_1_Students stud1 = new Zadanie_OOP_6_1_Students("Valentin",155,superAbility);
//       int ageStud  = stud1.getAge();
//       stud1.setSuper_ability(superAbility2);
//       String [] Super = stud1.getSuper_ability();
//       Zadanie_exception_8_1_Spell spell = new Zadanie_exception_8_1_Spell();
//       System.out.println("Супреспособности оригинал - "+ Arrays.toString(superAbility)+"\n суперспособности SET - "+Arrays.toString(Super));
//       System.out.println("Возраст студа - " + ageStud);
//                stud1.castSpell(spell);

         Zadanie_vetvlenie_3_1 zad3_1 = new Zadanie_vetvlenie_3_1();
        zad3_1.uslovie();



    }

}
