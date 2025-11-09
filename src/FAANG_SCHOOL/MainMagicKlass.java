package FAANG_SCHOOL; //https://faang-school.com/courses

import FAANG_SCHOOL.Zadanie_Map_13.*;
import FAANG_SCHOOL.Zadanie_Set_12.RemoveDuplicates;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
        UniversitySystem univer = new UniversitySystem();
        // ТЕСТ 1: Вывод всех студентов
        System.out.println("=".repeat(50));
        System.out.println("ТЕСТ 1: ВЫВОД ВСЕХ СТУДЕНТОВ");
        System.out.println("=".repeat(50));
        univer.printAllStudentsGrouped();

        // ТЕСТ 2: Добавление новых студентов
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ТЕСТ 2: ДОБАВЛЕНИЕ НОВЫХ СТУДЕНТОВ");
        System.out.println("=".repeat(50));

        univer.addStudent("Павел Орлов", "Информатика", 3);
        univer.addStudent("Юлия Семенова", "Математика", 2);

        // Попытка добавить дубликат
        univer.addStudent("Иван Петров", "Информатика", 1);

        // ТЕСТ 3: Поиск студентов
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ТЕСТ 3: ПОИСК СТУДЕНТОВ");
        System.out.println("=".repeat(50));

        univer.findStudentsByFacultyAndYear("Информатика", 1);
        univer.findStudentsByFacultyAndYear("Физика", 2);
        univer.findStudentsByFacultyAndYear("Биология", 1); // Несуществующий факультет

        // ТЕСТ 4: Удаление студентов
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ТЕСТ 4: УДАЛЕНИЕ СТУДЕНТОВ");
        System.out.println("=".repeat(50));

        univer.removeStudent("Мария Сидорова", "Информатика", 1);
        univer.removeStudent("Несуществующий Студент", "Информатика", 1);

        // ТЕСТ 5: Финальный вывод
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ТЕСТ 5: ФИНАЛЬНЫЙ ВЫВОД");
        System.out.println("=".repeat(50));

        univer.printAllStudentsGrouped();

        System.out.println("\n🎉 Тестирование завершено успешно!");











    }

    }







