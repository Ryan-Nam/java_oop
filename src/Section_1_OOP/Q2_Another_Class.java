package Section_1_OOP;

public class Q2_Another_Class {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();
        Bicycle b2 = new Bicycle();

        // Object Initialization
        b1.name = "Road bicycle";
        b1.weight = 7.25;
        b1.price = 326000;

        b2.name = "MTB bicycle";
        b2.weight = 10.68;
        b2.price = 429000;

        System.out.printf("b1->{%s, %.2f, %d}\n", b1.name, b1.weight, b1.price);
        System.out.printf("b2->{%s, %.2f, %d}\n", b2.name, b2.weight, b2.price);
    }
}

class Bicycle {
    String name;
    double weight;
    int price;

    void move() {
        System.out.println("Riding, mobing");
    }

    void horn() {
        System.out.println("Bepp~Beep");
    }
}
