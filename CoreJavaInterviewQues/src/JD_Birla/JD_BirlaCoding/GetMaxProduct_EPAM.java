package JD_Birla.JD_BirlaCoding;

import java.util.Comparator;

public class GetMaxProduct_EPAM {

    public static void main(String[] args) {
        String product = Transaction.getTransactions().stream()
                .sorted(Comparator.comparing(t -> t.getPrice() * t.getQuantity(), Comparator.reverseOrder()))
                .findFirst().orElse(null).getProduct();
        System.out.println(product);
    }

}
