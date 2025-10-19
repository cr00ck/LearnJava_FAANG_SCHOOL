package FAANG_SCHOOL;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie_massiv_5_2_3 {

    public void prepare() {
        Scanner scanner = new Scanner(System.in);

        String[] ingredients = {"Драконий коготь", "Лист мандрагоры", "Корень шершавой астрелии"};


        System.out.println("Добро пожаловать в лабораторию зелий! \nВведите ингредиенты, которые у вас есть (через запятую): ");
        String input = scanner.nextLine();
        String[] userIngredients = input.split(",");
        System.out.println(Arrays.toString(userIngredients));
        scanner.close();
        System.out.println(Arrays.toString(userIngredients)+" userIng - "+userIngredients[0]);

        int i = 1;
        if (userIngredients.length <=3){
            if (userIngredients[0].equals("Драконий коготь")||
                    userIngredients[0].equals("Лист мандрагоры")||
                            userIngredients[0].equals("Корень шершавой астрелии")) ;
            System.out.println("Первый есть");

            if(                    userIngredients[1].equals("Драконий коготь")||
                    userIngredients[1].equals("Лист мандрагоры")||
                    userIngredients[1].equals("Корень шершавой астрелии"));
            System.out.println("Второй есть");
            if (
            userIngredients[2].equals("Драконий коготь")||
                userIngredients[2].equals("Лист мандрагоры")||
                userIngredients[2].equals("Корень шершавой астрелии"))
                System.out.println("Все что надо для зелья есть! УРА!! " + Arrays.toString(userIngredients));
                        else {
                System.out.println("Что-то всетки не хватает - " + Arrays.toString(userIngredients));
                {

                }

            }

        }







}}
