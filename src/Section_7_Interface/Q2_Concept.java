package Section_7_Interface;

public class Q2_Concept {
    public static void main(String[] args) {
        // 객체 생성
        // 비프음 내기
        // 음악 재생하기
    }
}

interface Alarm {
    public void beep();                  // 비프음
    public void playMusic(String title); // 음악 재생
}

class SmartPhone implements Alarm {
    private String name; // 모델명

    public SmartPhone(String name) {
        this.name = name;
    }
    /* Alarm 인터페이스의 추상 메소드를 재정의하시오. */
}