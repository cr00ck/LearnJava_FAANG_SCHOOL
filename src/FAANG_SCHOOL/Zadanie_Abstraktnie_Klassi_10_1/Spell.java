package FAANG_SCHOOL.Zadanie_Abstraktnie_Klassi_10_1;

public abstract class Spell {
    private String name;
    private String effect;
    private boolean status;

    public Spell(String name, String effect, boolean status) {
        this.name = name;
        this.effect = effect;
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Spell() {
    }

    public String getName() {
        return name;
    }

    public String getEffect() {
        return effect;
    }

    public boolean isStatus() {
        return status;
    }

    public void doMagic(){

    }
}
// это решение для абстрактного класса Spell
//ReducingMagic one = new ReducingMagic();
//ExpandingSpell two = new ExpandingSpell();
//        one.setName("jojo");
//        two.setName("lolo");
//        one.setStatus(false);
//        two.setStatus(true);
//        one.setEffect("ice");
//        two.setEffect("ice");
//        one.doMagic();
//        two.doMagic();
