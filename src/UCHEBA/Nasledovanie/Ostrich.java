package UCHEBA.Nasledovanie;

public class Ostrich extends Birds {

    public String neck;
    public String longLegs;
    public String Beam;

    public Ostrich(String name, String voice, String tail, Wings wings, String neck, String longLegs, String beam) {
        super(name, voice, tail, wings);
        this.neck = neck;
        this.longLegs = longLegs;
        Beam = beam;
    }

    public void HideHead(){
        System.out.println("i'm hiding in a sand" );
        System.out.println(super.getName()); //супер означает что обращаемся к супер классу birds
    }

}
