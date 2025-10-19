package UCHEBA.Nasledovanie;

public class Birds {
    private String name;
    private String voice;
    private String tail;
    private Wings wings;

    public Birds(String name, String voice, String tail, Wings wings) {
        this.name = name;
        this.voice = voice;
        this.tail = tail;
        this.wings = wings;
    }

    private void Sing(){
        System.out.println("i can sing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }
}



