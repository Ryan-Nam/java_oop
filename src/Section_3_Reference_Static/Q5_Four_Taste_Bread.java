package Section_3_Reference_Static;

public class Q5_Four_Taste_Bread {
    public static void main(String[] args) {

        FishBread[] breads = new FishBread[4];


        breads[0] = new FishBread(0);
        breads[1] = new FishBread(1);
        breads[2] = new FishBread(2);
        breads[3] = new FishBread(3);


        for (int i = 0; i < FishBread.count; i++) {
            breads[i].print();
        }
        System.out.println("==============");


        System.out.printf("Bread Object number: %d", FishBread.count);
    }
}

class FishBread {

    String contents;


    static int count;


    public FishBread(int n) {

        String[] arr = {"RedBean", "Photato", "Chese", "Cream"};
        contents = arr[n];
        FishBread.count++;
    }

    void print() {
        System.out.printf("[%s] 붕어빵\n", contents);
    }
}