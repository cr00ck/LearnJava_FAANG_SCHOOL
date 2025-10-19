package FAANG_SCHOOL;

import java.util.Arrays;

public class Zadanie_massiv_5_1 {


    public boolean foo () {
        String[] massiv = new String[5];
        massiv[0] = "g";
        massiv[1] = "h";
        massiv[2] = "a";
        massiv[3] = "l";
        massiv[4] = "b";

        String[] massiv2 = Arrays.copyOfRange(massiv, 0, 3);
        String[] massiv3 = new String[10];
        int[] massiv4 = {6, 9, 3, 10, 44, 61, 7, 1, 4, 22, 2};
        Arrays.fill(massiv3, "lololo");//заполнить массив значением
        Arrays.sort(massiv4, 4, 8);//с какого элемента сортировать и по какой включительно
        Arrays.sort(massiv);
        int h = Arrays.binarySearch(massiv, "e");//номер элемента в списке

        String[] recipe = {
                "\n Засушенная чешуя василиска",
                "\n Частичка души лесной феи",
                "\n Капля сока вампирской розы",
                "\n Яд шершавого ядозуба",
                "\n Осколок кометы",
                "\n Слеза феникса"};
        String[] potion = new String[6];
        potion[2] = "\n Капля сока вампирской розы";
        potion[5] = "\n Слеза феникса";
        potion[0] = "\n Засушенная чешуя василиска";
        potion[1] = "\n Частичка души лесной феи";
        potion[3] = "\n Яд шершавого ядозуба";
        potion[4] = "\n Осколок кометы";
//        String[] recipeClone = recipe.clone();

// Порядок добавления: Капля сока вампирской розы,
// Слеза феникса, Засушенная чешуя василиска, Частичка души лесной феи,
// Яд шершавого ядозуба, Осколок кометы

        System.out.println(" massiv h - "+ h+"\n "+" massiv"+ " - "+Arrays.toString(massiv) + "\n  "+"massiv2 - " +Arrays.toString(massiv2)+ "\n  "+"massiv3"+ " - "+ Arrays.toString(massiv3)+ "\n  "+"massiv4"+ " - "+ Arrays.toString(massiv4));
        System.out.println("recipe "+Arrays.toString(recipe)+"\npotion "+Arrays.toString(potion)+"\n equals arrays - "+Arrays.equals(recipe,potion));

//Как обычно, здесь подвох
//System.out.println(potion.toString());
        return false;
    }



}

