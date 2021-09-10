package Section_5_API;

import java.util.ArrayList;

public class Q6_ArrayList_4_TotalSum {
    public static void main(String[] args) {
        ArrayList<Ramen> list = new ArrayList<Ramen>();

        Ramen shin = new Ramen("shin Noddle", 800);
        Ramen jin = new Ramen("jin Noddle", 700);
        Ramen bibim = new Ramen("jin Noodle", 600);

        list.add(shin);
        list.add(jin);
        list.add(bibim);

        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            Ramen ramen = list.get(i);
            System.out.println(ramen.toString());
            sum += ramen.getPrice();
        }
        System.out.println("=====================");
        System.out.println("Total: $" + sum);
    }
}

class Ramen {
    private String name;
    private int price;

    Ramen(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return String.format("Ramen { name: %s, price: %d }", name, price);
    }

    public int getPrice() {
        return price;
    }
}

