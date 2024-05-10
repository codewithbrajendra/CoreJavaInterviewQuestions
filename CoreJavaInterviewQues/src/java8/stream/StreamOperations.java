package java8.stream;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamOperations {

    public static void main(String[] args) {
        List<String> memberNames = new ArrayList<>();
            memberNames.add("Manish");
            memberNames.add("Jyoti");
            memberNames.add("Arti");
            memberNames.add("Ananya");
            memberNames.add("Chotu");
            memberNames.add("Shikha");
            memberNames.add("Mona");
            memberNames.add("Sourabh");
            memberNames.add("Diksha");



//        memberNames.stream().filter((s) -> s.startsWith("S"))
//                .forEach(System.out::println);

//        memberNames.stream().filter((s) -> s.startsWith("S"))
//                .map(String::toUpperCase)
//                .forEach(System.out::println);

        List<String> newMembers = Arrays.asList("Abhi","Soumya","Bitto");
        List<List<String>> membersNames = Arrays.asList(memberNames,newMembers);
        List<String> flatMapList = membersNames.stream().flatMap(map -> map.stream()).collect(Collectors.toList());
        System.out.println("flatMapList :: "+flatMapList);

//        memberNames.stream().sorted()
//                .map(String::toUpperCase)
//                .forEach(names -> System.out.print(names+" "));
//
//        memberNames.stream().sorted()

    }
}
