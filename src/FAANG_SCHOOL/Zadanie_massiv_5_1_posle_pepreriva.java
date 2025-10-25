package FAANG_SCHOOL;

import java.util.Arrays;
import java.util.Random;

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

    public void algorithm () {
        int[] five = {1, 2, 3, 4, 5};
        for (int i=1; i<five.length; i++ ){
            int min = five[0];
            int max = five[4];
            if(five[i]<min){
                System.out.println(five[i]);
            }else if (five[i]<max){
                System.out.println(max);
            }
        }

    }
}


