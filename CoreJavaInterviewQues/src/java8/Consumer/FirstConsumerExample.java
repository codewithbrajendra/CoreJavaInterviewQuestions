package java8.Consumer;
import java.util.function.Consumer;

public class FirstConsumerExample {

    public static void main(String[] args) {

        Consumer<String> consumerString = string -> System.out.println(string);
         consumerString.accept("Mona");

         System.out.println("================================================================");

        Consumer<String> printUpperCase = (upperCaseString) -> System.out.println(upperCaseString.toUpperCase());
         printUpperCase.accept("Diksha");

         System.out.println("================================================================");

        Consumer<String> reverseConsumerString = reverseString -> {
            StringBuilder sb = new StringBuilder(reverseString);
            System.out.println(sb.reverse());
        };
        consumerString.andThen(printUpperCase).andThen(reverseConsumerString).accept("Shikha");
      }
  }

