package java8.foreach;
import java.util.HashMap;
import java.util.Map;

public class Java8ForEachLoop {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        map.put("E", 50);
        map.put("F", 60);
        map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
    }
}
