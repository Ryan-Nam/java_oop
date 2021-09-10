package Section_5_API;

import java.util.ArrayList;

public class Q5_ArrayList_3_Set {
    public static void main(String[] args) {
        ArrayList<Monster> list = new ArrayList<Monster>();

        Monster slime = new Monster("Slime", 1);
        Monster orc = new Monster("Orc", 3);
        Monster golem = new Monster("Golem", 8);

        list.add(slime);
        list.add(orc);
        list.add(golem);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Monster rabbit = new Monster("Rabbit", 1);

        list.set(1, rabbit);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

class Monster {
    private String name;
    private int level;

    public Monster(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String toString(){
        return String.format("Monster { name: %s, level: %d }", name, level);
    }
}