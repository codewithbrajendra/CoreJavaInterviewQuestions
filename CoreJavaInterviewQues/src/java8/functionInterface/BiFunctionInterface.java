package java8.functionInterface;
import java.util.function.BiFunction;

public class BiFunctionInterface {

    public static void main(String[] args) {
        BiFunction<Integer,Double,Boolean> bifunction = (inte,doub) -> {
            Integer age = inte + doub.intValue();
            Boolean result = age > 18 ? Boolean.TRUE : Boolean.FALSE;
            return result;
        };
        System.out.println("BiFunction -> "+bifunction.apply(12,12.1));
    }
}
