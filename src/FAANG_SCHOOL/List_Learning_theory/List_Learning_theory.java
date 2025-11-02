package FAANG_SCHOOL.List_Learning_theory;

import java.util.ArrayList;

public class List_Learning_theory {
    public void setProffessors() {
    ArrayList<String> professors = new ArrayList<>(10);
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
    professors.add(1,"любит");
    for(int i=0; i<professors.size(); i++){
        System.out.println(professors.get(i));
    }



    }

}
