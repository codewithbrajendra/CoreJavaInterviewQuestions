package java8.stream.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamGroupingByExample {

    public static void main(String[] args) {
        Student s1 = new Student(1,"Shikha",28,new int[]{90,85,79,75});
        Student s2 = new Student(1,"Brajendra",34,new int[]{92,88,77,73});
        Student s3 = new Student(1,"Mona",27,new int[]{91,84,76,71});
        Student s4 = new Student(1,"Sourabh",26,new int[]{87,84,79,75});
        Student s5 = new Student(1,"Abhi",19,new int[]{60,53,51,48});
        Student s6 = new Student(1,"Diksha",25,new int[]{90,86,77,75});
        Student s7 = new Student(1,"Soumya",24,new int[]{92,88,79,73});
        Student s8 = new Student(1,"Mansi",24,new int[]{93,87,81,77});
        Student s9 = new Student(1,"Komal",24,new int[]{90,83,75,75});
        Student s10 = new Student(1,"Disha",25,new int[]{88,83,76,71});

        List<Student> students = Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);

        Map<Integer,List<Student>> groupingByAge = students.stream().collect(Collectors.groupingBy(student -> student.getAge()));
        System.out.println("groupingByAge :: "+groupingByAge);

        Map<Integer, Set<Student>> groupByAgeSet = students.stream().collect(Collectors.groupingBy(student -> student.getAge(), Collectors.toSet()));
        System.out.println("groupByAgeSet :: "+groupByAgeSet);

        Map<Integer, List<String>> groupByAgeWithName = students.stream().collect(Collectors.groupingBy(student -> student.getAge(),Collectors.mapping(student -> student.getName(),Collectors.toList())));
        System.out.println("groupByAgeWithName :: "+groupByAgeWithName);

    }

    /*public int apply(Student student) {
        return student.getAge();
    }*/
}
