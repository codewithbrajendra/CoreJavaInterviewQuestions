package interview;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.*;
import java.util.function.*;

public class TrimNConvertLowerCheckValidEmailNRemoveDuplicateString_EPAM {

    /***
     * emails: emailing lists, a collection of lists
     * returns: list of unique, valid emails
     ***/
    private static Collection<String> processEmails(Collection<List<String>> emailLists) {

        /*Stream<String> emails = emailLists.stream().flatMap(list -> list.stream());
       // emails.forEach(System.out::println);
        List<String> listString = emails.map(s -> s.trim().toLowerCase()).collect(Collectors.toList());
        System.out.println("listString : "+listString);
        Map<String, Long> strings = listString.stream().filter(s -> isValid(s)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("strings : "+strings);
        HashSet<String> hs = new HashSet<>();
        Map<String,Long> withOutDuplicate = strings.entrySet().stream().filter(m -> hs.add(m.getKey())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println("withOutDuplicate : "+withOutDuplicate);

        List<String> result = withOutDuplicate.keySet().stream().toList();*/

        Set<String> result = emailLists.stream().flatMap(list -> list.stream())
                        .map(String::trim).map(String::toLowerCase).filter(s -> isValid(s)).collect(Collectors.toSet());


        System.out.println("result : "+result);
        return result;

    }

    public static void main(String[] args) {
        List<String> listCustomers = List.of("customer@company.com", "USER@company.com", "invalid@email@.com", "email_trim@email.com ");
        List<String> listUsers = List.of("user@company.com", "another@invalid@email", "   email_trim@email.com");
        //List<String> empty = List.of();

        Collection<String> result = processEmails(List.of(listCustomers, listUsers));
        System.out.println(result.containsAll(List.of("customer@company.com", "email_trim@email.com", "user@company.com")));
        result.stream().forEach(s->System.out.println(s));
    }

    private static Boolean isValid(String email) {
        return Pattern.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", email);
    }
}
