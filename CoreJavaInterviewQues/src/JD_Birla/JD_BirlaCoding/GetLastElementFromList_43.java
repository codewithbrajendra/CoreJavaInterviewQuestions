package JD_Birla.JD_BirlaCoding;
import java.util.*;
public class GetLastElementFromList_43 {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        String lastElement = listOfStrings.stream().skip(listOfStrings.size() - 1)
                .findFirst().get();
        System.out.println(lastElement);
    }
}
