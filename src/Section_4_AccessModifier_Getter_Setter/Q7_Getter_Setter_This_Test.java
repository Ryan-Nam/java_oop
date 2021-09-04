package Section_4_AccessModifier_Getter_Setter;

public class Q7_Getter_Setter_This_Test {
    public static void main(String[] args) {

        Knight k1 = new Knight("Marine", 30);

        System.out.println("[Object build]");
        System.out.printf("%s\n", k1.toString());

        k1.setHp(k1.getHp()+30);

        System.out.println("[HP increased +30]");
        System.out.printf("%s\n", k1.toString());
    }
}

class Knight {
    private String name;
    private int hp;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Knight (String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String toString(){
        return String.format("Knight { name: %s, hp: %d}", this.name, this.hp);
    }
}

