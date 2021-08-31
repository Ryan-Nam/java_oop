package Section_2_Constructor;

public class Q1_Call_Constructor_Initialize {
    public static void main(String[] args) {
        // Object, and initialize
        Bicycle b1 = new Bicycle("부릉2", 21.74, 899000);
        Bicycle b2 = new Bicycle("씽씽2", 12.57, 495000);

        System.out.printf("Bicycle { %s, %.2fkg, %d원 }\n", b1.name, b1.weight, b1.price);
        System.out.printf("Bicycle { %s, %.2fkg, %d원 }\n", b2.name, b2.weight, b2.price);
    }
}

class Bicycle {
    String name;
    double weight;
    int price;

    Bicycle(String n, double w, int p) {
        name = n;
        weight = w;
        price = p;
    }

}
