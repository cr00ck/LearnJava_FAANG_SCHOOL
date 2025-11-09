package FAANG_SCHOOL.Zadanie_Map_13;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice_2 {

    HashMap<String, String> capitalCountryMap = new HashMap<>();

    public void countryCapital (){
        capitalCountryMap.put("Paris", "France");
        capitalCountryMap.put("Berlin", "Germany");
        capitalCountryMap.put("Rome", "Italy");

       //печатаем мапу столица -> страна
        for(Map.Entry<String, String> entry : capitalCountryMap.entrySet()){
            System.out.println("\nпечатаем мапу столица -> страна");
            System.out.println(entry.getKey()+" - "+ entry.getValue());
        }
        //создаем обратную мапу страна -> столица
        HashMap<String, String> countryCapitalMap = new HashMap<>();
        for(Map.Entry<String, String> entry : capitalCountryMap.entrySet()){
            countryCapitalMap.put(entry.getValue(),entry.getKey());
        }
        //печатаем обратную мапу страна -> столица
        for(Map.Entry<String, String> entry : countryCapitalMap.entrySet()){
            System.out.println("\nпечатаем мапу страна -> столица");
            System.out.println(entry.getKey()+" - "+ entry.getValue());
        }

        //вывод для этого класса
        //  HashMapPractice_2 one = new HashMapPractice_2();
        //        one.countryCapital();




    }

}
