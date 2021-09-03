package Section_4_AccessModifier_Getter_Setter;

public class Q2_Private_AccessModifier {
    /* Assume Q2_Private_AccessModifier class = Theif*/
    public static void main(String[] args) {
        // make wallet object
        Wallet wallet = new Wallet(30000);
        System.out.print(wallet.toString());

        //Hacker does hack user's money to 0
        Q2_Private_AccessModifier.steal(wallet);

        // check wallet
        System.out.println(" -> " + wallet.toString());
    }

    // class method
    public static void steal(Wallet target) {
        //target.money = 0;
    }
}

class Wallet {
    // Fields = instance variable
    private int money; /* QQ!!, protect this variable so hacker will have no access here. */

    public Wallet(int i) {
        money = i;
    }

    public String toString() {
        return String.format("Wallet { money: %d }", money);
    }
}