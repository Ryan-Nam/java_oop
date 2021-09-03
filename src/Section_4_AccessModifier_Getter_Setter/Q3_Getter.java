package Section_4_AccessModifier_Getter_Setter;

public class Q3_Getter {
    public static void main(String[] args) {

        Person park = new Person("Ryan", "0403312952");

        System.out.printf("Name: %s\n", park.getName());
        System.out.printf("Mobile: %s\n", park.getPhoneNumber());
    }
}

class Person {
    private String name;
    private String phoneNumber;


    public Person(String n, String p) {
        name = n;
        phoneNumber = p;
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

}
