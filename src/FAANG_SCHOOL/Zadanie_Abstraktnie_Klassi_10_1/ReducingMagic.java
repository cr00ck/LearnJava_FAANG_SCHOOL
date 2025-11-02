package FAANG_SCHOOL.Zadanie_Abstraktnie_Klassi_10_1;

public class ReducingMagic extends Spell {
    public ReducingMagic() {
    }

    public ReducingMagic(String name, String effect, boolean status) {
        super(name, effect, status);
    }

    @Override
    public void doMagic() {
        if (super.isStatus()) {
            System.out.println(this.getName() + " применил " + this.getEffect());
        } else if (!super.isStatus()) {
            System.out.println(this.getName() + " нихуя НЕ применил " + this.getEffect());

        }
    }
}
