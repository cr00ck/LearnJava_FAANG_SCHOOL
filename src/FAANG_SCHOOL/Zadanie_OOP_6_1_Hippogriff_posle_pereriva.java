package FAANG_SCHOOL;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie_OOP_6_1_Hippogriff_posle_pereriva  {
    //это я сам придумал знакомиться и записывать в переменные, такого в задании не было
    Random random = new Random();

    Scanner scanner = new Scanner(System.in);
    public void znakomstvo () {
        System.out.println("как тебя зовут ?");
        String inputName = scanner.nextLine();
        name = inputName;
        System.out.println("приятно с тобой познакомиться - "+name+"\n а сколько тебе лет?");
        int inputAge = Integer.parseInt(scanner.nextLine());
        age = inputAge;
        System.out.println("Круто! "+name+"\nзначит тебе"+age+ "лет!?\n а назови три своих самых любимых занятия:)");
        String[] inputObility = new String[]{scanner.nextLine()};
        shoot = Arrays.toString(inputObility);
        System.out.println("Ну вообще круть! давно научился "+shoot+" ?");
        String ansver = scanner.nextLine();

    }
    String name;
    int age;
    String color;
    String shoot;



    public Zadanie_OOP_6_1_Hippogriff_posle_pereriva(String name, int age, String color, String shoot) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.shoot = shoot;
    }

    public Zadanie_OOP_6_1_Hippogriff_posle_pereriva(String name) {
        this.name = name;
    }

    public Zadanie_OOP_6_1_Hippogriff_posle_pereriva(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public Zadanie_OOP_6_1_Hippogriff_posle_pereriva() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String isShoot() {
        return shoot;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String eat(String food) {
        System.out.println("Что любишь есть ? ");
        String inputFood= scanner.nextLine();
        food = inputFood;
        if(food=="пельмени"||food=="Пельмени"){
            System.out.println("Меня зовут "+ this.name +" не буду это есть!!");
            }else {
            System.out.println("Меня зовут "+ this.name +" умею делать "+this.shoot+"\nпоэтому такое съем! ) ((");
        }
        return food;
    }

    public void  fly () {
        System.out.println("Как зовут дракона ? ");
        String inputNameFly = scanner.nextLine();
        name = inputNameFly;
        System.out.println("А лет-то сколько ему ? ");
        int inputAgeFly = Integer.parseInt(scanner.nextLine());
        age = inputAgeFly;
        if (age <= 2) {
            System.out.println("Сорян " + name + "\n"+age+" слишком мало =( тебе пока еще нельзя летать =((");
        } else {
            System.out.println("Да, "+age+" уже норрм! =)\n " + name + " ты уже созрел для полетов!");
        }
    }
    public Zadanie_OOP_6_1_Students_posle_pereriva giveRide(Zadanie_OOP_6_1_Students_posle_pereriva student){
        int isGivingRide= random.nextInt(10);
        System.out.println("случайное число - "+isGivingRide);
        if(isGivingRide>=3&&isGivingRide<=5){
            System.out.println(student.getName()+" полетееееел красавец !!");
        }else if(isGivingRide>=4&&isGivingRide<=8){
            System.out.println(student.getName()+" демонстративно отворачивается и отказывается летать !!");
        }else if(isGivingRide==9&&isGivingRide==10){
            System.out.println(student.getName()+" ты должен попробовать снова !!");
        }
        return null;
    };

}
//надо вставить в main.magic.klass
//Zadanie_OOP_6_1_Hippogriff_posle_pereriva  z31 = new Zadanie_OOP_6_1_Hippogriff_posle_pereriva ();
//Zadanie_OOP_6_1_Students_posle_pereriva z32 = new Zadanie_OOP_6_1_Students_posle_pereriva("Artur","Sing",33, new String[]{"sleep"});
//Zadanie_OOP_6_1_Students_posle_pereriva z33 = new Zadanie_OOP_6_1_Students_posle_pereriva();
//        z33.setName("Kiril");
//        z33.setAge(40);
//
////        z31.znakomstvo();
////        z31.eat("1");
////        z31.giveRide(z32);
//        z31.giveRide(z33);

