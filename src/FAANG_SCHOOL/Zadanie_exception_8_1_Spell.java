package FAANG_SCHOOL;

import java.util.Random;

public class Zadanie_exception_8_1_Spell {
    private int title ;
    private int power  ;
    Random random = new Random();

    public Zadanie_exception_8_1_Spell() {
        this.power = random.nextInt(1, 7);
        this.title = random.nextInt(1, 7);
    }


    public int getTitle() {
        return title;
    }

    public int getPower() {
        return power;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public void checkValueRamdom(){
        System.out.println("power - " + power + "\ntitle - " + title);
    }

}
// //надо вставить в main тут решение

//    Zadanie_exeption_8_1_Spell check = new Zadanie_exeption_8_1_Spell();
//        check.checkValueRamdom();
//                String [] superAbility = {"pooop", "hoh-ho","gigle"};
//                Zadanie_OOP_6_1_Students stud1 = new Zadanie_OOP_6_1_Students("Valentin",155,superAbility);
//                int ageStud  = stud1.getAge();
//                Zadanie_exeption_8_1_Spell spell = new Zadanie_exeption_8_1_Spell();
//                System.out.println("Возраст студа - " + ageStud);
//                stud1.castSpell(spell);