package UCHEBA.Polimorfizm;

public class Test {
    public void foo(Dogs kindDog){
        kindDog.walk();
    }
}
// если мы подставляем в метод test.foo разных собак, срабатывает разный метод - это и есть полиморфизм
//public class GlavniKlass {
//    public static void main(String[] args) {
//        Dogs dogs = new Dogs();
//        ChauChau chauchau = new ChauChau();
//        Test test = new Test();
//        YorkshirskiiTerier york = new YorkshirskiiTerier();
//        test.foo(chauchau);
//    }
//}

