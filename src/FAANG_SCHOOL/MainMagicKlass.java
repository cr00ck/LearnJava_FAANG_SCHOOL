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


    }

}
