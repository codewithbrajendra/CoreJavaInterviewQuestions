package java8.optional;

import java.util.Optional;

public class WaysToCreateOptionalObject {

    public static void main(String[] args) {

        Optional<String> firstOptional = Optional.empty();// First way for empty Optional class
        System.out.println(firstOptional);

        //If we are using Optional.of(T t) then T should be not null otherwise it will throw NullPointerException always.
        Optional<String> secondOptional = Optional.of("This is second class object.");// Second way for getting value of object.

        //	Optional<String> secondOptional = Optional.of(null); //throw NullPointerException at this line

        System.out.println("Direct second optional class object is display ::: "+secondOptional);
        if(secondOptional.isPresent()) {
            System.out.println("secondOptional class is not null ::: "+secondOptional.get());
        } else {
            System.out.println("secondOptional class is null.");
        }

        //If we are using Optional.ofNullable(T t) and if T is null value then it just return Optional.empty value not throw any exception.
        Optional<String> thirdOptional = Optional.ofNullable(null);// Third way for getting value of object but it handle null condition.

        System.out.println("Direct third optional class object is display ::: "+thirdOptional);

        if(thirdOptional.isPresent()) {
            System.out.println("thirdOptional class is not null ::: "+thirdOptional.get());
        } else {
            System.out.println("thirdOptional class is null.");
        }

    }
}
