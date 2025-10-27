package FAANG_SCHOOL.Zadanie_Interface_9_1;

public class Cloak implements Invisible{
    int capacity;
    int weight;



    @Override
    public void become_Invisible() {
        System.out.println("Чел под плащом не виден");

    }

    @Override
    public void become_Visible() {
        System.out.println("Чел под плащом стал виден");


    }
}
