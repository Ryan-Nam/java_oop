package Section_3_Reference_Static;

public class Q7_Distance_Between_TwoPoints {
    public static void main(String[] args) {

        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);


        double dist = Point.distance(p1, p2);


        System.out.printf("Two point A%s, B%s Distance between: %.2f", p1.toStr(), p2.toStr(), dist);
    }
}

class Point {
    int x;
    int y;

    Point(int _x, int _y) {
        x = _x;
        y = _y;
    }

    String toStr(){
        return String.format("(%d, %d)", x, y);
    }

    static double distance(Point i, Point j){
        double dX = i.x - j.x;
        double dY = i.y - j.y;
        return Math.sqrt(dX * dX + dY * dY);
    }
}
