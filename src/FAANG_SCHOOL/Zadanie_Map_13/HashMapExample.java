package FAANG_SCHOOL.Zadanie_Map_13;

import javax.xml.transform.Source;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
    public HashMapExample() {
    }

    public void Map() {

        // Создадим HashMap. Ключом будет имя человека,
        // а значением - его возраст.
        Map<String, Integer> map = new HashMap<>();

        // Добавим элементы (пары ключ-значение).
        // Для этого используем метод put()
        map.put("Alice", 28);
        map.put("Dima", 25);
        map.put("Vasya", 18);

        // Получим значение по ключу
        Integer ageOfAlice = map.get("Alice");
        System.out.println("Возраст Alice: " + ageOfAlice);

        // Чтобы удалить элемент по ключу, используем метод remove()
        map.remove("Alice");

        // Проверка наличия ключа
        System.out.println("Содержит ли HashMap ключ 'Alice': " +
                map.containsKey("Alice"));

        // Итерация по элементам HashMap
        System.out.println("Итерация по элементам HashMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(
                    "Имя: " + entry.getKey() + ", Возраст: " + entry.getValue()
            );
        }
        // LinkedHashMap сохраняет порядок добавления + счетчик
        System.out.println("Сохраняем порядок итерации : ");
        LinkedHashMap<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("Анна", 25);//одинаковые значения нн выводятся
        linkedMap.put("Анна", 25);
        linkedMap.put("Петр", 30);
        linkedMap.put("Мария", 2);
        int counter = 0;
        for(Map.Entry<String, Integer> entry : linkedMap.entrySet()){
            System.out.println(counter+": "+entry.getKey()+" "+entry.getValue()+" "+entry.hashCode());
        counter ++;
        }
        //TreeMap— на основе древовидной передачи данных, обеспечивается доступ к элементам по ключам
        // в отсортированном порядке. Не позволяет хранить nullключи, но допускает null-значения.
        // В отличие от HashMapи LinkedHashMapэффективности реализации словарь не обеспечивает
        // столь же быстрый доступ к данным по ключу: get/ put/ remove/ containsKeyбудут работать за O(logN), а не за O(1).
        TreeMap<String, Integer> students = new TreeMap<>();

        // Добавление элементов
        students.put("Анна", 25);
        students.put("Петр", 30);
        students.put("Мария", 22);
        students.put("Иван", 28);
        students.put("Ольга", 26);

        System.out.println("Автоматически отсортировано по ключам:");
        System.out.println(students); //Вывод: {Анна=25, Иван=28, Мария=22, Ольга=26, Петр=30}

        System.out.println("Первый элемент: " + students.firstKey());        // Анна
        System.out.println("Последний элемент: " + students.lastKey());      // Петр
        System.out.println("Первый запись: " + students.firstEntry());       // Анна=25
        System.out.println("Последняя запись: " + students.lastEntry());     // Петр=30

        // Получение соседних элементов
        System.out.println("Выше 'Мария': " + students.lowerKey("Мария"));   // Иван
        System.out.println("Ниже 'Мария': " + students.higherKey("Мария"));  // Ольга



    }
}
