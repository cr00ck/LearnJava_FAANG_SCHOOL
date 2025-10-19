package FAANG_SCHOOL;

public class Zadanie_cikl_Quidditch_4_1 {
    int studentsAmount = 50;
    boolean someoneHasVertigo;
    int i = 1;


    public void Riddikulus() {
        while (i <= studentsAmount) {
            System.out.println("Student #" + i + " said spell");
            i++;
        }
//
//        for (int i = 1; i <= studentsAmount; i=(i+10)) {
//            if (i == 11) {
//                break;
//            }
//            System.out.println(someoneHasVertigo + " Student №" + i + " says *Riddikulus*");
//        }
    }

    public void Quidditch() {
        while (i <= studentsAmount) {
            if (i == 10) {
                System.out.println("First ball - Quaffle");
            } else if (i == 30) {
                System.out.println("Second ball - Bludger");
            } else if (i == 50) {
                System.out.println("Third ball - Golden Snitch");
            } else {
                System.out.println("Next ball is "+i);
            } i++;
        }
    }
}

