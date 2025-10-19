package FAANG_SCHOOL;

import java.util.Random;

public class Zadanie_OOP_6_1_Students {
    String name;
    int grade;
    int age ;
    String[] super_ability = new String[5];
    Random randomAGE= new Random();


    public Zadanie_OOP_6_1_Students(String name, int grade, String[] super_ability) {

        this.name = name;
        this.grade = grade;
        this.age =  randomAGE.nextInt(10,18);
        this.super_ability = super_ability;
    }


    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    public int getAge() {
        return age;
    }
    public String[] getSuper_ability() {
        return super_ability;
    }

    public void setSuper_ability(String[] super_ability) {
        this.super_ability = super_ability;
    }
    public void castSpell (Zadanie_exception_8_1_Spell spell) throws Zadanie_exception_8_2_CustomException{
        if (age >=17){
            System.out.println(name + " может использовать все заклинания! даже номер - "+ spell.getTitle());
        } else if (age >=11 || age <=16) {
            int requarePower = age - 10;
            if (spell.getPower() == requarePower) {
                System.out.println(name + " использует заклинание " + spell.getTitle());
            } else {
                throw new Zadanie_exception_8_2_CustomException(name + " (возраст: " + age + ") не может использовать заклинание силы " +
                        spell.getPower() + ". Требуется сила: " + requarePower);
            }
        }else {
            System.out.println(name + " не может использовать из-за возраста, слишком мал. Ему всего - " + age);
            
        }


//        if (age == 11){
//            if (spell.getPower() ==1 ) {
//                System.out.println(name + " использует заклинание" + spell.getTitle());
//            }else {
//                throw new IllegalArgumentException(name + " слишком мелкий для такого заклинания - "+ spell.getTitle());
//            }
//        } else if (age == 12) {
//            if (spell.getPower() ==2){
//                System.out.println(name + " использует заклинание" + spell.getTitle());
//            }else {
//                throw new IllegalArgumentException(name + " слишком мелкий для такого заклинания - " + spell.getTitle());
//            }
//            } else if (age == 13) {
//                if (spell.getPower() == 3) {
//                    System.out.println(name + " использует заклинание" + spell.getTitle());
//                } else {
//                    throw new IllegalArgumentException(name + " слишком мелкий для такого заклинания - " + spell.getTitle());
//                }
//                } else if (age == 14) {
//                    if (spell.getPower() == 4) {
//                        System.out.println(name + " использует заклинание" + spell.getTitle());
//                    } else {
//                        throw new IllegalArgumentException(name + " слишком мелкий для такого заклинания - " + spell.getTitle());
//                    }
//                    } else if (age == 15) {
//                        if (spell.getPower() == 5) {
//                            System.out.println(name + " использует заклинание" + spell.getTitle());
//                        } else {
//                            throw new IllegalArgumentException(name + " слишком мелкий для такого заклинания - " + spell.getTitle());
//                        }
//                        } else if (age == 16) {
//                            if (spell.getPower() ==6){
//                                System.out.println(name + " использует заклинание" + spell.getTitle());
//                            } else {
//                                throw new IllegalArgumentException(name + " слишком мелкий для такого заклинания - "+ spell.getTitle());}
//                        } else if (age <= 17) {
//                            if (spell.getPower() >= 0 || spell.getPower() <= 7)
//                                System.out.println(name + " использует любые заклинания, даже это - " + spell.getTitle() + " так как ему уже больше 17 лет!");


                        }
                    }






