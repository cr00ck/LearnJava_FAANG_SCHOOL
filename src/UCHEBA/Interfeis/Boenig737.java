package UCHEBA.Interfeis;

public class Boenig737 extends AirCraft implements VertikalTakeoff{
    @Override
    public void fly() {
        System.out.println("Fly Boening 737");

    }

    @Override
    public void Verticaltakeoff() {
        System.out.println("737 can Vertical too");

    }
}
