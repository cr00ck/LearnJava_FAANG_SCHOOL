package FAANG_SCHOOL;

import java.util.Scanner;

public class Zadanie_vetvlenie_3_2_SortingHat {
    Scanner scanner = new Scanner(System.in);
    String question_1 = "Ты предпочитаешь работать в команде? (Да/Нет)";
    String question_2 = "Ты любишь разгадывать головоломки? (Да/Нет)";
    String question_3 = "Ты идешь на риск, чтобы достичь своей цели? (Да/Нет)";
    String question_4 = "Ты проявляешь заботу к существам и природе? (Да/Нет)";
    public void hat (){
        System.out.println(question_1);
        String answer1 = scanner.nextLine();
        System.out.println(question_2);
        String answer2 = scanner.nextLine();
        System.out.println(question_3);
        String answer3 = scanner.nextLine();
        System.out.println(question_4);
        String answer4 = scanner.nextLine();

        if (answer1.equalsIgnoreCase("да")) {
            if (answer3.equalsIgnoreCase("да")) {
                System.out.println("\nТвой факультет - Гриффиндор! 🦁");
                System.out.println("Отвага, благородство и честь - твои главные качества!");
            } else if (answer4.equalsIgnoreCase("да")) {
                System.out.println("\nТвой факультет - Пуффендуй! 🦡");
                System.out.println("Трудолюбие, верность и справедливость - вот что тебя характеризует!");
            } else if (answer2.equalsIgnoreCase("да")) {
                System.out.println("\nТвой факультет - Когтевран! 🦅");
                System.out.println("Мудрость, творчество и любознательность - твои сильные стороны!");
            } else {
                System.out.println("\nТвой факультет - Слизерин! 🐍");
                System.out.println("Хитрость, амбиции и решительность - твои главные черты!");//(если только answer1="Да", а остальные "Нет")
            }
        } else {
            if (answer3.equalsIgnoreCase("да")) {
                System.out.println("\nТвой факультет - Слизерин! 🐍");
                System.out.println("Хитрость, амбиции и решительность - твои главные черты!");
            } else {
                System.out.println("\nТвой факультет - Пуффендуй! 🦡");
                System.out.println("Трудолюбие, верность и справедливость - вот что тебя характеризует!");
            }
            scanner.close();
        }

        }}



