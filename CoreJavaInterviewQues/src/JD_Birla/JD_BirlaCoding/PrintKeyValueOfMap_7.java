package JD_Birla.JD_BirlaCoding;

import java.util.HashMap;
import java.util.Map;

public class PrintKeyValueOfMap_7 {

    public static void main(String[] args) {
        System.out.println("Que1:How to print keys & values of a Map in Java 8 ?");
        Map<String, Integer> strMap = new HashMap<>();
        strMap.put("Ram", 1000);
        strMap.put("Raju", 2000);
        strMap.put("Ramaan", 3000);
        strMap.put("JD", 3000);

        strMap.keySet().stream().iterator().forEachRemaining(System.out::println);
        System.out.println("===================================================");
        strMap.values().stream().forEach(System.out::println);

    }
}
