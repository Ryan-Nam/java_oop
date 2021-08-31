package Section_3_Reference_Static;

public class Q2_Reference_player {
    public static void main(String[] args) {

        int[] points0 = { 10, 9, 9, 8 };
        int[] points1 = { 9, 10, 9, 9 };
        int[] points2 = { 10, 9, 10, 10 };

        Player2 p0 = new Player2("Kim", points0);
        Player2 p1 = new Player2("Lee", points1);
        Player2 p2 = new Player2("Park", points2);

        Player2[] players = { p0, p1, p2 };

        for (int i = 0; i < players.length; i++) {
            players[i].printTotalPoints();
        }
    }
}

class Player2 {
    // Fields
    String name;  // 이름
    int[] points; // 점수

    // Constructor
    Player2(String str, int[] arr) {
        this.name = str;
        this.points = arr;
    }

    // Method
    void printTotalPoints() {

        System.out.printf("%s -> %d\n", name, totalPoints());
    }

    int totalPoints() {
        int sum = 0;
        for (int i = 0; i < points.length; i++) {
            sum += points[i];
        }
        return sum;
    }
}
