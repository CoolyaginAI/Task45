import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {

        getArithmeticProgressionSum();

    }

    public static void getArithmeticProgressionSum() {

        LongStream longStream = LongStream.range(10000000L, 1000000000L);
        System.out.println(longStream.sum());

    }

}