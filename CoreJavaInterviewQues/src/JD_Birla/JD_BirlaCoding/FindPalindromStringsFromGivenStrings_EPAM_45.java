package JD_Birla.JD_BirlaCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindPalindromStringsFromGivenStrings_EPAM_45 {

    public static void main(String args[]) {
                List<String> palindromsString =
                        Arrays.asList("madam", "abcd", "racecar");

                List<String> result = palindromsString.stream()
                        .filter(str -> IntStream.range(0, str.length() / 2)
                                .allMatch(i ->
                                        str.charAt(i) == str.charAt(str.length() - 1 - i)))
                        .collect(Collectors.toList());

                System.out.println(result);

                palindromsString.stream().forEach(str -> System.out.println(IntStream.range(0, str.length() / 2).sum()));
            }
        }

