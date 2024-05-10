package java8.stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortMethod {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mona","Rakhi","Anjali","Shikha","Ranu","Diksha");
        System.out.println("Before Sorting ::: "+names);
        //sorted in stream api is sorted collection according to natural order.
        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
        System.out.println("After Sorting ::: "+sortedNames);
    }
}
