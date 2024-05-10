package java8.stream.ArrayStream;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
class StudyTonight{
    public static void main(String args[])
    {
        String[] stringArray = { "java", "cpp", "c", "python" };
        Stream<String> stringStream = Arrays.stream(stringArray);
        stringStream.forEach(str -> System.out.print(str + " "));

        System.out.println();

        int[] intArray = {12, 41, 18, 4, 5, 31};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(str -> System.out.print(str + " "));
    }
}