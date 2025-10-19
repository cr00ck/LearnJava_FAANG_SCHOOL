package FAANG_SCHOOL;

import java.time.LocalDateTime;
import java.util.Random;
//Создайте строку из 5 случайных чисел new Random().nextInt().
//        Замените все единицы на символ ‘i’.
//        У получившейся строки уберите все символы ‘-’
//        У получившейся строки замените все нули на символ ‘o’.
//        У получившейся строки замените все шестерки на символ ‘b’.
//        Выведите результат в консоль.
//        Узнайте, содержится ли подстрока “23” у получившейся строки.
//        Узнайте индекс подстроки “ob”.

public class Zadanie_2_stroki {
    Random random = (Random) new Random() ;
    int randomNumber1 = random.nextInt();
    int randomNumber2 = random.nextInt();
    int randomNumber3 = random.nextInt();
    int randomNumber4 = random.nextInt();
    int randomNumber5 = random.nextInt();
       String  zamena_1 = String.valueOf(randomNumber1)
            .replace('1', 'i')
            .replace("-","")
            .replace("0","o")
            .replace("6","b");
    String  zamena_2 = String.valueOf(randomNumber2)
            .replace('1', 'i')
            .replace("-","")
            .replace("0","o")
            .replace("6","b");
    String  zamena_3 = String.valueOf(randomNumber3)
            .replace('1', 'i')
            .replace("-","")
            .replace("0","o")
            .replace("6","b");
    String  zamena_4 = String.valueOf(randomNumber4)
            .replace('1', 'i')
            .replace("-","")
            .replace("0","o")
            .replace("6","b");
    String  zamena_5 = String.valueOf(randomNumber5)
            .replace('1', 'i')
            .replace("-","")
            .replace("0","o")
            .replace("6","b");
    StringBuilder sb= new StringBuilder()
            .append(zamena_1)
            .append(" ").append(zamena_2)
            .append(" ").append(zamena_3)
            .append(" ").append(zamena_4)
            .append(" ").append(zamena_5);
    String res= sb.toString();
//    StringBuilder spell = zaklinanie.toString().reverse();


    String zaklinanie = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA";
    StringBuilder reversSpell = new StringBuilder();
    String revers = reversSpell.append(zaklinanie.substring(1)).reverse().toString();
    String start = zaklinanie.substring(10);
    char index0 = revers.charAt(0);
    char index1 = revers.charAt(1);
    String index01 = revers.replace((char) 1, (char) 0); // не получилось это сделать (поменять местами индексы((((



    public void zameni (){
        System.out.println(sb);
    };
    public void castSpell() {
        System.out.println("Заклинание: " + zaklinanie.toLowerCase()+ "\n" + "start индекс: "+ start);
        System.out.println("spell наоборот: " +revers);
        System.out.println("index 0 "+index0 + "\nindex 1 "+index1);
        String result2 = String.join(", ", "1", "2", "3", "4", "5");
        System.out.println(result2);


    }
}
