import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {

        getArithmeticProgressionSum(10000000L, 1000000000L);

    }

    public static void getArithmeticProgressionSum(long a, long b) {

        long maxValue = a>b ? a : b;
        long minValue = a+b-maxValue;

        LongStream longStream = LongStream.range(minValue, maxValue);
        System.out.println(longStream.sum());

    }

}