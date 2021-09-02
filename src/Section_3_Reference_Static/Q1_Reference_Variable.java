package Section_3_Reference_Static;

public class Q1_Reference_Variable {
    public static void main(String[] args) {
        // Sunday to Saturday 0~6
        int[] hours0 = { 2, 4, 3, 4, 5, 8, 8 };
        int[] hours1 = { 7,	3, 4, 3, 3, 4, 4 };
        int[] hours2 = { 3, 3, 4, 3, 3, 2, 2 };
        int[] hours3 = { 9, 3, 4, 7, 3, 4, 1 };
        int[] hours4 = { 3, 5, 4, 3, 6, 3, 8 };
        int[] hours5 = { 3, 4, 4, 6, 3, 4, 4 };
        int[] hours6 = { 3, 7, 4, 8, 3, 8, 4 };
        int[] hours7 = { 6 ,3, 5, 9, 2, 7, 9 };

        // Object
        Employee e0 = new Employee("직원0", hours0);
        Employee e1 = new Employee("직원1", hours1);
        Employee e2 = new Employee("직원2", hours2);
        Employee e3 = new Employee("직원3", hours3);
        Employee e4 = new Employee("직원4", hours4);
        Employee e5 = new Employee("직원5", hours5);
        Employee e6 = new Employee("직원6", hours6);
        Employee e7 = new Employee("직원7", hours7);

        // Array of object
        Employee[] employees = { e0, e1, e2, e3, e4, e5, e6, e7 };

        for (int i = 0; i < employees.length; i++) {
            employees[i].printTotalHours();
        }
    }
}

//Class
class Employee {
    // Field
    String name; // name
    int[] hours; // time to work based on days

    // Constructor
    Employee(String str, int[] arr) {
        name = str;
        hours = arr;
    }

    // method
    void printTotalHours() {
        System.out.printf("%s -> %d 시간\n", name, totalHours());
    }

    int totalHours() {
        int sum = 0;
        for (int i = 0; i < hours.length; i++) {
            sum += hours[i];
        }
        return sum;
    }
}