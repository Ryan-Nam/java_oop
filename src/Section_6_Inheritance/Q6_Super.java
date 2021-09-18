package Section_6_Inheritance;

public class Q6_Super {
    public static void main(String[] args) {
        /* 1. Orc 객체를 만들고 정보를 출력하시오. */
        /* 2. OrcWarrior 객체를 만들고 정보를 출력하시오. */
    }
}

class Orc {
    protected String name;
    protected int hp;

    public Orc(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String toString() {
        return String.format("Orc { name: %s, hp: %d }", this.name, this.hp);
    }
}

class OrcWarrior extends Orc {
    protected int amor;

    public OrcWarrior(String name, int hp, int amor) {
        super(name, hp);
        this.amor = amor;
    }

    // 메소드 오버라이딩!
    public String toString() {
        return String.format("OrcWarrior { name: %s, hp: %d, amor: %d }", super.name, super.hp, this.amor);
    }
}
