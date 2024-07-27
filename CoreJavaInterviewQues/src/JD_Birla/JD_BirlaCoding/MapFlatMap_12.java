package JD_Birla.JD_BirlaCoding;

import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMap_12 {

    public static void main(String[] args) {

        List<Customer> customers = EkartDataBase.getAll();

        List<String> emails = customers.stream().map(c -> c.getEmail()).collect(Collectors.toList());
        System.out.println("List of emails ::: "+emails);

        List<List<String>> customersPhoneNumbers = customers.stream().map(c -> c.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println("List of phoneNumbers ::: "+customersPhoneNumbers);

        /*List<String> flatCustomers = customers.stream().map(c -> c.getPhoneNumbers()).flatMap(f -> f.stream())
                .collect(Collectors.toList());*/

               //Or

        List<String> flatCustomers = customers.stream().flatMap(f -> f.getPhoneNumbers().stream()).collect(Collectors.toList());

        System.out.println("Flat Map of Customers1 ::: "+flatCustomers);


        /*List<String> collect = EmployeeDatabase.getEmployees().stream().map(Employee::getAddress).flatMap(f -> f.s)
                .map(ad -> ad.getCity()).distinct().collect(Collectors.toList());*/

    }
}
