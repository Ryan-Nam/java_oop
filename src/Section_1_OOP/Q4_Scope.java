package Section_1_OOP;

public class Q4_Scope {
    public static void main(String[] args) {
        // Object
        DrinkMachine machine1 = new DrinkMachine();
        DrinkMachine machine2 = new DrinkMachine();

        // Pick Drinks
        machine1.pushButton(0);
        machine2.pushButton(1);

        // Check Drinks
        machine1.printOutput();
        machine2.printOutput();
    }
}

class DrinkMachine {
    /* Fields */
    String output;

    /* Methods */
    void pushButton(int num) {
        // drinks = local variable
        String[] drinks = {"Coke", "Fanta", "Beer"};
        output = drinks[num];
    }

    void printOutput() {
        System.out.println(output);
    }
}