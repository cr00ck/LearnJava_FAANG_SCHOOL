package FAANG_SCHOOL;
//Третье задание
//        Давайте теперь немного посчитаем. Для тренировки.
//        Используя цикл, вычислите сумму всех чётных чисел от 222 до 444 включительно. Результат выведите в консоль. В консоли должно появиться одно число, которое является суммой.
public class Zadanie_cikl_Quidditch_4_3 {
    int startNumber = 222;
    int sum = 0;


    public void foo() {
        sum=0;
        while (startNumber <= 444) {
            sum += startNumber;
                startNumber+= 2;
        System.out.println("Сумма которую складывваем = "+sum+ "    СтартНомер : "+ startNumber);
        }        System.out.println("Сумма всех четных равна = "+sum);
    }
//    int sum = 0;
//    int i = 222;
//while (i <= 444) {
//        sum += i;
//        i += 2;
//    }
//System.out.println(sum);
}



