package JD_Birla.JD_BirlaCoding;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOfString_33 {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";
        String reversedStr = Arrays.stream(str.split(" "))
                .map(s -> new StringBuffer(s).reverse()).collect(Collectors.joining(" "));
        System.out.println(reversedStr);
    }
}
