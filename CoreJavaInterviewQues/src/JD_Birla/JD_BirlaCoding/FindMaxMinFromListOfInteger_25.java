package JD_Birla.JD_BirlaCoding;
import java.util.*;
public class FindMaxMinFromListOfInteger_25 {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Max val ::: "+max);

        int min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Min val ::: "+min);

    }
}
