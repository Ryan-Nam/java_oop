package Section_4_AccessModifier_Getter_Setter;

public class Q4_Setter {
    public static void main(String[] args) {

        Lock lock = new Lock("123!@#");

        //lock.password = "654#@!";
        lock.setPassword("654#@!");


        System.out.println(lock.toString());
    }
}

class Lock {
    private String password;

    public Lock(String p) {
        password = p;
    }

    public void setPassword(String s) {
        password = s;
    }

    public String toString() {
        return String.format("Lock { password: %s }", password);
    }

}
