package JD_Birla.JD_BirlaCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumbersInList_13 {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

        List<Integer> evenNumbers = myList.stream().filter(n -> n%2 == 0).collect(Collectors.toList());

        System.out.println(evenNumbers);
    }
}
