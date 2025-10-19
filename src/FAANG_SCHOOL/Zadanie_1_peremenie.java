package FAANG_SCHOOL;

import java.util.Random;

//В методе main класса Main создайте 5 переменных типа String: dumbledore, mcgonagall, snape, lupin, hugrid. Присвойте каждой переменной значение, соответствующее ее названию. Должны получиться поля, содержащие имена знаменитых волшебников.
//        Затем создайте еще одну строку с названием teachers, содержащую текст: “School teachers:“. Обратите внимание, в тексте содержится двоеточие.
//        Выведите на экран сначала строку teachers, затем все 5 строк с именами преподавателей. Должен получиться список учителей.
public class Zadanie_1_peremenie {
    String dumbledore = "dumbledore", mcgonagall = "mcgonagall",  snape = "snape",  lupin = "lupin",  hugrid = "hugrid";
    String School_teachers = "School teachers:";
    Random random = new Random();
    int grade1 = random.nextInt(1, 10);
    int grade2 = random.nextInt(1, 10);
    boolean isGrade1 = grade1 >= 5;
    boolean isGrade2 = grade2 >= 5;
    boolean result =(isGrade1&&isGrade2);
    float average = (grade1 + grade2) / 2;
    long thirteen = 4199/13;
    long fourteen = 4199/14;
    long fifteen = 4199/15;
    long sixteen = 4199/16;
    long seventeen = 4199/17;
    long eighteen = 4199/18;
    long nineteen = 4199/19;
    long summ = thirteen + fourteen + fifteen + sixteen + seventeen + eighteen + nineteen;
    String lines = """
            gghhh
            bhbtb
            ttbtnn
            """;
    public void printText(String text) { // Добавьте имя метода
         System.out.println(text);
         }

        public void foo () {
            System.out.println(School_teachers + "\n" + dumbledore + ", " + mcgonagall + ", " + snape + ", " + lupin + ", " + hugrid);
            System.out.println("isGrade1 = " + grade1 + " > 5 ? - " + isGrade1 + "\nisGrade2 = " + grade2 + " > 5 ? - " + isGrade2);
            System.out.println("общий результат -  " + result + "\nсредний балл равен " + average);
            System.out.println(thirteen+ ", " + fourteen+ ", " +fifteen+ ", " +sixteen+ ", " +seventeen+ ", " +eighteen+ ", " +nineteen+ ", - summ " +summ);
            System.out.println(lines);

    }
}

