package FAANG_SCHOOL;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//хочу сам просто попробовать создать массив в котром будет 100 элементов и с помощью цикла каждый раз подставлять в ячейку новое значение

public class Zadanie_massiv_5_1_posle_pepreriva {
    Random random = new Random();
    int[] arrayTest = new int[100];

    public void setArray() {
        for (int i = 0; i < arrayTest.length; i++) {
            arrayTest[i] = random.nextInt(50) - 10; // Заполняем числами от 50 до -10
        } //если скобку поставить после System.out.println то будет заполняться матрицей
        System.out.println(Arrays.toString(arrayTest));
    }
//    Четвертое задание
//    попробуем написать небольшой алгоритм. Все необходимые инструменты мы уже прошли. За подсказками попробуйте обратиться к предыдущим урокам.
//
//    Создайте массив из 5 целых чисел. Напишите код для нахождения наименьшего и наибольшего элемента в массиве. Выведите эти элементы в консоль.

    //Не получилось =((((((
    public void algorithm() {
        int[] five = {1, 2, 3, 4, 5};
        for (int i = 1; i < five.length; i++) {
            int min = five[0];
            int max = five[4];
            if (five[i] < min) {
                System.out.println(min);
            } else if (five[i] < max) {
                System.out.println(max);
            }
        }
        // Порядок добавления: Капля сока вампирской розы,
// Слеза феникса, Засушенная чешуя василиска, Частичка души лесной феи,
// Яд шершавого ядозуба, Осколок кометы
    }

    public void recipes() {
        String[] recipe = {"Засушенная чешуя василиска",
                "Частичка души лесной феи",
                "Капля сока вампирской розы",
                "Яд шершавого ядозуба",
                "Осколок кометы",
                "Слеза феникса"};
        String[] poison = new String[6];
        poison[2] = "Капля сока вампирской розы";
        poison[5] = "Слез6а феникса";
        poison[0] = "Засушенная чешуя василиска";
        poison[1] = "Частичка души лесной феи";
        poison[3] = "Яд шершавого ядозуба";
        poison[4] = "Осколок кометы";
        if (Arrays.equals(poison, recipe)) {
            System.out.println("recipe = poison\n" +
                    Arrays.toString(recipe) +
                    "\n " + Arrays.toString(poison));
        } else {
            System.out.println("recipe НЕ РАВНО poison\n" +
                    Arrays.toString(recipe) +
                    "\n " + Arrays.toString(poison));
        }
        ;

    }

    ;
    // тут используется исключение Zadanie_exception_8_2_CustomException_2

    public void prepare()  {
        Scanner scanner = new Scanner(System.in);
        String[] preparation = {"Драконий коготь, Лист мандрагоры, Корень шершавой астрелии"};
        System.out.println("Добро пожаловать в лабораторию зелий!\nВведите ингредиенты, которые у вас есть (через запятую):");
        String input = scanner.nextLine();
        String[] userIngredients = input.split(", ");
        System.out.println("Ваши ингредиенты: " + Arrays.toString(userIngredients));
        try {
            // Проверяем каждый ингредиент пользователя
            for (String ingredient : userIngredients) {
                if (ingredient.equals("Яд")) { // Пример запрещенного ингредиента
                    throw new Zadanie_exception_8_2_CustomException_2(ingredient);
                }
            }
        } catch (Zadanie_exception_8_2_CustomException_2 e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


