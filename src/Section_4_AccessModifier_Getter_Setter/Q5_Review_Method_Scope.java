package Section_4_AccessModifier_Getter_Setter;

public class Q5_Review_Method_Scope {
    public static void main(String[] args) {
        int score = 88;
        System.out.printf("score = %d in main()\n", score);
        Record.foo(score);
        System.out.printf("score = %d in main()\n", score);
    }
}

class Record {
    public static void foo(int score) {
        score -= 10;
        System.out.printf("score = %d in foo()\n", score);
    }
}
