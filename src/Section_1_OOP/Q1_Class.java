package Section_1_OOP;

public class Q1_Class {
    public static void main(String[] args) {
        // Dog Object
        Cat c = new Cat();

        c.name = "Malo";
        c.breeds = "Peritian";
        c.age = 3;

        // print object output
        System.out.printf("Name: %s\n", c.name);
        System.out.printf("Breed: %s\n", c.breeds);
        System.out.printf("Age: %s\n", c.age);
    }
}

/* Dog Class */
class Cat {
    /* 1. Filed */
    String name;
    String breeds;
    int age;

    /* 2. Add Method */
    void claw() {
        System.out.println("Miaooong!!!!!");
    }

    void meow() {
        System.out.println("Meow~:)");
    }
}