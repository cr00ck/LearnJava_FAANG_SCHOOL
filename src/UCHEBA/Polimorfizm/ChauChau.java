package UCHEBA.Polimorfizm;

public class ChauChau extends Dogs{
    public void lick (){
        System.out.println("i can lick everything");
    }

    @Override
    public void walk() {
        System.out.println("Чау- чау переопределили метод на новый из супер класса");
    }
}
