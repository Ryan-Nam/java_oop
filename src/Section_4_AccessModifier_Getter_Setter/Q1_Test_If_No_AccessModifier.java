package Section_4_AccessModifier_Getter_Setter;

// Purpose: Hacking -> change 100000 to 0
public class Q1_Test_If_No_AccessModifier {
    public static void main (String[] args) {

        Account myAccount = new Account(1000000);

        System.out.println(myAccount.toString());

        // Hacking
        Hacker.malcious(myAccount);

        System.out.println(myAccount.toString());
    }
}

class Account {
    int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public String toString() {
        return String.format("Account { balance: %d }", balance);
    }
}

class Hacker {
   // Class method, Hacker will make user's account to 0 dollars.
    public static void malcious(Account account) {
        account.balance = 0;
    }
}

/* To sum up
* if develoer does not know about the access modifier,
* will be bankrup*/