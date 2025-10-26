package FAANG_SCHOOL;

public class Zadanie_OOP_6_1_Students_posle_pereriva {
    // имя, факультет, возраст, и особые навыки
    String name;
    String facult;
    int age;
    String[] sleep = new String[3];

    public Zadanie_OOP_6_1_Students_posle_pereriva(String name, String facult, int age, String[] sleep) {

        this.name = name;
        this.facult = facult;
        this.age = age;
        this.sleep = sleep;
    }

    public String getName() {
        return name;
    }

    public String getFacult() {
        return facult;
    }

    public int getAge() {
        return age;
    }

    public String[] getSleep() {
        return sleep;
    }

    public Zadanie_OOP_6_1_Students_posle_pereriva() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFacult(String facult) {
        this.facult = facult;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSleep(String[] sleep) {
        this.sleep = sleep;
    }
    public void castSpell(Zadanie_exception_8_1_Spell_posle_pereriva spell){
        if (this.age == 11) {
            if (spell.getPower() == 1) {
                System.out.println(this.name + "использовал заклинание " + spell.getTitle());
            } else {
                throw new IllegalArgumentException(this.name + " еще пока не может использовать " + spell.getTitle()+ " с силой мощности:  " + spell.getPower());
            }
        } else if (this.age == 12) {
            if (spell.getPower() == 2) {
                System.out.println(this.name + " использовал заклинание: " + spell.getTitle()+ " с силой мощности:  " + spell.getPower());
            } else {
                throw new IllegalArgumentException(this.name + " еще пока не может использовать " + spell.getTitle()+ " с силой мощности:  " + spell.getPower());
            }
        } else if (this.age >= 17) {
                System.out.println(this.name + " использовал заклинание " + spell.getTitle()+ " с силой мощности:  " + spell.getPower());
            }
    }
}
