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
    // 필드
    private String password;

    // 생성자
    public Lock(String p) {
        password = p;
    }

    public void setPassword(String s) {
        password = s;
    }

    // 메소드
    public String toString() {
        return String.format("Lock { password: %s }", password);
    }

    /* 2. 비밀번호 변경을 위한, 세터 메소드를 추가하시오. */
}
