package FAANG_SCHOOL.List_Learning_theory;
import java.util.List;
import java.util.ArrayList;

public class List_Learning_practice {
    List<String> list;

    public List_Learning_practice() {
        this.list = new ArrayList<>(
                List.of("", "a", "b", "ab", "ba", "z", "h", "", "heh", "")
        );
    }
    public void listOrderChain () {
            System.out.println("Наш лист первоначально: " + list);
        }

        public void listOrder () {
            System.out.println("Наш первоначальный лист, с пустыми элементами : ");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i + ": " + list.get(i));
            }

        }

    public List<String> transform() {
          list.removeIf(String::isEmpty);
        System.out.println("Измененный лист : " + list);
          return list;
    }


}

// нужно получить [a, b, ab, ba, z, h, heh]

// Создаем объект нашего класса в Main
//List_Learning_practice program = new List_Learning_practice();
//        program.listOrderChain();
//        program.transform();





