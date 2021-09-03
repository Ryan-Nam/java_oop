package Section_3_Reference_Static;

public class Q6_Call_ClassMethod {
    public static void main(String[] args) {

        Circle c1 = new Circle(0, 0, 3); // 중심(0,0) - 반지름3
        Circle c2 = new Circle(2, 3, 4); // 중심(2,3) - 반지름4


        double area1 = Circle.area(c1);
        double area2 = Circle.area(c2);


        System.out.printf("%s => result: %.2f\n", c1.toStr(), area1);
        System.out.printf("%s =>r result: %.2f\n", c2.toStr(), area2);
    }
}

class Circle {

    int x;
    int y;
    int r;


    Circle(int centerX, int centerY, int radius) {
        x = centerX;
        y = centerY;
        r = radius;
    }


    String toStr() {
        return String.format("Circle { center: (%d, %d), half length: %d }", x, y, r);
    }


    static double area(Circle c) {
        return Math.PI * c.r * c.r;
    }
}
