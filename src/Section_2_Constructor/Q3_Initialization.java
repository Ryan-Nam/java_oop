package Section_2_Constructor;

public class Q3_Initialization {
    public static void main(String[] args) {

        Hero ironMan = new Hero("아이언맨", 80);
        Hero thanos = new Hero("타노스", 160);
        Hero thor = new Hero("토르", 150);
        Hero groot = new Hero("그루트", 40);


        System.out.println(ironMan.toStr());
        System.out.println(thanos.toStr());
        System.out.println(thor.toStr());
        System.out.println(groot.toStr());
    }
}

// Hero class
class Hero {
    // Field
    String name;
    int hp;

    // Constructor
    Hero(String n, int h) {
        name = n;
        hp = h;
    }

    // Method
    String toStr() {
        return String.format("Hero { name: %s, hp: %d }", name, hp);
    }
}
