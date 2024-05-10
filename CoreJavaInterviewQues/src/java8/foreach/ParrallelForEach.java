package java8.foreach;
import java.util.stream.Stream;

public class ParrallelForEach {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("a", "b", "c", "1", "2", "3");
        s.parallel().forEachOrdered(x -> System.out.println(x));
    }
}
