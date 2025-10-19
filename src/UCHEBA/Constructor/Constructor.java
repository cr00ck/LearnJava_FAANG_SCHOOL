package UCHEBA.Constructor;

public class Constructor {
    public void foo() {
        Flower flower = new Flower();
        flower.color = "Blue";
        flower.kind = "Lilac";
        flower.name = "Lubimka";
        flower.size = 35;

        Flower flower2 = new Flower("Kiska", "roza", "Red", 14);
        Flower flower3 = new Flower("Bushka", "Camomile", "White", 15);
        Flower flower4 = new Flower("Love", "Marihuana", "Green", 100);

        System.out.println(flower.color + " " + flower.name + " " + flower.kind);
        System.out.println(flower2.name + " " + flower2.color + " " + flower2.kind);
        System.out.println(flower3.color + " " + flower3.color + " " + flower3.kind);
        System.out.println(flower.color + " " + flower2.kind + " " + flower3.name);
        System.out.println(flower4.kind + " " + flower4.color + " " + flower.name + " " + flower4.size);

    }
}
