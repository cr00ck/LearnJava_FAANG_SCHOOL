package FAANG_SCHOOL.Zadanie_Interface_9_1;

public class Car implements Invisible {
    String StudentDriver;

    public Car(String studentDriver, int speed, boolean isFlying) {
        StudentDriver = studentDriver;
        this.speed = speed;
        this.isFlying = isFlying;
    }

    int speed;
    boolean isFlying;

    @Override
    public void become_Invisible() {
            System.out.println("Машина изчезла!!");
        }

    @Override
    public void become_Visible() {
        System.out.println("Машина снова видна!!");

    }
    public String isFlyingCar (Cloak zemlia){
        if(isFlying){
            zemlia.become_Invisible();
            this.become_Invisible();
        }else if(!isFlying){
            zemlia.become_Visible();
            this.become_Visible();

        }
        return "";
    }
}


