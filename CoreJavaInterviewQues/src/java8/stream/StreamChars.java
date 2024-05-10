package java8.stream;
import java.util.stream.IntStream;

public class StreamChars {
    public static void main(String[] args) {
        IntStream stream = "12345_abcdefg".chars();
        stream.forEach(p -> System.out.print(p+" "));
    }
}
