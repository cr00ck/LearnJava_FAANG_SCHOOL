package FAANG_SCHOOL;

import java.util.Arrays;
import java.util.Random;

//Попробуем написать небольшой алгоритм. Все необходимые инструменты мы уже прошли.
// За подсказками попробуйте обратиться к предыдущим урокам.
//        Создайте массив из 5 целых чисел. Напишите код для нахождения наименьшего и наибольшего
//        элемента в массиве. Выведите эти элементы в консоль.
public class Zadanie_massiv_5_4 {
    Random random = new Random();
    int randomMassiv[] = {random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt()};


    public void vivod() {

        System.out.println("массив " + Arrays.toString(randomMassiv));

//        int max = Arrays.stream(randomMassiv).max().getAsInt();
//        int min = Arrays.stream(randomMassiv).min().getAsInt();
//        System.out.println("max " + max + "\nmin " + min);
//    }}

        int min = randomMassiv[0];
        int max = randomMassiv[0];

        for (int i = 1; i < randomMassiv.length; i++) {
            if (randomMassiv[i] < min) {
                min = randomMassiv[i];
            }
            if (randomMassiv[i] > max) {
                max = randomMassiv[i];
            }
        }
        System.out.println("Наименьшее число: " + min);
        System.out.println("Наибольшее число: " + max);
    }}




