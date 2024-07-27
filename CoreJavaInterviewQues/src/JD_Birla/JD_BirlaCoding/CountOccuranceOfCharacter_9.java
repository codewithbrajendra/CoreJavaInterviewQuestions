package JD_Birla.JD_BirlaCoding;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountOccuranceOfCharacter_9 {

    public static void main(String[] args) {
        String someString = "JAVA PROGRAMMER";

        /*char[] chars = someString.toCharArray();
        Set<Character> distinctChar = new TreeSet<>();


        for(Character c : chars) {
            distinctChar.add(c);
        }
       // distinctChar.forEach(System.out::print);

        for(Character c : distinctChar) {
            Long count = someString.chars().filter(c1 -> c1 == c).count();
          //  System.out.println("Character : "+c+" "+"Count : "+count);
        }
        Map<Character, Integer> cntmap = new HashMap<Character, Integer>();
        for (char c : chars) {
            int count = 1;
            if (cntmap.containsKey(c)) {
                int curCont = cntmap.get(c);
                cntmap.put(c, curCont + 1);
            } else {
                cntmap.put(c, count);
            }
        }
        System.out.println(cntmap);*/

        Map<String,Long> collect = Arrays.stream(someString.split(""))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(collect);
    }
}
