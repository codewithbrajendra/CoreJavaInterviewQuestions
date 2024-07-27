package interview;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ZomatoOrder {

    private int zomotoOrderId;
    private String zomatoOrderName;
    private LocalDate zomatoOrderDate;

    public ZomatoOrder(int zomotoOrderId, String zomatoOrderName, LocalDate zomatoOrderDate) {
        this.zomotoOrderId = zomotoOrderId;
        this.zomatoOrderName = zomatoOrderName;
        this.zomatoOrderDate = zomatoOrderDate;
    }

    public int getZomotoOrderId() {
        return zomotoOrderId;
    }

    public void setZomotoOrderId(int zomotoOrderId) {
        this.zomotoOrderId = zomotoOrderId;
    }

    public String getZomatoOrderName() {
        return zomatoOrderName;
    }

    public void setZomatoOrderName(String zomatoOrderName) {
        this.zomatoOrderName = zomatoOrderName;
    }

    public LocalDate getZomatoOrderDate() {
        return zomatoOrderDate;
    }

    public void setZomatoOrderDate(LocalDate zomatoOrderDate) {
        this.zomatoOrderDate = zomatoOrderDate;
    }

    public static List<ZomatoOrder> getZomatoOrders() {
        return Arrays.asList(
                new ZomatoOrder(101, "Veg Thali",LocalDate.of(2024,02,02)),
                new ZomatoOrder(201, "Veg Mini Thali",LocalDate.of(2024,03,07)),
                new ZomatoOrder(102, "Pizza",LocalDate.of(2024,02,07)),
                new ZomatoOrder(103, "Paneer Tikka and Manchurian",LocalDate.of(2024,02,10)),
                new ZomatoOrder(075, "Veg Fried Rice and Spring Rolls",LocalDate.of(2024,01,23))
        );
    }
}
