package JD_Birla.JD_BirlaCoding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNoOfOccuranceOfWords_10 {

    public static void main(String[] args) {
        String input = "welcome to code decode and code decode welcome you";
        List<String> words = Arrays.asList(input.split(" "));

        Map<String, Long> occuranceWords = words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(occuranceWords);
    }
}
