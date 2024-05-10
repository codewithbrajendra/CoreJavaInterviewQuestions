package java8.stream;
import java.util.stream.Stream;

public class StreamIterate {
    public static void main(String[] args) {
        Stream.iterate(1,element -> element + 1)
                .filter(element -> element % 10 == 0).limit(5)
                .forEach(element -> System.out.print(element+" "));
    }
}
