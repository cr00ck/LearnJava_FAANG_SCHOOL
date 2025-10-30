package FAANG_SCHOOL.List_Learning_theory;

import java.util.ArrayList;
import java.util.List;

public class List_Learning_theory {
    public void setProffessors() {
    ArrayList<String> professors = new ArrayList<>();
        professors.add("Минерва Макгонаглл");
        professors.add("Снейп Северус");
        professors.add("Аластор Грюм");
        professors.add("Гораций Слизнорт");
        professors.add("Долорес Амбридж");
        professors.add("Златопуст Локонс");
        professors.add("Квиринус Квирелл");
        professors.add("Римус Люпин");
        professors.add("Рубеус Хагрид");
        professors.add("Альбус Дамблдор");
        professors.add("Аластор Грюм");
        professors.add("Аластор Грюм");

     //   E set(int index, E element)— изменение элемента под индексом,
        //   где вместо существующего элемента будет подставлен новый, передаваемый в метод element.
        professors.set(2, "Альбус Дамблдор");
        professors.add("Аластор Грюм");

        professors.add(1,"любит");
        for(int i=0; i<professors.size(); i++){
            System.out.println(i +": "+ professors.get(i));
        }

        int index = professors.indexOf("Аластор Грюм");
// Получим 3, т.к. первый встретившийся профессор "Аластор Грюм" находится под индексом 2
        System.out.println(index);

// Получим -1, т.к. "Том Реддл" в списке нет
        index = professors.indexOf("Том Реддл");
        System.out.println(index);
// int lastIndexOf(Object o)— возвращает индекс последнего элемента, для которого equalsвернёт true.
        // В случае, если такого элемента нет, результат будет -1.
        int index1 = professors.lastIndexOf("Аластор Грюм");
// Получим 13
        System.out.println(index1);

        //List<E> subList(int fromIndex, int toIndex)— возвращает список, в частности i: fromIndex ≤ i < toIndex.
        List<String> result = professors.subList(2, 5);
// Получим [Альбус Дамблдор, Аластор Грюм, Гораций Слизнорт]
        System.out.println(result);





    }

}
