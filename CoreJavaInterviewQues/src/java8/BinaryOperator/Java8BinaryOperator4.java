package java8.BinaryOperator;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class Java8BinaryOperator4 {

    public static void main(String[] args) {

        Developer dev1 = new Developer("jordan", BigDecimal.valueOf(99999));
        Developer dev2 = new Developer("jack", BigDecimal.valueOf(88888));
        Developer dev3 = new Developer("jaden", BigDecimal.valueOf(100000));
        Developer dev4 = new Developer("ali", BigDecimal.valueOf(30000));
        Developer dev5 = new Developer("mkyong", BigDecimal.valueOf(25000));

        List<Developer> list = Arrays.asList(dev1, dev2, dev3, dev4, dev5);

        // 1. Create a Comparator
        Comparator<Developer> comparing = Comparator.comparing(Developer::getSalary);

        // 2. BinaryOperator with a custom Comparator
        BinaryOperator<Developer> bo = BinaryOperator.maxBy(comparing);
        Developer result = find(list, bo);
        System.out.println(result);     // Developer{name='jaden', salary=10000}

        // one line
        // find developer with highest pay
        Developer developer = find(list, BinaryOperator.maxBy(Comparator.comparing(Developer::getSalary)));
        System.out.println(developer);  // Developer{name='jaden', salary=100000}

        // find developer with lowest pay
        Developer developer2 = find(list, BinaryOperator.minBy(Comparator.comparing(Developer::getSalary)));
        System.out.println(developer2); // Developer{name='mkyong', salary=25000}

    }

    public static Developer find(List<Developer> list, BinaryOperator<Developer> accumulator) {
        Developer result = null;
        for (Developer t : list) {
            if (result == null) {
                result = t;
            } else {
                result = accumulator.apply(result, t);
            }
        }
        return result;
    }
}
