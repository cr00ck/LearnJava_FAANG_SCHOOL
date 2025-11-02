package FAANG_SCHOOL.Zadanie_Abstraktnie_Klassi_10_1;

public class ExpandingSpell extends Spell{
    public ExpandingSpell(String name, String effect, boolean status) {
        super(name, effect, status);
    }

    public ExpandingSpell() {
    }

    public void doMagic() {
            if (super.isStatus()&&super.getEffect()=="ice") {
                System.out.println(this.getName() + " применил " + this.getEffect());
            } else if (super.isStatus()&&super.getEffect()=="fire") {
                System.out.println(this.getName() + " применил " + this.getEffect());

            } else {
                System.out.println(this.getName() + " нихуя НЕ применил " + this.getEffect());

            }
        }
    }

