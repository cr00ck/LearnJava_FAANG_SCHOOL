package FAANG_SCHOOL.Zadanie_Set_12;

import java.util.HashSet;

public class subsetCheck {
    HashSet<Integer> set1;
    HashSet<Integer> set2;

    public subsetCheck() {
        this.set1= new HashSet<>();
        this.set2= new HashSet<>();

    }

    public void subSetCheck (){
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(2);
        set2.add(3);

        boolean isContainsTheSame = set1.containsAll(set2);
        if(isContainsTheSame){
            System.out.println("set2 содержится в set1");
        }else {
            System.out.println("set2 НЕ содержится в set1 !!!");
        }

    }

}
//вот решение для этого класса, но обязательно импортировать этот класс в main
//а то ииза этого долго не запускалось
//subsetCheck one = new subsetCheck();
//        one.subSetCheck();
