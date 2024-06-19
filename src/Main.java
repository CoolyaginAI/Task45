import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {

        getArithmeticProgressionSum(10000000L, 1000000000L);

    }

    public static void getArithmeticProgressionSum(long a, long b) {

        if (a>b) {
            long temp = b;
            b = a;
            a = temp;
        }

        LongStream longStream = LongStream.range(a, b);
        System.out.println(longStream.sum());

    }

}