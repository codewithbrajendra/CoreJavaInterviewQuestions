package JD_Birla.JD_BirlaCoding;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CheckIfTwoStringAnagram_28 {

    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";

        s1 = Arrays.stream(s1.split("")).map(String::toUpperCase).sorted()
                .collect(Collectors.joining());
        s2 = Arrays.stream(s2.split("")).map(String::toUpperCase).sorted()
                .collect(Collectors.joining());
        if(s1.equals(s2)) {
            System.out.println("Both Strings are Anagram");
        } else {
            System.out.println("Both Strings are not Anagram");
        }
    }
}
