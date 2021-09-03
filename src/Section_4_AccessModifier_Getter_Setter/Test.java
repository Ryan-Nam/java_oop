package Section_4_AccessModifier_Getter_Setter;


public class Test {

    public static void main(String[] args) {
        int[] points0 = { 10, 9, 9, 8 };
        int[] points1 = { 9, 10, 9, 9 };
        int[] points2 = { 10, 9, 10, 10 };

        Player2 p0 = new Player2("Kim", points0);
        Player2 p1 = new Player2("Lee", points1);
        Player2 p2 = new Player2("Park", points2);

        Player2[] players = {p0, p1, p2};

        for (int i = 0; i < players.length; i++) {
            players[i].printTotalPoints();
        }
        p2.PrintTst();
    }
}

class Player2 {
    String name;
    int[] points;

    Player2(String _name, int[] _points) {
        name = _name;
        points = _points;
    }

    void printTotalPoints() {
        System.out.printf("%s -> %d점\n", name, totalPoints());
    }

    void PrintTst(){
        System.out.println(totalPoints());
    }

    int totalPoints() {
        int sum = 0;
        for (int i = 0; i < points.length; i++) {
            sum += points[i];
        }
        return sum;
    }
}
