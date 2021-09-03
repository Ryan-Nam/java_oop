package Section_3_Reference_Static;

public class Q4_Static_Variable {
    public static void main (String[] args) {
        // arry, size 5
        Galaxy[] phones = new Galaxy[5];

        // assign
        for (int i = 0; i < phones.length; i++) {
            phones[i] = new Galaxy();
        }

        // Print all the info of objects
        for (int i = 0; i < phones.length; i++) {
            phones[i].print();
        }
        System.out.println("=========================");

        System.out.printf("Galaxy number of Objects: %d", Galaxy.count);
    }
}

// Class
class Galaxy {
    // Field = instance variable
    String serialNum;

    static int count = 0;

    Galaxy() {
        count++;
        char c = randomAlphabet(); // A ~ Z 중 택1
        serialNum = String.format("%c-%d", c, Galaxy.count);
    }

    char randomAlphabet() {
        return (char) ('A' + Math.random() * 26); // A to Z
    }

    void print() {
        System.out.printf("Galaxy { serialNum: %s }\n", serialNum);
    }
}
