package java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class EmployeePredicate {

    private Integer id;
    private Integer age;
    private String gender;
    private String firstName;
    private String lastName;

    public EmployeePredicate(Integer id, Integer age, String gender, String firstName, String lastName) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "EmployeePredicate{" +
                "id=" + id +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

public class PredicateEmployeeExample {

    public static void main(String[] args) {
        EmployeePredicate e1 = new EmployeePredicate(1,23,"M","Ricky","Luther");
        EmployeePredicate e2 = new EmployeePredicate(2,22,"F","Rosy","Taylor");
        EmployeePredicate e3 = new EmployeePredicate(3,33,"M","Jayden","West");
        EmployeePredicate e4 = new EmployeePredicate(4,21,"M","Shane","Lawmen");
        EmployeePredicate e5 = new EmployeePredicate(5,19,"F","Cristine","Josie");
        EmployeePredicate e6 = new EmployeePredicate(6,25,"M","David","Feezor");
        EmployeePredicate e7 = new EmployeePredicate(7,38,"F","Scarlet","Ellie");
        EmployeePredicate e8 = new EmployeePredicate(8,41,"M","Russel","Gussin");
        EmployeePredicate e9 = new EmployeePredicate(9,35,"F","Rakul","Singh");
        EmployeePredicate e10 = new EmployeePredicate(10,45,"M","Aiden","Taylor");

        List<EmployeePredicate> employees = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);
        System.out.println("All employees ::: "+employees);
        System.out.println("=========================================================================");

        //We have to filter young employee which age > 21 and age < 40
        //Using stream api
        List<EmployeePredicate> youngEmployees = employees.stream().filter(e -> e.getAge()>21 && e.getAge()<40).collect(Collectors.toList());
        System.out.println("Filtered young employees with stream ::: "+youngEmployees);
        System.out.println("=========================================================================");

        //Without stream api using only for each loop and creating different predicates
        Predicate<EmployeePredicate>  youngEmp = e -> e.getAge() > 21 && e.getAge() < 40;

        for(EmployeePredicate employeePredicate : employees) {
            if(youngEmp.test(employeePredicate)) {
                System.out.println("Young employees without stream ::: "+employeePredicate);
            }
        }
        System.out.println("=========================================================================");

        Predicate<EmployeePredicate> femaleEmp = e -> e.getGender().equals("F");
        for(EmployeePredicate employeePredicate : employees) {

            if(femaleEmp.test(employeePredicate)) {
                System.out.println("Female employees without stream ::: "+employeePredicate);
            }
        }
        System.out.println("=========================================================================");

        //BiPredicate is a different type of predicate which has two arguments. First arg is class and second arg is data type for dynamic value.
        BiPredicate<EmployeePredicate,Integer> biPredicate = (e,age) -> e.getAge() > age;
        for(EmployeePredicate employeePredicate : employees) {

            if(biPredicate.test(employeePredicate, 35)) {
                System.out.println("Using BiPredicate filter to get those employees who's greater than 35 years age ::: "+employeePredicate);
            }
        }
    }
}


