package Section_2_Constructor;

public class Q5_Objects_Array {
    public static void main(String[] args) {
    // Object
    Song s0 = new Song("You are so beautiful", "JayPark");
    Song s1 = new Song("Party in the USA", "Miley");
    Song s2 = new Song("Secret", "Hanna");

    // Object Array
    Song[] songs = {s0, s1, s2 };

    // 모든 배열 속 객체 출력
    for (int i = 0; i < songs.length; i++) {
        //System.out.println(songs[i]); -> Array can not be called like that.
        System.out.println(songs[i].toStr());

    }
}
}

class Song {
    // 필드
    String name;
    String singer;

    // 생성자
    Song(String n, String s) {
        name = n;
        singer = s;
    }

    // 메소드
    String toStr() {
        return String.format("Song { name: %s, singer: %s }", name, singer);
    }
}