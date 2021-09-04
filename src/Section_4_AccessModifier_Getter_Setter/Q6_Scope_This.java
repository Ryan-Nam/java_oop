package Section_4_AccessModifier_Getter_Setter;

public class Q6_Scope_This {
    public static void main(String[] args) {
        Coffee americano = new Coffee("Long Black", 1500);
        System.out.printf("Before Increasing => %s\n", americano.toString());

        americano.setPrice(1800);
        System.out.printf("After Increasing => %s\n", americano.toString());
    }
}

class Coffee {
    private String name;
    private int price;

    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return String.format("Coffee { name: %s, price: %d }", name, price);
    }
}
