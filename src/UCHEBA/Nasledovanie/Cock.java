package UCHEBA.Nasledovanie;

public class Cock extends Birds {
    public String color;
    public String strongVoice;

    public Cock(String name, String voice, String tail, Wings wings, String color, String strongVoice) {
        super(name, voice, tail, wings);
        this.color = color;
        this.strongVoice = strongVoice;
    }

    public void Scream(){
        System.out.println("i can scream out loud");
    }
}
