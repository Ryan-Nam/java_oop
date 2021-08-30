package Section_1_OOP;

public class Q5_SquareTest {
    public static void main(String[] args) {
        Square s = new Square();

        s.length(4);
        //System.out.println( cal1.times(4));
        s.output();
    }
}

class Square{
   int result;
   int n;

    public int length(int _n) {
        n = _n;
        result = n * n;
        return result;
    }

    void output (){
        //System.out.println(result);
        System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d",n, result);
    }

}
