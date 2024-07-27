package JD_Birla.JD_BirlaCoding;

import java.util.Arrays;
import java.util.List;

public class Transaction {

    private int id;
    private String product;
    private int quantity;
    private double price;

    public Transaction(int id, String product, int quantity, double price) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static List<Transaction> getTransactions() {
        return Arrays.asList(
                new Transaction(1, "Samsung",15,20000),
                new Transaction(2, "Nokia",12,12000),
                new Transaction(3, "Realme",10,11000),
                new Transaction(4, "OnePlus",18,25000),
                new Transaction(5, "iPhone",18,35000));
    }
}
