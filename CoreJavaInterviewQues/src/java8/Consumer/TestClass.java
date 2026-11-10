package java8.Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestClass {

    public static void main(String[] args) {
//        List al = new ArrayList();
//        al.add("Anuj111");
//        al.add(1);
//        al.add(11.11);
//
//        System.out.println(al);
        List<String> employees =
                Arrays.asList("Rahul", "Amit", "Priya");

        Consumer<String> printEmployee =
                name -> System.out.println(name);

        employees.forEach(printEmployee);


    }
}
