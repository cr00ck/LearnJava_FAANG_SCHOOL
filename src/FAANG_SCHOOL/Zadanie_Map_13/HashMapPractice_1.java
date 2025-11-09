package FAANG_SCHOOL.Zadanie_Map_13;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice_1 {
    int[] arr = {1, 2, 3, 4, 2, 1, 3, 4, 5, 1};
    public void hashArr (){
        //выводим просто массив
        System.out.println("наш массив : ");
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        //объявляем Map и Итерация по элементам массива в HashMap - РЕШИТЬ САМИ НЕ СМОГ (((
        Map<Integer, Integer> mapArr = new HashMap<>();
        // Правильно заполняем HashMap: подсчитываем вхождения чисел
        for (int number : arr) {
            // Если число уже есть в Map - увеличиваем счетчик, иначе добавляем со значением 1
            mapArr.put(number, mapArr.getOrDefault(number, 0) + 1);
        }
        System.out.println("Итерация по элементам HashMap:");
        for (Map.Entry<Integer, Integer> entry : mapArr.entrySet()) {
            System.out.println("Число: " + entry.getKey() + ", Количество: " + entry.getValue());
        }
    }

    // Главный метод для запуска
//        HashMapPractice_1 practice = new HashMapPractice_1();
//        practice.hashArr();

}

