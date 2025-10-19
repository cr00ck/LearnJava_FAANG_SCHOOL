package FAANG_SCHOOL;

public class Zadanie_7_1_Modifikator_dostupa {
    private String name;
    private int old;
    private String color;
    private boolean special;

    public Zadanie_7_1_Modifikator_dostupa(String name, int old, String color, boolean special) {
        // Проверка имени
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя обязательно и не может быть пустым!");
        }

        // Проверка возраста
        if (old < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным!");
        }

        // Проверка цвета
        if (color == null || color.trim().isEmpty() || color.length() < 5) {
            throw new IllegalArgumentException("Цвет должен содержать минимум 5 символов!");
        }

        // Проверка специального статуса
        if (special) {
            throw new IllegalArgumentException("Требуется специальный статус!");
        }

        this.name = name;
        this.old = old;
        this.color = color.toUpperCase();
        this.special = special;
    }

    // Геттеры (без сеттеров, если не нужны)
    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }

    public String getColor() {
        return color;
    }

    public boolean isSpecial() {
        return special;
    }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя обязательно!!!");
        }
        // Заменяем последнюю букву
         this.name = name.substring(0, name.length() - 1) + "е";
    }
    public String getDativeCaseName() {
        if (name == null || name.isEmpty()) {
            return name;
        }
        // Получаем последнюю букву (в нижнем регистре)
        char lastChar = Character.toLowerCase(name.charAt(name.length() - 1));
        // Проверяем, нужно ли добавлять "е"
        if (isConsonant(lastChar) && lastChar != 'й') {
            return name + "е";
        } else if (lastChar == 'й') {
            return name.substring(0, name.length() - 1) + "ю";
        } else if (lastChar == 'а' || lastChar == 'я') {
            return name.substring(0, name.length() - 1) + "е";
        } else if (lastChar == 'о') {
            return name.substring(0, name.length() - 1) + "у";
        }
        return name; // Если не подошло ни одно правило
    }

    private boolean isConsonant(char c) {
        return "бвгджзклмнпрстфхцчшщ".indexOf(c) != -1; // проверяем если ли эти буквы/чары/сиволы и если да, то какой индекс, если нет то выводит -1
    }

    public String fly(Zadanie_OOP_6_1_Students student ){
        String nameInDative = getDativeCaseName();
        if (student.getAge()>=10) {
            return student.getName()+ ", полетит на " + nameInDative+" !";
        } else{
        return student.getName()+" маловат пока еще ;( чтобы летать на " +nameInDative+" !";
        }
    }
// надо вписать в main класс - это решение этого урока
//    String[] super_ability = {"eat","sleep","fuck"};
//    Zadanie_OOP_6_1_Students kirill = new Zadanie_OOP_6_1_Students("Назар",100,9,super_ability);
//    Zadanie_7_1_Modifikator_dostupa popa = new Zadanie_7_1_Modifikator_dostupa("Арбуз",0,"green",false);
//        System.out.println(popa.fly(kirill));
}
