package interview;

import java.util.*;

public class TestPerson_Iris {

    public static void main(String[] args) {
        //Ques 1. How we prevent setDate for Person class dob if Person class is immutable
        Date dob = new Date();
        String name = "Test";
        Person p1 = new Person(name, dob);
        Person p2 = new Person(name, dob);
        System.out.println(p1.getDob());
        p1.getDob().setDate(1);
        System.out.println(p1.getDob());
//Solution of the above problem is to create deep copy of Date class in Person class which is reference of different class.

        //Ques 2. When we created object of TreeSet and then  try to add some value of Person class then we get exception
        //Exception in thread "main" java.lang.ClassCastException: class interview.Person cannot be cast to class java.lang.Comparable
        Set<Person> set1 = new TreeSet();
        set1.add(p1);
//Solution of the above problem is to implements Comparable<Person> interface and override compareTo method.

        //Ques 3. If p1 and p2 are same values then it should be stored only one object value not both.
        Set<Person> set2 = new HashSet();
        set2.add(p1);
        set2.add(p2);
        System.out.println("HashSet -> " + set2);
//Solution of the above problem is to override equals and hashcode. Because equals method compare each variable and if value is duplicate then return false

        //Ques 4. If we declare final of List then can we add, modify and remove element from list?
        final List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
//Answer : Yes, In java if you declare list or any other collection as final, you cannot reassign the list to a different list. But still
        //you can modify the contents of the list(e.g. add, remove or change elements). The final keyword only prevents reassignment of the
        //reference to a different object.

    }
}
