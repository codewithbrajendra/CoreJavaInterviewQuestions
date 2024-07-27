package JD_Birla.JD_BirlaCoding;
import java.util.*;
public class FindStringStartWithNumFromList_39 {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        listOfStrings.stream().filter(l -> Character.isDigit(l.charAt(0)))
                .forEach(System.out::println);
    }

}
