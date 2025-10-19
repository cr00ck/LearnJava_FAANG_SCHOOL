package FAANG_SCHOOL;

import java.util.Random;

public class Zadanie_OOP_6_1_Hippogriff {

    String name;
    Integer age;
    String color;
    boolean special;

    public Zadanie_OOP_6_1_Hippogriff(String name, Integer age, String color, boolean special) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.special = special;
    }

    public Zadanie_OOP_6_1_Hippogriff(String name) {
        this.name = name;
    }

    public Zadanie_OOP_6_1_Hippogriff(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getNameAgeColorSpecial() {
        return " "+name+"мне " + age+ ", я цвета"+ color+" и могу дышать огнем - "+special;
    }

    public Integer getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public boolean isSpecial() {
        return special;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty())
            this.name = name;

        }
        int isGivingRide = new Random().nextInt(1, 10);
        int isGivingRide1 = new Random().nextInt(1, 10);
        int isGivingRide2 = new Random().nextInt(1, 10);
        boolean hoho = true;

    public Zadanie_OOP_6_1_Hippogriff() {
    }

    public String eat(String food) {
        if (food == "картошка") {
            return "Я такое не ем =((((( фу!!!";
        } else {
            return food+" это НЯМ-НЯМ-НЯМ";
        }
    }
    public String fly() {
        if (age >= 2) {
            return this.name+ " Ура я могу летать!!";
        } else {
            return this.name +" FUCK I CANT FLYYY =((((((";
        }
    }
    public String giveRide(Zadanie_OOP_6_1_Students student){
        System.out.println("isGivingRide - " + isGivingRide);
        if (isGivingRide >= 1 && isGivingRide <= 3){
            return student.getName() + " прокатился на Гиппокрифе!";
        } else if (isGivingRide >= 4 && isGivingRide <= 8) {
            return "Я бля не повезу этого вашего "+student.getName();
        } else if (isGivingRide == 9 || isGivingRide == 10) {
            return student.getName()+" попробуй-ка еще разок!";
        }
        return null;}
        public String giveRide2(Zadanie_OOP_6_1_Students student){
        System.out.println("isGivingRide - " + isGivingRide1);
        if (isGivingRide1 >= 1 && isGivingRide1 <= 3){
            return student.getName() + " прокатился на Гиппокрифе!";
        } else if (isGivingRide1 >= 4 && isGivingRide1 <= 8) {
            return "Я бля не повезу этого вашего "+student.getName();
        } else if (isGivingRide1 == 9 || isGivingRide1 == 10) {
            return student.getName()+" попробуй-ка еще разок!";
        }
        return null;
    }
        public String giveRide3(Zadanie_OOP_6_1_Students student){
        System.out.println("isGivingRide - " + isGivingRide2);
        if (isGivingRide2 >= 1 && isGivingRide2 <= 3){
            return student.getName() + " прокатился на Гиппокрифе!";
        } else if (isGivingRide2 >= 4 && isGivingRide2 <= 8) {
            return "Я бля не повезу этого вашего "+student.getName();
        } else if (isGivingRide2 == 9 || isGivingRide2 == 10) {
            return student.getName()+" попробуй-ка еще разок!";
        }
        return null;
    }
//    это надо вставить в MainMagicKlass
//    Zadanie_OOP_6_1_Hippogriff lolo = new Zadanie_OOP_6_1_Hippogriff("lolo ",300," purple",false);
//       Zadanie_OOP_6_1_Hippogriff popo = new Zadanie_OOP_6_1_Hippogriff("popo ", 500, " зеленый",true);
//       Zadanie_OOP_6_1_Hippogriff toto = new Zadanie_OOP_6_1_Hippogriff("toto ",3, " pink", true);
//       Zadanie_OOP_6_1_Hippogriff wowo = new Zadanie_OOP_6_1_Hippogriff();
//       wowo.setName("setname - ");
//       String[] super_ability = {"невидимость", "читает мысли", "сверх сила"};
//       Zadanie_OOP_6_1_Students alex = new Zadanie_OOP_6_1_Students("LEXA",30,22,super_ability);
//       Zadanie_OOP_6_1_Students alex1 = new Zadanie_OOP_6_1_Students("Серега ",400,30,super_ability);
//       Zadanie_OOP_6_1_Students alex2 = new Zadanie_OOP_6_1_Students("Гриша ",100,36,super_ability);
//
//        System.out.println("Меня зовут"+ lolo.getNameAgeColorSpecial()+" и "+lolo.giveRide(alex));
//        System.out.println("Меня зовут"+ popo.getNameAgeColorSpecial()+" и "+lolo.giveRide2(alex1));
//        System.out.println("Меня зовут"+ toto.getNameAgeColorSpecial()+" и "+lolo.giveRide3(alex2));


}
