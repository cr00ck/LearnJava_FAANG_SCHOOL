package UCHEBA.ClassEnum;

public enum EnumClass { // в тем могут хранжанры музыки, дни недели или профессии
    ROCK(1,"Heavy"),POP(2, "Ivanuwki"),TRANCE(3, "Apex"),CLASSIC(4, "Mocard");
    private int i;
    private String name;

    EnumClass(int i, String name) { //после того как создали конструктор, надо в переменных класса задать значения и создаем геттеры
        this.i = i;
        this.name = name;
    }
        public int getI() {
            return i;
        }

        public String getName() {
            return name;
        }

    }


// это все надо вставтить в главный класс, что бы посмотреть как работать с enum классом

//public static void main(String[] args) {
//    EnumClass en = EnumClass.TRANCE;
//    EnumClass en2 = EnumClass.valueOf(EnumClass.class,"ROCK");
//    EnumClass en3 = EnumClass.POP;
//    EnumClass en4 = EnumClass.CLASSIC;
//
//    System.out.println(en);
//    System.out.println(en2);
//
//    for (EnumClass element: EnumClass.values()){
//        System.out.println(element);
//    }
//    switch (en2) {
//        case CLASSIC:
//            System.out.println("classic");
//            break;
//        case POP:
//            System.out.println("pop");
//            break;
//        case TRANCE:
//            System.out.println("trance");
//            break;
//        case ROCK:
//            System.out.println("rock fuck");
//            break;
//    }
//    System.out.println(en2.getI()+en2.getName()+en2.name());
//    System.out.println(en3.getI()+en3.getName()+en3.name());
//    System.out.println(en.getI()+en.getName()+en.name());
//    System.out.println(en4.getI()+en4.getName()+en4.name());
//}
