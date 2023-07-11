package Collection.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateList {

	public static void main(String[] args) {
		List<Car> carList = Arrays.asList(new Car("Toyota","White",500000),
								           new Car("BMW","Silver",750000),
										   new Car("Mercedes Benz","Grey",600000),
										   new Car("Hyundai Honda","Black",500000));
		
		List<Car> carList1 = Arrays.asList(new Car("Toyota1","White",500000),
		           new Car("BMW1","Silver",750000),
				   new Car("Mercedes Benz1","Grey",600000),
				   new Car("Hyundai Honda1","Black",500000));
	
	System.out.println("carList : "+carList);
	System.out.println("carList1 : "+carList1);
	
	Predicate<Car> p = x -> x.getPrice() > 500000;
	
	//System.out.println("Predicate value is : "+p);
	
	for(Car c : carList1) {
		if(p.test(c)) {
			System.out.println(c.getName());
		}
	}
	
	}
}
