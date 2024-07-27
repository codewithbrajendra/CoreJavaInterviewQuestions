package JD_Birla.JD_BirlaCoding;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMaxRepeatedWordFromList_37 {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        Map<String, Long> collect = listOfStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map.Entry<String, Long> word = collect.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("Most Repeated Word is ::: "+word.getKey()+" , "+"Count is ::: "+word.getValue());
    }

}
