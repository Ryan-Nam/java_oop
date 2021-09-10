package Section_5_API;

import java.util.ArrayList;

public class Q3_ArrayList_1 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add("Kim");
        names.add("Lee");
        names.add("Park");
        names.add("Choi");
        names.add("Hong");
        names.add("No");

        for (int i = 0; i < names.size(); i++) {
            //String name = names.get(i);
            System.out.printf("names.get(%d) -> %s\n", i, names.get(i));
        }
    }
}
