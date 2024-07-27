package JD_Birla.JD_BirlaCoding;
import java.util.*;
public class SortListOfStringOnTheirLength_30 {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

    }
}
