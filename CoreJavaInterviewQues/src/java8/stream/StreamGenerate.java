package java8.stream;
import java.util.Random;
import java.util.stream.Stream;

public class StreamGenerate {
    public static void main(String[] args) {
        Stream<Integer> randomNumbers = Stream
                .generate(() -> (new Random()).nextInt(100));

        randomNumbers.limit(5).forEach(n -> System.out.print(n+" "));
    }
}
