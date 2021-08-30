package Section_2_Constructor;

public class Q2_StringFormat_Method {
    public static void main(String[] args) {

        Goroke g1 = new Goroke("Pizza", 1000);
        Goroke g2 = new Goroke("Vegie", 800);
        Goroke g3 = new Goroke("Redbean", 500);


        System.out.println(g1.str());
        System.out.println(g2.str());
        System.out.println(g3.str());
    }
}

class Goroke {

    String name;
    int price;


    Goroke(String n, int p) {
        name = n;
        price = p;
    }

   // String.format VS Printf
    String str() {
        return String.format("Goroke { name: %s, price: %d원 }", name, price);
    }
}
