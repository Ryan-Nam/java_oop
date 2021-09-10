package Section_5_API;

import java.util.*;

public class Q7_Lotto_Number_Generator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 45; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);

        int[] picked = new int[6];

        for (int i = 0; i < picked.length; i++) {
            picked[i] = numbers.get(i);
        }
        System.out.printf("Lotto number: %s", Arrays.toString(picked));
    }
}
