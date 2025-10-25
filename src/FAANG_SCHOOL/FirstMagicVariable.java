package FAANG_SCHOOL;
//https://faang-school.com/courses/mvyz9jdk/bvd6v8d9

import java.util.Random;

public class FirstMagicVariable {
    int c = 5 * 5 - (4 / 2 - 4);
    int a = 12, b = 4;
    int resultPlus = a + b;
    int resultMinus = a - b;
    int resultMul = a * b;
    int resultDiv = a / b;
//    int result = resultPlus + resultMinus + resultMul + resultDiv - 1000;

    int number = new Random().nextInt();       // Создаем случайное число
    boolean isFirstEven = number % 2 == 0;     // true, если число чётное; иначе false
    boolean isFirstOdd = number % 2 != 0;      // true, если число нечётное; иначе false

    int number2 = -76474764;//new Random().nextInt();      // Создаем еще одно случайное число
    boolean isFirstBigger = number > number2;  // true, если первое число больше второго; иначе false
    boolean isFirstLowerOrEqual = number <= number2; // true, если первое число меньше или равно второму; иначе false
    boolean result = (isFirstEven && isFirstOdd) || isFirstBigger; // Теперь result будет true, если:
    // 1. Первое число чётное И Второе число нечётное ИЛИ
// 2. Первое число больше второго
    String s1 = "Строка - %s, Число - %d";
    String s2 = "POK\tA"; // \t табуляция
    StringBuilder builder = new StringBuilder();


    public void foo() {
        System.out.println("number is " + number + " is " + isFirstEven + " " + "result " + result + " number/2 "  + number/2 );
        System.out.println(number2 + " is " + isFirstEven);
        System.out.println(number + " is " + isFirstBigger);
        System.out.println(number + " is " + isFirstLowerOrEqual);
        System.out.println("isFirstEven && isFirstOdd is " + result);
        System.out.println("charAt is " + s1);
        builder.append("hfhfj ").append( 45454 ).append("grggsg ").append(s2,0,5).reverse();
        System.out.println(builder);
        System.out.println(s2);



    }
}

