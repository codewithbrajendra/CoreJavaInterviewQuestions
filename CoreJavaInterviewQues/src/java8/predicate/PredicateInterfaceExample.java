package java8.predicate;

import java.util.function.Predicate;

public class PredicateInterfaceExample {

    public static void main(String[] args) {

        Predicate<String> predicateNullAndSizeCheck = (s) -> s != null && s.length() > 0;
        System.out.println("predicateNullAndSizeCheck null value ::: "+predicateNullAndSizeCheck.test(null));
        System.out.println("predicateNullAndSizeCheck some string value ::: "+predicateNullAndSizeCheck.test("okayjava"));
        System.out.println("====================================================================================");
        Predicate<String> predicateStartsWith = (s) -> s.startsWith("o");
        System.out.println("predicateStartsWith different from o value ::: "+predicateStartsWith.test("java"));
        System.out.println("predicateStartsWith same with o value ::: "+predicateStartsWith.test("okayjava"));
        System.out.println("====================================================================================");
        Predicate<String> predicateEndsWith = (s) -> s.endsWith("a");
        System.out.println("predicateEndsWith different from a value ::: "+predicateEndsWith.test("okay"));
        System.out.println("predicateEndsWith same with a value ::: "+predicateEndsWith.test("okayjava"));
        System.out.println("====================================================================================");

        System.out.println("Predicate joining AND different value ::: "+predicateNullAndSizeCheck.and(predicateStartsWith).and(predicateEndsWith).test("abc"));
        System.out.println("Predicate joining AND same value ::: "+predicateNullAndSizeCheck.and(predicateStartsWith).and(predicateEndsWith).test("okayjava"));

        System.out.println("====================================================================================");

        System.out.println("Predicate joining OR different value ::: "+predicateStartsWith.or(predicateEndsWith).test("abc"));
        System.out.println("Predicate joining OR same value ::: "+predicateStartsWith.or(predicateEndsWith).test("okayjava"));

        System.out.println("====================================================================================");
        //negate method return oposite result of test method.
        System.out.println("Predicate negate correct value ::: "+predicateEndsWith.negate().test("java"));
        System.out.println("Predicate negate incorrect value ::: "+predicateEndsWith.negate().test("abc"));


    }
}
