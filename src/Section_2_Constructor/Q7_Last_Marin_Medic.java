package Section_2_Constructor;

public class Q7_Last_Marin_Medic {
    public static void main(String[] args) {
        Medic medic = new Medic("Support_hero", 60, 60);
        Marine marine = new Marine("Warrier_hero", 590);

        marine.stimpack();
        medic.heal(marine);
    }
}

class Medic {
    String name;
    int hp;
    int mp;

     public Medic (String name, int hp, int mp){ // not sure cuz marine does not have mp
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }


    void heal(Marine teammate) {
        System.out.printf("[%s]'s heal => [%s] HP(%d -> ", name, teammate.name, teammate.hp);
        this.mp -= 10;
        teammate.hp += 10;
        System.out.printf("%d)\n", teammate.hp);
    }
}

class Marine{
    String name;
    int hp;

    public Marine (String name, int hp){ // not sure cuz marine does not have mp
        this.name = name;
        this.hp = hp;
    }
    void stimpack() {
        System.out.printf("[%s]'s stimpack! HP: %d -> ", name, this.hp);
        this.hp -= 10;
        System.out.printf("%d\n", this.hp);
    }

}
