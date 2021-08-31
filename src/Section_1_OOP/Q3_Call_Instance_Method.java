package Section_1_OOP;

public class Q3_Call_Instance_Method {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.name = "Tony";
        cat2.name = "Milio";

        cat1.meow();
        cat2.meow();

        cat1.claw();
        cat2.claw();
    }
}

class Cat {

    String name;
    String breeds;
    int age;

    void meow() {
        System.out.printf("[%s]'s Meowwww~\n", name);
    }
    void claw() {
        System.out.printf("[%s]'s miao!!!!!'", name);
    }
}