package JD_Birla.JD_BirlaCoding;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceOperationPractice_22 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);

        Optional<Integer> reduce = numbers.stream().reduce((a, b) -> a + b);
        if (reduce.isPresent())
            System.out.println("1 "+reduce.get());
        Optional<Integer> reduce1 = numbers.stream().reduce(Integer::sum);
        if (reduce1.isPresent())
            System.out.println("2 "+reduce1.get());

        Integer maxval = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("3 "+maxval);

        Integer maxval2 = numbers.stream().reduce(Integer::max).get();
        System.out.println("4 "+maxval2);

        List<String> words = Arrays.asList("corejava", "spring", "hibernate");
        Optional<String> reduce2 = words.stream().reduce((a, b) -> a.length() > b.length() ? a : b);
        System.out.println("5 "+reduce2.get());

        Double asa = EmployeeDatabase.getEmployees().stream().filter(A -> A.getGrade() == "A").map(Employee::getSalary)
                .mapToDouble(a -> a).average().getAsDouble();

        System.out.println("6 "+asa);
    }
}
