package UCHEBA.Incapsulacia;

public class Incapsulacia {
   static int a , b;
    public int foo () {
    return a + b;
    }

    public int getA() { //нажимает command N чтобы открылось меню и устанавливаем геттеры и сеттеры, чтобы переменные можно было менять только с помощью их/
        return a;        // потом вызываем класс и через точку выбираем геттеры и сеттеры главном классе
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;

    }
}

