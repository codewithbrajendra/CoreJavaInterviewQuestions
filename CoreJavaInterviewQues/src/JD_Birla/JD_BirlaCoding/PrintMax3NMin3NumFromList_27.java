package JD_Birla.JD_BirlaCoding;
import java.util.*;
public class PrintMax3NMin3NumFromList_27 {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println("--------------------------------------------");
        System.out.println("Minimum 3 numbers");
        listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);

        System.out.println("---------------------------------------------");
        System.out.println("Maximum 3 numbers");
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3)
                .forEach(System.out::println);

    }

}
