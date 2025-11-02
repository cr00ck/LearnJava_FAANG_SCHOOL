package FAANG_SCHOOL.List_Learning_theory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Learning_theory {
    public void setProffessors() {
    List<String> professors = new ArrayList<>();
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

    //LinkedList, благодаря своей ошибке, может быстро вставить большое количество элементов в начало или конец списка.
    // И также быстро их удалить. Поэтому, если в рамках задачи мы понимаем,
    // что будем очень часто подавать и удалять и редко будем обращаться к средней строке, то лучше всего использовать LinkedList.
    //Однако при программировании такие задачи встречаются не так часто, поэтому в большинстве случаев подходит ArrayList.

    public void setWizards (){
        List<String> wizards = new LinkedList<>();
        wizards.add("Рон");
        wizards.add("Гарри");
        wizards.add("Гермиона");
        wizards.add("Хагрид");
        // Было:
// null <- "Рон" <-> "Гарри" <-> "Гермиона" <-> "Хагрид" -> null
        wizards.add(2, "Малфой");
// Нам не нужно двигать всю правую часть массива
// достаточно лишь для Гарри и Гермионы поправить ссылки
// null <- "Рон" <-> "Гарри" <-> "Малфой" <-> "Гермиона" <-> "Хагрид" -> null
    }

}
