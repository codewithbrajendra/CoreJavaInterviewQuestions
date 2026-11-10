package java8.foreach;
import java.util.stream.Stream;

public class ParrallelForEach {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("c", "a", "b", "3", "2", "1");
        s.parallel().forEachOrdered(x -> System.out.println(x));
    }
}
