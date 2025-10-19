package UCHEBA.Polimorfizm;

public class YorkshirskiiTerier extends Dogs{
    public String beauty;

    @Override
    public void walk() {
        System.out.println("Йорк это еще один переделанный метод через override ");
    }
}
