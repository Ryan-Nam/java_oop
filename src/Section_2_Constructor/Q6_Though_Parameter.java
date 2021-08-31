package Section_2_Constructor;

public class Q6_Though_Parameter {
    public static void main(String[] args) {
        // 객체 생성
        Hero1 thor = new Hero1("Thor", 150);     // thor -> {"토르", 150}
        Hero1 thanos = new Hero1("Thanos", 160); // thanos -> {"타노스", 160}

        // 토르의 펀치 -> 타노스
        thor.punch(thanos);

        /* 2.코드를 추가하여 펀치를 주고 받으세요. */
        thanos.punch(thor);
        thanos.punch(thor);
    }
}

class Hero1 {
    // 필드
    String name;
    int hp;

    // 생성자
    Hero1(String s, int i) {
        name = s;
        hp = i;
    }

    // 메소드
    void punch(Hero1 enemy) {
        // 때린 주체 객체
        System.out.printf("[%s]'s punch!! ", name);

        /* 1. 맞은 객체에 대한 정보를 출력하세요. */
        System.out.printf("%s의 HP: %d -> ", enemy.name, enemy.hp);
        enemy.hp -= 10; // 체력 감소
        System.out.printf("%d\n", enemy.hp);
    }
}
