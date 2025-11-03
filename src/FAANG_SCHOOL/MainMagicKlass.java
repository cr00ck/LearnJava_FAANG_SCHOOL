package FAANG_SCHOOL; //https://faang-school.com/courses

import FAANG_SCHOOL.List_Learning_theory.List_Learning_practice;
import FAANG_SCHOOL.List_Learning_theory.List_Learning_theory;
import FAANG_SCHOOL.Zadanie_Abstraktnie_Klassi_10_1.ExpandingSpell;
import FAANG_SCHOOL.Zadanie_Abstraktnie_Klassi_10_1.ReducingMagic;
import FAANG_SCHOOL.Zadanie_Interface_9_1.Car;
import FAANG_SCHOOL.Zadanie_Interface_9_1.Cloak;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainMagicKlass {
    public static void main(String[] args) throws Zadanie_exception_8_2_CustomException_2 {
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
        // Создаем объект нашего класса
        List_Learning_practice program = new List_Learning_practice();
        program.listOrderChain();
        program.transform();







    }

    }







