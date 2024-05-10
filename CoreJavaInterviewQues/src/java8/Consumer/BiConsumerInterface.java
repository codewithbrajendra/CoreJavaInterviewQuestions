package java8.Consumer;
import java.util.function.BiConsumer;

public class BiConsumerInterface {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(1, 2);
    }
}
