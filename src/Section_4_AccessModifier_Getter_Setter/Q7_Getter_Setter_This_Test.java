package Section_4_AccessModifier_Getter_Setter;

public class Q7_Getter_Setter_This_Test {
    public static void main(String[] args) {
        // 객체 생성
        Knight k1 = new Knight("돈키호테", 30);
        // 정보 출력
        System.out.println("[객체 생성]");
        System.out.printf("Knight { name: 돈키호테, hp: %d }\n", k1.getHp());

        k1.setHp(k1.getHp()+30);
        // 체력 증가: 기존 체력 + 30
        // 결과 출력
        System.out.println("[체력 증가 +30]");
        System.out.printf("Knight { name: 돈키호테, hp: %d }", k1.getHp());
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

    Knight (String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    // 게터
    // 세터
}

