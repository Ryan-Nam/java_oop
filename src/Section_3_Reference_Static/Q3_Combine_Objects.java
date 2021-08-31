package Section_3_Reference_Static;

public class Q3_Combine_Objects {
    public static void main(String[] args) {
        // Player object
        Player kim = new Player("Kim", new int[] { 9, 8, 10 });
        Player lee = new Player("Lee", new int[] { 10, 9, 10 });
        Player park = new Player("Park", new int[] { 8, 10, 9 });

        Player Xiao = new Player("Xiao", new int[] { 10, 9, 10 });
        Player Yu = new Player("Yu", new int[] { 8, 9, 10 });
        Player Xui = new Player("Xui", new int[] { 8, 9, 9 });

        // object array
        Player[] koreaPlayers = { kim, lee, park };
        Player[] chinaPlayers = { Xiao, Yu, Xui };

        // Team object
        Team korea = new Team("KOREA", koreaPlayers);
        Team china = new Team("CHINA", chinaPlayers);

        /* can do like that straight away, but for readability
        * Team korea = new Team("KOREA", new Player[] {
  new Player("Kim", new int[] { 9, 8, 10 }),
  new Player("Lee", new int[] { 10, 9, 10 }),
  new Player("Park", new int[] { 8, 10, 9 })
});
        * */

        // Team score
        korea.printTeamPoints();
        china.printTeamPoints();
    }
}

// Team Class
class Team {
    // Field
    String nation;
    Player[] players;

    // Constructor
    Team (String str, Player[] arr) {
        nation = str;
        players = arr;
    }

    // Method
    void printTeamPoints() {
        int sum = 0;
        for (int i = 0; i < players.length; i++) {
            sum += players[i].totalPoints();
        }
        System.out.printf("%s -> %d points\n", nation, sum);
    }
}

// Player Class
class Player {
    // Field
    String name;
    int[] points;

    // Constructor
    Player (String str, int[] arr) {
        name = str;
        points = arr;
    }

    // Method
    int totalPoints() {
        int sum = 0;
        for (int i = 0; i < points.length; i++) {
            sum += points[i];
        }
        return sum;
    }
}
