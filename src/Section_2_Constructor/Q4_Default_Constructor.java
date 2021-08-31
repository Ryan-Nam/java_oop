package Section_2_Constructor;

/*
* Remarkable Concept
* 1. If there is a set constrcutor, default constructor is not made.
* so if i want to use fault constructor, i have to declare manually....!!!!
* 2. Array.
* */
public class Q4_Default_Constructor {
    public static void main(String[] args) {
        // using default constructor, make object
        Drink d1 = new Drink();
        d1.name = "포카리";
        d1.price = 1000;


        Drink d2 = new Drink("박카스", 800);

        //store both objects into an array.
        Drink[] drinks = {d1,d2};

        for (int i = 0; i < drinks.length; i++) {
            System.out.println(drinks[i].toStr());
        }

        /*
        System.out.println(d1.toStr());
        System.out.println(d2.toStr());*/
    }
}

// 드링크 객체
class Drink {
    // 필드
    String name;
    int price;


    // Default constructor
    Drink (){

    }

    // Constructor
    Drink(String n, int p) {
        name = n;
        price = p;
    }

    // 메소드
    String toStr() {
        return String.format("Drink { name: %s, price: %d }", name, price);
    }
}
