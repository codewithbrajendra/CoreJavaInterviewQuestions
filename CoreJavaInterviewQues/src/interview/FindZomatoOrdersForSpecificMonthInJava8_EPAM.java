package interview;

import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

public class FindZomatoOrdersForSpecificMonthInJava8_EPAM {

    public static void main(String[] args) {
        //Write a program to find Zomato orders for February month only

        List<ZomatoOrder> ZomatoOrders = ZomatoOrder.getZomatoOrders().stream().filter(o -> o.getZomatoOrderDate().getMonth() == Month.FEBRUARY)
                .collect(Collectors.toList());
        System.out.println(ZomatoOrders);

    }

}
