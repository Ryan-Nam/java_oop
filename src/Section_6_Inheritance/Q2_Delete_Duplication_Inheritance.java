package Section_6_Inheritance;

public class Q2_Delete_Duplication_Inheritance {

    public static void main(String[] args) {
        // 객체 생성
        Pet dog = new Pet();

        /* 4. 객체를 초기화하세요. */

        dog.name = "차우차우";
        dog.age = 3;
        dog.price = 2200000;

        // 정보 출력
        System.out.printf("Pet { name: %s, age: %d세, price: %d원 }", dog.name, dog.age, dog.price);
    }
}

class Animal {
    String name; // 이름

    public void cry() {
        System.out.println("동물이 웁니다!");
    }
}


class Pet extends Animal{


    int age;     // 나이
    int price;   // 가격




    public void play() {
        System.out.println("애완 동물이 장난을 칩니다~");
    }
}
