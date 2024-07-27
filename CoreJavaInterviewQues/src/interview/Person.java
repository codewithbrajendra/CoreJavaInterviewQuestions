package interview;

import java.util.Date;
import java.util.Objects;

//Person class is immutable but some issue with class which is solved in TestPerson_Iris class and new class is created below.
/*public final class Person {

    private final String name;
    private final Date dob;

    public Person(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public Date getDob() {
        return this.dob;
    }

    public String getName() {
        return this.name;
    }
}*/
public final class Person implements Comparable<Person>{

    private final String name;
    private final Date dob;

    public Person(String name, Date dob) {
        this.name = name;
        this.dob = new Date(dob.getTime());//deep copy for the field which is reference of different object
    }

    public Date getDob() {
        return new Date(dob.getTime());//deep copy for the field which is reference of different object
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(getName(), person.getName()) && Objects.equals(getDob(), person.getDob());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDob());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }
}