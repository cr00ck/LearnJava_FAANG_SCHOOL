package UCHEBA.Clonirovanie;

public class Dolly implements Cloneable { //устанавливаем интерфэйс клонейбл
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException { // тут надо поменять на паблик
        return super.clone();
    }
}

// public static void main(String[] args) {    по итогу имеем клонированную переменную
//        Dolly dolly = new Dolly();
//        Dolly dolly2 =foo(dolly);
//        dolly.setName("Rira");
//        dolly2.setName("Maria");
//
//        System.out.println(dolly.getName());
//        System.out.println(dolly2.getName());
//
//    }
//    public static Dolly foo(Dolly dolly2){
//        Dolly dollly = null;
//        try {
//            dollly = (Dolly)dolly2.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }
//        return dollly;
//
//    }
//}
