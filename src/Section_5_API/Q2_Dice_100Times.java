package Section_5_API;

import java.util.Random;

public class Q2_Dice_100Times {
    public static void main(String[] args) {

        int [] arr = new int[13];

        for (int k = 0; k <100; k++){
            int a = DieA.roll();
            int b = DieB.roll();
            arr[a+b]++;
        }



        for (int i = 2; i < arr.length; i++) {
            System.out.printf("%d => ", i);
            for (int j = 0; j < arr[i]; j++) {
                System.out.printf("#");
            }
            System.out.println();
            //System.out.println(arr[i]);
        }
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