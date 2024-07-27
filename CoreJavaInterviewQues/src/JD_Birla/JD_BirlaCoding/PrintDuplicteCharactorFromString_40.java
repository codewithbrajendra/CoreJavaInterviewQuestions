package JD_Birla.JD_BirlaCoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicteCharactorFromString_40 {

    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
        String newStr = inputString.replaceAll("\\s+","").toLowerCase();
        Set<String> uniqueChar = new HashSet<>();

        Set<String> uniqueSet = Arrays.stream(newStr.split(""))
                .filter(s -> !uniqueChar.add(s)).collect(Collectors.toSet());
        System.out.println(uniqueSet);

    }
}
