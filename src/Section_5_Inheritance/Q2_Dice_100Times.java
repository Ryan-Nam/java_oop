package Section_5_Inheritance;

import java.util.Random;

public class Q2_Dice_100Times {
    public static void main(String[] args) {
        int a = DieA.roll();
        int b = DieB.roll();

        System.out.printf("A: %d\n", a);
        System.out.printf("B: %d\n", b);
    }
}

class DieA {
    public static int roll() {
        double r = Math.random() * 6; // 0.0 <= r < 6.0
        int randInt = (int) r;        // 0, 1, 2, ..., 5
        return randInt + 1;           // 1, 2, 3, ..., 6
    }
}

class DieB {
    public static int roll() {
        Random rand = new Random();
        int randInt = rand.nextInt(6); // (0 ~ 5)
        return randInt + 1;
    }
}