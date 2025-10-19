package UCHEBA.Interfeis;

public class Mi8 extends Helicopter implements VertikalTakeoff
{
    @Override
    public void fly() {
        System.out.println("Fly  Mi8");

    }

    @Override
    public void Verticaltakeoff() {
        System.out.println("Mi8 Vertical");

    }
}
