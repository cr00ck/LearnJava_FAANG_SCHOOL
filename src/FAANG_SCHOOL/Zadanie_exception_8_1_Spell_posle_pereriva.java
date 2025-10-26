package FAANG_SCHOOL;

public class Zadanie_exception_8_1_Spell_posle_pereriva {
    private String title;
    private int power;

    public Zadanie_exception_8_1_Spell_posle_pereriva(String title, int power) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Название обязательно и не может быть пустым!");
        }
        if (power <= 0 || power >= 7) {
            throw new IllegalArgumentException("Уровень силы должен быть от 1 до 7 !");
        }
        this.title = title;
        this.power = power;
    }

    public String getTitle() {
        return title;
    }

    public int getPower() {
        return power;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Zadanie_exception_8_1_Spell_posle_pereriva() {
    }

    public void setPower(int power) {
        this.power = power;
        if (power <= 0 || power >= 7) {
            throw new IllegalArgumentException("Уровень силы должен быть от 1 до 7 !");
        }

   }
}

//Zadanie_OOP_6_1_Students_posle_pereriva zx1 = new Zadanie_OOP_6_1_Students_posle_pereriva("Anton","OZIOZBORN",44,new String[] {"Sleep"});
//Zadanie_exception_8_1_Spell_posle_pereriva zx2 = new Zadanie_exception_8_1_Spell_posle_pereriva();
//        zx2.setPower(77);
//        zx2.setTitle("Albumin");
//        zx1.castSpell(zx2);
