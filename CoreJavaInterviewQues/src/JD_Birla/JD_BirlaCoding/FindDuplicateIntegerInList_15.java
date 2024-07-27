package JD_Birla.JD_BirlaCoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateIntegerInList_15 {

    public static void main(String[] args) {
        List<Integer> myList2 = Arrays.asList(10, 15, 8, 10, 25, 15, 32, 15);
        HashSet<Integer> hs = new HashSet<>();
      //  List<Integer> duplicateNum = myList2.stream().filter(a -> !hs.add(a)).collect(Collectors.toList());
      //  System.out.println(duplicateNum);
//output - [10, 15, 15]

        myList2.stream().filter(a -> !hs.add(a)).collect(Collectors.toSet()).forEach(System.out::println);
        //output -
        // 10
        // 15
    }

}
